  <%@page import="java.sql.*"%>

<html>
<head>
     <%@include file="adminmenu.jsp" %>
    <div id="data">
<center>
<form action="addslots.jsp">
<table cellpadding="12"  cellspacing="15" bgcolor="white" class="t1">
<tr>
    <th align="center" colspan="2"><h3>Add slots</h3></th> <br>
</tr>
<tr>
    <td>Slot-no</td>
<td><input type="text"  name="t1"  class="t1"><br></td>
</tr>
<tr>
     <td>Timing</td>
<td> <input type="text"  name="t2" class="t1"><br></td>
</tr>
<tr>
     <td>Charges</td>
    <td ><input type="text"  name="t3" class="t1"><br></td>
</tr>
<tr>
<th align="center" colspan="2"><input type="submit" value="Add" id="button1" name="b1"></th>
</tr>
</table>
</form>
</center>
</div>
<%
    String s11=request.getParameter("b1");
    if(s11!=null){
                                   String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		String s3=request.getParameter("t3");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///majorproject","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("insert into slots values('"+s1+"','"+s2+"','"+s3+"')");
			con.close();
			response.sendRedirect("showslots.jsp");
		}
		catch(Exception e){
			out.println(e);
		}
    }
                %>
    
    </body>
    </html>