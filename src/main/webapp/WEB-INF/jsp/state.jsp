<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />



    <h1>API Test</h1>
    <div class="container">
            <input type="text" id="locationName" />
            <button id="btnSearch" class="btn btn-success">SEARCH</button>
    </div>
   	<h3>The Senators for the State of <span id="stateName"></span>:</h3>
   		<div id="senator1"></div>
   		<div id="senator2" /></div>
   		<br/>
   		<br/>
<!-- 	<div id="stateName"></div>
	<div id="districtName"></div>
	<div id="countyName"></div> -->
    
    
     	
        

<c:import url="/WEB-INF/jsp/footer.jsp" />