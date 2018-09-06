<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to our Recipe Finder</h1>
<h3>The best recipe finder in the greater Grand Circus area</h3>

<form action="/results/ingredientSearch" method="post">
			<p>
			<label for="ingredients">Ingredient: <input name="ingredients" required minlength="2"/> </label>
			</p>
			<p>
			<button type="submit" class="btn btn-outline-success">Submit!</button>
			</p>
		</form>

</body>
</html>