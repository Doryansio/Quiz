<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des questions</title>
</head>
<body>
<h1>Liste des questions</h1>


<table>
<thead>
	<tr>
		<th>Id</th>
		<th>Question</th>
		<th>Reponse</th>
	</tr>
</thead>
<c:forEach var="q" items="${listeQuestions}">
<tr>
                <td>${q.id}</td>
                <td>${q.question}</td>
                <td>${q.response}</td>
</tr>
</c:forEach>
</table>
<form action="${pageContext.request.contextPath}/AdminQuestion" method="post">

<input type="text" name="question" >
<input type="text" name = "reponse">
<button>Ajouter la question</button>
</form> 
            
<button onclick="window.location.href='http://localhost:8080/quiz/Acceuil.html';"> retour au menu </button>

</body>
</html>