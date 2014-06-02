<%-- 
    Document   : anexoapn
    Created on : 27/04/2014, 04:48:27 PM
    Author     : Princess
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
      <h1 style="font-family: serif; color:brown" align="center">ANEXO "A" DEL PIN-AD-02</h1>
      <br>
        <div class="container">
                <div align="left"  class="well container" style=" background: #e1edf7"  >
                <div class="row container">    
                <div class="col-lg-4">
                   <form class="form-horizontal" role="form">
                         <div class="form-group" > 
                             <label class="col-sm-6 control-label">N° de Requisición:</label>  
                             
                             <div class="col-sm-6">
                             <input type="text" id="nr3" name="nr3" class="form-control"> <br>
                             </div>
                            
                             <label class="col-sm-6 control-label">Status:</label> 
                             <div class="col-sm-6">
                             <select id="status" name="status" class="form-control">
                                            <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>
                                            
                                            <option value="<>"></option>
                                           

                             </select>
                         </div>
                         </div>
                   </form>
                </div>
                    
                    <div class="col-lg-4">
                   <form class="form-horizontal" role="form">
                         <div class="form-group" > 
                             <label class="col-sm-6 control-label">Proyecto:</label>  
                             <div class="col-sm-6">
                               <select id="status" name="status" class="form-control">
                                            <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>
                                            <? 

                                            ?>
                                            <option value="<?= $edoC->getid(); ?>"><?= $edoC-></option>
                                            <?

                                            }
                                            ?>

                             </select> <br>
                             </div>
                             <label class="col-sm-6 control-label">Tipo:</label> 
                             <div class="col-sm-6">
                             <select id="status" name="status" class="form-control">
                                            <option value="" disabled="disabled" selected="selected">-Cualquiera-</option>
                                            <? 

                                            ?>
                                            <option value="<?= $edoC->getid(); ?>"><?= $edoC-></option>
                                            <?

                                            }
                                            ?>

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
                             <input type="checkbox"> Requiere Calidad  <br>
                             </div>
                            
                         </div>
                   </form>
                </div>
                                   
                                        
                  
                                     </div>
                </div>
                </div>
   
              
        <br>              
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
        <br>
               
                <div class="container well" style="background: #e1edf7">
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
                
                
                <div class="container" align=" center">
                                             <br><a  id="bguardar2" class="btn btn-danger">Guardar</a>&nbsp;&nbsp;&nbsp;&nbsp
                                    <button     type="button" class="btn btn-danger">Duplicar</button>
                             </div> 
                <br>
                <br>
          
      </div>  
</body>
    
</html>
