package ure.mvc;

import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class UreControllerTest {
    private UreController ureController;
    private ModelMap modelMap;
    @Before
    public void setUp() throws Exception {
       ureController = new UreController();
        modelMap = new ModelMap();
     }

    @Test
    public void shouldGetUrePage() throws IOException, ParseException {
        //Given

        //When

        //Then
         assertThat(ureController.onView(modelMap).getViewName(),is("urePage"));
    }

    @Test
    public void shouldGetUreResource() throws IOException, ParseException {
        //Given

        //When
        ModelAndView modelAndView = ureController.onView(modelMap);

        //Then
        assertThat(modelAndView.getModelMap().get("questions"), is(notNullValue()));
        assertThat(modelAndView.getModelMap().get("questions").toString(), is(not("")));

    }
}
