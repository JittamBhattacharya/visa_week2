<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>What is the capital of Karnataka?</h3>
<p>Answer :${Hint}</p>
<p>Life :${Life} </p>
<form method="post" action="/game">
Write your character:<t><input type="text" name="guess">
<button type="submit" > Submit your answer</button>
</form>

</body>
</html>