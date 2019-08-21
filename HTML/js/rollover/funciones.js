window.onload=cargarImagenes;

function cargarImagenes(){
    for(var i = 0;i< document.images.length;i++){
        if(document.images[i].parentNode.tagName == 'A'){
            configuraRollover(document.images[i]);
        }
    }
}

function configuraRollover(imagen){
    imagen.imagenOff = new Image();
    imagen.imagenOff.src = "boton1.png";
    imagen.onmouseout = cambiaOff;
    

    imagen.imagenOn = new Image();
    imagen.imagenOn.src= "boton2.png";
    imagen.onmouseover = cambiaOn;
}

function cambiaOff(){
    this.src = this.imagenOff.src;
}

function cambiaOn(){
    this.src = this.imagenOn.src;
}