<%--
  Created by IntelliJ IDEA.
  User: agile
  Date: 2021/3/4
  Time: 1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
</head>
<body>
<%=request.getAttribute("name")%><br>
<%=request.getAttribute("email")%><br>
${pageContext.request}<br>
${name}<br>
${email}<br>
</body>
</html>
