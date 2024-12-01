<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Register</title>
</head>
<body>
<form class="row g-3" action="memberRegisterServlet">
<div class="col-md-6">
    <label for="inputName4" class="form-label">Name</label>
    <input name="membername" type="text" class="form-control" id="inputName4">
  </div>
  <div class="col-md-6">
    <label for="inputEmail4" class="form-label">Email</label>
    <input name="memberemail" type="email" class="form-control" id="inputEmail4">
  </div>
  <div class="col-md-6">
    <label for="inputPassword4" class="form-label">Password</label>
    <input name ="memberpassword" type="password" class="form-control" id="inputPassword4">
  </div>
  <div class="col-12">
    <label for="inputAddress" class="form-label">Address</label>
    <input name ="memberaddress" type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
  </div>
  
  <div class="col-md-6">
    <label for="inputCity" class="form-label">City</label>
    <input name="membercity" type="text" class="form-control" id="inputCity">
  </div>
  <div class="col-md-4">
    <label for="inputState" class="form-label">State</label>
    <input name="memberstate" type="text" class="form-control" id="inputState">
   <!--  <select id="inputState" class="form-select">
      <option selected>Choose...</option>
      <option>...</option>
    </select>  -->
  </div>
  <div class="col-md-2">
    <label for="inputZip" class="form-label">Zip</label>
    <input name="memberzip" type="text" class="form-control" id="inputZip">
  </div>
  <div class="col-md-2">
    <label for="inputPhone" class="form-label">Phone</label>
    <input name="memberphone" type="text" class="form-control" id="inputPhone">
  </div>
  <div class="col-12">
    <div class="form-check">
      <input name="check" class="form-check-input" type="checkbox" id="gridCheck">
      <label  class="form-check-label" for="gridCheck">
        Confirmation of data
      </label>
    </div>
  </div>
  <div class="col-12">
    <button type="submit" class="btn btn-primary">Sign in</button>
  </div>
</form>
</body>
</html>