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
			ResultSet rs=st.executeQuery("select * from slots");%>
        </head>
        <body>
            <div id="data">
<center>

<form action="insertserver.jsp">
<table cellpadding="12" cellspacing="10" bgcolor="white" class="t1"  >
    <tr  colsopan="2">
        <td >Slots-no</td>
     <td >Timing</td>
     <td >Charges</td>
    </tr>
   


	<%		
			
			while(rs.next())
			{%>
                                                       <tr>
                                                    <td><%= rs.getString(1)%></td>
                                                    <td><%= rs.getString(2)%></td>
                                                    <td><%= rs.getString(3)%></td>
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