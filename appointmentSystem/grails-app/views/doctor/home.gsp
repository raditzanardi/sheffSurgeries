<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="home.css"/>
    <title>Sheffield Surgeries | Doctors Page</title>
</head>
<body>


<div id="content" role="main">

<div class="row">

<div class="first">
		<h3>Create Prescription</h3>
<p>Please click here to create new prescriptions </p>
	<button type="button" class="btn btn-success">
	<g:link controller="prescription" action="create">Create prescription</g:link>

</button>
</div>



<div class="second">
	<h3>View Prescriptions</h3>
<p>Click here to view the available prescriptions</p>
	
	<button type="button" class="btn btn-success">
		<g:link controller="prescription" action="index">View Prescriptions</g:link>
	</button>
</div>


<div class="first">
	<h3>Patiens</h3>
<p>Click here to view the registered patients</p>
	
	<button type="button" class="btn btn-success">
		<g:link controller="patient" action="index">View patients</g:link>
	</button>
</div>

<div class="second">
	<h3>View Appointments</h3>
<p>Click here to view appointments</p>
	
	<button type="button" class="btn btn-success">
		<g:link controller="appointment" action="index">View Appointments</g:link>
	</button>
</div>

<div class="first">
	<h3>Prescription Search</h3>
<p>Click here to search for prescriptions</p>

	<button type="button" class="btn btn-success">
		<g:link controller="prescription" action="advSearch">Search Prescriptions</g:link>
	</button>
</div>

</div>
</div>
</body>
</html>
