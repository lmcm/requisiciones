<%-- 
    Document   : permisos
    Created on : 27/04/2014, 11:16:37 PM
    Author     : Princess
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../../WEB-INF/jspf/jscss.jspf" %> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
    </head>
    <body>
        <%@include file="../../WEB-INF/jspf/menu.jspf" %> 
          <br>
            <h1 style="font-family: serif; color:brown" align="center">PERMISOS DE USUARIO</h1>
          <br>
          <div class="container">
          <div  style="width: 20%" >
              <label>
                  Usuario:
              </label>
          </div>
          <div style="width: 20%" >
                <select id="status" name="status" class="form-control">
                                            <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>
                                            <? 

                                            ?>
                                            <option value="<?= $edoC->getid(); ?>"><?= $edoC-></option>
                                            <?

                                            }
                                            ?>

                             </select>
              <br>
          </div>
              </div>
        <div class="container well"  style="background: #e1edf7" >
            <br>
            <div  class="container row" >
         <div class="col-lg-3">  
          
          <form role="form">
 
 <div class="checkbox">
   <label>
     <input type="checkbox"> Administración
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Almacen
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Calidad y Pruebas
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Comercialización
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Construción Civil
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Control de Documentos
   </label>
     
 </div>

</form>
          
          
      </div>
          
  <div class="col-lg-3">  
          
          <form role="form">
 
 <div class="checkbox">
   <label>
     <input type="checkbox"> Costos Y Compras
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Desarrollo de Negocios
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Finanzas
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Ingenieria
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Ingenieria y Proyectos de Innovación
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Operaciones Generales
   </label>
     
 </div>

</form>
          
          
      </div>  
          
          
          <div class="col-lg-3">  
          
          <form role="form">
 
 <div class="checkbox">
   <label>
     <input type="checkbox"> Recursos Humanos
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Redes
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Servicios Generales
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Soporte Tecnico
   </label>
     
 </div>
              <div class="checkbox">
   <label>
     <input type="checkbox"> Teleinformatica
   </label>
     
 </div>
           

</form>
                 
          
      </div>  
          
          </div>
            <br>
          </div>
     <div  class="container  " align="center">
         <br>
                                <button type="button" class="btn btn-danger">Guardar</button>
                             </div>
    </body>
</html>
