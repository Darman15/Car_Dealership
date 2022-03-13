<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="utf-8">
    <title>Purchased Vehicles</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/cover/">

    <!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="styles/styles.css">


    <!-- Custom styles for this template -->
    <link href="cover.css" rel="stylesheet">

  </head>


<body class="text-center">
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="masthead mb-auto">
    <div class="inner">
      <h3 class="masthead-brand">Cover</h3>
      <nav class="nav nav-masthead justify-content-center">
        <a class="nav-link active" href="/">Home</a>

      </nav>
    </div>
  </header>

<body>

<h4> These vehicles have been purchased</h4>




  <c:forEach items="${listOfPurchasedVehicles}" var="purchase">

    <table>
      <tbody>
      <tr>
      <td>${purchase.transactionNum}</td>
      <td>${purchase.dateListed}</td>
      <td>${purchase.dateSold}</td>
      <td>${purchase.purchasingUser}</td>
      <td>${purchase.vehicle}</td>
      <td>${purchase.sellPrice}</td>





      </tr>
      </tbody>
      </table>

</c:forEach>


</body>

</html>


