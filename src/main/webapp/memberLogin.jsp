<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="notregistered">
	<a href = memberRegister.jsp>get registered</a>
</div>
<div class="container mt-5">
        <h2>member Login</h2>
        <form action="memberLoginServlet" method="POST" class="mt-4">
            <!-- Username -->
            <div class="mb-3">
                <label for="username" class="form-label">memberemail</label>
                <input type="text" id="username" name="memberemail" class="form-control" placeholder="Enter username" required>
            </div>
            
            
            
             <!-- Submit Button -->
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>
</body>
</html>