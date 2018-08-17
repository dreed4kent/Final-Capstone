<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />



    <h1>API Test</h1>
    <div class="container">
            <input type="text" id="locationName" />
            <button id="btnSearch" class="btn btn-success">SEARCH</button>
    </div>
   	<h3>The Senators for the State of <span id="stateName"></span>:</h3>
   		<div class="senator">
   			<div id="senator1"/></div>
	   		<div id=senator1Party /></div>
	   		<div id="senator1Address" /></div>
	   		<div id="senator1PhoneNumber" /></div>
	   		<div id="senator1WebSite" /></div>
	   		<div id="senator1" /></div>
	   		<!-- <img src="senator1Image"/> -->
   		</div>
   		<br/>
   		<br/>
   		<div class="senator">
   			<div id="senator2" /></div>
	   		<div id="senator2Party" /></div>
	   		<div id="senator2Address" /></div>
	   		<div id="senator2PhoneNumber" /></div>
	   		<div id="senator2WebSite" /></div>
	   		<div id="senator2" /></div>
	   		<!-- <img src="senator2Image"/> -->
   		</div>
   		<br/>
   		<br/>
<!-- 	<div id="stateName"></div>
	<div id="districtName"></div>
	<div id="countyName"></div> -->
    
    
     	
        

<c:import url="/WEB-INF/jsp/footer.jsp" />