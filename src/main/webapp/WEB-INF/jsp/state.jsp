<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<!--     <div class="container">
            <input type="text" id="locationName" />
            <button id="btnSearch" class="btn btn-success">SEARCH</button>
    </div> -->
   	<h3><span id="stateName"></span>:</h3>
   		<div class="senator"> <h4>Senators:</h4> 
   			<b><div id="senator1"/></div></b>
	   		<div id=senator1Party /></div>
	   		<div id="senator1Address" /></div>
	   		<div id="senator1PhoneNumber" /></div>
	   		<div id="senator1WebSite" /></div>
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
<!-- 	<div id="stateName"></div>
	<div id="districtName"></div>
	<div id="countyName"></div> -->
    
  <script type="text/javascript" src="${state}"></script>
     	
        

<c:import url="/WEB-INF/jsp/footer.jsp" />