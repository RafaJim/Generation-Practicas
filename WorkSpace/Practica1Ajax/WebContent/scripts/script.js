var xhr=new XMLHttpRequest();
window.onload=function()
{
	document.getElementById('btnSuma').addEventListener("click", sumarNumeros);
	document.getElementById('btnResta').addEventListener("click", restaNumeros);
	document.getElementById('btnMulti').addEventListener("click", multiplicarNumeros);
}

function sumarNumeros()
{
	var nombreTextboxNumero1=document.getElementById('txtNumero1').name;
	var nombreTextboxNumero2=document.getElementById('txtNumero2').name;
	
	var valorTextboxNumero1=document.getElementById('txtNumero1').value;
	var valorTextboxNumero2=document.getElementById('txtNumero2').value;
	
	//Este xhr.open y el de abajo son los mismo. Funcion igual, solo que en esta linea se deben de declarar las variables nombreTextboxNumero1 y valorTextboxNumero1 de arria.
	//xhr.open("GET", "SumaNumerosServlet?"+nombreTextboxNumero1+"="+valorTextboxNumero1+"="+nombreTextboxNumero2+"="+valorTextboxNumero2+"=");
	
	xhr.open("GET", "SumaNumerosServlet?txtNumero1="+valorTextboxNumero1+"&txtNumero2="+valorTextboxNumero2);
	xhr.onload=funcionCallBack;
	xhr.send(null);
}



function funcionCallBack()
{
	document.getElementById('txtResultado').value=xhr.responseText;
}

function restaNumeros()
{
	var num1=document.getElementById('txtNumero1').value;
	var num2=document.getElementById('txtNumero2').value;
	
	var forma = new FormData();
	forma.append("txtNumero1", num1);
	forma.append("txtNumero2", num2);
	
	//Lo mismo que las lineas de arriba pero con menos lineas
	/*forma.append("txtNumero1", document.getElementById('txtNumero1').value);
	forma.append("txtNumero2", document.getElementById('txtNumero2').value);*/
	
	xhr.open("POST", "RestaNumerosServlet", true);
	console.log('num 1: '+num1);
	console.log('num 2: '+num2);
	xhr.onload=funcionCallBackDiv;
	xhr.send(forma);
	/////////////////////////////////////////////////////////////////////
	
}

function funcionCallBackDiv()
{
	document.getElementById('divResultado').innerHTML=xhr.responseText;
}

function multiplicarNumeros()
{
	var num1=document.getElementById('txtNumero1').value;
	var num2=document.getElementById('txtNumero2').value;
	
	var forma = new FormData();
	
	forma.append('txtNumero1', num1);
	forma.append('txtNumero2', num2);
	
	xhr.open("POST", "MultiplicacionNumerosServlet", true);
	
	console.log('num 1M: '+num1);
	console.log('num 2M: '+num2);
	
	xhr.onload=funcionCallBack2;
	xhr.send(forma);
}

function funcionCallBack2()
{
	document.getElementById('txtResMul').value=xhr.responseText;
}

function dividirNumeros()
{
	var forma = FormData();
	
	forma.append("txtNumero1", document.getElementById('txtNumero1').value);
	forma.append("txtNumero2", document.getElementById('txtNumero2').value);
	
	xhr.open("POST", "DivisionNumeroServlet", true);
	
	xhr.onload=funcionDivi;
	xhr.send(forma);
}

function funcionDivi()
{
	document.getElementById('divDivi').value=xhr.responseText;
}