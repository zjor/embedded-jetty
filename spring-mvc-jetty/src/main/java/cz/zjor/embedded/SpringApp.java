package cz.zjor.embedded;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        // greetService is not visible in the inner scope of dispatcher-context.xml
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-context.xml", "embedded-jetty.xml");

    }
}
