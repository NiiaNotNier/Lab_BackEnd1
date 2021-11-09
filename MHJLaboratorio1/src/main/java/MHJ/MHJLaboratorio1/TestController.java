package MHJ.MHJLaboratorio1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/testHtml")
    public String Test() {
        return "test";
    }
}
