<%@page import="java.sql.*"%>
<%
    try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///majorproject","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("delete from slots");
			con.close();
			response.sendRedirect("showslots.jsp");
		}
		catch(Exception e){
			out.println(e);
		}%>