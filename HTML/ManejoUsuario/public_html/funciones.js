function anadir(){
    var usu = forma.usuario;
    var li=document.createElement('li');
    li.id=usu.value;
    li.innerHTML=usu.value;
    document.getElementById("listaiten").appendChild(li);
    usu.select();
    return false;
}

function buscar(formados){
    
    var usuearch = formados.usuariosearch;
    var itens = document.getElementById("listaiten").getElementsByTagName("li");
    var posicion=0;
    for(i=0;i < itens.length;i++){
        var contenido = itens[i].innerHTML;
        if( contenido == usuearch.value){
            posicion = i;
        }        
    }
    document.getElementById("busqueda").innerHTML="La posicion del usuario es: " + (posicion+1);
    return false;    
}


