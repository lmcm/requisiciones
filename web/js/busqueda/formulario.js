$(document).ready(function() {

    $.expr[':'].Contains = function(x, y, z) {
        return jQuery(x).text().toLowerCase().indexOf(z[3].toLowerCase(), 0) >= 0;
    };

    $('#bBusqueda').click(function()
    {
        var p;

        if ($('#NReq option:selected').text() != "-Cualquiera-") {
            var search = $('#NReq option:selected').text();

        }

        if ($('#area option:selected').text() != "-Cualquiera-") {
            var search1 = $('#area option:selected').text();

        }
        

        if ($('#proy option:selected').text() != "-Cualquiera-") {
            var search2 = $('#proy option:selected').text();

        }

        if ($('#tipo option:selected').text() != "-Cualquiera-") {
            var search3 = $('#tipo option:selected').text();

        }
//*******************************************************************************
        if($('#NReq option:selected').text() != "-Cualquiera-"){
             p=1;
         }
         
         if($('#area option:selected').text() != "-Cualquiera-"){
             p=2;
         }   
        
         if($('#proy option:selected').text() != "-Cualquiera-"){
             p=3;
         }

        if($('#tipo option:selected').text() != "-Cualquiera-"){
             p=4;
        }
        
        if($('#area option:selected').text() != "-Cualquiera-" && $('#proy option:selected').text() != "-Cualquiera-" && $('#tipo option:selected').text() != "-Cualquiera-"){
             p=5;
         }
         
        if($('#area option:selected').text() != "-Cualquiera-" &&  $('#tipo option:selected').text() != "-Cualquiera-"){
             p=6;
         } 
         
        if($('#area option:selected').text() != "-Cualquiera-" && $('#proy option:selected').text() != "-Cualquiera-" ){
             p=7;
         }
         
         if($('#proy option:selected').text() != "-Cualquiera-" && $('#tipo option:selected').text() != "-Cualquiera-"){
             p=8;
         }
         
         if( $('#NReq option:selected').text() != "-Cualquiera-"&& $('#area option:selected').text() != "-Cualquiera-" && $('#proy option:selected').text() != "-Cualquiera-" && $('#tipo option:selected').text() != "-Cualquiera-"){
             p=1;
         }
         
         if(  $('#NReq option:selected').text() != "-Cualquiera-" && $('#area option:selected').text() != "-Cualquiera-" ){
             p=1;
         }
         if($('#NReq option:selected').text() != "-Cualquiera-" && $('#proy option:selected').text() != "-Cualquiera-" ){
             p=1;
         }
         if($('#NReq option:selected').text() != "-Cualquiera-" &&  $('#tipo option:selected').text() != "-Cualquiera-"){
             p=1;
         }
         
          if( $('#NReq option:selected').text() != "-Cualquiera-"&& $('#area option:selected').text() != "-Cualquiera-" && $('#proy option:selected').text() != "-Cualquiera-" ){
             p=1;
         }
         
          if( $('#NReq option:selected').text() != "-Cualquiera-"&& $('#area option:selected').text() != "-Cualquiera-" &&  $('#tipo option:selected').text() != "-Cualquiera-"){
             p=1;
         }
         
          if( $('#NReq option:selected').text() != "-Cualquiera-"&& $('#proy option:selected').text() != "-Cualquiera-" && $('#tipo option:selected').text() != "-Cualquiera-"){
             p=1;
         }
         
//******************************************************************************

        $('#tabla2 tr').show();
      
        switch (p) {
            case 1:

                $("#tabla2 tr td.prioridad").filter(function() {

                    return $(this).html().toLowerCase() != search.toLowerCase();

                }).parent().hide();
                break;


            case 2:
                $("#tabla2 tr td.prioridad1").filter(function() {

                    return $(this).html().toLowerCase() != search1.toLowerCase();

                }).parent().hide();
                break;


            case 3:
                $("#tabla2 tr td.prioridad2").filter(function() {

                    return $(this).html().toLowerCase() != search2.toLowerCase();

                }).parent().hide();
                break;

            case 4:
                $("#tabla2 tr td.prioridad3").filter(function() {

                    return $(this).html().toLowerCase() != search3.toLowerCase();
                }).parent().hide();
                break;

            case 5:
                $("#tabla2 tr td.prioridad1").filter(function() {

                    return $(this).html().toLowerCase() != search1.toLowerCase();

                }).parent().hide();

                $("#tabla2 tr td.prioridad2").filter(function() {

                    return $(this).html().toLowerCase() != search2.toLowerCase();

                }).parent().hide();

                $("#tabla2 tr td.prioridad3").filter(function() {

                    return $(this).html().toLowerCase() != search3.toLowerCase();

                }).parent().hide();
                break;

            case 6:
                $("#tabla2 tr td.prioridad1").filter(function() {

                    return $(this).html().toLowerCase() != search1.toLowerCase();

                }).parent().hide();

                $("#tabla2 tr td.prioridad3").filter(function() {

                    return $(this).html().toLowerCase() != search3.toLowerCase();

                }).parent().hide();
                break;

            case 7:

                $("#tabla2 tr td.prioridad1").filter(function() {

                    return $(this).html().toLowerCase() != search1.toLowerCase();

                }).parent().hide();

                $("#tabla2 tr td.prioridad2").filter(function() {

                    return $(this).html().toLowerCase() != search2.toLowerCase();

                }).parent().hide();
                break;

            case 8:

                $("#tabla2 tr td.prioridad2").filter(function() {

                    return $(this).html().toLowerCase() != search2.toLowerCase();

                }).parent().hide();

                $("#tabla2 tr td.prioridad3").filter(function() {

                    return $(this).html().toLowerCase() != search3.toLowerCase();

                }).parent().hide();
                break;
        }
        
    });
});


//********************BOTON BUSCAR************************* 

$(document).ready(function() {

    $("#bBusqueda").click(function(event) {

        $("#bBusqueda2").show();
        $("#bBusqueda").hide();

    });


    $("#bBusqueda2").click(function(event) {
        $("#bBusqueda").show();
        $("#bBusqueda2").hide();
        $("#uno").show();
        $("#NReq").val("");
        $("#area").val("");
        $("#proy").val("");
        $("#tipo").val("");
        $("#finicial").val("");
        $("#ffinal").val("");
        $("#check").prop("checked", false);
    });

});
//********************FORMULARIO************************* 

$(document).ready(function() {

    $("#filtro").click(function(event) {
        
        $("#filtro").hide();
        $("#filtro1").show();
        $("#divformulario").show();
       
    });

    $("#bRE").click(function(event) {
        $("#filtro1").hide();
        $("#filtro").show();
        $("#divformulario").hide();
    });
    
     $("#filtro1").click(function(event) {
        $("#filtro1").hide();
        $("#filtro").show();
        $("#divformulario").hide();
    });

});
//********************CONSULTA************************* 

$(document).ready(function() {

    $("#bNRq").click(function(event) {
        $("#aproy").hide();
        $("#aArea").hide();
        $("#aTipo").hide();
        $("#aNRq").show();
        $("#NReq1").show();
        $("#proy1").hide();
        $("#area1").hide();
        $("#tipo1").hide();
       
    });
  

    $("#bproy").click(function(event) {
        alert("aki");
        $("#aArea").hide();
        $("#aNRq").hide();
        $("#aTipo").hide();
        $("#aproy").show();
        $("#proy1").show();
        $("#NReq1").hide();
        $("#area1").hide();
        $("#tipo1").hide();
    });
    
  
    
    $("#barea").click(function(event) {
         alert("estoy");
        $("#aNRq").hide();
        $("#aproy").hide();
        $("#aArea").show();
        $("#area1").show();
        $("#NReq1").hide();
        $("#proy1").hide();
        $("#tipo1").hide();
        
    });
    
    $("#btipo").click(function(event) {
         alert("yo");
        $("#aArea").hide();
        $("#aNRq").hide
        $("#aproy").hide();
        $("#aTipo").show();
        $("#tipo1").show();
        $("#NReq1").hide();
        $("#proy1").hide();
        $("#area1").hide();
    });

});
//********************CONSULTA************************* 
$(document).ready(function() {

    $.expr[':'].Contains = function(x, y, z) {
        return jQuery(x).text().toLowerCase().indexOf(z[3].toLowerCase(), 0) >= 0;
    };

    $('#consulta').click(function()
    {
        var p;

        if ($('#NReq1 option:selected').text() != "-Cualquiera-") {
            var search = $('#NReq1 option:selected').text();

        }

        if ($('#area1 option:selected').text() != "-Cualquiera-") {
            var search1 = $('#area1 option:selected').text();

        }
        

        if ($('#proy1 option:selected').text() != "-Cualquiera-") {
            var search2 = $('#proy1 option:selected').text();

        }

        if ($('#tipo1 option:selected').text() != "-Cualquiera-") {
            var search3 = $('#tipo1 option:selected').text();

        }
        
        });
        });