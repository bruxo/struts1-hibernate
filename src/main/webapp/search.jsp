<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
<head>
<title>ABC, Inc. Human Resources Portal - Employee Search</title>
</head>
<body>

	<font size="+1"> ABC, Inc. Human Resources Portal - Employee Search </font>
	<br>
	<hr width="100%" noshade="true">

	<html:errors />

	<html:form action="/search">

		<table>
			<tr>
				<td align="right"><bean:message key="label.search.name" />:</td>
				<td><html:text name="SearchForm" property="name" /></td>
			</tr>
			<tr>
				<td></td>
				<td>-- or --</td>
			</tr>
			<tr>
				<td align="right"><bean:message key="label.search.ssNum" />:</td>
				<td><html:text name="SearchForm" property="ssNum" /> (xxx-xx-xxxx)</td>
			</tr>
			<tr>
				<td></td>
				<td><html:submit /></td>
			</tr>
		</table>

	</html:form>
	
</body>
</html>