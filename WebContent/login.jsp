<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
<link rel="stylesheet" href="styles.css" type="text/css">
</head>
<body>
	<br>
	<h2>家計簿アプリ</h2><br>
	
	
	<form action="HogeHogeServlet" method="POST">
		<p>
		　ID　　<input type="text" id="userID" name="userID"><br><br>
		PASS　　<input type="password" id="userPassword" name="userPassword">
		<!-- <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password" required maxlength='20'> -->
		</p><br>
		
		<h4 style="color: red">${msg}</h4>
		
		<button type="reset" value="クリア">
		<button type="submit" value="ログイン" />
		
		<input type="hidden" name="formName" value="userInfo">
		<input type="hidden" name="actionName" value="action">
		<input type="hidden" name="actionMethodName" value="login">
	</form>
	
</body>
</html>