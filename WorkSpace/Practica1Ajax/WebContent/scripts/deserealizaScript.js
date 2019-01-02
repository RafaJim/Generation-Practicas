var xhr=new XMLHttpRequest();
window.onload=()=>
{
	document.getElementById("btnDeserealiza").addEventListener("click", funcionDeserealiza);
}

function funcionDeserealiza()
{
	var forma=new FormData();
	forma.append("txtCanedaJson", document.getElementById("txtCadenaJson").value);
	xhr.open("POST", "DeserealizaProductoServlet");
	xhr.onload=funcionCallBack;
	xhr.send(forma);
}

function funcionCallBack()
{
	document.getElementById("resultadoAjax").innerHTML=xhr.responseText;
}