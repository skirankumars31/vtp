package no.nav.foreldrepenger.vtp.unleash;


import ch.qos.logback.core.status.Status;
import org.apache.http.HttpEntity;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("unleash/client")
public class UnleashRestDouble {
        private static final Logger LOG = LoggerFactory.getLogger(UnleashRestDouble.class);
        private static final String UNLEASH_URL = "https://unleash.nais.adeo.no/api/";
        private static final String FEATURES_URL = UNLEASH_URL + "client/features";
        private static final String REGISTER_URL = UNLEASH_URL + "client/register";
        private static final String METRICS_URL = UNLEASH_URL + "client/metrics";



        @GET
        @Path(value = "/features")
        public Response getFeatures() throws Exception{
                LOG.info("invoked: Unleash getFeatures");
                HttpGet httpGet = new HttpGet(FEATURES_URL);

                try(CloseableHttpClient httpClient = HttpClients.createDefault();
                    CloseableHttpResponse response = httpClient.execute(httpGet)){
                        HttpEntity entity = response.getEntity();
                        String entityString = EntityUtils.toString(entity);
                        return Response.status(Response.Status.OK).entity(entityString).build();
                }
         }

        @POST
        @Path(value = "/register")
        public Response postRegister(){
                LOG.info("invoked: Unleash postRegister");

                return null;
        }

        @POST
        @Path(value = "/metrics")
        public Response postMetrics(){
                LOG.info("invoked: Unleash postMetrics");

                return null;
        }


}
