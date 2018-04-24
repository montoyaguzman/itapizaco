//MONTOYA/ANA COMPLETO, CON ESQUINAS
import QtQuick 2.8
import QtQuick.Window 2.2

Window {
    property int numRepe : 0;
    property int numEvol : 0;
	property int tama : 5;
    property var matrizOrig;
    property var matrizCopia;
    

    Component.onCompleted: {
        definirMatrices();
        mostrarMatrizOrig();
        while(numRepe<10){
            revisarVecinos();
            mostrarEvolucion(numEvol);
            numEvol++;
            numRepe++;
        }
    }

    function definirMatrices(){
        matrizOrig = [tama];
        for (var a = 0; a < tama; a++){
            matrizOrig [a] = [tama];
            for (var b = 0; b < tama; b++){
                matrizOrig[a][b] = Math.floor(Math.random()*2)
            }
        }
        matrizCopia = matrizOrig.slice();
            for (var n = 0; n < tama; n++){
        }
    }

    function revisarVecinos(){
        var vecinos = 0;
        for(var f=0; f<tama; f++){
            for(var c=0; c<tama; c++){
                if (f==0){
                    if(c==0){
                        vecinos = matrizCopia[f][c+1] + matrizCopia[f+1][c+1] + matrizCopia[f+1][c];
                    }
                    else if(c==tama-1){
                        vecinos = matrizCopia[f+1][c] + matrizCopia[f+1][c-1] + matrizCopia[f][c-1];
                    }
                    else{
                        vecinos= matrizCopia[f][c-1] + matrizCopia[f][c+1]
                                + matrizCopia[f+1][c-1] + matrizCopia[f+1][c] + matrizCopia[f+1][c+1];
                    }
                }
                else if(f==tama-1){
                    if (c==0){
                        vecinos = matrizCopia[f-1][c] + matrizCopia[f-1][c+1] + matrizCopia[f][c+1];
                    }
                    else if(c==tama-1){
                        vecinos = matrizCopia[f-1][c] + matrizCopia[f-1][c-1] + matrizCopia[f][c-1];
                    }
                    else{

                        vecinos = matrizCopia[f-1][c-1] + matrizCopia[f-1][c] + matrizCopia[f-1][c+1]
                                + matrizCopia[f][c-1] + matrizCopia[f][c+1];
                    }
                }
                else if(f > 0 && f < tama-1){
                    if(c==0){
                        vecinos= matrizCopia[f-1][c] + matrizCopia[f-1][c+1]
                                + matrizCopia[f][c+1] + matrizCopia[f+1][c+1] + matrizCopia[f+1][c];
                     }
                     else if(c==tama-1){
                        vecinos = matrizCopia[f-1][c] + matrizCopia[f-1][c-1]
                                + matrizCopia[f][c-1] + matrizCopia[f+1][c-1] + matrizCopia[f+1][c];
                     }
                }
                else{
                    vecinos = matrizCopia[f-1][c-1] + matrizCopia[f-1][c] + matrizCopia[f-1][c+1]
                            + matrizCopia[f][c-1] + matrizCopia[f][c+1]
                            + matrizCopia[f+1][c-1] + matrizCopia[f+1][c] + matrizCopia[f+1][c+1];
                }

                if(matrizCopia[f][c] === 1 && (vecinos>=4 || vecinos < 2)){
                    matrizCopia [f][c] = 0;
                }
                else if(matrizCopia[f][c] === 0 && (vecinos==3 || vecinos==2)){
                    matrizCopia [f][c] = 1;
                }

            }
        }
    }

    function mostrarMatrizOrig(){
        console.log("\nMatriz original")
        for (var g = 0; g < tama; g++){
            console.log(matrizOrig[g]);
        }
        console.log("\n");
    }

    function mostrarEvolucion(numEvol){
        var n = numEvol.toString();
        console.log("\nEvolucion "+n);

        for (var b = 0; b < tama; b++){
            console.log(matrizCopia[b]);
        }
        console.log("\n");
    }
}
