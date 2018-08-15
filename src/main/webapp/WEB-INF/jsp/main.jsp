<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="/webapp/js/jquery.js"></script>
<script src="/webapp/js/raphael.js"></script>
<script src="/webapp/js/jquery.usmap.js"></script>

<c:import url="/WEB-INF/jsp/header.jsp" />



<body>This working?</h1>
<div id="map" style="width: 300px; height: 300px;">


<script type="text/javascript">

$(document).ready(function() {
    $('#map').usmap({});
  });
</script>
</div>
</body>


<c:import url="/WEB-INF/jsp/footer.jsp" />


