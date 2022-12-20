<!DOCTYPE html>
<html>
<head>
<title>Student Information Form</title>
<script type="text/javascript">
function valid() 
{

var regEx = /^[a-z][a-z\s]*$/;
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
var ag = document.getElementById("age").value;
var mno = document.getElementById("pno").value;
if(!fnm.value.match(regEx))
{
   alert("Please enter letters and space and small case only .");
    return false;
}
if(!lnm.value.match(regEx))
{
   alert("Please enter letters and space only.");
    return false;
}
if(isNaN(ag)||ag<18||ag>50)
{
alert("The age must be a number between 18 and 50");
return false;
}
if(!eid.value.match(mailformat)) 
{  
alert("E-mail ID is not valid");
return false;
}
if(mno==""||mno==null)
{
alert("Enter The Phone No");
return false;
}
if(isNaN(mno)||mno.length>10||mno.length<10)
{
alert("The mobile no. always has 10 digit numerical value");
return false;
}
alert("The Student Information Submitted Successfully");
}
</script>
</head>
<body>
<center><b>
<h3>Student Registration Form</h3>
<form action="" onsubmit="return valid()" method="post">
First Name: <input type="text" id="fnm"><br><br>
Last Name: <input type="text" id="lnm"><br><br>
Age: <input type="text" id="age"><br><br>
Email id: <input type="text" id="eid"><br><br>
Phone Number: <input type="text" id="pno"><br><br>
<input type="submit" value="Submit">
</form>
</b></center>
</body>
</html>
