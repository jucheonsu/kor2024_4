package day53task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class);
    }
}

@RestController
class day53taskController {

    @GetMapping("/day53task")
    public String getMethod() {
        return "GET 메소드 통신 성공";
    }

    @PostMapping("/day53task")
    public String postMethod() {
        return "POST 메소드 통신 성공";
    }

    @PutMapping("/day53task")
    public String putMethod() {
        return "PUT 메소드 통신 성공";
    }

    @DeleteMapping("/day53task")
    public String deleteMethod() {
        return "DELETE 메소드 통신 성공";
    }

}