/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.busqueda;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Proyectos;
import model.Requisiciones;
import model.VwaspnetMembershipUsers;
//import org.apache.commons.codec.digest.DigestUtils;
//import org.apache.catalina.core.StandardContext;

/**
 *
 * @author Princess
 */
public class Cbusqueda extends HttpServlet {

    VwaspnetMembershipUsers vw = new VwaspnetMembershipUsers();
    Requisiciones re = new Requisiciones();
    private ArrayList<String> numeroRequi = new ArrayList<String>();
    private ArrayList<String> fkProyecto = new ArrayList<String>();
    private ArrayList<String> tipo = new ArrayList<String>();
    Date ahora = new Date();
    SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
    String idUser;
    HttpServletRequest request;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        this.request = request;
        String pagina;

        HttpSession session = request.getSession(true);

        if (session.getAttribute("userName") == null) {
            pagina = "/index.jsp";
            response.sendRedirect(request.getContextPath() + pagina);
        } else {
            limpiarDatos();
            String userName = (String) session.getAttribute("userName");
            idUser = (String) (session.getAttribute("idUser"));

            List r = consulta(userName);
            List a = cargarArea(userName);
            cargarMenu(userName);
            pagina = "/view/busqueda/Vbusqueda.jsp";

            //  
            //st8V7QUAko2M+KWAlJ38PbGRxw8=
            //abraham
            //VoWFUcnSmCi2U3MNjOb9QyL0D4g=
            //patricia.morales
            //CuWippqweGujyTujgdplgF46Z7c=
            //rosa.sanchez
            //RohHFaUU6QJtYRWW5EKMfV2KNOk=
            agregarAtributos("datos", r);
            agregarAtributos("datos2", a);
            agregarAtributos("numero", getNumeroRequi());
            agregarAtributos("fkProyecto", getFkProyecto());

            agregarAtributos("tipo", getTipo());

            RequestDispatcher rd = getServletContext().getRequestDispatcher(pagina);
            rd.forward(request, response);
        }

    }

    public List consulta(String user) throws ParseException {
        List<Object> requi = Persistence.createEntityManagerFactory("RequisicionesPU").createEntityManager().createNamedQuery("Requisiciones.findByNombreUsuario2").setParameter("nombreUsuario", user).getResultList();
        return requi;
    }

    public List cargarArea(String user) {
        List requi = Persistence.createEntityManagerFactory("RequisicionesPU").createEntityManager().createNamedQuery("VwAreaUsuario.findByUserName").setParameter("userName", user).getResultList();
        return requi;
    }

    public void cargarMenu(String user) {
        List<Object> requi = Persistence.createEntityManagerFactory("RequisicionesPU").createEntityManager().createNamedQuery("Requisiciones.findByNombreUsuarioProyecto").setParameter("nombreUsuario", user).getResultList();
        Iterator i = requi.iterator();
        while (i.hasNext()) {
            Object[] obj = (Object[]) i.next();
            if (!numeroRequi.contains(String.valueOf(obj[0]))) {
                numeroRequi.add(String.valueOf(obj[0]));
            }
            if (!fkProyecto.contains(String.valueOf(obj[1]))) {
                fkProyecto.add(String.valueOf(obj[1]));
            }

            switch (Integer.parseInt(String.valueOf(obj[2]))) {

                case 1:
                    agregarNoRepetidos("Articulo");
                    break;
                case 2:
                    agregarNoRepetidos("Servicio");
                    break;
                case 3:
                    agregarNoRepetidos("I.N Articulo");
                    break;
                case 4:
                    agregarNoRepetidos("I.N Servicio");
                    break;
            }

        }
    }

    public void agregarNoRepetidos(String s) {

        if (!tipo.contains(s)) {
            tipo.add(s);
        }
    }

    public void limpiarDatos() {
        getFkProyecto().clear();
        getNumeroRequi().clear();
        getTipo().clear();

    }

    public void agregarAtributos(String nombre, Object valor) {

        request.setAttribute(nombre, valor);

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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {

        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {

        }

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

    public ArrayList<String> getTipo() {
//        
        return tipo;
    }

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getNumeroRequi() {
        return numeroRequi;
    }

    public void setNumeroRequi(ArrayList<String> numeroRequi) {
        this.numeroRequi = numeroRequi;
    }

    public ArrayList<String> getFkProyecto() {
        return fkProyecto;
    }

    public void setFkProyecto(ArrayList<String> fkProyecto) {
        this.fkProyecto = fkProyecto;
    }
}
