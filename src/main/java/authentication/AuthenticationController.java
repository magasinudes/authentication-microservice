package authentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/health")
<<<<<<< HEAD
    public String health() {return "ok"; }
=======
    public String health() {
        return "ok";
    }
>>>>>>> Added health point and unit test
}