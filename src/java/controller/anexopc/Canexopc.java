/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.anexopc;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Requisiciones;

/**
 *
 * @author Princess
 */
public class Canexopc extends HttpServlet {

    Requisiciones req = new Requisiciones();
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
          String pagina = "/view/anexos/Vanexoapc.jsp";
         RequestDispatcher rd = getServletContext().getRequestDispatcher(pagina);
        rd.forward(request, response);
        
         EntityManagerFactory emf;
       emf= Persistence.createEntityManagerFactory("RequisicionesPU");
       EntityManager em = emf.createEntityManager();  
       
       String nreq= request.getParameter("nr2");
       String status= request.getParameter("status2");
       String proy= request.getParameter("proy2");
       String tipo= request.getParameter("tipo2");
       String fsoli= request.getParameter("fS");
       String fentre= request.getParameter("fe");
       String total= request.getParameter("total");
       String solicita= request.getParameter("solicita");
       String contacto= request.getParameter("contacto");
       String cliente= request.getParameter("cliente");
       String obs= request.getParameter("obser");
       String aprueba= request.getParameter("aprueba");
       String prove= request.getParameter("prove");
       String vericali= request.getParameter("vericali");
       
//       req.setNumero(nreq);
//       req.setStatus(status);
//       req.setFkProyecto(null);
//       req.setTipo(tipo);
//       req.setFechaSolicitud(null);
//       req.setFechaRequerida(null);
//       req.setTotal(BigDecimal.ZERO);
//       req.setSolicita(solicita);
//       req.setContacto(contacto);
//       req.setCliente(cliente);
//       req.setObservaciones(obs);
//       req.setAutorizadoPor(aprueba);
//       req.setProveedor(prove);
//       req.setVerifCalidad(vericali);
//     
//       EntityTransaction trans = em.getTransaction();
//       trans.begin();
//       em.persist(req);
//       trans.commit();
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
