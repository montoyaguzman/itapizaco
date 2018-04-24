import QtQuick 2.6
import QtQuick.Window 2.2



Window {
    visible: true
    width: 2000
    height: 1000
    title: qsTr("EL JUEGO DE LA VIDA")
    property bool color1: false
    property var arreglo;


    Rectangle {
        width: 2000
        height: 1000
        color:"#660000"

        Grid{
            id:filcol
            anchors.fill: parent
            anchors.margins: 4
            spacing: 1
            width: 2000
            height: 2000
            columns: 150
            rows: 100

            Repeater{
                model: 10000

                Rectangle{
                    id: celulas
                    width: 18
                    height: 18

                    MouseArea{
                        anchors.fill: parent
                        hoverEnabled: true
                        function colores(){
                            if(color1){
                                celulas.color = "#660033"
                            }else{
                                celulas.color = "#FF99FF"
                            }
                            console.log(color);
                        }

                        onClicked: {
                            var x=0;
                            var y =0;
                            if(clicked){
                                color1 = !color1;
                                colores();
                                filcol.childAt(x,y)
                                console.log(children);

                            }
                        }

                    }

                }
            }


        }


    }



    function nuevaMatriz (){
        arreglo= new Array (filcol.rows)
        for (var a=0; a<=arreglo.length; a++){
            arreglo [a] = new Array (filcol.columns)
            for (var b=0; b<=arreglo.length; b++){
//Extraer con un childitem la prpiedad color del grid y comparar


            }
        }
        //childAt(real x, real y)
    }
    function revisarVecinos(){
                    var vecinos = 0;
                    for(var f=0; f<t; f++){
                        for(var c=0; c<t; c++){
                            if (f===0){
                                if(c===0){
                                    vecinos  = arreglo[f][c+1] + arreglo[f+1][c+1] + arreglo[f][c+1];
                                }
                                else if(c=== t-1){
                                    vecinos = arreglo[f+1][c] + arreglo[f+1][c-1] + arreglo[f][c-1];
                                }
                                else{
                                    vecinos= arreglo[f][c-1] + arreglo[f][c+1] + arreglo[f+1][c-1] + arreglo[f+1][c] + arreglo[f+1][c+1];
                                }}
                            else if(f === t-1){
                                if (c === 0){
                                    vecinos= arreglo[f-1][c] + arreglo[f-1][c+1] + arreglo[f][c+1];
                                }
                                else if(c === t-1){
                                    vecinos= arreglo[f-1][c] + arreglo[f-1][c-1] + arreglo[f][c-1];
                                }
                                else{
                                    vecinos= arreglo[f-1][c-1] + arreglo[f-1][c] +arreglo[f-1][c+1] + arreglo[f][c-1] + arreglo[f][c+1];
                                }
                            }
                            else if(f > 0 && f < t-1){
                                if(c === 0){
                                    vecinos= arreglo[f-1][c] + arreglo[f-1][c+1] + arreglo[f][c+1] + arreglo[f+1][c-1] + arreglo[f+1][c];
                                    if(c === t-1){
                                        vecinos= arreglo[f-1][c] +arreglo[f-1][c-1] + arreglo[f][c+1] + arreglo[f][c-1] + arreglo[f+1][c-1];
                                    }
                                }
                            }
                            else{
                                vecinos= arreglo[f-1][c-1] + arreglo[f-1][c] + arreglo[f-1][c+1] + arreglo[f][c-1] +arreglo[f][c+1] + arreglo[f+1][c-1] + arreglo[f+1][c] + arreglo[f+1][c+1];
                            }
                            if(arreglo[f][c] === 1 && (vecinos>=4 || vecinos <=2 )){
                                arreglo [f][c] = 0;
                                if (vecinos === 3 && vecinos === 3){
                                    arreglo [f][c] = 1;
                                }
                            }
                            else if(arreglo[f][c] === 0 && vecinos === 3){
                                arreglo [f][c] = 1;

                            }
                        }
                    }
                }


            }




/*// function realizarMat();
// function copiarMat ();
// function revisarVecinos();
// fuction mostrarMatrizdos ();
// function mostrarEvolucion(cont);
// function repetidor (); 0000

property int t : 6
property int t2 : 10
property var matriz1;
property var matriz2;
property int cont : 0;


function realizarMat(){
    matriz1 = [t];
    for (var a=0; a<t; a++){
        matriz1 [a] = [t];
        for (var b=0; b<t2; b++){
            matriz1[a][b] = Math.floor(Math.random()*2)
        }
    }
}
function copiarMat (){
    matriz2 = matriz1.slice();
    for (var n=0; n<t; n++){
    }
}
function revisarVecinos(){
    var vecinos = 0;
    for(var f=0; f<t; f++){
        for(var c=0; c<t; c++){
            if (f===0){
                if(c===0){
                    vecinos  = matriz1[f][c+1] + matriz1[f+1][c+1] + matriz1[f][c+1];
                }
                else if(c=== t-1){
                    vecinos = matriz1[f+1][c] + matriz1[f+1][c-1] + matriz1[f][c-1];
                }
                else{
                    vecinos= matriz1[f][c-1] + matriz1[f][c+1] + matriz1[f+1][c-1] + matriz1[f+1][c] + matriz1[f+1][c+1];
                }}
            else if(f === t-1){
                if (c === 0){
                    vecinos= matriz1[f-1][c] + matriz1[f-1][c+1] + matriz1[f][c+1];
                }
                else if(c === t-1){
                    vecinos= matriz1[f-1][c] + matriz1[f-1][c-1] + matriz1[f][c-1];
                }
                else{
                    vecinos= matriz1[f-1][c-1] + matriz1[f-1][c] + matriz1[f-1][c+1] + matriz1[f][c-1] + matriz1[f][c+1];
                }
            }
            else if(f > 0 && f < t-1){
                if(c === 0){
                    vecinos= matriz1[f-1][c] + matriz1[f-1][c+1] + matriz1[f][c+1] + matriz1[f+1][c-1] + matriz1[f+1][c];
                    if(c === t-1){
                        vecinos= matriz1[f-1][c] + matriz1[f-1][c-1] + matriz1[f][c+1] + matriz1[f][c-1] + matriz1[f+1][c-1];
                    }
                }
            }
            else{
                vecinos= matriz1[f-1][c-1] + matriz1[f-1][c] + matriz1[f-1][c+1] + matriz1[f][c-1] + matriz1[f][c+1] + matriz1[f+1][c-1] + matriz1[f+1][c] + matriz1[f+1][c+1];
            }
            if(matriz1[f][c] === 1 && (vecinos>=4 || vecinos <=2 )){
                matriz1 [f][c] = 0;
                if (vecinos === 3 && vecinos === 3){
                    matriz1 [f][c] = 1;
                }
            }
            else if(matriz1[f][c] === 0 && vecinos === 3){
                matriz1 [f][c] = 1;

            }
        }
    }
}
function mostrarMatrizdos (){
    console.log("Matriz original")
    for (var g = 0; g < t; g++){
        console.log(matriz1[g]);

    }
}
function mostrarEvolucion(cont){
    var n = cont.toString();
    console.log("Evolucion "+n);
    for (var b = 0; b < t; b++){
        console.log(matriz2[b]);
    }
}
function repetidor (){
    while (y < 10){
        revisarVecinos();
        mostrarEvolucion(cont);
        y++;
        cont++;
    }

}*/
