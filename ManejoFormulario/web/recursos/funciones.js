function validarForma(formi){
    var usuario = formi.usuario;
    if(usuario.value =="" || usuario.value =="Escribir usuario"){
        alert("Debe de escribir un usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    var password = formi.password;
    if(password.value=="" || password.value.length <3 ){
        alert("Debe de proporcionar un password de mas de 3 carateres");
        usuario.focus();
        usuario.select();
        return false;
    }
    var tecnologia = formi.tecnologia;
    var checkSeleccionado=false;
    for(i=0;i<tecnologia.length;i++){
        if(tecnologia[i].checked){
            checkSeleccionado=true;
        }
    }
    if(!checkSelecionado){
        alert("Debe de seleccionar alguna tecnologia");
        return false;
    }
    var generos= formi.genero;
    var radioSeleccionado =false;
    for(i=0;i< generos.length;i++){
        if(generos[i].checked){
            radioSeleccionado=true;
        }
    }
    if(!radioSeleccionado){
        alaert("Debe de selecionar algun genero");
        return false;
    }

    var ocupacion= formi.ocupacion;
    if(ocupacion.value==""){
        alert("Debe de seleccionar alguna ocupacion");
        return false;
    }

    alert("Formualrio valido,enviando datos");
    return true;

}