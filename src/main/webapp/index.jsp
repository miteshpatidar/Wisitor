<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wisitor</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>
<div class="container mt-5">
        <h2>Select a Role</h2>
        <ul class="list-group list-group-flush">
            <!-- Each list item uses href with a query parameter -->
            <li class="list-group-item">
                <a href="gaurd.jsp" class="text-decoration-none">Guard</a>
            </li>
            <li class="list-group-item">
                <a href="headLogin.jsp" class="text-decoration-none">Visitor</a>
            </li>
            <li class="list-group-item">
                <a href="memberLogin.jsp" class="text-decoration-none">Member</a>
            </li>
        </ul>
    </div>
                
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>