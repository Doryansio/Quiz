<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
    <%@page import="Data.DataQuestions" %>
    <%@page import="model.Questions" %>
    <%
    List<Questions> liste = (List<Questions>) request.getAttribute("listeQuestions");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des questions</title>
</head>
<body>
<h1>Liste des questions</h1>
<%
	if(liste != null && !liste.isEmpty()){ %>
		<ul>
		<% for (Questions q : liste) { %>
		<li><%= q.GetQuestion() %></li>
		<% } %>
	
		</ul>
	<%} else { %>
		<p> Aucune question disponible.</p>
	<%} %>
	

</body>
</html>