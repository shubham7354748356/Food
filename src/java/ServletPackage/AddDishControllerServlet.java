/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletPackage;

import daoPackage.DishDao;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author india
 */
@MultipartConfig
public class AddDishControllerServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            System.out.println("Going To Print Username");
            String username  =  (String)session.getAttribute("username");
             
          
            System.out.println("In The AddDishControllerServlet");
            System.out.println("Username: "+username);
            String dish_name = request.getParameter("dish_name");
            int price = Integer.parseInt(request.getParameter("price"));
            String description = request.getParameter("description");
            
            System.out.println(dish_name);
            System.out.println(description);
            System.out.println(price);
            Part part = request.getPart("image");
            System.out.println(part.getSubmittedFileName());
              String path = "D://S.o.p(java.se)//Food//web//images//"+part.getSubmittedFileName();
              InputStream is = part.getInputStream();
              try
              {
                  FileOutputStream fos = new FileOutputStream(path);
                  byte [] bt = new byte[is.available()];
                  int read=0;
                  while((read=is.read(bt))!=-1)
                  {
                      fos.write(bt , 0 , read);
                  }
                  fos.close();
                  System.out.println("Dish Image Uploaded Successfully");
                  if(DishDao.addDish(username,dish_name,price, description , part.getSubmittedFileName()))
                  {
                      System.out.println("In The Servlet Dish added Successfully");
                      out.println("success");
                  }
                  else
                  {
                      System.out.println("The FunctionReturned false");
                      out.println("failure");
                  }
                  
              }
              catch(Exception ex)
              {
                  
                  ex.printStackTrace();
                  System.out.println("exception in AddDishControllerServlet");
              }
          
            
            
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

}
