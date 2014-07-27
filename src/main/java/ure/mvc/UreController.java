package ure.mvc;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ure.domain.Ure;

import java.io.IOException;

@Controller
public class UreController {
    @RequestMapping(value = "/home", method=RequestMethod.GET)
    public ModelAndView onView(ModelMap model) throws IOException, ParseException {
        Ure ure = new Ure();
        model.put("questions",ure.getUreQuestions());
        return new ModelAndView("urePage", model);
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String onSubmit() {
        return "success";
    }

}
