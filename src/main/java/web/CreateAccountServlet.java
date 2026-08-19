/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hebebebebe
 */
public class CreateAccountServlet extends HttpServlet {
  private customerDAO dao;

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
        
        dao = new customerDAO();

            // extract the form data
            Integer id = Integer.valueOf(request.getParameter("id"));
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            String phoneNumber = request.getParameter("phoneNumber");
            String major = request.getParameter("major");

            // create the student object
            Student student = new Student(id, name, address, phoneNumber, major);

            if (dao.doesStudentExist(id)) {
                Student oldStudent = dao.getByID(id);
                dao.delete(oldStudent);
            }

            // check that the student contains valid data
            new Validator().assertValid(student);

            dao.save(student);
    }

   

}
