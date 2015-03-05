<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="datos.*" %>
<%@ page import="java.util.*" %>
<%@ page import="tp.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Holis
<%
 // = new ArrayList<Lavarropas>();
datos.CatalogoLavarropas cat = new CatalogoLavarropas();
ArrayList<Lavarropas> lista = cat.getLavarropas();


for(int i=0; i<lista.size();i++)
{
	//response.getWriter().print(lista.get(i));
	out.print(lista.get(i));
}
%>
</body>
</html>