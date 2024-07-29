<%@page import="java.sql.*"%>
<html>
<head>
     <%@include file="menubar.jsp" %>
     </head>
 <body>
    <div id="data">
<center>
<form action="adminlogin.jsp">
<table cellpadding="10"  bgcolor="white" class="t1" >
<tr>
    <th align="center" colspan="2"><h3>AdminLogin</h3></th> <br>
</tr>
<tr>
<td><input type="text" placeholder="Enter Username" name="un"  class="t1"><br></td>
</tr>
<tr>
<td> <input type="text" placeholder="Enter Password" name="up" class="t1"><br></td>
</tr>
<tr>
<th align="center" colspan="2"><input type="submit" value="Login" id="button1" name="b1"></th>
</tr>

<%
    String s11=request.getParameter("b1");
    if(s11!=null)
    {
            
                                      String s1=request.getParameter("un");
		String s2=request.getParameter("up");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///majorproject","root","1211");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from adminL where username='"+s1+"' AND password='"+s2+"' ");
			
			
			if(rs.next())
			{
                            Cookie ck=new Cookie("un","admin");
                            ck.setMaxAge(60*30);
                            response.addCookie(ck);
                            
			response.sendRedirect("adminmenu.jsp");
			}
			else
			{
           
              
			 response.sendRedirect("adminlogin.jsp");
		
			}
			
			
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
    }
                %>
</table>
</form>
</center>
</div>
</body>
</html>
