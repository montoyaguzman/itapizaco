function valida_longitud(div1, idCaja, maximo){ 

	var letrasAContar = document.getElementById(idCaja);
	var letrasEscritas = letrasAContar.value.length;
	var letrasRestantes = idCaja + 'Contador';
	
	var label = document.getElementById(letrasRestantes);
	
	if (label == null) {
		label = document.createElement("span");
		label.innerHTML = maximo;
		label.setAttribute("id", letrasRestantes);
		label.setAttribute("class", "numeroCaracteresText");
		document.getElementById(div1).appendChild(label);
	}

	if (letrasEscritas > maximo){ 
	    letrasAContar.value = letrasAContar.value.slice(0,maximo);
    }
	
	label.innerHTML = maximo-letrasAContar.value.length;
	
	
} 