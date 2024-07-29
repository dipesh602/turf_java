<html>
     <head>
<link rel="stylesheet" href="csslink_1.css">
</head>
    <body>
        
<form style="margin-top: 100px; margin-left:600px; " action="Slotsdemo.jsp">
    <script src="https://checkout.razorpay.com/v1/payment-button.js" data-payment_button_id="pl_Kbd2ib3nrlRKwB" async> </script>
    <input type="submit" value="if payment done click here" id="button1"><br></form>

    </body>
    </html>
    <%@page import="java.sql.*"%>
    <%
                               String s1=request.getParameter("sl");
		String s2=request.getParameter("en");
		String s3=request.getParameter("eg");
		String s4=request.getParameter("ec");
		String s5=request.getParameter("em");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///majorproject","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("insert into booking values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
			con.close();
			//response.sendRedirect("payment.jsp");
		}
		catch(Exception e){
			System.out.println(e);
		}
                %>