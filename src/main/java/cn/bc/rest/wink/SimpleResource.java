package cn.bc.rest.wink;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * @author dragon
 */
@Path("/simple")
public class SimpleResource {
    @GET
    public String getHtml() {
        return "simple";
    }

    @GET
    @Path("name")
    public String getName() {
        return "simple.name";
    }

    @GET
    @Produces("application/json")
    public String getJson() {
        return "{\"id\":1, \"name\":\"dragon\"}";
    }
}