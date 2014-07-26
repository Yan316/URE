package ure.domain;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;

public class UreTest {
    @Test
    public void shouldGetUreQuestions() throws IOException, ParseException {
        //Given
        Ure ure = new Ure();

        //When
        JSONArray ureJson = ure.getUreQuestions();

        //Then
        assertThat(ureJson, is(notNullValue()));
        assertThat(ureJson.size(), is(not(0)));
    }
}
