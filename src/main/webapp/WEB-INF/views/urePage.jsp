<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <link href="resources/bootstrap/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<h1>URE</h1>
<c:forEach var="i" begin="0" end="${fn:length(questions)}">
    <c:if test='${questions[i].rawBaseQuestion.baseQuestionType eq "HEADING"}'>
        <div class="row-fluid">
            <div class="span4">
                    ${questions[i].rawBaseQuestion.baseQuestionText}
            </div>
            <div class="span8">
            </div>
        </div>

    </c:if>
</c:forEach>
</body>
</html>