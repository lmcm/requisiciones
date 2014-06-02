<%-- 
    Document   : crearusuario
    Created on : 27/04/2014, 05:36:23 PM
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
        <script src="js/cuenta/crearusuario.js" type="text/javascript"></script>
        <%@include file="../../WEB-INF/jspf/menu.jspf" %> 
        <br>
        <h1 style="font-family: serif; color:brown" align="center">CREAR CUENTA</h1>
        <br>
        <div class="container " align="center">
        <div class="container ">
        <div  class="well" style="background: #e1edf7;width: 50%">
                <div class="row container "> 
                <div class="col-lg-6">
                 <br>
                  <form class="form-horizontal" role="form">
                    <div class="form-group">
                      <label for="inputEmail3" class="col-sm-5 control-label">Nombre de Usuario:</label>
                    <div class="col-sm-6">
                      <input  class="form-control" id="nomusuario" >
                    </div>
                    </div>
                  <div class="form-group">
                    <label for="inputPassword3" class="col-sm-5 control-label">Contraseña:</label>
                     <div class="col-sm-6">
                       <input  class="form-control" id="contraseña" >
                     </div>
                  </div>

                   <div class="form-group">
                    <label for="inputPassword3" class="col-sm-5 control-label">Confirmar Contraseña:</label>
                    <div class="col-sm-6">
                       <input  class="form-control" id="confircontraseña" >
                    </div>
                  </div>  
                    <div class="form-group">
                    <label for="inputPassword3" class="col-sm-5 control-label">Correo Electronico:</label>
                    <div class="col-sm-6">
                        <input  class="form-control" id="correo" >
                    </div>
                    
                   </div>   
                       <div class="form-group">
                    <label for="inputPassword3" class="col-sm-5 control-label">Pregunta de Seguridad:</label>
                    <div class="col-sm-6">
                        <input  class="form-control" id="preguntadeseguridad" >
                    </div>
                    
                   </div>  
                         <div class="form-group">
                    <label for="inputPassword3" class="col-sm-5 control-label">Respuesta de Seguridad:</label>
                    <div class="col-sm-6">
                        <input  class="form-control" id="respuestadeseguridad" >
                    </div>
                    
                   </div>
                       
                </form>
              </div>    
        </div>
         </div>
        </div>
          
            
             <div align="center">
                        <a  id="bRegistrar" class="btn btn-danger">Regristrar</a>
             </div>
            <br>
            <br>
        </div>
         
    </body>
</html>
