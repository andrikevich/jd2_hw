<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head> <h1>Task 17</h1> </head>
<body>

<h1>Our expenses are: </h1>
<table border="3" cellspacing="2" cellpadding="3">

 <tr>
    <th>Number</th>
    <th>Pay Date</th>
    <th>Value</th>
    <th>Receiver</th>
 </tr>
    <c:forEach var="expense" items="${expenses}">
     <tr>
        <td align="center"><c:out value="${expense.num}"/></td>
        <td align="center"><c:out value="${expense.paydate}"/></td>
        <td align="center"><c:out value="${expense.value}"/></td>
        <td align="center"><c:out value="${expense.receiverNum}"/></td>
     </tr>
    </c:forEach>




</table>




</body>

</html>