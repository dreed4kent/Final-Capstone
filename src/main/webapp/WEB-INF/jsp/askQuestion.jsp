<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<%-- <c:url var ="askQuestionURL" value="/askQuestion"/> --%>

<form>
	<div>Enter Your Question Here:</div>
	<input type="text">
	<button>Submit Question</button>


</form>






<c:import url="/WEB-INF/jsp/footer.jsp" />