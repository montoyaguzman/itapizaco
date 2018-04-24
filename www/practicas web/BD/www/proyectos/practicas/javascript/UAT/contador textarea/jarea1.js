
	function valida_longitud(capa, idComponente, num_caracteres_permitidos){ 
	
		var componenteAcontar = document.getElementById(idComponente);
		var num_caracteres = componenteAcontar.value.length;
		var nombreComponente = idComponente + 'Contador';
		
		var componenteNumero = document.getElementById(nombreComponente);
		
		if (componenteNumero == null) {
			componenteNumero = document.createElement("span");
			componenteNumero.innerHTML = num_caracteres_permitidos;
			componenteNumero.setAttribute("id", nombreComponente);
			componenteNumero.setAttribute("class", "numeroCaracteresText");
			document.getElementById(capa).appendChild(componenteNumero);
		}
		
		if (num_caracteres > num_caracteres_permitidos){ 
		    componenteAcontar.value = componenteAcontar.value.slice(0,num_caracteres_permitidos);
	    }
		
		componenteNumero.innerHTML = num_caracteres_permitidos-componenteAcontar.value.length;
	}