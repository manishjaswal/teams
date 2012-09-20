<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Visit</title>
</head>
<body>
   <h1>Visit Details</h1>
   <s:form action="test">
   <table>
   <tbody>
  <tr>   <td> <b>Client Details </b></td></tr>
     
  <tr>    <s:textfield  type="text" label="Name" name="client.name"/> </tr>
            
      <tr><s:textfield  type="text" label="E-mail" name="client.emailId"/></tr>
          
     <tr> <s:textfield  type="text" label="Phone(Office)" name="client.phoneOffice"/></tr>
           
     <tr> <s:textfield  type="text" label="Phone(Mobile)" name="client.phonePersonal"/></tr>

  <tr>    <s:textfield  type="text" label="Phone(Local)" name="client.phoneLocal"/></tr>
  <tr>   <td> <b>Client Organization Details </b></td></tr>
       
  <tr>    <s:textfield  type="text" label="Organization Name" name="client.clientOrganization.organizationName"/></tr>
        
  <tr>    <s:textfield  type="text" label="Other Details" name="client.clientOrganization.otherDetails"/></tr>
  <tr>   <td> <b>Visiting Locations </b></td></tr>
      
         
  <tr>    <s:select list="response"  label="Location"  name="visitingLocations"/></tr>
          
   <tr>   <s:textfield  type="text" label="Date of Visit" name="dateOfVisit"/></tr>
   <tr>    <td>  <b>   Other Details</b> </td></tr>
      
           
  <tr>    <s:textfield label="Remarks" type="text" name="remarks"/> </tr>
           
  <tr >    <s:submit  type="submit" value="Submit"/> </tr>
      <tbody>
      </table>
   </s:form>
</body>
</html>