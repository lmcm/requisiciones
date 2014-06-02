<%-- 
    Document   : anexoapc
    Created on : 26/04/2014, 10:06:47 PM
    Author     : Princess
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          
        <%@include file="../../WEB-INF/jspf/jscss.jspf" %> 
       <script src="js/anexos/anexopc.js" type="text/javascript"></script>
    </head>
    <body>
         
        <%@include file="../../WEB-INF/jspf/menu.jspf" %>    
       
      <h3 style="font-family: serif; color:brown" align="center">ANEXO "A" DEL PC-06</h3>
      
       
        <div class="container">
                <div align="left"  class="well container" style="  background: #e1edf7"   >
                <div class="row container">    
                <div class="col-lg-4">
                   <form class="form-horizontal" role="form">
                         <div class="form-group" > 
                             <label class="col-sm-6 control-label">N° de Requisición:</label>  
                             
                             <div class="col-sm-6">
                             <input type="text" id="nr2" name="nR" class="form-control"> <br>
                             </div>
                            
                             <label class="col-sm-6 control-label">Status:</label> 
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
                               <input type="date" id="fS" name="fS" class="form-control"> <br>
                             </div>
                             <label class="col-sm-6 control-label">Fecha de Entrega:</label> 
                             <div class="col-sm-6">
                             <input type="date" id="fe" name="fe" class="form-control">
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
                <div class="container well" style="  background: #e1edf7">
                <div >
                    <br>
                    <textarea id="text" class="form-control" rows="12"></textarea>
                </div>
                    <div align="right" >
                        <label  class="col-sm-12 control-label">Total&nbsp </label>    </div>
                        <div align="right" class="col-sm-9">
                          
                        </div>
                            <div align="right" class="col-sm-3">
                            <input id="total" type="text" class="form-control">
                        </div>
                
                    <br>
                </div>
        <br>
               
                <div class="container well" style="  background: #e1edf7" >
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
                                             <br><a  id="bguardar" class="btn btn-danger">Guardar</a>&nbsp;&nbsp
                                    <button   id="bduplicar"  type="button" class="btn btn-primary">Duplicar</button>
                             </div> 
        
                <br>
                <br>
                
           
               </div>

   
        
      
    </body>
</html>
