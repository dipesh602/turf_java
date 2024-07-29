<%@page import="java.sql.*"%>
<html>
    <head>
         <%@include file="menubar.jsp" %>
         <%
                                     
		try
		{
                                                        Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///majorproject","root","1211");
			Statement st=con.createStatement();
                                                    Statement st1=con.createStatement();
                                                    ResultSet r1=st.executeQuery("select * from slots");
                                                    ResultSet r2=st1.executeQuery("select * from booking where name IS NOT NULL");

         %>
        </head>
        <body>
            <div id="data">
<center>


<table cellpadding="12" cellspacing="10"  class="t1"  >
   
 <tr>
        <td >Slots-no</td>
     <td >Timing</td>
     <td >Charges</td>
    </tr>
   

	<%		
			
			while(r1.next())
			{%>
                        <form action="slot1.jsp">
                                                       <tr>
                                                    <td><%= r1.getString(1)%></td>
                                                    <td><%= r1.getString(2)%></td>
                                                    <td><%= r1.getString(3)%></td> 
                                               <%if(r2.next()){%>
                                              <td><input type="button" value="booked" id="button2" ></td>  
                                                 
                                             

                                                     
                                                    <%}else{%>
                                                           <td>  <form action="slot1.jsp"><input type="submit" value="book" id="button1" ></form></td>

                                                      <%}%>
                                                    </tr>
		</form>	
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