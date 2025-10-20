<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import= "model.Questions" %>
    <%Questions q = (Questions) request.getAttribute("question"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz</title>
</head>
<body>
<h1>Question :</h1>
<%if (q != null) %>
<p><%= q.GetQuestion() %></p>
<form action="quiz" method="POST">
<input type="hidden" name="questionId" value="<%= q.GetId()%>">
Votre reponse : <input type="text" name="reponse" required>
<input type="submit" value="valider">
</form>
</body>
</html>