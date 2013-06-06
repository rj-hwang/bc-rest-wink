package cn.bc.rest.wink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;

/**
 * @author dragon
 */
@Path("{moduleName}")
public class ConfigurableResource {
    static final Logger logger = LoggerFactory.getLogger(ConfigurableResource.class);

    // 视图
    @GET
    @Produces("application/json")
    public String getViewJson(@QueryParam("s") String search) {
        return "m:View:json:s=" + search;
    }

    @GET
    @Produces("text/html")
    public String getViewHtml() {
        logger.debug("View:html");
        return "View:html";
    }

    // 获取表单
    @GET
    @Path("{id}")
    public String get(@PathParam("id") String id) {
        return "m:id=" + id;
    }

    // 更新
    @PUT
    @Consumes("application/x-www-form-urlencoded")
    @Path("{id}")
    public String post(@PathParam("id") String id, javax.ws.rs.core.MultivaluedMap<String, String> map) {
        return "m:id=" + id + ",map=" + map;
    }
}
