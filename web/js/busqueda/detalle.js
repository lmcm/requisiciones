



function celda_click(str) {

    var num = (str.cells[3].childNodes[0].nodeValue);

    $.ajax({
        url: "Cdetalle",
        type: 'POST',
        data: {'requi': num},
        success: function(request) {

            $(".container2").html(request);
            var arra = request.split("\n");
            if (arra[11].length > 1) {
                agregarDetallesAnexo2(arra);
                $("#divAnexo2").show();

            } else {
                agregarDetallesAnexo1(arra);
                $("#divAnexo1").show();
            }

        }});

}



function agregarDetallesAnexo1(arra) {

    $("#nr3").attr("value", (arra[0]));
    $("#sts").attr("value", (arra[1]));
    $("#pro").attr("value", (arra[2]));
    $("#tip").attr("value", (arra[3]));
    $("#fss").attr("value", (arra[4]));
    $("#fee").attr("value", (arra[5]));



    $("#totalaA1").attr("value", (arra[7]));


    $("#solicita").attr("value", (arra[12]));
    $("#contacto").attr("value", (arra[18]));
    $("#cliente").attr("value", (arra[9]));
    $("#obser").attr("value", (arra[10]));
    $("#aprueba").attr("value", (arra[19]));
    $("#prove").attr("value", (arra[8]));
    $("#vericali").attr("value", (arra[15]));



}
function agregarDetallesAnexo2(arra) {
    $("#nr3").attr("value", (arra[0]));
    $("#sts").attr("value", (arra[1]));
    $("#pro").attr("value", (arra[2]));
    $("#tip").attr("value", (arra[3]));
    $("#fss").attr("value", (arra[4]));
    $("#fee").attr("value", (arra[5]));
    $("#totalaA1").attr("value", (arra[7]));

    $("#prove2").attr("value", (arra[8]));
    $("#cliente2").attr("value", (arra[9]));
    $("#obser2").attr("value", (arra[10]));
    $("#eval").attr("value", (arra[11]));
    $("#solicita2").attr("value", (arra[12]));
    $("#revisa").attr("value", (arra[13]));
    $("#aprueba2").attr("value", (arra[19]));
    $("#vericali2").attr("value", (arra[15]));



}

