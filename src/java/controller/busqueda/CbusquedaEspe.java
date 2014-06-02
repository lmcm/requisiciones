/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.busqueda;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import model.Requisiciones;

/**
 *
 * @author Aurum CEO
 */
public class CbusquedaEspe extends HttpServlet {

    private String pagina;
    Requisiciones re = new Requisiciones();
    List list;
    HttpServletResponse response;
    int id = 0;
    PrintWriter out;

    Iterator i = null;

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
        this.response = response;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        HttpSession session = request.getSession();

        if (session.getAttribute("userName") == null) {
            pagina = "/index.jsp";
            this.response.sendRedirect(request.getContextPath() + pagina);
        } else {

            id = Integer.parseInt(request.getParameter("idPeticion"));
            String userName = session.getAttribute("userName").toString();
            System.out.println("USUARIO " + userName);
            list = consulta(id, userName);
            recorrerRequi();

        }

    }

    public List consulta(int idd, String user) {
        EntityManager em = Persistence.createEntityManagerFactory("RequisicionesPU").createEntityManager();
        Query q2 = em.createNamedQuery("Requisiciones.findByNombreUsuario");
//        JOptionPane.showMessageDialog(null, "id " + idd);
        q2.setParameter("status", idd);
        q2.setParameter("nombreUsuario", user);
        List requi = q2.getResultList();

        System.out.println("dddddddddddddddddddddddddddddddddddddddd");
        em.close();
        return requi;
    }

    public void recorrerRequi() throws IOException {
        int con = 0;
        String p = "";
        i = list.iterator();
        p += "<tbody id=' " + id + "'>";
        while (i.hasNext()) {
            con++;
            re = (Requisiciones) i.next();
            p += "<tr>";
            p += "<td></td>";
            p += "<td>" + re.getTipo() + "</td>";
            p += "<td>" + re.getStatus() + "</td>";
            p += "<td>" + re.getNumero() + "</td>";
            p += "<td>" + re.getNombreUsuario() + "</td>";
            p += "<td>" + re.getFechaRecepcion() + "</td>";
            p += "<td>" + re.getFechaProceso() == null ? "- Por asignar -" : re.getFechaProceso() + "</td>";
            p += "<td>" + re.getFechaOc() == null ? "- Por asignar -" : re.getFechaOc() + "</td>";
            p += "<td>" + re.convertir(re.getFkProyecto()) + "</td>";
            p += "<td>" + re.getArea() + "</td>";
            p += "</tr>";
        }
        p += "</tbody>";
        out.println(con > 0 ? p : "Sin registros");
        out.close();

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
