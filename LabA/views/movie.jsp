<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%--
	On this page we have a form to edit a single movie and a button to delete it.
	
	Model:
	- Movie movie
 --%>
<html>
<head>
	<title>Movies</title>
	<link href="<c:url value="/resources/main.css"/>" rel="stylesheet"/>
</head>
<body>
<div class="nav">
	<a href="<c:url value="/"/>">Home</a>
	<a href="<c:url value="/movies"/>">Back to Movies List</a>
</div>
<h1>
	Movie: ${ movie.title }
</h1>

<form method="post">
	<div>
		<label>Title</label>
		<input type="text" name="title" value="${movie.title}"/>
	</div>
	<div>
		<label>Category</label>
		<input name="category" value="${movie.category}"/>
	</div>
	<div>
		<label>Description</label>
		<textarea name="description">${movie.description}</textarea>
		</div>
		<div>
		<label>Year Released</label>
		<input type="number" name="year" value="${movie.year}"/>
		</div>
		<div>
		<label>Rating:</label>
		<select name="mydropdown">
			<option value="G"> G</option>
			<option value="PG"> PG</option>
			<option value="PG13"> PG13</option>
			<option value="R">R</option>
		</select>
		</div>
		<label>Origin:</label>
		<input type="radio" name="origin" value="HollyWood">HollyWood
		<input type="radio" name="origin" value="Foreign">Foreign
		<input type="radio" name="origin" value="Independent">Independent
		<div>
		<button type="submit">Save Changes</button>
		</div>
</form>

<form method="post" action="<c:url value="/movies/${movie.id}/delete"/>">
	<button type="submit">Delete this Movie</button>
</form>

</body>
</html>