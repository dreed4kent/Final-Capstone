var allTheDatas;
$(document).ready(function () {
//API working (sort of)	
    $("#btnSearch").on("click", function (event) {
        
        var url = "https://www.googleapis.com/civicinfo/v2/representatives";
        var userAddress = $("#locationName").val();
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
        	} else {
        		alert("Taxation Without Representation");
        		$("#senator1").html("Washington D.C. has no Sentators");
        	}
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    });


});