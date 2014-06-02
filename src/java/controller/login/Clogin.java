/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.login;

import controller.busqueda.Cbusqueda;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import model.Requisiciones;
import model.VwaspnetMembershipUsers;

/**
 *
 * @author Princess
 */
public class Clogin extends HttpServlet {

    VwaspnetMembershipUsers vw = new VwaspnetMembershipUsers();
    HttpSession session;

    /**
     * HttpSession session Processes requests for both HTTP <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagina = null;

        pagina = "/index.jsp";

        String user = request.getParameter("login");
        String pass = request.getParameter("pass");

        if (user.equals("") | pass.equals("")) {
            System.out.println("USERNAME Y PASSWORD VACIOS");
        } else {
            EntityManager em = Persistence.createEntityManagerFactory("RequisicionesPU").createEntityManager();
            Query q = em.createNamedQuery("VwaspnetMembershipUsers.findByUserName");
            q.setParameter("userName", user);

            List usuario = q.getResultList();

            if (usuario.isEmpty()) {
                System.out.println("No se encontro usuario");
            } else {
                vw = (VwaspnetMembershipUsers) usuario.get(0);
                String idUser = vw.getUserId();
                String nombre = vw.getUserName();
                String password = vw.getPassword();
                boolean status = vw.getIsApproved();
                boolean apro = vw.getIsLockedOut();
                if (nombre.equals(user) && status == true && apro == false && password.equals(pass)) {

                    System.out.println("entro a usuario");
                    session = request.getSession();

                    if (session != null) {
                        session.setAttribute("userName", nombre);
                        session.setAttribute("idUser", idUser);

                        pagina = "cbusqueda";
                        em.close();
                    }

                } else {
                    pagina = "/index.jsp";

                }

            }

        }

        request.getRequestDispatcher(pagina).forward(request, response);

        //st8V7QUAko2M+KWAlJ38PbGRxw8=
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

        request.getRequestDispatcher("cbusqueda").forward(request, response);
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

    public void verificarSesion() {

    }
}
