import QtQuick 2.8
import QtQuick.Window 2.2

Rectangle {
    id: main
    width: 400
    height: 400
    color: 'GRAY'

    property int tama : 17;
    property var matrizOrig;
    property var matrizCopia;
    property int numEvol : 0;

    Timer {
        interval: 1000
        running: true
        repeat: true
        onTriggered: {
            //console.log("Hola\n");
            revisarVecinos();
            mostrarEvolucion(numEvol);
            numEvol++;
            convertir(matrizCopia);
        }
    }

    Component {
        id: celdaComponent
        Rectangle {
            objectName: 'celda'
            property int row: 0
            property int col: 0
            x: main.width/2+width*col
            y: main.height/2+height*row
            width: 20
            height: 20
            radius: 2.5
            smooth: true
            color: 'BLUE'
        }
    }

    Component.onCompleted: {
        definirMatrices();
        mostrarMatrizOrig();
        convertir(matrizOrig);
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

    function mostrarMatrizOrig(){
        console.log("\nMatriz original")
        for (var g = 0; g < tama; g++){
            console.log(matrizOrig[g]);
        }
        console.log("\n");
    }

    //SIN BORDES
    /*function revisarVecinos(){
            var vecinos = 0;
            for(var f=1; f<tama-1; f++){
                for(var c=1; c<tama-1; c++){
                    vecinos = matrizCopia[f-1][c-1]
                            + matrizCopia[f-1][c]
                            + matrizCopia[f-1][c+1]
                            + matrizCopia[f][c-1]
                            + matrizCopia[f][c+1]
                            + matrizCopia[f+1][c-1]
                            + matrizCopia[f+1][c]
                            + matrizCopia[f+1][c+1];

                    if(matrizCopia[f][c] === 1 && (vecinos>=4 || vecinos < 2)){
                        matrizCopia [f][c] = 0;
                    }
                    else if(matrizCopia[f][c] === 0 && vecinos==3){
                        matrizCopia [f][c] = 1;
                    }
                }
            }
        }*/

    //CON BORDES
    function revisarVecinos(){
        var vecinos = 0;
        for(var f=0; f<tama; f++){
            for(var c=0; c<tama; c++){
                if (f==0){
                    if(c==0){
                        vecinos = matrizCopia[f][c+1]
                                + matrizCopia[f+1][c+1]
                                + matrizCopia[f+1][c];
                    }
                    else if(c==tama-1){
                        vecinos = matrizCopia[f+1][c]
                                + matrizCopia[f+1][c-1]
                                + matrizCopia[f][c-1];
                    }
                    else{
                        vecinos= matrizCopia[f][c-1]
                                + matrizCopia[f][c+1]
                                + matrizCopia[f+1][c-1]
                                + matrizCopia[f+1][c]
                                + matrizCopia[f+1][c+1];
                    }
                }
                else if(f==tama-1){
                    if (c==0){
                        vecinos = matrizCopia[f-1][c]
                                + matrizCopia[f-1][c+1]
                                + matrizCopia[f][c+1];
                    }
                    else if(c==tama-1){
                        vecinos = matrizCopia[f-1][c]
                                + matrizCopia[f-1][c-1]
                                + matrizCopia[f][c-1];
                    }
                    else{

                        vecinos = matrizCopia[f-1][c-1]
                                + matrizCopia[f-1][c]
                                + matrizCopia[f-1][c+1]
                                + matrizCopia[f][c-1]
                                + matrizCopia[f][c+1];
                    }
                }
                else if(f > 0 && f < tama-1){
                    if(c==0){
                        vecinos= matrizCopia[f-1][c]
                                + matrizCopia[f-1][c+1]
                                + matrizCopia[f][c+1]
                                + matrizCopia[f+1][c+1]
                                + matrizCopia[f+1][c];
                    }
                    else if(c==tama-1){
                        vecinos = matrizCopia[f-1][c]
                                + matrizCopia[f-1][c-1]
                                + matrizCopia[f][c-1]
                                + matrizCopia[f+1][c-1]
                                + matrizCopia[f+1][c];
                    }
                }
                else{
                    vecinos = matrizCopia[f-1][c-1]
                            + matrizCopia[f-1][c]
                            + matrizCopia[f-1][c+1]
                            + matrizCopia[f][c-1]
                            + matrizCopia[f][c+1]
                            + matrizCopia[f+1][c-1]
                            + matrizCopia[f+1][c]
                            + matrizCopia[f+1][c+1];
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

    function mostrarEvolucion(numEvol){
        var n = numEvol.toString();
        console.log("\nEvolucion "+n);

        for (var b = 0; b < tama; b++){
            console.log(matrizCopia[b]);
        }
        console.log("\n");
    }


    function convertir(matrizAConv){

        for (var i=0;i<children.length;i++) {
            if (children[i].objectName=='celda') {
                children[i].destroy();
            }
        }

        var a = (tama - 1)/2;
        var i1 = 0;
        var j1 = 0;
        var c;
        for (var i = 0; i < tama; i++)
        {
            for (var j = 0; j < tama; j++)
            {
                i1 = i - a;
                j1 = j - a;

                if (matrizAConv[i][j] === 1){
                    c = celdaComponent.createObject(
                                main,
                                {'row':i1,'col':j1}
                                );
                }
            }
        }

    }
}
