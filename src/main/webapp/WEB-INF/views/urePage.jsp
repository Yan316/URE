<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <link href="resources/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="resources/css/ure.css" rel="stylesheet">
</head>
<body>
<h1>URE</h1>
<c:forEach var="i" begin="0" end="${fn:length(questions)}">
<c:choose>
<c:when test='${questions[i].rawBaseQuestion.baseQuestionType eq "HEADING"}'>
<c:if test="${i ne 0}">
    </div>
    </div>
</c:if>
<div class="row-fluid">
    <div class="span2 header-question" id="${questions[i].rawBaseQuestion.baseQuestionId}">
            ${questions[i].rawBaseQuestion.baseQuestionText}
    </div>
    <div class="span6">
        </c:when>
        <c:when test='${questions[i].rawBaseQuestion.baseQuestionType eq "TRIGGER_ON_YES"}'>
            <div>
                <label class="question-text">
                        ${questions[i].rawBaseQuestion.baseQuestionText}
                </label>
                <div class="question-label">
                    <label class="radio-button"
                           for="${questions[i].rawBaseQuestion.baseQuestionId}_YES">YES </label>
                    <input style="visibility:hidden;" type="radio" name="${questions[i].rawBaseQuestion.baseQuestionId}" id="${questions[i].rawBaseQuestion.baseQuestionId}_YES"/>
                    <label class="radio-button"
                           for="${questions[i].rawBaseQuestion.baseQuestionId}_NO">NO </label>
                    <input style="visibility:hidden;" type="radio" name="${questions[i].rawBaseQuestion.baseQuestionId}" id="${questions[i].rawBaseQuestion.baseQuestionId}_NO"/>
                </div>
            </div>
        </c:when>
        </c:choose>
        </c:forEach>
    </div>
</div>
</body>
</html>