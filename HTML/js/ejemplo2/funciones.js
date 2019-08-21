window.onload = iniciaDatos;

function iniciaDatos(){
    document.getElementById("link").onclick=validaSalir;
    document.getElementById("linkSearch").onclick=busqueda;
}

function validaSalir(){
    if(confirm("Desea salir del sitio?")){
        alert("Nos vamos a google");
        return true;
    }else{
        alert("Nos quedamos en el sitio");
        return false;
    }
}

function busqueda(){
    var respuesta = prompt("Escribe la cadena a buscar:","");
    if(respuesta){
        alert("Tu respuesta fue: "+ respuesta);
        var nuevoLink = this + "search?q=" + respuesta;
        alert("Nuevo Link: " + nuevoLink);
        window.location=nuevoLink;
        return false;
    }else{
        alert("No proporcionaste una cadena a buscar");
        return false;
    }
}