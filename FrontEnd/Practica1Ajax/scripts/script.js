var xhr=new XMLHttpRequest();
window.onload=function()
{
    //alert('test');
    //var xhr=new XMLHttpRequest();
    //xhr.onreadystatechange=funcionCallBack;

    //Forma 1 - Asignacion semantica de eventos
    document.getElementById('btnBoton').onclick=botonClick;

    //Forma 2 - Asignacion de un Listener al evento
    //document.getElementById('btnBoton').addEventListener('click', botonClick);

    //Forma 3 - Asignacion de una funcion anonima al evento
    /*document.getElementById('btnBoton').onclick=function()
    {
        alert('clic');
    }*/

    //Forma 4 - Asignacion de una funcion flecha al evento
    /*document.getElementById('btnBoton').onclick =()=>
    {
        alert('clic');
    }*/
}



function botonClick()
{
    //alert('distes clic');
    
    xhr.onreadystatechange=funcionCallBack;
    xhr.open("GET", "resultado.html", true);
    xhr.send();
}

function funcionCallBack(event)
{
    if(xhr.readyState==1)
    {
        console.log('peticion se encuentra en el estado 1');
    }

    if(xhr.readyState==2)
    {
        console.log('peticion se encuentra en el estado 2');
    }

    if(xhr.readyState==3)
    {
        console.log('peticion se encuentra en el estado 3');
    }
    
    if(xhr.readyState==4)
    {
        console.log('peticion se encuentra en el estado 4');
        document.getElementById('resultado_ajax').innerHTML = xhr.responseText;
    }
}