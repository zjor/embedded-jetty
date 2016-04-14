package cz.zjor.embedded.jj.controller;

import cz.zjor.embedded.jj.service.GreetingService;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import java.util.Arrays;
import java.util.stream.Collectors;

@Slf4j
@Path("/")
public class GreetController {

    private GreetingService service;

    public GreetController(GreetingService service) {
        this.service = service;
    }

    @GET
    public String greet() {
        return service.greet("world");
    }

    @GET
    @Path("cookies")
    public String showCookies(@Context HttpServletRequest req) {
        log.info("<= {}", req);
        if (req.getCookies() != null) {
            return Arrays.stream(req.getCookies()).map(c -> "{" + c.getName() + ":" + c.getValue() + "}").collect(Collectors.joining("; "));
        }
        return "No Cookies";

    }

}
