package demo;

import javax.enterprise.context.ApplicationScoped;
import java.util.Date;

/**
 * Created by mikesir on 8/30/16.
 */
@ApplicationScoped
public class CalendarService {

  public Date getDate() {
    return new Date();
  }
}
