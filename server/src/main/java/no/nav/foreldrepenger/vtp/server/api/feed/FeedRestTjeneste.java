package no.nav.foreldrepenger.vtp.server.api.feed;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import no.nav.foreldrepenger.vtp.autotest.personhendelse.PersonhendelseDto;
import no.nav.foreldrepenger.vtp.testmodell.feed.HendelseContent;
import no.nav.foreldrepenger.vtp.testmodell.repo.impl.FeedRepositoryImpl;
import no.nav.tjenester.person.feed.common.v1.FeedEntry;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Api(tags = "Legge til data i feeds")
@Path("/api/feed")
public class FeedRestTjeneste {
    PersonhendelseAdapter personhendelseAdapter = new PersonhendelseAdapter();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "", notes = "Legg til hendelse")
    public Response leggTilHendelse(PersonhendelseDto personhendelseDto){
        FeedEntry feedEntry;
        try {
            HendelseContent hendelseContent = personhendelseAdapter.fra(personhendelseDto);
            feedEntry = FeedRepositoryImpl.getInstance().leggTilHendelse(hendelseContent);
        } catch (RuntimeException re){
            re.printStackTrace();
            return Response.status(Response.Status.BAD_REQUEST).entity(String.format("{\"error\": \"%s\"}",re.getMessage())).build();
        }
        return Response.status(201).entity(String.format("{\"success\": \"Personhendelse med sekvens: %s opprettet\"}",feedEntry.getSequence())).build();
    }
}
