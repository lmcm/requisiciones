

//********************TAB y COLORES************************* 
$(document).ready(function() {
    $("#nueva").click(function() {
        nuevas();

    });

    $("#recp").click(function() {
        requisiciones();

    });

    $("#proc").click(function() {
        proceso();
    });

    $("#oc").click(function() {
        oc();
    });

    $("#borradores").click(function() {
        borradores();

    });

    $("#canceladas").click(function() {
        canceladas();
    });
});


function nuevas() {
    var i = 0;
    var b = 0;
   
    $("#uno tr").each(function() {
        var a = document.getElementById("uno").rows[i].cells[2].innerText;
        if (a == "Nuevas"){
            $(this).show();
          
         if(b%2==0){
           $(this).css("background-color","white");
         }
             else{
             $(this).css("background-color","#ffe8e8e8");
             }
                b++;
         }
            
            else
            $(this).hide();
        i++;

    });

}

function requisiciones() {
    var i = 0;
    var b = 0;
    $("#uno tr").each(function() {
        var a = document.getElementById("uno").rows[i].cells[2].innerText;
        if (a=="Recepcionada"){
            $(this).show();
          if(b%2==0){
           $(this).css("background-color","white");
         }
             else{
             $(this).css("background-color", "#ffe8e8e8");
             }
                b++;
         }
            
            else
            $(this).hide();
        i++;
    });

}

function proceso() {
    var i = 0;
    var b = 0;
    $("#uno tr").each(function() {
        var a = document.getElementById("uno").rows[i].cells[2].innerText;
        if (a == "Proceso") {
            $(this).show();
          
        if(b%2==0){
           $(this).css("background-color","white");
         }
             else{
             $(this).css("background-color", "#ffe8e8e8");
             }
                b++;
         }
            
            else
            $(this).hide();
        i++;
    });

}

function oc() {
    var i = 0;
    var b =0;
    $("#uno tr").each(function() {
        var a = document.getElementById("uno").rows[i].cells[2].innerText;
        if (a == "OrdenCompra") {
            $(this).show();
        
            if(b%2==0){
           $(this).css("background-color","white");
         }
             else{
             $(this).css("background-color", "#ffe8e8e8");
             }
                b++;
         }
            
            else
            $(this).hide();
        i++;
    });

}


function borradores() {
    var i = 0;
    var b=0;
    $("#uno tr").each(function() {
        var a = document.getElementById("uno").rows[i].cells[2].innerText;
        if (a == "Borrador") {

            $(this).show();
        
    if(b%2==0){
           $(this).css("background-color", "white");
         }
             else{
             $(this).css("background-color", "#ffe8e8e8");
             }
                b++;
         }
            
            else
            $(this).hide();
        i++;
    });

}

function canceladas() {
    var i = 0;
    var b=0;
    $("#uno tr").each(function() {
        var a = document.getElementById("uno").rows[i].cells[2].innerText;
        if (a == "Canceladas") {
            $(this).show();
         if(b%2==0){
           $(this).css("background-color","white");
         }
             else{
             $(this).css("background-color", "#ffe8e8e8");
             }
                b++;
         }
            
            else
            $(this).hide();
        i++;
            
        
    });

}

//********************DETALLE************************* 

$(document).ready(function() {

    $("a.prueba").click(function(event) {
        $("#cAnexo").show();
        $("#ctabla").hide();
    });

    $("#bRegresar").click(function(event) {
        $("#ctabla").show();
        $("#cAnexo").hide();
     }); 
    
});

//*******************************************************

//function datostabla() {
//    clave = $("#inputClavePaquete").val();
//    nombre = $("#inputNombrePaquete").val();
//    descripcion = $("#inputDescripcionPaquete").val();
//    costo = $("#costoPaquete").val();
//    cantidad = $("#inputCantidadPaquete").val();
//    $.ajax({
//        url: URLROOT + "catalogos/Ccatalogos_servicios/nuevaclasehorario",
//        type: "POST",
//        data: {"clave": clave,
//            "nombre": nombre,
//            "descripcion": descripcion,
//            "costo": costo,
//            "cantidad": cantidad
//        },
//        success: function(request) {
//            if (request != 1) {
//                alert("La clase no se pudo Guardar Correctamente . Error -> " + request);
//                $("#modalNuevoPaquete").modal("hide");
//            }
//            else {
//
//                $("#modalNuevoPaquete").modal("hide");
//                location.reload(true);
//                        
//            }
//        }});
//}
    
