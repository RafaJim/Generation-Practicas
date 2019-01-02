window.onload=function()
{
    var base=0.0;
    var altura=0.0;

    //Forma correcta
    base=parseInt(window.prompt("Introduce la base del triangulo: "));
    altura=parseFloat(window.prompt("Introduce la altura del triangulo: "));
    console.log("El area deltriangulo es: "+areaTriangulo(base, altura));
    
    //Parametros definidos
    console.log("El area deltriangulo es: "+areaTriangulo(20, 20));

    
    lado=parseInt(window.prompt("Ingrese el lado del cuadrado: "));
    console.log("El area del cuadrado es: "+areaCuadrado(lado));

    lado=parseInt(window.prompt("Ingrese el lado del cuadrado: "));
    console.log("El perimetro del cuadrado es: "+perimetroCuadrado(lado));
}

function areaTriangulo(base, altura)
{
    var area=0.0;
    area=(base*altura)/2;
    return area;
}

function areaCuadrado(lado)
{
    var area=0.0;
    area=(lado*lado);
    return area;
}

function perimetroCuadrado(lado)
{
    var perimetro=0.0;
    perimetro=(lado*4);
    return perimetro;
}

/*function entrar()
{
    onmouseover=document.getElementById('contenidos').style.borderColor='black'; 
    
}

function salida()
{
    onmouseout=document.getElementById('contenidos').style.borderColor='silver';
}*/