<%@ page import="it.academy.module2.entity.Expense" %>
<%@ page import="java.util.List" %>
<html>
<head> Task 15 </head>
<body>

<h1>Our expenses are: </h1>
<%= (List<Expense>) request.getAttribute("expenses")
%>



</body>

</html>