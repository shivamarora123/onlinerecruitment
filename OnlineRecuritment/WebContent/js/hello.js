function validateForm() {
    var nam = document.forms["Admin"]["name"].value;
    if (nam == "") {
        alert("USERNAME must be filled out");
        return false;
    }
    else if(!nam.match(/^([^0-9]*)$/))
	{
	alert("USERNAME...!! NUMBERS not allowed ");
	return false
	}
	
	var pas = document.forms["Admin"]["old"].value;
    if (pas.length < 9) {
        alert("OLD PASSWORD must be filled out and minimum 9 digits");
        return false;
    }
    else if(!pas.match(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/))
	{
	alert("OLD PASSWORD must be VERY STRONG(one lowercase letter, one uppercase letter, one numeric digit, and one special character) and minimun NINE digit ");
	return false
	}
	
	var pad = document.forms["Admin"]["new"].value;
    if (pad.length < 9) {
        alert("NEW PASSWORD must be filled out and minimum 9 digits");
        return false;
    }
    else if(!pad.match(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/))
	{
	alert("NEW PASSWORD must be VERY STRONG(one lowercase letter, one uppercase letter, one numeric digit, and one special character) and minimun NINE digit ");
	return false
	}
    
    var pass = document.forms["Admin"]["confirm"].value;
    if (pass.length < 9) {
        alert("CONFIRM PASSWORD must be filled out and minimum 9 digits");
        return false;
    }
    
    if (pass!=pad) {
        alert("NEW_PASSWORD & CONFIRM_PASSWORD MUST BE SAME");
        return false;
    }

}