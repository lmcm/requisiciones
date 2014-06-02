<%-- 
    Document   : cambiarcontra
    Created on : 27/04/2014, 11:04:31 PM
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
        <script src="js/cuenta/cambiarcontra.js" type="text/javascript"></script>
         <%@include file="../../WEB-INF/jspf/menu.jspf" %> 
         <br>
             <h1 style="font-family: serif; color:brown" align="center">CAMBIAR CONTRASEÑA</h1>
             <br>
             <div class="container well" style="width: 55% ; background: #e1edf7" align="center" >
                 <form align="center" class="form-horizontal" role="form" >
             <div class="form-group">
                 <label align="right" class="col-sm-5">Contraseña Actual:</label>                                        
              <div class="col-sm-5">
                 <input type="password" id="contraseña" name="nR" class="form-control">
             </div>
             </div>
                <div class="form-group">
                  <label align="right" class="col-sm-5">Nueva Contraseña:</label> 

                  <div class="col-sm-5">
                    <input type="text" id="ncontraseña" name="nR" class="form-control">
                  </div>
                </div>
              
            <div class="form-group">
            <label align="right" class="col-sm-5">Confirmar Contraseña:</label>
                                     

            <div class="col-sm-5">
                <input type="text" id="confcontraseña" name="nR" class="form-control">
            </div>
            </div>
            </form>
            </div>
       
             <div align="center">
               <a  id="bCGuardar" class="btn btn-danger">Guardar</a>
          </div>
    </body>
</html>
