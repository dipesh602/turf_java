
<%@page import="java.sql.*"%>
<%
    try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///majorproject","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("delete from booking");
			con.close();
			response.sendRedirect("showbookings.jsp");
		}
		catch(Exception e){
			out.println(e);
		}%>