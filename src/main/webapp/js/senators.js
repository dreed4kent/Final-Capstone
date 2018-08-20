var allTheDatas;
$(document).ready(function () {

	function getQueryVariable(variable)
	{
	       var query = window.location.search.substring(1);
	       var vars = query.split("&");
	       for (var i=0;i<vars.length;i++) {
	               var pair = vars[i].split("=");
	               if(pair[0] == variable){return pair[1];}
	       }
	       return(false);
	}
	
    $("#btnSearch").on("click", function (event) {
    	//var parts = "http://localhost:8080/capstone/state?CSRF_TOKEN=jmeKjBtjYShPb4tJohbQUg%3D%3D&locationName=Alabama".split('=');
    	//var userAddress = parts.pop() || parts.pop();
    	
    	
    	var userAddress = getQueryVariable("locationName");
    	alert(userAddress);
      
    	
    	
    	
    	
        var url = "https://www.googleapis.com/civicinfo/v2/representatives";
        
        
        var apiUrl = url;
        $.ajax({
            url: apiUrl,
               data: {
                   address: userAddress,
                key: "AIzaSyCZom8UkHqmSzLcAWfnfL41vOfirikaS3w"
            },
            type: "GET",
            dataType: "json"
        }).done(function (data) {
        	
        	if (data.normalizedInput.line1 != "") {
            	$("#districtName").html(data.divisions[data.offices[3].divisionId].name);
            	$("#countyName").html(data.divisions[data.offices[13].divisionId].name);
        	}
        	
        	
//changing what comes after the "data." gets the data from that specific part of the api
        	console.log(data);
        	console.log(data.divisions);
        	allTheDatas = data;
        	$("#stateName").html(data.divisions[data.offices[2].divisionId].name);
        	$("#rep").html(data.officials[3]);
        	if (data.normalizedInput.state != "DC") {
        	//Senator #1
            $("#senator1").html(data.officials[2].name);
            $("#senator1WebSite").html(data.officials[2].urls);
            $("#senator1Party").html(data.officials[2].party);
            $("#senator1PhoneNumber").html(data.officials[2].phones);
            $("#senator1Address").html(data.officials[2].address);
            $("#senator1Image").html(data.officials[2].photoUrl);
        	
        	
        	//Senator #2
            $("#senator2").html(data.officials[3].name);
            $("#senator2WebSite").html(data.officials[3].urls);
            $("#senator2Party").html(data.officials[3].party);
            $("#senator2PhoneNumber").html(data.officials[3].phones);
            $("#senator2Address").html(data.officials[3].address);
            $("#senator2Image").html(data.officials[3].photoUrl);
            
            //Local Representative
            $("districtName").html(data.divisions[data.offices[3].divisionId].name);
            $("#representativeName").html(data.officials[4].name);
           $("#representativeWebSite").html(data.officials[4].urls);
            $("#representativeParty").html(data.officials[4].party);
            $("#representativePhoneNumber").html(data.officials[4].phones);
            $("#representativeFB").html(data.officials[4].channels[0].id);
            $("#representativeTwitter").html(data.officials[4].channels[1].id);
            $("#representativeYouTube").html(data.officials[4].channels[2].id);
            $("#representativeGooglePlus").html(data.officials[4].channels[3].id);
            representativeTwitter
//            $("#representativeImage").html(data.officials[4].photoUrl);
        	} else {
        		alert("Taxation Without Representation");
        		$("#senator1").html("Washington D.C. has no Sentators");
        	}
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    });


});