<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />
		<c:url var="formAction" value="/state" />
		<form method="GET" action="${formAction}">
	<%-- 	<input type="hidden" name="destination" value="${param.destination}"/> --%>
		<input type="hidden" name="CSRF_TOKEN" value="${CSRF_TOKEN}"/>


    <h1>API Test</h1>
    <div class="container">
            <input type="text" id="locationName" />
            <button id="btnSearch" class="btn btn-success">SEARCH</button>
        </div>
   
        <h1 id="working">'${working}'</h1>
      <!-- address info to copy and paste to try -->
        <h4>1275 Kinnear Rd, Columbus, OH 43212</h4>
        

<c:import url="/WEB-INF/jsp/footer.jsp" />