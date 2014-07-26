package ure.mvc;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class UreControllerTest {
    @Test
    public void shouldGetUrePage(){
        //Given
        UreController ureController = new UreController();

        //When

        //Then
         assertThat(ureController.onView(),is("urePage"));
    }
}
