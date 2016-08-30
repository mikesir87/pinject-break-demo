package demo;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by mikesir on 8/30/16.
 */
@ApplicationScoped
public class MessageConverter {

  public String format(String formatString) {
    return "FORMATTED: " + formatString;
  }
}
