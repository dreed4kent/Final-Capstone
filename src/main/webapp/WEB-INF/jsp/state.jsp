<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

 	<h3><span id="stateName"></span>:</h3>
 	<div class="senator"> <h4>Senators:</h4> 
 		<b><div id="senator1"/></div></b>
  		<div id=senator1Party /></div>
  		<div id="senator1Address" /></div>
  		<div id="senator1PhoneNumber"/></div>
  		<div id="senator1WebSite" /></div>
  		
  		<c:url var="website1" value="${senator1WebSite}"></c:url>
  		<div class="senatorWebsite1"><a href="${website1}">Senator's Website</a></div>
  		<div id="senator1" /></div>
  		<!-- <img src="senator1Image"/> -->
 	</div>
 	<br/>
 	<div class="senator">
 		<b><div id="senator2" /></div></b>
  		<div id="senator2Party" /></div>
  		<div id="senator2Address" /></div>
  		<div id="senator2PhoneNumber" /></div>
  		<div id="senator2WebSite" /></div>
  		<div id="senator2" /></div>
  		<!-- <img src="senator2Image"/> -->
 	</div>
 	<br/>
 	<div class="governor"><h4>Governor:</h4>
 		<b><div id="governorName"></div></b>
   		<div id="governorParty"></div>
  		<div id="governorPhoneNumber"></div>
  		<div id="governorWebSite"></div> 
   		<div>https://www.facebook.com/<span id="governorFB"></span></div>
  		<div>https://twitter.com/<span id="governorTwitter"></span></div>
  		<div>https://www.youtube.com/results?search_query=UCtVl3kb7Xvt3pY7l6x-M6LA<span id="governorYouTube"></span></div>
  		<div>https://plus.google.com/<span id="governorGooglePlus"></span></div>
 	</div>
 	<br/>

	<div>
		<c:url var="district" value="/districtInput"/>
		<form method="GET" action="${district}">
			<input type="text" id="districtSearch"/>
			<button id="districtButtonSearch">Enter your address to find your Reps!</button>
		</form>
	</div>

<%-- 	<c:url var="formAction" value="/district" />
	<form class="districtSearch" method="GET" action=district>
<input type="hidden" name="CSRF_TOKEN" value="${CSRF_TOKEN}"/> --%>
  <script type="text/javascript" src="${state}"></script>
     	
        

<c:import url="/WEB-INF/jsp/footer.jsp" />