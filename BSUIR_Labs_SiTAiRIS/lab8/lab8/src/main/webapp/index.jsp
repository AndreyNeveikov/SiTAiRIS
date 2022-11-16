<%@ page import="main.Main" %>
<%@ page import="main.Laptop" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collections" %>
<%@page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>Lab8</title>
</head>
<body>
<h2>Lab8</h2>
<p>
    <%
        Main main1 = new Main();

        ArrayList<Double> pricelist = new ArrayList<>();
    %>
    Количество товаров в магазине:
    <% int productAmount = main1.parse().size(); %>
    <%= productAmount%>
    <br><br>

    <%for (int i = 0; i < productAmount; i++) {%>
    <p1>
        Товар номер:
        <%= main1.laptopList.get(i).getProduct_id()%>
        <br>
        Производитель:
        <%= main1.laptopList.get(i).getManufacturer()%>
        <br>
        Модель:
        <%= main1.laptopList.get(i).getPc_model()%>
        <br>
        RAM:
        <%= main1.laptopList.get(i).getRAM()%>
        <br>
        Процессор:
        <%= main1.laptopList.get(i).getProcessor_model()%>
        <br>
        HDD:
        <%= main1.laptopList.get(i).getHDD()%>
        <br>
        Описание:
        <%= main1.laptopList.get(i).getDescription()%>
        <br>
        Цена:
        <%= main1.laptopList.get(i).getPrice()%>
        <%
            pricelist.add(main1.laptopList.get(i).getPrice());
        %>
        <br>
    </p1>
    <br>
    <% } %>

    <p2>
        Отчет о стоимости:
        <br>
        Самый дорогой товар стоит
        <%= Collections.max(pricelist)%>
        <br>
        Самый дешевый товар стоит
        <%= Collections.min(pricelist)%>
        <br>
        Суммарная цена
        <%
            double sumPrice = 0;
            for(int i = 0; i < pricelist.size(); i++)
                sumPrice += pricelist.get(i);
        %>
        <%=sumPrice%>
        <br>
        Средняя цена
        <%= sumPrice/pricelist.size()%>
        <br>
    </p2>
</p>
</body>
</html>

