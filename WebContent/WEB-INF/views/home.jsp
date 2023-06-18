<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Welcome to ChessComp repository!</h1>

	<a href="/getSchedule">Clique aqui para saber programação de jogos!</a>
	<br><br>

	<h3>Procurar jogos planejados por:</h3>

	<h4>Hotel (digite o nome do hotel)</h4>
	<form action="/getGamesByHotel" method="post">
		<input type="text" name="username" /><input type="submit" value="Submit" />
	</form>
	<h4>Jogador (digite o número associado do jogador)</h4>
	<form action="/getGamesByPlayer" method="post">
		<input type="text" name="username" /><input type="submit" value="Submit" />
	</form>
	<h4>Árbitro (digite o número associado do árbitro)</h4>
	<form action="/getGamesByReferee" method="post">
		<input type="text" name="username" /><input type="submit" value="Submit" />
	</form>
</body>
</html>