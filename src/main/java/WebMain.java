

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hlw.controller"})
public class WebMain {
    public static void main(String[] args) {
        SpringApplication.run(WebMain.class);
    }
}
