//Forma 1 del onloan
/*window.onload=function()
{
    alert('Pagina se cargo completamente');
}*/

//Forma 2 del onload
/*window.onload=TacosdePerro();

function TacosdePerro()
{
    alert('Tacos de Perro');
    return;
}*/

//Forma 3 del onload
/*window.onload=()=>
{
    alert('Tacos de Tejon');
}*/

/*window.onload=()=>
{
    var num1=0;
    var num2=0;
    var suma=0;

    num1=parseInt(window.prompt("Introduce un numero: "));
    num2=window.prompt("Introduce segundo numero: ");
    suma=num1+parseInt(num2);
    console.log("La suma es: "+suma);
}*/

//Ejercicio 1
window.onload=TacosdePerro();

function TacosdePerro()
{
    alert('Tacos de Perro');
    for(var i=0;i<10;i++)
    {
        console.log("Vuelta: "+i);
    }
    return;
}

//Ejercicio 2
var vector=[];
var suma=0;
{
    for(var i=0;i<5;i++)
    {
        vector[i]=parseInt(window.prompt("Introduce un numero ["+i+"]:"));
    }
    for(var i=0;i<5;i++)
    {
        suma+=vector[i];
    }
    console.log("Numeros ingresados: "+vector);
    console.log("La suma es: "+suma);
}