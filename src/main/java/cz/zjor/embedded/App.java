package cz.zjor.embedded;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.servlet.DispatcherServlet;

public class App {
    public static void main(String[] args) throws Exception {
        Server server = new Server(9999);

        ServletHolder holder = new ServletHolder("dispatcher", DispatcherServlet.class);
        holder.setInitParameter("contextConfigLocation", "classpath:dispatcher-context.xml");
        holder.setInitOrder(0);

        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/spring");
        context.addServlet(holder, "/*");

        HandlerCollection handlers = new HandlerCollection();
        handlers.setHandlers(new Handler[]{context, new DefaultHandler()});
        server.setHandler(handlers);

        server.start();
        server.join();
    }

}
