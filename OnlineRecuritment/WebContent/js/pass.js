// User password
function CheckPasswordStrength(password) {

        var password_strength = document.getElementById("password_strength");

 

        //TextBox left blank.

        if (password.length == 0) {

            password_strength.innerHTML = "";

            return;

        }

 

        //Regular Expressions.

        var regex = new Array();

        regex.push("[A-Z]"); //Uppercase Alphabet.

        regex.push("[a-z]"); //Lowercase Alphabet.

        regex.push("[0-9]"); //Digit.

        regex.push("[$@$!%*#?&]"); //Special Character.

 

        var passed = 0;

 

        //Validate for each Regular Expression.

        for (var i = 0; i < regex.length; i++) {

            if (new RegExp(regex[i]).test(password)) {

                passed++;

            }

        }

 

        //Validate for length of Password.

        if (passed > 2 && password.length > 8) {

            passed++;

        }

 

        //Display status.

        var color = "";

        var strength = "";

        switch (passed) {

            case 0:

            case 1:

                strength = "Weak";

                color = "red";

                break;

            case 2:

                strength = "Good";

                color = "darkorange";

                break;

            case 3:

            case 4:

                strength = "Strong";

                color = "green";

                break;

            case 5:

                strength = "Very Strong";

                color = "darkgreen";

                break;

        }

        password_strength.innerHTML = strength;

        password_strength.style.color = color;

    } 
    // User Repassword
    function CheckPasswordStrengt(password) {

        var password_strength = document.getElementById("password_strengt");

 

        //TextBox left blank.

        if (password.length == 0) {

            password_strength.innerHTML = "";

            return;

        }

 

        //Regular Expressions.

        var regex = new Array();

        regex.push("[A-Z]"); //Uppercase Alphabet.

        regex.push("[a-z]"); //Lowercase Alphabet.

        regex.push("[0-9]"); //Digit.

        regex.push("[$@$!%*#?&]"); //Special Character.

 

        var passed = 0;

 

        //Validate for each Regular Expression.

        for (var i = 0; i < regex.length; i++) {

            if (new RegExp(regex[i]).test(password)) {

                passed++;

            }

        }

 

        //Validate for length of Password.

        if (passed > 2 && password.length > 8) {

            passed++;

        }

 

        //Display status.

        var color = "";

        var strength = "";

        switch (passed) {

            case 0:

            case 1:

                strength = "Weak";

                color = "red";

                break;

            case 2:

                strength = "Good";

                color = "darkorange";

                break;

            case 3:

            case 4:

                strength = "Strong";

                color = "green";

                break;

            case 5:

                strength = "Very Strong";

                color = "darkgreen";

                break;

        }

        password_strength.innerHTML = strength;

        password_strength.style.color = color;

    } 
    
 // Company Password
    
    function CheckPasswordStreng(password) {

        var password_strength = document.getElementById("password_streng");

 

        //TextBox left blank.

        if (password.length == 0) {

            password_strength.innerHTML = "";

            return;

        }

 

        //Regular Expressions.

        var regex = new Array();

        regex.push("[A-Z]"); //Uppercase Alphabet.

        regex.push("[a-z]"); //Lowercase Alphabet.

        regex.push("[0-9]"); //Digit.

        regex.push("[$@$!%*#?&]"); //Special Character.

 

        var passed = 0;

 

        //Validate for each Regular Expression.

        for (var i = 0; i < regex.length; i++) {

            if (new RegExp(regex[i]).test(password)) {

                passed++;

            }

        }

 

        //Validate for length of Password.

        if (passed > 2 && password.length > 8) {

            passed++;

        }

 

        //Display status.

        var color = "";

        var strength = "";

        switch (passed) {

            case 0:

            case 1:

                strength = "Weak";

                color = "red";

                break;

            case 2:

                strength = "Good";

                color = "darkorange";

                break;

            case 3:

            case 4:

                strength = "Strong";

                color = "green";

                break;

            case 5:

                strength = "Very Strong";

                color = "darkgreen";

                break;

        }

        password_strength.innerHTML = strength;

        password_strength.style.color = color;

    }
