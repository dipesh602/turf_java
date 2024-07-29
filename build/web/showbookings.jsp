<%@page import="java.sql.*"%>
<html>
    <head>
         <%@include file="adminmenu.jsp" %>
         <%
                                     
		try
		{
                 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///majorproject","root","1211");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from booking");%>
        </head>
        <body>
            <div id="data">
<center>

<form action="insertserver.jsp">
<table cellpadding="12" cellspacing="15" bgcolor="white" class="t1">
    <tr>
    <td>Slots</td>
     <td>Name</td>
      <td>Email id</td>
       <td>Contact no.</td>
        <td>Total Members</td>
    </tr>
   


	<%		
			
			while(rs.next())
			{%>
                                                       <tr>
                                                    <td><%= rs.getString(1)%></td>
                                                    <td><%= rs.getString(2)%></td>
                                                    <td><%= rs.getString(3)%></td>
                                                    <td><%= rs.getString(4)%></td>
                                                    <td><%= rs.getString(5)%></td>
                                                    </tr>
			<%}
			
			
			
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
                %>
    
</table>
</center>
</div>
        </body>
        </html>