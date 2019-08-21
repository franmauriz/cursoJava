function sumar(){
    try{
        var nun1 = prompt("Valor del primer número:","");
        var nun2 = prompt("Valor del segundo número:","");

        if(!nun1 || isNaN(nun1)){
            throw new Error("Valor invalido de nun1: " + nun1);
        }

        if(!nun2 || isNaN(nun2)){
            throw new Error("Valor invalido de nun2: " + nun2);
        }

        var resultado = parseInt(nun1) + parseInt(nun2);

        alert("El resultado es: " + resultado);

    }catch(e){
        alert("El error es:" + e.message);
    }
}