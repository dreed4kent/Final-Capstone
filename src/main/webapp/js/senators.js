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
//changing what comes after the "data." gets the data from that specific part of the api
        	console.log(data);
        	console.log(data.divisions);
        	allTheDatas = data;
        	$("#stateName").html(data.divisions[data.offices[2].divisionId].name);
        	$("#districtName").html(data.divisions[data.offices[3].divisionId].name);
        	$("#countyName").html(data.divisions[data.offices[13].divisionId].name);
            $("#senator1").html(data.officials[2].name);
            $("#senator2").html(data.officials[3].name);
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    });


});