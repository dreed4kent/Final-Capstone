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
            console.log($("#working").html(data.kind));
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    });


});