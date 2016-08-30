package demo;

import org.soulwing.cdi.properties.Property;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;

/**
 * Created by mikesir on 8/30/16.
 */
@Path("/test2")
public class SecondDemoResource {

  @Inject
  @Property
  protected String message;

//  @Inject
//  @Property
//  protected String otherMessage;
//
//  @Inject
//  @Property
//  protected String thirdMessage;

  @Inject
  protected CalendarService calendarService;

  @Inject
  protected MessageConverter messageConverter;

  @GET
  public Response getResponse() {
    return Response
        .ok(Arrays.asList(calendarService.getDate(), messageConverter.format("HI THERE"), message))
        .type(MediaType.APPLICATION_JSON)
        .build();
  }
}
