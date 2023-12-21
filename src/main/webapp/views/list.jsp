<%@ page import="java.util.List" %>
<%@ page import="entities.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        TABLE {
            width: 800px; /* Ширина таблицы */
            border-collapse: collapse; /* Убираем двойные линии между ячейками */
        }
        TD, TH {
            padding: 3px; /* Поля вокруг содержимого таблицы */
            border: 1px solid black; /* Параметры рамки */
        }
        TH {
            background: #00ff00; /* Цвет фона */
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>НикName</th>
        <th>Монеты</th>
        <th>Уровень</th>
    </tr>

        <c:forEach var="user" items="${userList}">
            <tr>
                <td><c:out value="${user.name}" /></td>
                <td><c:out value="${user.money}" /></td>
                <td><c:out value="${user.lvl}" /></td>
            </tr>
        </c:forEach>
    <tr>
        <td><c:out value="${User.getCountOfUsers(userList)}" /></td>

        <td>&nbsp</td>
        <td>&nbsp</td>

    </tr>
</table>
</body>
</html>
