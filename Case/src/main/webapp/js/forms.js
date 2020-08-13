function fnvalid_pincode()

	{

		var pincode=document.getElementById("pincode").value;

		var cno=document.getElementById("cno").value;

		if(cno.length!=10)

		{

			alert("Contact no length must 10");

			return false;

		}else if(pincode.length!=6)

		{

			alert("pincode length must 6");

			return false;

		}

		return true;

	}



function fnvalid_phno()

{

	var cno=document.getElementById("cno").value;

	if(cno.length!=10)

	{

		alert("Contact no length must 10");

		return false;

	}

	return true;

}



function vlidate_password()

{

	var pass=document.getElementById("password").value;

	if(pass.length<8)

	{

		alert("Password must contain 8 charecter")		

		return false;

	}

	return true;

		

}