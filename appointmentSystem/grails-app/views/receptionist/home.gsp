<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="home.css"/>
    <title>Sheffield Surgeries | Receptionists Page</title>
</head>
<body>


<div id="content" role="main">

<div class="row">

<div class="first">
		<h3>Register Patients</h3>
<p>Please click here to register a new patient </p>
	<button type="button" class="btn btn-success">
	<g:link controller="patient" action="create">Register Patients</g:link>

</button>
</div>



<div class="second">
	<h3>Doctor Management</h3>
<p>Click here to register a new doctor</p>
	
	<button type="button" class="btn btn-success">
		<g:link controller="doctor" action="create">Register Doctors</g:link>
	</button>
</div>


<div class="first">
	<h3>Register Nurse</h3>
<p>Click here to register a new nurse</p>
	
	<button type="button" class="btn btn-success">
		<g:link controller="nurse" action="create">Register nurse</g:link>
	</button>
</div>


<div class="second">
	<h3>Register Receptionists</h3>
<p>Click here to register a receptionist</p>
	
	<button type="button" class="btn btn-success">
		<g:link controller="receptionist" action="create">Register Receptionist</g:link>
	</button>
</div>

<div class="first">
	<h3>Nurse Management</h3>
<p>Click here to manage the nurses i.e. Assigning to a Doctor</p>
	
	<button type="button" class="btn btn-success">
		<g:link controller="nurse" action="index">Manage Nurses</g:link>
	</button>
</div>

<div class="second">
	<h3>Patients Management</h3>
<p>Click here to manage a patient i.e. Assigning to a doctors</p>
	
	<button type="button" class="btn btn-success">
		<g:link controller="patient" action="index">Manage Patients</g:link>
	</button>
</div>

<div class="first">
	<h3>Patient Search</h3>
<p>Click here to search for patients</p>

	<button type="button" class="btn btn-success">
		<g:link controller="patient" action="advSearch">Search Patient</g:link>
	</button>
</div>
	


</div>
</div>
</body>
</html>

