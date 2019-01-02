var xhr=new XMLHttpRequest();

window.onload=function()
{
    document.getElementById('btnBoton').addEventListener('click', botonClick);
}

function botonClick()
{
    //alert('asljdkjas');
    xhr.responseType='text/html';
    xhr.open('get', 'resultado.html');
    xhr.onload=todoBienCompa;
    xhr.ontimeout=tePasasteCompa;
    xhr.onerror=todoMalCompa;
    xhr.send(null);
}

function todoBienCompa()
{
    if(xhr.status==200)
    {
        document.getElementById('resultadoAjax').innerHTML=xhr.responseText;
        console.log('Todo bien compa');
    }
}

function tePasasteCompa()
{
    console.log('Te pasaste de tiempo');
}

function todoMalCompa()
{
    console.log('Todo mal compa');
}