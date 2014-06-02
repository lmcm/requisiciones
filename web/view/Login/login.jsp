<%-- 
    Document   : login
    Created on : 28/04/2014, 10:01:15 PM
    Author     : Princess
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../../WEB-INF/jspf/jscss.jspf" %> 
        <script src="js/login/login.js" type="text/javascript"></script>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <title>Requisiciones IAI</title>
    </head>
    <body>
        <%
            String pagina;
            HttpSession actual = request.getSession(true);
            if (actual.getAttribute("userName") == null) {
            } else {
                pagina = "/cbusqueda";
                response.sendRedirect(request.getContextPath() + pagina);
            }
        %>

        <nav class="navbar" role="navigation" style="background:brown">
            <img width="200" src="image/index/Logo5.png">
        </nav>
        <br><br><br> <div class="container" >      


            <div class="row"> 
                <div class="col-lg-3"  ></div> 
                <div  class="col-lg-6 " style="border:solid 1px brown"  >
                    <br>
                    <div>
                        <legend align="center"  style="font-family: serif; font-size: 35px c; color:brown "><img  src="image/index/Logo4.png">&nbsp;&nbsp;REQUISICIONES</legend>

                        <a class="brand" class="active" href="#"></a><br>
                        <div >
                            <form  class="form-horizontal " role="form" action="clogin" method="POST" align="center">
                                <div  class="form-group " >

                                    <div  class="col-sm-4"   ></div>  
                                    <div  class="col-sm-4"   >
                                        <input id="login" name="login" type="text" placeholder="Usuario" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div  class="col-sm-4"   ></div>  
                                    <div class="col-sm-4">
                                        <input id="pass" name="pass" type="password" placeholder="Contraseña" class="form-control" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-8">
                                        <br>
                                        <input id="TlkLoginButton"  class="btn  btn-success TlkLoginButton" type="submit" value="Entrar">
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div> 
                </div> 
            </div> 

            <br>
            <br>
        </div>       

    </body>
</html>

