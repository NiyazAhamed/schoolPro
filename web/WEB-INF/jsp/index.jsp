<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript"   src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $("#loginForm").submit(function(){
            $.ajax({
                type : "POST",
                url: '/schoolPro/login/doLogin',
                dataType: 'json',
                data: $(this).serialize(),
                success: function(data){
                    $("#msg-div").html(data.message);
                }});
            return false;
        });
    });
</script>  

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to School Pro</title>
    </head>

    <body>
        <div id='msg-div'></div>
        <form name="loginForm" id="loginForm" action="/schoolPro/login/doLogin"> 
            <div id='input-div'>   

                <input  type="text" name="userName" value="User Name:" id='user-name'/>
                <input  type="password" name="userPassWord" value="Password:" id='user-password'/>

                <div id='form-submit'>

                    <input type= "submit" name="submit-btn" id="login-btn"  value="Login"/>
                    <input type= "reset" name="reset-btn" value="Reset"/>                

                </div>   

            </div>    
        </form>     
    </body>
</html>
