package cn.bc.rest.wink;

import org.json.JSONException;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author dragon
 */
@Path("e")
public class EntityResource {
    @GET
    @Produces("application/json")
    public JSONObject getJson() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("id",1);
        json.put("name","dragon");
        return json;
    }
}