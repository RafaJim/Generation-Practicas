window.onload=function()
{
    //agregar eventos, forma semantica
    document.getElementById("btnPresioname").onclick=holaMundo;
    document.getElementById("btnEscondeme").onclick=escondeme;
    document.getElementById("btnMuestrame").onclick=muestrame;
    //document.getElementById("btnMuestrame").addEventListener('click', muestrame);
    document.getElementById("btnAgregaTesto").onclick=agregaTesto;
    document.getElementById("btnColor").onclick=color;
    
    //agregar eventos mediante manejadores de eventos
    document.getElementById("btnMuestraEsconde").addEventListener("click",MuestraEsconde);
    document.getElementById("btnSumalos").addEventListener("click",sumalos);
    document.getElementById("btnRestalos").addEventListener("click",restalos);
    document.getElementById("btnMultiplica").addEventListener("click",multiplica);
    var misTextboxes=document.getElementsByClassName("textBoxita");
    for(var i=0;i<misTextboxes.length;i++)
    {
        misTextboxes[i].addEventListener("mouseover", resalta);
        misTextboxes[i].addEventListener("mouseout", desresalta);
    }
}

function holaMundo()
{
    alert("Hola mundo");
    return;
}

function escondeme()
{
    //document.getElementById("parrafo1").innerHTML="";    //Modo 1
    document.getElementById("parrafo1").style.display="none";   //Modo 2
    //document.getElementById("parrafo1").style.visibility="hidden";    //Modo 3
    return;
}

function muestrame()
{
    /*document.getElementById("parrafo1").innerHTML="Lorem, ipsum dolor sit amet consectetur adipisicing elit. Quia est modi optio totam beatae ut quod maiores suscipit, corrupti perferendis autem consequuntur dolor ipsa doloribus eligendi nobis dolorum nemo incidunt.";*/    //Modo1
    document.getElementById("parrafo1").style.display="block";  //Modo 2
    //document.getElementById("parrafo1").style.visibility="visible";   //Modo 3
    return;
}

function agregaTesto()
{
    document.getElementById("parrafo1").innerHTML+="Lorem, ipsum dolor sit amet consectetur adipisicing elit. Quia est modi optio totam beatae ut quod maiores suscipit, corrupti perferendis autem consequuntur dolor ipsa doloribus eligendi nobis dolorum nemo incidunt.";
    return;
}

function MuestraEsconde()
{
    if(document.getElementById("parrafo1").style.display=="none")
    {
        document.getElementById("parrafo1").style.display="block";
    }
    else
    {
        document.getElementById("parrafo1").style.display="none";
    }
    return;
}

function color()
{
    document.getElementById("parrafo1").style.color='red';
    return;
}

function sumalos()
{
    var miFormulario=document.getElementById("frmNumeros");
    var misNumeros=miFormulario.getElementsByTagName("input");
    resultado=0;
    for(var i=0;i<misNumeros.length;i++)
    {
        if(misNumeros[i].type=="text")
        {
            resultado=resultado+parseInt(misNumeros[i].value);
        }
    }
    document.getElementById("resultado").innerHTML=resultado;
    return;
}

function restalos()
{
    var numero1= parseInt(document.getElementById("txtNumeros1").value);
    var numero2= parseInt(document.getElementById("txtNumeros2").value);
    document.getElementById("resultado").innerHTML=numero1-numero2;
    return;
}

function multiplica()
{
    var numero1=parseInt(document.getElementById("txtTabla").value);
    var numero2=parseInt(document.getElementById("txtMultiplicador").value);
    document.getElementById("txtResultadoMultiplicacion").value=numero1*numero2;
    return;
}

function resalta()
{
    this.style.backgroundColor="red";
    return;
}

function desresalta()
{
    this.style.backgroundColor="white";
    return;
}