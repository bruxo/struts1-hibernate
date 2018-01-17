<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<ul>
		<li><html:link href="${pageContext.request.contextPath}/user.do?dispatch=goToSearchPage">Search user</html:link></li>
		<li><html:link href="${pageContext.request.contextPath}/user.do?dispatch=goToAddPage">Add user</html:link></li>
	</ul>
</body>
</html>