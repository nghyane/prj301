<!DOCTYPE html>
<html>
<head>
        <title>PRJ301 Demo - Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1> Please answer </h1>
      

        <h1><%=request.getAttribute("a")%> + <%=request.getAttribute("b")%> = <%=
            request.getAttribute("result")
        %></h1>
        <form action="calculator" method="post">
            <input name="a" type="hidden" value="<%=request.getAttribute("a")%>">
            <input name="b" type="hidden" value="<%=request.getAttribute("b")%>">

            <input name="result" type="text">
            <input name="user" type="submit">
        </form>
        
    </body>
</html>
