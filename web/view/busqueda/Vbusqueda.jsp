

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
                   prefix="c" %>
        <%@include file="../../WEB-INF/jspf/jscss.jspf" %> 
        <script src="js/busqueda/paginacion.js" type="text/javascript"></script>
        <script src="js/busqueda/busqueda.js" type="text/javascript"></script>
        <script src="js/busqueda/formulario.js" type="text/javascript"></script>
        <script src="js/busqueda/detalle.js" type="text/javascript"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>

        <%@include file="../../WEB-INF/jspf/menu.jspf" %>    
        <nav class="navbar navbar-default  " role="navigation">
            <div class="navbar-header" >

                <button type="button" class="navbar-toggle " data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class=" sr-only">Navegador</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>

            </div>
            <div  class="container-fluid collapse navbar-collapse navbar-ex1-collapse">


                <ul class="nav navbar-nav">
                    <li><a >  Busqueda  de</a></li>
                    <li class="dropdown">
                        <a id="aNRq"  data-toggle="dropdown">N° de Requisición <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li id="bproy"><a >Proyecto</a></li>
                            <li id="barea"><a >Área</a></li>
                            <li id="btipo"><a >Tipo</a></li>
                        </ul>
                    </li>
                    <li class="dropdown"  >
                        <a id="aproy"  data-toggle="dropdown" style="display: none">Proyecto <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li id="bNRq"><a >N° de Requisición </a></li>
                            <li id="barea"><a >Área</a></li>
                            <li id="btipo"><a >Tipo</a></li>
                        </ul>
                    </li>
                    <li class="dropdown"  >
                        <a id="aArea"  data-toggle="dropdown" style="display: none">Área <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li id="bNRq"><a >N° de Requisición </a></li>
                            <li id="bproy"><a >Proyecto</a></li>
                            <li id="btipo"><a >Tipo</a></li>
                        </ul>
                    </li>
                    <li class="dropdown"  >
                        <a id="aTipo"  data-toggle="dropdown" style="display: none">Tipo <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li id="bNRq"><a >N° de Requisición </a></li>
                            <li id="bproy"><a >Proyecto</a></li>
                            <li id="barea"><a >Área</a></li>

                        </ul>
                    </li>
                </ul>
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <select  name="nreq" class="form-control" id="NReq1">
                            <option value="" disabled="disabled" selected="selected"  >-Cualquiera-</option>
                            <c:forEach  var="num" begin="0" items="${requestScope.numero}">
                                <option >${num}</option>
                            </c:forEach>
                        </select>

                        <select id="area1" name="area" class="form-control" style="display: none">
                            <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>
                            <c:forEach var="areas" begin="0" items="${requestScope.datos2}">
                                <option>${areas}</option>
                            </c:forEach>
                        </select>

                        <select id="proy1" name="proy" class="form-control" style="display: none">
                            <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>
                            <c:forEach var="pro" begin="0" items="${requestScope.fkProyecto}">
                                <option>${pro}</option>
                            </c:forEach>
                        </select>

                        <select id="tipo1" name="status" class="form-control" style="display: none">
                            <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>
                            <c:forEach var="tip" begin="0" items="${requestScope.tipo}">
                                <option>${tip}</option>
                            </c:forEach>
                        </select> 
                    </div>
                    <a id="consulta" class="btn btn-default glyphicon glyphicon-search "></a>
                </form>
                <ul class="nav navbar-nav navbar-right">
                    <br>
                    <a  href="#" id="filtro" class="glyphicon glyphicon-arrow-down">Busqueda Avanzada</a>
                    <a  href="#" id="filtro1" class="glyphicon glyphicon-arrow-up" style="display: none">Busqueda Avanzada</a>
                </ul>

            </div>
        </nav>
        <h3 style="font-family: serif; color:brown" align="center">BUSQUEDA DE REQUISICIÓN</h3>
        <br>
        <div class="container">

            <div align="left"  class="well container" style=" background: #e1edf7; display: none"  id="divformulario" >

                <div class="row container">    
                    <div class="col-lg-4">
                        <form class="form-horizontal" role="form">
                            <div class="form-group" > 
                                <label class="col-sm-5 control-label">N° de Requisición:</label>  

                                <div class="col-sm-7">
                                    <select  name="nreq" class="form-control" id="NReq">
                                        <option value="" disabled="disabled" selected="selected"  >-Cualquiera-</option>
                                        <c:forEach  var="num" begin="0" items="${requestScope.numero}">
                                            <option >${num}</option>
                                        </c:forEach>
                                    </select> <br>
                                </div>

                                <label class="col-sm-5 control-label">Área:</label> 
                                <div class="col-sm-7">
                                    <select id="area" name="area" class="form-control">
                                        <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>
                                        <c:forEach var="areas" begin="0" items="${requestScope.datos2}">
                                            <option>${areas}</option>
                                        </c:forEach>
                                    </select> <br>
                                </div>
                            </div>
                        </form>
                    </div>

                    <div class="col-lg-3">
                        <form class="form-horizontal" role="form">
                            <div class="form-group" > 
                                <label class="col-sm-5 control-label">Proyecto:</label>  
                                <div class="col-sm-7">
                                    <select id="proy" name="proy" class="form-control">
                                        <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>
                                        <c:forEach var="pro" begin="0" items="${requestScope.fkProyecto}">
                                            <option>${pro}</option>
                                        </c:forEach>
                                    </select> <br>
                                </div>
                                <label class="col-sm-5 control-label">Tipo:</label> 
                                <div class="col-sm-7">
                                    <select id="tipo" name="status" class="form-control">
                                        <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>
                                        <c:forEach var="tip" begin="0" items="${requestScope.tipo}">
                                            <option>${tip}</option>
                                        </c:forEach>
                                    </select> 
                                </div>
                            </div>
                        </form>
                    </div>

                    <div class="col-lg-3">
                        <form class="form-horizontal" role="form">
                            <div class="form-group" > 
                                <label class="col-sm-5 control-label">Fecha Inicial:</label>  
                                <div class="col-sm-7">
                                    <input type="date" id="finicial" name="finicial" class="form-control"> <br>
                                </div>
                                <label class="col-sm-5 control-label">Fecha Final:</label> 
                                <div class="col-sm-7">
                                    <input type="date" id="ffinal" name="ffinal" class="form-control">
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="col-lg-2" >
                        <form class="form-horizontal" role="form">
                            <div class="form-group" > 

                                <div class="col-sm-3">
                                    <a id="bBusqueda" class="btn btn-danger"  >Buscar </a>
                                    <a id="bBusqueda2" class="btn btn-primary " style="display: none">Nueva Busqueda</a>
                                    <br><br>
                                    <a id="bRE" class="btn btn-danger"  >Salir </a>
                                </div> 

                            </div>
                        </form>
                    </div>
                </div>
            </div>   



            <div class="contenedor  container well " style="  background: #e1edf7"  id="ctabla">
                <ul class="nav nav-tabs" >

                    <li ><a href="#profile" data-toggle="tab" id="nueva"  ><b>Nuevas</b></a></li>
                    <li><a id="recp" href="#messages" data-toggle="tab" ><b>Recepcionadas</b></a></li>
                    <li><a id="proc" href="#settings" data-toggle="tab" ><b>En proceso</b></a></li>
                    <li><a id="oc" href="#settings" data-toggle="tab" ><b>Con O.C.</b></a></li>
                    <li><a id="borradores" href="#settings" data-toggle="tab" ><b>Borradores</b></a></li>
                    <li><a id="canceladas" href="#settings" data-toggle="tab" ><b>Canceladas</b></a></li>
                </ul>

                <!-- Tab panes -->


                <table class="table table-hover" id="tabla2">
                    <thead id="head">
                    <th>-</th>
                    <th>Tipo</th>
                    <th>Status</th>
                    <th>Número</th>
                    <th>Trabajada por</th>
                    <th>Fecha Recepción</th>
                    <th>Fecha de Proceso</th>
                    <th>Fecha de Orden</th>
                    <th>Proyecto</th>
                    <th>Área</th>

                    </thead>
                    <tbody id="uno">
                        <c:forEach var="Requisiciones" begin="0" items="${requestScope.datos}">
                            <tr>

                                <td onclick="celda_click(parentNode);"><a id="iddetalle" class="glyphicon glyphicon-plus prueba"   > </a>
                                </td>

                                <% // TIPO DE REQUISICION %>
                                <c:choose>
                                    <c:when test="${Requisiciones[1]== 1}">
                                        <td class="prioridad3">Articulo</td>
                                    </c:when>
                                    <c:when test="${Requisiciones[1]== 2}">
                                        <td class="prioridad3">Servicio</td>
                                    </c:when>
                                    <c:when test="${Requisiciones[1]== 3}">
                                        <td class="prioridad3">I.N Articulo</td>
                                    </c:when>
                                    <c:when test="${Requisiciones[1]== 4}">
                                        <td class="prioridad3">I.N Servicio</td>
                                    </c:when>
                                </c:choose>
                                <% // STATUS REQUISICION  %>
                                <c:choose>
                                    <c:when test="${Requisiciones[2]== 1}">
                                        <td >Borrador</td>
                                    </c:when>
                                    <c:when test="${Requisiciones[2]== 2}">
                                        <td >Nuevas</td>
                                    </c:when>
                                    <c:when test="${Requisiciones[2]== 3}">
                                        <td >Recepcionada</td>
                                    </c:when>
                                    <c:when test="${Requisiciones[2]== 4}">
                                        <td >Proceso</td>
                                    </c:when>
                                    <c:when test="${Requisiciones[2]== 5}">
                                        <td >Cancelada</td>
                                    </c:when>
                                    <c:when test="${Requisiciones[2]== 6}">
                                        <td >OrdenCompra</td>
                                    </c:when>
                                </c:choose>

                                <% // NUMERO REQUISICION  %>
                                <td class="prioridad" >${Requisiciones[3]}</td>

                                <% // TRABAJADA POR  %>
                                <c:choose>
                                    <c:when test="${Requisiciones[20]!=null}">
                                        <td >${Requisiciones[20]}</td>
                                    </c:when>
                                    <c:otherwise>
                                        <td >Por Asignar</td>
                                    </c:otherwise>
                                </c:choose>


                                <% // FECHA RECEPCION  %>
                                <c:choose>
                                    <c:when test="${Requisiciones[18]!=null}">
                                        <td >${Requisiciones[18]}</td>
                                    </c:when>
                                    <c:otherwise>
                                        <td >Por Asignar</td>
                                    </c:otherwise>
                                </c:choose>


                                <% // FECHA PROCESO  %>
                                <c:choose>
                                    <c:when test="${Requisiciones[5]!=null}">
                                        <td >${Requisiciones[5]}</td>
                                    </c:when>
                                    <c:otherwise>
                                        <td >Por Asignar</td>
                                    </c:otherwise>
                                </c:choose>


                                <% // FECHA ORDEN COMPRA  %>
                                <c:choose>
                                    <c:when test="${Requisiciones[6]!=null}">
                                        <td >${Requisiciones[6]}</td>

                                    </c:when>
                                    <c:otherwise>
                                        <td >Por Asignar</td>
                                    </c:otherwise>
                                </c:choose>


                                <% // FK PROYECTO  %>
                                <td class="prioridad2" >${Requisiciones[9]}</td>


                                <% // AREA  %>
                                <td  class="prioridad1">${Requisiciones[10]}</td>


                            </tr>
                        </c:forEach>



                    </tbody>
                </table>

                <div  style= "display:''; border: 0px;" id="NavPosicion"></div>
            </div> 
            <script type="text/javascript">
                var pager = new Pager('tabla2', 15);
                pager.init();
                pager.showPageNav('pager', 'NavPosicion');
                pager.showPage(1);
            </script>

        </div>






        <div class="container" id="cAnexo" style="display: none">
            <div align="left"  class="well container" style=" background: #e1edf7"  >
                <div class="row container">    

                    <br>
                    <div class="col-lg-4">             
                        <form class="form-horizontal" role="form">
                            <div class="form-group" > 
                                <label class="col-sm-6 control-label">N° de Requisición:</label>  

                                <div class="col-sm-6">
                                    <input type="text" id="nr3" name="nr3" class="form-control" value="" disabled> <br>
                                </div>

                                <label class="col-sm-6 control-label">Status:</label> 
                                <div class="col-sm-6">

                                    <input type="text" id="sts" name="sts" class="form-control" value="" disabled> 
                                </div>
                            </div>
                        </form>
                    </div>

                    <div class="col-lg-4">
                        <form class="form-horizontal" role="form">



                            <div class="form-group" > 
                                <label class="col-sm-6 control-label">Proyecto:</label>  
                                <div class="col-sm-6">

                                    <input type="text" id="pro" name="pro" class="form-control" value="" disabled> 



                                    </select> <br>
                                </div>
                                <label class="col-sm-6 control-label">Tipo:</label> 
                                <div class="col-sm-6">
                                    <input type="text" id="tip" name="tip" class="form-control" value="" disabled> 
                                </div>
                            </div>
                        </form>
                    </div>

                    <div class="col-lg-4">
                        <form class="form-horizontal" role="form">
                            <div class="form-group" > 
                                <label class="col-sm-6 control-label"> Fecha de Solicitud:</label>  
                                <div class="col-sm-6">
                                    <input type="text" id="fss" name="fss" class="form-control" value=""  disabled> <br>
                                </div>
                                <label class="col-sm-6 control-label">Fecha de Entrega:</label> 
                                <div class="col-sm-6">
                                    <input type="text" id="fee" name="fee" class="form-control" value=""  disabled>
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
                    <input id="totalaA1" type="text" class="form-control" value=""  disabled>
                </div>

                <br>
            </div>

            <div id="divAnexo2" class="container well" style="background: #e1edf7; display: none" >
                <div class="row container"> 
                    <div class="col-lg-6">
                        <br>
                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">Proveedor:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="prove2"  disabled>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Cliente:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="cliente2"  disabled>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Observacion:</label>
                                <div class="col-sm-8">
                                    <textarea id="obser2" class="form-control" rows="3" disabled ></textarea>
                                </div>
                            </div>  
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Evaluado por:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="eval" disabled >
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
                                    <input align="left" class="form-control" id="solicita2" disabled >
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Revisa Existencia:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="revisa" disabled >
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Aprueba:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="aprueba2" disabled >
                                </div>
                            </div>  
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Verificó Calidad:</label>
                                <div class="col-sm-8" >
                                    <input  class="form-control" id="vericali2"  disabled>

                                </div>

                            </div>   
                            <div class="form-group">
                                <div class="col-sm-1">
                                </div>
                                <div class="col-sm-6">
                                    <input type="checkbox" disabled ><b> Relacionado con Seguridad</b>                  
                                </div>            
                                <div class="col-sm-5">

                                    <input type="checkbox" disabled ><b> Aplica 10 CFRcparte 21</b>
                                </div>
                            </div>


                        </form>

                    </div> 

                </div>

            </div>


            <div id="divAnexo1" class="container well" style="  background: #e1edf7; display: none" >
                <div class="row container"> 
                    <div class="col-lg-6">
                        <br>
                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">Solicita:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="solicita" disabled >
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Contacto:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="contacto" disabled >
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Cliente:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="cliente" disabled >
                                </div>
                            </div>  
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Observaciones:</label>
                                <div class="col-sm-8">
                                    <textarea id="obser" class="form-control" rows="3" disabled></textarea>
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
                                    <input align="left" type="text" class="form-control" id="aprueba" disabled >
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Proveedores:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="prove"  disabled>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-4 control-label">Verificó Calidad:</label>
                                <div class="col-sm-8">
                                    <input  class="form-control" id="vericali"  disabled>
                                </div>
                            </div>  

                        </form>
                    </div> 

                </div>

            </div>

            <div class="container" align=" center">
                <br>
                <button    type="button" class="btn btn-danger">Duplicar</button>
                <a id="bRegresar" class="btn btn-danger"  >Regresar</a>
            </div> 
            <br>
            <br>

        </div> 

    </body>

</html>