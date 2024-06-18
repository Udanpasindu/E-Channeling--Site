<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/PatientRegister.css">
    <script type="text/javascript">
        function validateNIC() {
            var nic = document.getElementById("nic").value;
            var nicPattern = /^[0-9]{9}[vV]$|^[0-9]{12}$/;
            if (!nicPattern.test(nic)) {
                alert("NIC should contain 12 numbers or 9 numbers + 'v' or 'V'.");
                return false;
            }
            return true;
        }
    </script>
    
    <meta charset="ISO-8859-1">
    <title>E-channeling</title>
</head>
<body>
    
        
        <div class="form1">
      
        <div class="image0">
        	  <div class="home">
        	<a href="Home.jsp">Back to home</a>
        </div>
	        <img src="images/signup.jpg" width="80%"><br>
        </div>
        <form class="form" action="insert" method="post" onsubmit="return validateNIC();">
	         <div class="header">
	            <h2 class="animation a1">Register On DocLinkOnline</h2>
	        </div>
	        <label class="name">Username</label><br>
            <input class="box" type="text" name="name" id="name" placeholder="Username" required><br>
            <label class="name">Age</label><br>
            <input class="box" type="number" name="age" id="age" placeholder="Age" required><br>
            <label class="name">NIC</label><br>
            <input class="box" type="text" name="nic" id="nic" placeholder="NIC" required><br>
            <label class="name">Phone</label><br>
            <input class="box" type="text" name="phone" id="phone" placeholder="Phone" required><br>
            <label class="name">Address</label><br>
            <input class="box" type="text" name="address" id="address" placeholder="Address" required><br>
            <label class="name">Password</label><br>
            <input class="box" type="password" name="password" id="password" placeholder="Password" required><br>
            <label class="name">Confirm Password</label><br>
            <input class="box" type="password" name="conpassword" id="conpassword" placeholder="Confirm Password" required><br>
            <button class="btn" type="submit">Register</button>
             
            	       
            
        </form>
    </div>
</body>
</html>
