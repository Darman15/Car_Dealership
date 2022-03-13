<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="utf-8">
    <title>Student Portal</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/cover/">

    <!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="styles/styles.css">


    <!-- Custom styles for this template -->
    <link href="cover.css" rel="stylesheet">

  </head>


<body class="text-center">
  <div class="container">

<h2 class="cover-heading">Search</h2>
<br>${msg}<br>
<div class="row align-items-center">
  <h5>Search vehicles by model</h5>
</div>

<div class="row align_items-center">
  <form method = "POST" class="row contact_form">
    <input type="text" id="keyword" name="keyword" placeholder="Search by model" class="form-control">
    <a href="/results" class="text-info"><button type="submit" >Search by Model</button></a>
  </form>
</div>
</div>
</body>

</html>


