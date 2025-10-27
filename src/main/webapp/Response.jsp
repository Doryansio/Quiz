<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.Questions" %>
<% Questions q = (Questions) request.getAttribute("question");
String reponseUtilisateur = (String) request.getAttribute("reponseUtilisateur");
boolean correct = (Boolean) request.getAttribute("correct");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Question : <%=q.getQuestion()%></p>
<p> Reponse : <b><%= reponseUtilisateur %></b></p>

<% if (correct){ %>
	<p style="color: green;"> Bonne reponse! </p>
	<%} else { %>
	<p style="color:red;"> Mauvaise  reponse! </p>
	<%} %>
	
<p> <a href="quiz"> Nouvelle question</a>

</body>
</html>