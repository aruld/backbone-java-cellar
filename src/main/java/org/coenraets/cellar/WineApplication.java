package org.coenraets.cellar;

import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Arul Dhesiaseelan (aruld@acm.org)
 */
@ApplicationPath("/")
public class WineApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    final Set<Class<?>> classes = new HashSet<>();
    // register root resource
    classes.add(WineResource.class);
    classes.add(JacksonFeature.class);
    return classes;
  }
}
