
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.wisitor.dao.*" %>
<%@page import="com.wisitor.entities.Usermember"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member home</title>
</head>
<body>
	<h3>welcome ${sessionScope.usermember.getMembername()}</h3>
	<p>you are at ${sessionScope.usermember.getMemberaddress()} <br></p>
	
	
	
	<!--  
	<a href="membervisitorlistServlet.java">get your visitors</a>
	-->
	<div>
		<h2>Visitor Details</h2>
		
    <%
    	//String email = (String)session.getAttribute("usermember").getMemberemail();
        ResultSet rs = (ResultSet)session.getAttribute("visitordata");

        if (rs != null) {
            try {
    %>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Visitor Name</th>
                            <th>Phone</th>
                            <th>Purpose</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            while (rs.next()) {
                        %>
                        <tr>
                            <td><%= rs.getString("visitorname") %></td>
                            <td><%= rs.getString("visitorphone") %></td>
                            <td><%= rs.getString("visitorpurpose") %></td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
    <%
            } catch (SQLException e) {
                out.println("<p>Error processing visitor details.</p>");
                e.printStackTrace();
            }
        } else {
            out.println("<p>No visitor data available.</p>");
        }
    %>
	</div>
	
	
	
	
	
	
	<div>
		<h5>Add Visitor</h5>
		<form action="visitorAddServlet" method="POST">
        <h2>Visitor Information</h2>
        <div class="form-group">
            <label for="visitorname">Visitor Name:</label>
            <input type="text" id="visitorname" name="visitorname" placeholder="Enter visitor's name" required>
        </div>
        <div class="form-group">
            <label for="visitorphone">Visitor Phone:</label>
            <input type="text" id="visitorphone" name="visitorphone" placeholder="Enter visitor's phone" required>
        </div>
        <div class="form-group">
            <label for="visitorpurpose">Visitor Purpose:</label>
            <textarea id="visitorpurpose" name="visitorpurpose" rows="3" placeholder="Enter purpose of visit" required></textarea>
        </div>
        <div class="form-group">
            <label for="memberemail">Member Email:</label>
            <input type="email" id="memberemail" name="memberemail" value="${sessionScope.usermember.memberemail}" readonly>
        </div>
        <button type="submit">Submit</button>
    </form>
	</div>
</body>
</html>