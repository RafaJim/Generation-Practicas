var xhr = new XMLHttpRequest();
window.onload=function()
{
	document.getElementById('btnSerializa').addEventListener('click', funcionSerializa);
}

function funcionSerializa()
{
	var forma = new FormData();
	forma.append("txtIdProducto", document.getElementById('txtIdProducto').value);
	forma.append("txtNombreProducto", document.getElementById('txtNombreProducto').value);
	forma.append("txtPrecioProducto", document.getElementById('txtPrecioProducto').value);
	xhr.open("POST", "SerializaProductosServlet");
	xhr.onload =()=>
	{
		document.getElementById("resultadoAjax").innerHTML = xhr.responseText;
		//Prar que se veo de manera presentable en la consola
		var resultadoServidor =JSON.parse(xhr.responseText);
		console.log("idProducto: "+resultadoServidor["idProducto"]);
		console.log("nombreProducto: "+resultadoServidor["nombreProducto"]);
		console.log("precioProducto: "+resultadoServidor["precioProducto"]);
	}
	xhr.send(forma);
}