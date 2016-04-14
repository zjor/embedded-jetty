package cz.zjor.embedded.jj.service;

import org.springframework.stereotype.Service;

@Service
public class InnerService {

    public String getGreetingFormat() {
        return "Welcome {0}!";
    }

}
