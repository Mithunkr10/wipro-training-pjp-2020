//javascript for user signup module

function validateform(){
		var fname=document.reg.fname.value;
		var lname=document.reg.lname.value;
		var pswd=document.reg.pswd.value;
		var cpswd=document.reg.cpswd.value;
		var num=document.reg.num.value;
		var em=document.reg.email.value;
		var dob=document.reg.dob.value;
		var p=/^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
		var d=/^\(?([0-3][0-9]{2})\)?[-]?([0-1][1-9]{2})[-]?([0-9]{4})$/;
		var e=/^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/;
		if(!isNaN(fname))
			alert("First-Name must be character value.");
		if(!isNaN(lname))
			alert("Last-Name must be character value.")	;
		if(pswd.length<6 || pswd.length>20 || cpswd.length<6 || cpswd.length>20)
			alert("The password length must be between 6 and 20.");
		if(pswd!=cpswd)
			alert("The password's does not match.");
		if(!num.match(p))
			alert("The phone number must be in the following format:\n XXX-XXX-XXXX\n XXX.XXX.XXXX\n XXX XXX XXXX");
		if(!dob.match(d))
			alert("The Date of Birth must be in the format: DD-MM-YYYY.");
		if(!em.match(e))
			alert("The email address is not valid.")
	}
