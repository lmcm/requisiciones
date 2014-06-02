/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.busqueda;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Requisiciones;

/**
 *
 * @author pciai275
 */
public class Cdetalle extends HttpServlet {

    Requisiciones re = new Requisiciones();

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
//        String pagina = "/view/busqueda/Vdetalle.jsp";

        response.setContentType("text/html;charset=UTF-8");
        String numero = request.getParameter("requi");

        System.out.println("TU NUMERO ES : " + numero);
        PrintWriter out = response.getWriter();
        re = this.buscarRequi(numero);
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println(re.getNumero());
            out.println(obtenerStatus(re.getStatus()));
            out.println(re.getFkProyecto());
            out.println(obtenerTipo(re.getTipo()));
            out.println(re.getFechaSolicitud());

            out.println(re.getFechaRequerida());
            out.println(re.getReqCalidad());
            out.println((((re.getTotal()))));
            out.println(re.getProveedor());
            out.println(re.getCliente());

            out.println(re.getObservaciones());
            out.println(re.getEvaluadoPor());
            out.println(re.getSolicita());
            out.println(re.getRevisaExistencia());
            out.println(re.getAutorizadoPor());

            out.println(re.getVerifCalidad());
            out.println(re.getRelSeguridad());
            out.println(re.getCFRparte21());
            out.println(re.getContacto());
            out.println(re.getAutorizadoPor());

            System.out.println(re.getNumero());
            System.out.println(re.getSolicita());
            System.out.println(re.getTotal());
            
            System.out.println("evaluado por [" + re.getEvaluadoPor() + "]");

//            request.setAttribute("requiArticulo", out);
        } finally {
            out.close();
        }

//        RequestDispatcher rd = getServletContext().getRequestDispatcher(pagina);
//        rd.forward(request, response);
//      
    }

    public Requisiciones buscarRequi(String r) {
        re = (Requisiciones) Persistence.createEntityManagerFactory("RequisicionesPU").
                createEntityManager().
                createNamedQuery("Requisiciones.findByNumero").
                setParameter("numero", r).
                getSingleResult();
        return re;

    }

    public String obtenerStatus(int i) {
        String st = "";
        switch (i) {
            case 1:
                st = "Borrador";
                break;
            case 2:
                st = "Nuevas";
                break;
            case 3:
                st = "Recepcionada";
                break;
            case 4:
                st = "Proceso";
                break;
            case 5:
                st = "Cancelada";
                break;
            case 6:
                st = "OrdenCompra";
                break;
        }

        return st;
    }

    public String obtenerTipo(int i) {
        String st = "";

        switch (i) {
            case 1:
                st = "Articulo";
                break;
            case 2:
                st = "Servicio";
                break;
            case 3:
                st = "I.N Articulo";
                break;
            case 4:
                st = "I.N Servicio";
                break;

        }

        return st;
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
