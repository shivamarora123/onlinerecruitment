
function validateFormCompany() {
    var name = document.forms["myForm"]["namecomp1"].value;
    if (name == "") {
        alert("COMPANY NAME must be filled out");
        return false;
    }
        else if(!name.match(/^([^0-9]*)$/))
        	{
        	alert("COMPANY NAME...!! NUMBERS not allowed");
        	return false
        	}
    
		 var Company = document.forms["myForm"]["addrcomp1"].value;
    if (Company == "") {
        alert("COMPANY ADDRESS  must be filled out");
        return false;
    }
	
	var nam = document.forms["myForm"]["usernamecomp1"].value;
    if (nam == "") {
        alert("USERNAME must be filled out");
        return false;
    }
    else if(!nam.match(/^([^0-9]*)$/))
	{
	alert("USERNAME...!! NUMBERS not allowed");
	return false
	}
	
	var pass = document.forms["myForm"]["passwordcomp1"].value;
    if (pass.length < 9) {
        alert("PASSWORD must be filled out and minimum 9 digits");
        return false;
    }
    else if(!pass.match(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/))
	{
	alert("PASSWORD must be VERY STRONG(one lowercase letter, one uppercase letter, one numeric digit, and one special character) and minimun NINE digit ");
	return false
	}
	

	var email = document.forms["myForm"]["email1"].value;
	var atpos = email.indexOf("@");
    var dotpos = email.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=email.length) {
        alert("Not a valid EMAIL address");
        return false;
    }
	
	var phnNo = document.forms["myForm"]["phn1"].value;
    if ((phnNo.length != 10)) {
        alert("PHONE NUMBER must be equal to 10 digit");
        return false;
    }
    else if(!phnNo.match(/^[1-9]\d*(?:\.\d{0,2})?$/ ))
	{
	alert("PHONE NO. only NUMBERS allowed ");
	return false
	}
	 var post = document.forms["myForm"]["post1"].value;
    if (post == "") {
        alert("POST must be filled out");
        return false;
    }
    else if(!post.match(/^([^0-9]*)$/))
	{
	alert("POST...!! NUMBERS not allowed");
	return false
	}
	 var cutoff = document.forms["myForm"]["cutoff1"].value;
    if (cutoff == "") {
        alert("CUTOFF(%)  must be filled out");
        return false;
    }
    else if(!cutoff.match(/^[1-9]\d*(?:\.\d{0,2})?$/ ))
	{
	alert("CUTOFF(%) only NUMBERS allowed ");
	return false
	}
    else if(cutoff<33 || cutoff>100) {
        alert("CUTOFF(%) must be within 33-100");
        return false;
    }
}



function validateFormuser() {
    var nam = document.forms["myForm1"]["username1"].value;
    if (nam == "") {
        alert("USERNAME must be filled out");
        return false;
    }
    else if(!nam.match(/^([^0-9]*)$/))
	{
	alert("USERNAME...!! NUMBERS not allowed");
	return false
	}
	
	var pas = document.forms["myForm1"]["password1"].value;
    if (pas.length < 9) {
        alert("PASSWORD must be filled out and minimum 9 digits");
        return false;
    }
    else if(!pas.match(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/))
	{
	alert("PASSWORD must be VERY STRONG(one lowercase letter, one uppercase letter, one numeric digit, and one special character) and minimun NINE digit ");
	return false
	}
	
	var pad = document.forms["myForm1"]["repassword1"].value;
    if (pad.length < 9) {
        alert("RE-PASSWORD must be filled out and minimum 9 digits");
        return false;
    }
    
    if (pas!=pad) {
        alert("PASSWORD & RE-PASSWORD MUST BE SAME");
        return false;
    }

	var phnNo = document.forms["myForm1"]["phno1"].value;
    if ((phnNo.length != 10)) {
        alert("PHONE NUMBER must be equal to 10 digit");
        return false;
    }
    else if(!phnNo.match(/^[1-9]\d*(?:\.\d{0,2})?$/ ))
	{
	alert("PHONE NO. only NUMBERS allowed ");
	return false
	}
	var btech = document.forms["myForm1"]["btech1"].value;
    if (btech=="") {
        alert("B.TECH % must be filled out");
        return false;
    }
    else if(!btech.match(/^[1-9]\d*(?:\.\d{0,2})?$/ ))
	{
	alert("B.TECH only NUMBERS allowed ");
	return false
	}
    else if(btech<33 || btech>100) {
        alert("B.TECH(%) must be within 33-100");
        return false;
    }
	var amnt = document.forms["myForm1"]["marks121"].value;
    if (amnt=="") {
        alert("12th(%) must be filled out");
        return false;
    }
    else if(!amnt.match(/^[1-9]\d*(?:\.\d{0,2})?$/ ))
	{
	alert("12th(%) only NUMBERS allowed ");
	return false
	}
    else if(amnt<33 || amnt>100) {
        alert("12(%) must be within 33-100");
        return false;
    }
	var acnt = document.forms["myForm1"]["marks101"].value;
    if (acnt == "") {
        alert("10th(%) must be filled out");
        return false;
    }
    
    else if(!acnt.match(/^[1-9]\d*(?:\.\d{0,2})?$/ ))
	{
	alert("10(%) only NUMBERS allowed ");
	return false
	}
    else if(acnt<33 || acnt>100) {
        alert("10(%) must be within 33-100");
        return false;
    }
	 var age = document.forms["myForm1"]["age1"].value;
    if (age == "") {
        alert("AGE must be filled out");
        return false;
    }
    else if(!age.match(/^[1-9]\d*(?:\.\d{0,2})?$/ ))
	{
	alert("AGE only NUMBERS allowed ");
	return false
	}
    else if(age<20 || age>40) {
        alert("AGE must be within 20-40");
        return false;
    }
	 var cty = document.forms["myForm1"]["city1"].value;
    if (cty == "") {
        alert("CITY must be filled out");
        return false;
    }
    else if(!cty.match(/^([^0-9]*)$/))
	{
	alert("CITY...!! NUMBERS not allowed");
	return false
	}
	var pin = document.forms["myForm1"]["pincode1"].value;
    if (pin.length < 6) {
        alert("PINCODE must be filled out and equals to 6 digit");
        return false;
    }
    else if(!pin.match(/^[1-9]\d*(?:\.\d{0,2})?$/ ))
	{
	alert("PINCODE only NUMBERS allowed ");
	return false
	}
	 var Count = document.forms["myForm1"]["skills1"].value;
    if (Count == "") {
        alert("SKILLS must be filled out");
        return false;
    }
    else if(!Count.match(/^([^0-9]*)$/))
	{
	alert("SKILLS...!! NUMBERS not allowed  ");
	return false
	}
}




