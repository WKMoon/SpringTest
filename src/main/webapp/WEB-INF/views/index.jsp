<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <body>
        <h2>LOGIN</h2>

        <input type="text" id="id" name="id"/>
        <input type="password" id="pw" name="pw"/>
        <input type="button" id="btn" name="btn" value="SUBMIT" onclick="login();"/>
    </body>
<%--    <script src="/resources/jquery/jquery-3.3.1.js"></script>--%>
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>

    <script>
        function login(){
            var id = document.getElementById("id").value;
            var pw = document.getElementById("pw").value;

            $.ajax({
                url: "/login",
                type: "POST",
                data: {id:id, pw:pw},
                success: function(data){
                    alert("Hello " + data.id);
                },
                error: function(){
                    console.log("error");
                }
            });

        }

    </script>
</html>
