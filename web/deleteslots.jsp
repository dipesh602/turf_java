<%@page import="java.sql.*"%>
<html>
<head>
 <%@include file="adminmenu.jsp"  %>
 
</head>
<body >
<div id="data">
    <center>
 <form action="deleteslots.jsp">




<table cellpadding="10" cellspacing="12" bgcolor="white" class="t1">
<tr>
    <th align="center" colspan="2"><h3>Delete Slot</h3></th> <br>
</tr>
<tr>
    <td>Slot-no</td>
<td><input type="text"  name="t1"  class="t1"><br></td>
</tr>
    <tr>
<th align="center" colspan="2"><input type="submit" value="Delete" id="button1" name="b1"></th>
</tr>
 <tr>
     <th align="center" colspan="2"><a href="delete all slots.jsp">Delete all Slots</a></th>
</tr>



<%
    
    String s1=request.getParameter("b1");
    if(s1!=null){
		    String s2=request.getParameter("t1");

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///majorproject","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("delete from slots where slotno='"+s2+"'");
			con.close();
			response.sendRedirect("showslots.jsp");
		}
		catch(Exception e){
			out.println(e);
		}
    }%>
 </form>
 </center>
 </div>
</body>
</html>