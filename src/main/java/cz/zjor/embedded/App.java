package cz.zjor.embedded;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.servlet.DispatcherServlet;

public class App {
    public static void main(String[] args) throws Exception {
        Server server = new Server(9999);

        ServletHolder holder = new ServletHolder("dispatcher", DispatcherServlet.class);
        holder.setInitParameter("contextConfigLocation", "classpath:dispatcher-context.xml");
        holder.setInitOrder(0);


        ServletHandler s = new ServletHandler();
        s.addServletWithMapping(holder, "/*");

        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/spring");
        context.setServletHandler(s);

//        HandlerCollection handlers = new HandlerCollection();
//        handlers.setHandlers(new Handler[]{context, new DefaultHandler()});
        server.setHandler(context);

        server.start();
        server.join();
    }

}
