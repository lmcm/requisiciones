<%-- 
    Document   : recuperarcontra
    Created on : 27/04/2014, 10:47:07 PM
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
      <h1 style="font-family: serif; color:brown" align="center">RECUPERAR CONTRASEÑA</h1>
      <br>
             <div class="container well" style="width: 50% ; background: #e1edf7" align="center" >
                 <form class="form-horizontal" role="form" >

<div align="left" >
    <div  align="center" >                          
       <label > Escriba su correo para recuperar su contraseña</label>
       <br>
       <br>
        <table align="center">
            <tbody>
                <tr>
                    <td>
                        
                      <label><samp class="glyphicon glyphicon-envelope"></samp>&nbsp Correo:&nbsp  </label>  
                    </td>
                    <td>
                       <input id="email" name="email" type="text" class="form-control" /> 
                    </td>
                </tr>
            </tbody>
        </table>  
        
    </div>
    <br>
   
</div>
			
						
		</form>
                 
  </div>
         <div align="center">
               <button     type="button" class="btn btn-danger">Enviar</button>
          </div>

    </body>
    
   
</html>
