/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.cal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Asus
 */
public class CBR_Client extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WS_Project/WS_ProjectServer.wsdl")
    private WSProjectServer_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String name=request.getParameter("name");
            String ic=request.getParameter("ic");
            float weight=Float.parseFloat(request.getParameter("weight"));
            float height=Float.parseFloat(request.getParameter("height"));
            String gender=request.getParameter("gender");
            String activity=request.getParameter("activity");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calory Burn Rate</title>");   
            out.println("<style>");
            out.println("body {");
            out.println("   background-color: #f2f2f2;");
            out.println("   background-image: url(\"https://s3-ap-southeast-2.amazonaws.com/clinedge/webassets/uploads/images/featured_image/1513841028-PE071%20Blogpost%20Image%20-%20600X300.jpg\");");
            out.println("   background-repeat: no-repeat;");
            out.println("   background-size: cover;");
            out.println("   background-position: -480px 0;");
            out.println("}");  
            out.println(".container {");
            out.println("   width: 610px;");
            out.println("   margin: 20px 150px;");
            out.println("   padding: 20px;");
            out.println("   background-color: #fff;");
            out.println("   border: 1px solid #ccc;");
            out.println("   border-radius: 5px;");
            out.println("}");
            out.println("heading h1 {");
            out.println("   font-size: 36px;");
            out.println("   color: #333;");
            out.println("   margin-bottom: 20px;");
            out.println("   margin: 20px 180px;");
            out.println("   text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);");  
            out.println("}");
            out.println("calName h1 {");
            out.println("   font-size: 30px;");
            out.println("   color: green;");
            out.println("   margin-bottom: 20px;");
            out.println("   text-align: center;");
            out.println("}");
            out.println("res h1{");
            out.println("   font-size: 30px;");
            out.println("   color: blue;");
            out.println("   margin-bottom: 20px;");
            out.println("   text-align: center;");
            out.println("}");  
            out.println(".styled {");
            out.println("   width: 100%;");
            out.println("   border-collapse: collapse;");
            out.println("   margin: 25px 0;");
            out.println("   font-size: 0.9em;");
            out.println("   font-family: sans-serif;");
            out.println("   min-width: 400px;");
            out.println("   box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);");
            out.println("}");
            out.println(".styled thead tr {");
            out.println("   background-color: #009879;");
            out.println("   color: #ffffff;");
            out.println("   text-align: left;");
            out.println("}");
            out.println(".styled th, .styled td {");
            out.println("   padding: 12px 15px;");
            out.println("}");
            out.println(".styled tbody tr {");
            out.println("   border-bottom: 1px solid #dddddd;");
            out.println(".styled tbody tr:nth-of-type(even) {");
            out.println("   background-color: #f3f3f3;");
            out.println("}");
            out.println(".styled tbody tr:last-of-type {");
            out.println("   border-bottom: 2px solid #009879;");
            out.println("}");
            out.println(".styled tbody tr.active-row {");
            out.println("   font-weight: bold;");
            out.println("   color: #009879;");
            out.println("}");                                      
          
            out.println("</style>");
            out.println("</head>");            
                       
            out.println("<body>");
            out.println("<br/><heading><h1>Personal Health & Fitness Calculator</h1></heading><br/>");
            out.println("<div class=\"container\">");
            out.println("<calName><h1>Calory Burn Rate Calculator</h1></calName>");
            out.println("<form>");
            out.println("<center>");
            out.println("<table class=\"styled\">");
            out.println("<thead>");
            out.println("<tr>");       
            out.println("   <td>");
            out.println("       <h2>Details</h2>");
            out.println("   </td>");
            out.println("   <td>");            
            out.println("       <h2>Input</h2>");
            out.println("   </td>");
            out.println("</tr>");
            out.println("</thead>"); 
            out.println("<tbody>");
            out.println("<tr>");       
            out.println("   <td>");
            out.println("       <h2>Name: </h2>");
            out.println("   </td>");
            out.println("   <td>");            
            out.println("       <h2>"+name+"</h2>");
            out.println("   </td>");
            out.println("</tr>");
            out.println("</tbody>"); 
            out.println("<tbody>");          
            out.println("<tr>");
            out.println("   <td>");
            out.println("       <h2>IC: </h2>");
            out.println("   </td>");
            out.println("   <td>");                        
            out.println("       <h2>"+ic+"</h2>");
            out.println("   </td>");
            out.println("</tr>");
            out.println("</tbody>");
            out.println("<tbody>");            
            out.println("<tr>");
            out.println("   <td>");            
            out.println("       <h2>Age: </h2>");
            out.println("   </td>");
            out.println("   <td>");            
            out.println("       <h2>"+age(ic)+"</h2>");
            out.println("   </td>");
            out.println("</tr>");
            out.println("</tbody>");
            out.println("<tbody>");            
            out.println("<tr>");
            out.println("   <td>");            
            out.println("       <h2>Gender: </h2>");
            out.println("   </td>");
            out.println("   <td>");            
            out.println("       <h2>"+gender+"</h2>");
            out.println("   </td>");
            out.println("</tr>");            
            out.println("</tbody>");
            out.println("<tbody>");
            out.println("<tr>");
            out.println("   <td>");            
            out.println("       <h2>Activity Level: </h2>");
            out.println("   </td>");
            out.println("   <td>");            
            out.println("       <h2>"+activity+"</h2>");
            out.println("   </td>");
            out.println("</tr>");          
            out.println("</tbody>");
            out.println("<tbody>");
            out.println("<tr>");
            out.println("   <td>");            
            out.println("       <h2>Weight (in kg): </h2>");
            out.println("   </td>");
            out.println("   <td>");            
            out.println("       <h2>"+weight+"</h2>");
            out.println("   </td>");
            out.println("</tr>");
            out.println("</tbody>");
            out.println("<tbody>");            
            out.println("<tr>");
            out.println("   <td>");            
            out.println("       <h2>Height (in cm): </h2>");
            out.println("   </td>");
            out.println("   <td>");            
            out.println("       <h2>"+height+"</h2>");
            out.println("   </td>");
            out.println("</tr>");
            out.println("</tbody>");            
            out.println("</table>");          
            out.println("<res><h1>Result</h1></res>");
            out.println("<h2> " + cbr(ic, weight, height, gender, activity) + " calories/day</h2>");   
            out.println("</center>");            
            out.println("</form><br/>");
            out.println("<center>");
            out.println("<a href=\"index.html\">");
            out.println("<button type=\"button\">Return</button>");
            out.println("</a>");
            out.println("</center>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        } catch (NotValidIcNumberException_Exception ex) {
            Logger.getLogger(CBR_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

        private int age(java.lang.String arg0) throws NotValidIcNumberException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.cal.WSProjectServer port = service.getWSProjectServerPort();
        return port.age(arg0);
    }
        
    private String cbr(java.lang.String ic, float weight, float height, java.lang.String gender, java.lang.String activity) throws NotValidIcNumberException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.cal.WSProjectServer port = service.getWSProjectServerPort();
        return port.cbr(ic, weight, height, gender, activity);
    }

}
