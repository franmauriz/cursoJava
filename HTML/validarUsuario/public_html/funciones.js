function validar(formi){
    var nombre = formi.nombre;
    var apellido= formi.apellido;
    var email = formi.email;
    
    if(!nombre.value || !isNaN(nombre.value)){
        alert("Escribe un valor valido para nombre");
        return false;
    }
    
    if(!apellido.value || !isNaN(apellido.value)){
        alert("Escribe un valor valido para apellido");
        return false;
    }
    
    if(!email.value ||  /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3,4})+$/.test(email.value)){
        alert("Escribe un valor valido para email");
        return false;
    }
    
    return true;
    
    
}