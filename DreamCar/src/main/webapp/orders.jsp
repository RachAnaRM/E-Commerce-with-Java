<%@ page import = "cn.packagename.connection.DBConnection" %>
<%@ page import="cn.packagename.model.*"%>
<%@ page import="java.util.*"%>

<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% User auth = (User) request.getSession().getAttribute("auth"); 
	if(auth != null) {
		request.setAttribute("auth", auth);
	}
%>

<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Orders</title>
<%@ include file= "includes/head.jsp" %>
</head>
<body>
<%@ include file= "includes/navbar.jsp" %>


<%@ include file= "includes/footer.jsp" %>

</body>
</html>