package eu.lengarski.jira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class JiraApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(JiraApplication.class);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("server.port", "18080");

        app.setDefaultProperties(map);

        app.run(args);
    }

}
