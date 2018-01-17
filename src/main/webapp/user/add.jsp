<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script type="text/javascript">
		function postForm(method){
			var form = document.getElementById('formAdd');
			form.elements["dispatch"].value = method;
			form.submit();
		}
	</script>
</head>
<body>
	<html:form action="/user" styleId="formAdd">
		<html:hidden property="dispatch" />
		<table>
			<tr>
				<td>User name</td>
				<td><html:text property="name" size="20" /></td>
			</tr>
			<tr>
				<td>User age</td>
				<td><html:text property="age" size="3" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><html:button value="Add" property=""
						onclick="postForm('addUser')" /></td>
			</tr>
		</table>
	</html:form>
	
	<font color="green" size=2> 
		<logic:present name="success">
			User added successfully! 
		</logic:present>
	</font>
	
	<font color="red" size=2> 
		<logic:present name="failure">
			Ooops, an error occurred!! 
		</logic:present>
	</font>	
	<br><br>
	<html:link href="${pageContext.request.contextPath}/"> Home </html:link>
</body>
</html>