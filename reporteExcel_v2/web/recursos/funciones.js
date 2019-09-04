var capa;

function cambio(idCapa){
    if(document.layers)
        capa = eval("docuemnt." + idCapa);
    if(document.all)
        capa = eval(idCapa + ".style");
    if(document.getElementById)
        capa = eval("document.getElementById('" + idCapa + "').style");
    
    if(capa.visibility == "hidden" || capa.visibility == "hide"){
        capa.visibility = (document.layers) ? "show" : "visible";
    }else{
        capa.visibility = (document.layers) ? "hide" : "hidden";
    }
}


