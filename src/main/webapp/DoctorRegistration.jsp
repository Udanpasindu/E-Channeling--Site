<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Components/HospitalNav.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/Register.css">
<script>
document.addEventListener("DOMContentLoaded", function () {
    var phoneInput = document.getElementById("phone");
    
    phoneInput.addEventListener("input", function () {
        var phoneNumber = phoneInput.value;
        // Remove any non-digit characters from the phone number
        phoneNumber = phoneNumber.replace(/\D/g, "");
        
        // Check if the phone number contains exactly ten digits
        if (phoneNumber.length !== 10) {
            phoneInput.setCustomValidity("Phone number must contain ten digits.");
        } else {
            phoneInput.setCustomValidity(""); // Reset the validation
        }
    });
});
</script>
</head>
<body>
<div class="form1">
    <div class="header">
      <h2 class="animation a1">Add a new Doctor</h2>
      
    </div>
    <form class="form" action="dadd" method="post" enctype="multipart/form-data">
    			
    			 <fieldset>
         		 <legend>Doctor Details</legend>

                 <input class="box" type="text" name="dname"  placeholder="Doctor Name" required><br>
                Add image :<input type="file" name="dimage"><br>
                <input class="box" type="text" name="MedID"  placeholder="Medical ID" required><br>
                Specialization:
                <select class="box"  name="Special">
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
        	</select><br>
                <input class="box" type="email" name="Email"  placeholder="E-Mail" required> <br>  
                <input class="box" type="text" name="Phone" id="phone"  placeholder="Phone" required>  <br> 
                <input class="box" type="text" name="username"  placeholder="Username" required> <br>               
                <input class="box" type="password" name="password"  placeholder="Password" required><br>
         		<input class="box" type="password" name="conpassword"  placeholder="Confirm Password" required><br>
         		</fieldset>
  
                
         		 
         		 <fieldset>
         		 <legend>Channelling Details</legend>
         		 <input class="box" type="text" name="RoomNO"  placeholder="Room Number" required><br>
                <input class="box" type="text" name="Time"  placeholder="Channeling Time" required><br>
                
                 		<label for="weekday">Saturday</label>
					    <input type="radio" name="day" id="weekday" value="Saturday" required><br>
					
					    <label for="weekend">Sunday</label>
					    <input type="radio" name="day" id="weekend" value="Sunday" required><br>
         		 </fieldset>
         		 
         		
            <button type="submit">Add Doctor</button>
    </form>


   </div>
</body>
</html>