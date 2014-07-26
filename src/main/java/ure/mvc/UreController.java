package ure.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UreController {
    @RequestMapping(value = "/home", method=RequestMethod.GET)
    public String onView() {
        return "urePage";
    }

}
