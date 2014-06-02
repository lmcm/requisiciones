<%-- 
    Document   : Vdetalle
    Created on : 22/05/2014, 02:05:25 PM
    Author     : pciai275
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../../WEB-INF/jspf/jscss.jspf" %> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body >
        <script src="js/anexos/anexopn.js" type="text/javascript"></script>
        <%@include file="../../WEB-INF/jspf/menu.jspf" %>   
        <br>

        <br>
     

                    <div class="col-lg-4">
                        <form class="form-horizontal" role="form">
                            <div class="form-group" > 
                                <label class="col-sm-6 control-label">Proyecto:</label>  
                                <div class="col-sm-6">
                                    <select id="status" name="status" class="form-control">
                                        <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>

                                        <option value=""> </option>


                                    </select> <br>
                                </div>
                                <label class="col-sm-6 control-label">Tipo:</label> 
                                <div class="col-sm-6">
                                    <select id="status" name="status" class="form-control">
                                        <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>

                                        <option value=""></option>

                                    </select>
                                </div>
                            </div>
                        </form>
                    </div>

                    <div class="col-lg-4">
                        <form class="form-horizontal" role="form">
                            <div class="form-group" > 
                                <label class="col-sm-6 control-label">Fecha de Solicitud:</label>  
                                <div class="col-sm-6">
                                    <input type="date" id="fsolicitud" name="fs" class="form-control"> <br>
                                </div>
                                <label class="col-sm-6 control-label">Fecha de Entrega:</label> 
                                <div class="col-sm-6">
                                    <input type="date" id="fentrega" name="fe2" class="form-control">
                                </div>
                            </div>
                        </form>
                    </div>

                    <div class="row container">    
                        <div class="col-lg-4">
                            <form class="form-horizontal" role="form">
                                <div class="form-group" > 


                                    <div class="col-sm-6">
                                        <input type="checkbox" disabled=""> Requiere Calidad  <br>
                                    </div>

                                </div>
                            </form>
                        </div>



                    </div>
                </div>
            </div>

            <div class="container well" style="background: #e1edf7">
                <div >
                    <br>
                    <textarea id="text2" class="form-control" rows="12"></textarea>
                </div>
                <div align="right" >
                    <label  class="col-sm-12 control-label">Total&nbsp </label>    </div>
                <div align="right" class="col-sm-9">

                </div>
                <div align="right" class="col-sm-3">
                    <input id="total2" type="text" class="form-control">
                </div>

                <br>
            </div>

            <div id="div" class="container well" style="background: #e1edf7">
                <div class="row container"> 
                    <div class="col-lg-6">
                        <br>
                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">Proveedor:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="prove2" >
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Cliente:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="cliente2" >
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Observacion:</label>
                                <div class="col-sm-8">
                                    <textarea id="obser2" class="form-control" rows="3" ></textarea>
                                </div>
                            </div>  
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Evaluado por:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="eval" >
                                </div>

                            </div>                
                        </form>
                    </div> 
                    <div class="col-lg-6">
                        <br>
                        <form  class="form-horizontal" role="form">
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">Solicita:</label>
                                <div class="col-sm-8">
                                    <input align="left" class="form-control" id="solicita2" >
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Revisa Existencia:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="revisa" >
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Aprueba:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="aprueba2" >
                                </div>
                            </div>  
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Verificó Calidad:</label>
                                <div class="col-sm-8" >
                                    <input  class="form-control" id="vericali2" >

                                </div>

                            </div>   
                            <div class="form-group">
                                <div class="col-sm-1">
                                </div>
                                <div class="col-sm-6">
                                    <input type="checkbox"  ><b> Relacionado con Seguridad</b>                  
                                </div>            
                                <div class="col-sm-5">

                                    <input type="checkbox" ><b> Aplica 10 CFRcparte 21</b>
                                </div>
                            </div>


                        </form>

                    </div> 

                </div>

            </div>


            <div id="div1" class="container well" style="  background: #e1edf7; display: none" >
                <div class="row container"> 
                    <div class="col-lg-6">
                        <br>
                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">Solicita:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="solicita" >
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Contacto:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="contacto" >
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Cliente:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="cliente" >
                                </div>
                            </div>  
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Observaciones:</label>
                                <div class="col-sm-8">
                                    <textarea id="obser" class="form-control" rows="3"></textarea>
                                </div>

                            </div>                
                        </form>
                    </div> 
                    <div class="col-lg-6">
                        <br>
                        <form  class="form-horizontal" role="form">
                            <div class="form-group">
                                <label align="left" for="inputEmail3" class="col-sm-4 control-label">Aprueba:</label>
                                <div class="col-sm-8">
                                    <input align="left" type="text" class="form-control" id="aprueba" >
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Proveedores:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="prove" >
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Verificó Calidad:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="vericali" >
                                </div>
                            </div>  

                        </form>
                    </div> 

                </div>

            </div>








            <div class="container" align=" center">
                <br>
                <button     type="button" class="btn btn-danger">Duplicar</button>
            </div> 
            <br>
            <br>

        </div>  
    </body>

</html>
