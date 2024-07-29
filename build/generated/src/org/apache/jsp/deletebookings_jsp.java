package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class deletebookings_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/adminmenu.jsp");
  }

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

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write(" ");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"csslink.css\">\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<div id=\"menu\">\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("<li></li>   \n");
      out.write("<li style=\"font-size:20px;\"><a href=\"addslots.jsp\" style=\"text-decoration:none\">Add Slots</a></li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\"><a href=\"deleteslots.jsp\" style=\"text-decoration:none\">Delete Slots</a></li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\"><a href=\"showslots.jsp\">Show Slots</a></li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\"><a href=\"showbookings.jsp\">Show Bookings</a></li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\"><a href=\"deletebookings.jsp\">Delete Bookings</a></li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\"><a href=\"home.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write(" \n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<div id=\"data\">\n");
      out.write("    <center>\n");
      out.write(" <form action=\"deletebookings.jsp\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table cellpadding=\"10\" cellspacing=\"12\" bgcolor=\"white\" class=\"t1\">\n");
      out.write("<tr>\n");
      out.write("    <th align=\"center\" colspan=\"2\"><h3>Delete booking</h3></th> <br>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Contact-no</td>\n");
      out.write("<td><input type=\"text\"  name=\"t1\"  class=\"t1\"><br></td>\n");
      out.write("</tr>\n");
      out.write("    <tr>\n");
      out.write("<th align=\"center\" colspan=\"2\"><input type=\"submit\" value=\"Delete\" id=\"button1\" name=\"b1\"></th>\n");
      out.write("</tr>\n");
      out.write(" <tr>\n");
      out.write("<th align=\"center\" colspan=\"2\"><input type=\"submit\" value=\"Delete All\" id=\"button1\" name=\"b2\"></th>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

   String s11=request.getParameter("b2"); 
    String s1=request.getParameter("b1");
    
    if(s1!=null){
		    String s2=request.getParameter("t1");

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///majorproject","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("delete from booking where Contactno='"+s2+"'");
			con.close();
			response.sendRedirect("showbookings.jsp");
		}
		catch(Exception e){
			out.println(e);
		}
    }
       if(s11!=null){
		    

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
		}
    }

      out.write("\n");
      out.write(" </form>\n");
      out.write(" </center>\n");
      out.write(" </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
