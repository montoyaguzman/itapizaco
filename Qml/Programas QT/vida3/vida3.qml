//SERGIO COMPLETO

import QtQuick 2.6
import QtQuick.Window 2.2

Window {

    visible: false
    property int tam: 10
    property var matriz1
    property var matriz2
    property bool sig: true

    Component.onCompleted: {
        crearGeneracion();
        copyMatriz(1);
        showMatriz(1);


        while(sig==true){
         comenzarGame();
        }
    }

     function comenzarGame(){
     for(var i=0;i<tam;i++){
        for(var j=0; j<tam;j++){
        actValMat(i,j);
        }
     }
         console.log("");
        copyMatriz(2);
        showMatriz(2);
     }

    function crearGeneracion() { //crea y llena 2 arreglos bidimensionales
    matriz1 = new Array (tam)
        for (var i = 0; i < tam; i++) {
            matriz1[i] = new Array(tam)
                for(var j=0; j< tam; j++){
                    matriz1[i][j] =Math.floor(Math.random()*2);
                }
            }
        }
    function copyMatriz(orig){ //hace una copia de la matriz original
        if(orig ===1){
        matriz2 = matriz1.slice();
        }
        else{
        matriz1=matriz2.slice();
        }
    }
        function showMatriz (mat){
        if(mat===1){
            for(var i=0;i<tam; i++){
                console.log(matriz1[i]);
                }
            }
            else{
            for(var i =0;i<tam;i++){
                console.log(matriz2[i]);
                }
            }
        }


    function checklimite(row, col){
    if(row<0||row>=tam||col<0||col>=tam){
    return false;//limite fuera de la matriz
    }
    else{
        return true;//limite dentro de la matriz
    }
    }

    function obtDato(row,col){
    return matriz1[row][col];
}
    function vecinosVivos(row,col){//comprueba la poblacion que se encuentra alrededor

        var vecinos =0;
        for (var i=row-1;i<=row+1;i++){
        for(var j=col-1;j<=col+1;j++){
            if(checklimite(i,j)){
            var celula=obtDato(i,j);
                if(celula===1){
                    vecinos++;
                }
            }
        }
       }

        if(obtDato(row,col)===1){
            vecinos--;
        }
        return vecinos;
    }

    function gameReglas(nvec,celAc){

        if(celAc===true&&(nvec<2|| nvec>3)){
            return false;
        }
        else if(celAc===true&&(nvec===2|| nvec===3)){
            return true;
        }
        else if(celAc===false &&nvec ===3){
            return true;
        }
        else{
            return false;
        }

    }
    function actValMat(row,col){//crear

        matriz2=new Array(tam);
        for(var i=0;i<tam;i++){
            matriz2[i]=new Array(tam);
            for(var j=0;j<tam;j++){
                var vecinos= vecinosVivos(i,j);
                var actCel;
                if(obtDato(row,col)===1){
                    actCel=true;
                }
                else{
                    actCel=false;
                }
                var cel=gameReglas(vecinos,actCel);
                if(cel===true){
                    matriz2[i][j]=1;
                }
                else{
                    matriz2[i][j]=0;
                }
            }
        }
    }
 }
