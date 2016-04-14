package cz.zjor.embedded.jj.service;

import javax.inject.Inject;
import java.text.MessageFormat;

public class GreetingService {

    @Inject
    private InnerService service;

    public String greet(String name) {
        return MessageFormat.format(service.getGreetingFormat(), name);
    }

}
