package cn.bc.rest.wink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Application;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author dragon
 */
public class RestApplication extends Application {
    static final Logger logger = LoggerFactory.getLogger(RestApplication.class);

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new LinkedHashSet<Class<?>>();
        classes.add(ConfigurableResource.class);
        classes.add(SimpleResource.class);
        classes.add(EntityResource.class);

        logger.info("getClasses");
        return classes;
    }
}
