<%-- 
    Document   : requisicionesp
    Created on : 29/04/2014, 11:17:59 AM
    Author     : Yazmin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../../WEB-INF/jspf/jscss.jspf" %> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
    </head>
    <body>
        <script src="js/reportes/requisiciones.js" type="text/javascript"></script>
         <%@include file="../../WEB-INF/jspf/menu.jspf" %>  
         <br>
         <h1 style="font-family: serif; color:brown" align="center">REPORTES DE REQUISICIONES</h1>
         <br>
       <div class="container">
                <div class="well container" style=" background: #e1edf7"  >
                     <div class="col-lg-4">
                    <form class="form-horizontal" role="form">
                             <div class="col-sm-7"> 
                             <select id="tipo" name="status" class="form-control" >
                                            <option value="" disabled="disabled" selected="selected"></option>
                                            <? 

                                            ?>
                                            <option value="<?= $edoC->getid(); ?>"><?= $edoC->.    &nbsp;&nbsp;&nbsp</option>
                                            <?

                                            }
                                            ?>

                                        </select>
                             <br>
                             
                             </div>
                        <div class="col-sm-5"> 
                          <a  id="bBusquedaP" class="btn btn-danger">Buscar Proyecto</a>
                        </div>
                        </form>
                    <br>
                     <form class="form-horizontal" role="form">
                        <div class="col-sm-7">
                            <select id="tipo" name="status" class="form-control">
                                            <option value="" disabled="disabled" selected="selected"></option>
                                            <? 

                                            ?>
                                            <option value="<?= $edoC->getid(); ?>"><?= $edoC-></option>
                                            <?

                                            }
                                            ?>

                                        </select>
                             
                           </div>
                         <div class="col-sm-5"> 
                          <a  id="bBusquedaR" class="btn btn-danger">Buscar Requisición</a>
                        </div>
                                
                     </form>          
                     </div>  
                      <div class="col-lg-5 ">
                    
                </div>
                    <div class="col-lg-3 " align="right">
                    <form class="form-horizontal" role="form" >
                       <div class="col-sm-6" align="right"> 
                           <button    class="glyphicon glyphicon-print btn btn-danger" type="button" > Imprimir</button> 
                       </div>
                       
                        <div class="col-sm-6" align="right"> 
                           <button    class="glyphicon glyphicon-export btn btn-danger" type="button" > Exportar</button>
                       </div>
                    </form>
                </div>
                </div>
           <br>
        
           <div  class="container well" style=" background: #e1edf7">
               <table class="table table-striped" >
                <tr align="center" >
                    <td>N° de Requisicion</td>
                    <td>Status</td>
                    <td>Fecha de Recepción</td>
                    <td>Descripción</td>
                    <td>Fecha de Proceso</td>
                    <td>Orden de Compra</td>
                    <td>Fecha de O.C.</td>
                    <td>Observaciones</td>
                    <td>Solicitantes</td>
                    
                    
                </tr>
                <tbody id="btabla" style="display: none">
                <tr align="center">
               
                <td>21535451</td>
                <td>Nueva</td>
                <td>5/05/14</td>
                <td>Pantalla para laptop</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>Sebastian Lara</td>
                            
                </tr>
                 <tr align="center">
              
                <td>56542132</td>
                <td>Cancelada</td>
                <td>25/03/14</td>
                <td>Mouse para pc</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>Lorena mendez</td>
                            
                </tr>
                
                  <tr align="center">
              
                <td>56542132</td>
                <td>Nueva</td>
                <td>25/03/14</td>
                <td>Impresora</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>Ingrid Reyes</td>
                            
                </tr>
                
                  <tr align="center">
              
                <td>1245455</td>
                <td>Cancelada</td>
                <td>25/03/14</td>
                <td>un nuevo producto </td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>Antonio Otiz</td>
                            
                </tr>
                
                  <tr align="center">
              
                <td>56542132</td>
                <td>Cancelada</td>
                <td>25/03/14</td>
                <td>Mouse para pc</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>Lorena mendez</td>
                            
                </tr>
                
                  <tr align="center">
              
                <td>415412</td>
                <td>Cancelada</td>
                <td>25/03/14</td>
                <td>Mouse para pc viendo q mas para hacer grande el renglon de la tabla</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>Aldo</td>
                            
                </tr>
                
                  <tr align="center">
              
                <td>3248661</td>
                <td>Nueva</td>
                <td>25/03/14</td>
                <td>Mesa</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>Julia Martinez</td>
                            
                </tr>
                
                  <tr align="center">
              
                <td>56542132</td>
                <td>Cancelada</td>
                <td>25/03/14</td>
                <td>Mouse para pc</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>Lorena mendez</td>
                            
                </tr>
                
                  <tr align="center">
              
                <td>56542132</td>
                <td>Cancelada</td>
                <td>25/03/14</td>
                <td>Mouse para pc</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>--</td>
                <td>Lorena mendez</td>
                            
                </tr>
                </tbody>
            </table>
           </div>
       </div>
    </body>
</html>

