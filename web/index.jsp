<%-- 
    Document   : index
    Created on : 23/04/2014, 11:33:46 AM
    Author     : Yazmin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REQUISICIONES</title>

    </head>
    <body>

        <%
            String pag;
            HttpSession act = request.getSession(true);
            if (act.getAttribute("userName") == null) {

        %>
        <%@include file="/view/Login/login.jsp" %>
        <% } else {
                pag = "/cbusqueda";
                response.sendRedirect(request.getContextPath() + pag);
            }

        %>


        <!--<nav class="navbar" role="navigation" style="background:brown">
            <img width="200"src="image/index/Logo5.png">
        </nav>
                  
        <div align="center" style="margin:40px auto; width:40%; border:solid 1px brown; padding:20px;">
            <form id="FrmLogin" name="form1" method="post" >
                <legend align="center" style="font-family: serif; font-size: 35px c; color:brown "><img src="image/index/Logo4.png">&nbsp;&nbsp;REQUISICIONES</legend>
                                 
                                  <a class="brand" class="active" href="#"></a><br>
        
        
        <div align="left" style="padding-left: 130px;">
            <div class="well-lg" style="padding-right: 150px">                          
            <input id="login" name="login" type="text" placeholder="Usuario" class="form-control">
            <br>
            <input id="pass" name="pass" type="password" placeholder="Contraseña" class="form-control" />
            </div>
            <br>
           
        </div>
        <button id="TlkLoginButton"  style="margin:0px ;" class="btn  btn-success TlkLoginButton" type="button">Entrar<i class="icon-chevron-right icon-white"></i></button>
                                
                                <div class="alert alert-error hide" id="myerror">
                                  <i class="icon-info-sign icon-white"></i>
                                  Usuario o Contrase&ntilde;a no Validos, porfavor, intente de nuevo.
                                </div>
                                <input type="hidden" name="loginid" id="loginid" value="">			
                        </form>
          </div>-->


    </body>
</html>
