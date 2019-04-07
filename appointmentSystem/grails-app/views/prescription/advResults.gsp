<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    
    <title>Prescription Search</title>
</head>
<body>

<div class="row">
<h1>Prescription Search System</h1>
 
	<h3>Results</h3>

 	 <p>Searched
 
	for prescriptions matching <em>${term}</em>.

	Found <strong> ${prescriptions.size()} </strong> prescriptions.
 
</p>

 <ul>
 	<g:each var="prescription" in="${prescription}">

 	<li><g:link controller="prescription" action="show"

	id="${prescription.id}">${prescription.medicine}</g:link></li>
	 </g:each>
 </ul>

	<g:link action='advSearch'>Search Again</g:link>
</div>
</body>
</html>
