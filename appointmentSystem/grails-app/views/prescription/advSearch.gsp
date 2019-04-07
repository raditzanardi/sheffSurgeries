<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    
    <title>Prescription Search</title>
</head>
<body>

<div class="row">
<h1>Prescription Seacrh System</h1>

<formset>
 <legend>Search for Prescriptions</legend>

<table>
 <g:form action="advResults">

<tr>
 <td>Medicine</td>
 <td><g:textField name="medicine" /></td>
 </tr>

<tr>
 <td>Days of Supply</td>
 <td><g:textField name="daysOfsupply" /></td>
 </tr>

<tr>
 <td>Total Cost Required</td>
 <td><g:textField name="totalCost" /></td>
 </tr>

<tr>
 <td>Query Type:</td>
 <td><g:radioGroup name="queryType" labels="['And','Or','Not']"
values="['and','or','not']" value="and" >
${it.radio} ${it.label}
 </g:radioGroup>
 </td>
 </tr>

<tr>
 <td/>
 <td>
 <g:submitButton name="search" value="Search"/></td>
 </tr>
 </g:form>
 </table>
 </formset>
</div>
 </body>
</html>
