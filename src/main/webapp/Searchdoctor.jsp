<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>DocLinkOnline</title>
	<link rel="stylesheet" href="Components/searchDoc.css">
</head>
	<body>
		<div class="background"><br>
			<form class="search1" action="Docsearch1" method="post" >
				<select class="box"  name="Special" >
					            <option value="Cardiologist">Cardiologist</option>
					            <option value="Dermatologist">Dermatologist</option>
					            <option value="Gastroenterologist">Gastroenterologist</option>
					            <option value="Oncologist">Oncologist</option>
					            <option value="Pediatrician">Pediatrician</option>
					            <option value="Neurologist">Neurologist</option>
					            <option value="Psychiatrist">Psychiatrist</option>
					            <option value="OrthopedicSurgeon">Orthopedic Surgeon</option>
					            <option value="Ophthalmologist">Ophthalmologist</option>
					            <option value="Urologist">Urologist</option>
					            <option value="OrthopedicSurgeon">Nephrologist</option>
					            <option value="Ophthalmologist">Geriatrician</option>
					            <option value="Urologist">Hematologist</option>
			    </select>
			        	<input class="box" type="text" name="docname"  placeholder="Doctor Name" required>
			        	<input class="Button" type="submit" name="docname" value="Search"> <br> 
			</form><br>
		</div>
	</body>
</html>