package ure.enums;

import org.apache.commons.lang3.EnumUtils;
import org.junit.Test;

public class BaseQuestionTypeTest {
    @Test
    public void shouldReturnRightBaseQuestionType(){
        EnumUtils.isValidEnum(BaseQuestionType.class, "TRIGGER_ON_YES");
        EnumUtils.isValidEnum(BaseQuestionType.class,"HEAD");
    }
}
