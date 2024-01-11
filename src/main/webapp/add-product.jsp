<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
	<h1>Add Product Details</h1>
	<form action="addProduct" method="post" class="productForm" enctype="multipart/form-data">
	<label for="">Enter Product Id</label><br> 
	<input type="number" id="id" name="productId"><br>
	
	<label for="name">Enter Product Company Name</label> <br>
	<input type="text" id="name" name="productCompanyName"><br>
	
	
	<label for="name">Enter Product Type</label> <br>
	<select id="productType" name="productType">
		<option value="Pant">Pant</option>
		<option value="Shirt">Shirt</option>
		<option value="Jeans">Jeans</option>
	</select><br>
	
	<label for="price">Enter Product Price</label> <br>
	<input type="number" id="price" name="productPrice"><br>
	
		<label for="productWEarType">Enter Product  Wear Type</label> <br>
	<select id="productWearType" name="productWearType">
		<option value="Men's">Men's</option> 
		<option value="Women's">Women's</option>
		<option value="Kid's">Kid's</option>
	</select><br>
	
	<label>User Photo:</label>
	<input type="file" name="photo" size="50"/>
	<input type="submit" value="addproduct"> 
	 	
	</form>
	</div>
</body>
</html>