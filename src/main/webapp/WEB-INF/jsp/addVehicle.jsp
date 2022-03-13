<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

  <main role="main" class="inner cover">
     
     
<form:form method = "POST" action="/addVehicle" modelAttribute="vehicle">

  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputManufacturer">Manufacturing Company</label>
      <form:input path ="manufacturerName" type="text" class="form-control" id="inputManufacturer"/>
    </div>

    <div class="form-group col-md-6">
      <label for="inputNumberOfKilometers">Kilometers On Vehicle</label>
      <form:input path = "kilometersRan" type="number" class="form-control" id="inputNumberOfKilometers"/>
    </div>
  </div>
  
  

    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputPrice">Price</label>
      <form:input path = "price" class="form-control" type = "number" id= "inputPrice"/>
    </div>

   <div class="form-group col-md-6">
      <label for="inputModel">Model</label>
      <form:input  path = "model" type="text" class="form-control" id="inputModel"/>
    </div>
  </div>

    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputDescription">Vehicle Description</label>
      <form:input path = "description" class="form-control" type = "text" id= "inputDescription"/>
    </div>

   <div class="form-group col-md-6">
      <label for="inputYearBuilt">Year Built</label>
      <form:input  path = "yearBuilt" type="number" class="form-control" id="inputYearBuilt"/>
    </div>
  </div>

    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputDaysOnLot">Days On the Lot</label>
      <form:input path = "daysOnLot" class="form-control" type = "number" id= "inputDaysOnLot"/>
    </div>

   <div class="form-group col-md-6">
      <label for="inputNewOrUsed">New Or Used</label>
      <form:input  path = "newOrUsed" type="" class="form-control" id="inputNewOrUsed"/>
    </div>
  </div>
  
  
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Sign me up!
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary"> Sign me up!</button>
</form:form>


  </main>

  <footer class="mastfoot mt-auto">
    <div class="inner">
      <p>Cover template for <a href="https://getbootstrap.com/">Bootstrap</a>, by <a href="https://twitter.com/mdo">@mdo</a>.</p>
    </div>
  </footer>
</div>


</body>

</html>


