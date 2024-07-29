package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Slotsdemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menubar.jsp");
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
      out.write("    <head>\n");
      out.write("         ");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"csslink.css\">\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("\n");
      out.write("<div id=\"menu\">\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("<li></li>   \n");
      out.write("<li style=\"font-size:20px;\"><a href=\"home.jsp\" style=\"text-decoration:none\">home</a></li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\"><a href=\"Slotsdemo.jsp\" style=\"text-decoration:none\">book slots</a></li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\"><a href=\"adminlogin.jsp\">Admin login</a></li>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("         ");

                                     
		try
		{
                                                        Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///majorproject","root","1211");
			Statement st=con.createStatement();
                                                    Statement st1=con.createStatement();
                                                    ResultSet r1=st.executeQuery("select * from slots");
                                                    ResultSet r2=st1.executeQuery("select * from booking where name IS NOT NULL");

         
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <div id=\"data\">\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table cellpadding=\"12\" cellspacing=\"10\"  class=\"t1\"  >\n");
      out.write("   \n");
      out.write(" <tr>\n");
      out.write("        <td >Slots-no</td>\n");
      out.write("     <td >Timing</td>\n");
      out.write("     <td >Charges</td>\n");
      out.write("    </tr>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\t");
		
			
			while(r1.next())
			{
      out.write("\n");
      out.write("                        <form action=\"slot1.jsp\">\n");
      out.write("                                                       <tr>\n");
      out.write("                                                    <td>");
      out.print( r1.getString(1));
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print( r1.getString(2));
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print( r1.getString(3));
      out.write("</td> \n");
      out.write("                                               ");
if(r2.next()){
      out.write("\n");
      out.write("                                              <td><input type=\"button\" value=\"booked\" id=\"button2\" ></td>  \n");
      out.write("                                                 \n");
      out.write("                                             \n");
      out.write("\n");
      out.write("                                                     \n");
      out.write("                                                    ");
}else{
      out.write("\n");
      out.write("                                                           <td>  <form action=\"slot1.jsp\"><input type=\"submit\" value=\"book\" id=\"button1\" ></form></td>\n");
      out.write("\n");
      out.write("                                                      ");
}
      out.write("\n");
      out.write("                                                    </tr>\n");
      out.write("\t\t</form>\t\n");
      out.write("                                                    ");
}
			
			
			
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
                
      out.write("\n");
      out.write("    \n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("        </body>\n");
      out.write("        </html>");
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
