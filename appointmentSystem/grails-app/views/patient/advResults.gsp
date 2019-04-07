<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    
    <title>Patient Search</title>
</head>
<body>

	<div class="row">
<h1>Patient Search System</h1>
 <h3>Results </h3>

 <p>Searched
 for patients matching <em>${term}</em>.
 Found <strong> ${patients.size()}  </strong>  patients.
 </p>


 <ul>
 	<g:each var="patient" in="${patients}">

 	<li><g:link controller="patient" action="show"

	id="${patient.id}">  ${patient.patientName} </g:link></li>

	 </g:each>
 </ul>

	<g:link action='advSearch'>  Search Again</g:link>
</div>
</body>
</html>
