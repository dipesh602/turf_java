package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("<link rel=\"stylesheet\" href=\"csslink_1.css\">\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("<form style=\"margin-top: 100px; margin-left:600px; \" action=\"Slotsdemo.jsp\">\n");
      out.write("    <script src=\"https://checkout.razorpay.com/v1/payment-button.js\" data-payment_button_id=\"pl_Kbd2ib3nrlRKwB\" async> </script>\n");
      out.write("    <input type=\"submit\" value=\"if payment done click here\" id=\"button1\"><br></form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
      out.write("    \n");
      out.write("    ");

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
                
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
