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
<title>Insert title here</title>
</head>
<body>

	<div>
		<h2>Visitor Details</h2>
		
    <%
    	String email = request.getParameter("memberemail");
        ResultSet rs = (ResultSet)request.getAttribute("visitordata");

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
	
	
</body>
</html>