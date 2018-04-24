import QtQuick 2.8
import QtQuick.Window 2.2

Rectangle {
  id: main
  width: 660
  height: 660


  color: '#0f0f0f'

  Timer {
    interval: 1000/60
    running: true
    repeat: true
    onTriggered: {metodo();visualizar();}
  }

  Component {
    id: celdaComponent
    Rectangle {
      objectName: 'celda'
      property int row: 0
      property int col: 0
      x: main.width/2+width*col
      y: main.height/2+height*row
      width: 5
      height: 5
      radius: 2.5
      smooth: true
      color: '#2c932c'
    }
  }

  property var celdas: null

  Component.onCompleted: {
    celdas=[[-1, 0],[-1, 1],[ 0,-1],[ 0, 0],[ 1, 0]];
    visualizar();
  }

  function visualizar() {
    // Simplemente regenera completamente el campo de visualización de cada trama
    // TODO: podría ser mejor hacer actualizaciones diferenciales, permitiría animaciones de nacimiento / muerte


    // Nuke todas las celdas previamente mostradas
    for (var i=0;i<children.length;i++) {
      if (children[i].objectName=='celda') {
        children[i].destroy();
      }
    }

    // Mostrar el conjunto actual de celdas
    for (var i=0;i<celdas.length;i++) {
      var c=celdaComponent.createObject(
        main,
        {'row':celdas[i][0],'col':celdas[i][1]}
      );
    }
  }

  function metodo() {

    // Construir un hash de las células actualmente vivas y un recuento de vecinos (incluye auto)
    var a=new Object;
    var n=new Object;
    for (var i=0;i<celdas.length;i++) {
      var p=celdas[i]
      var r=p[0];
      var c=p[1];
      if (!(r in a)) a[r]=new Object;
      a[r][c]=1;
      for (var dr=r-1;dr<=r+1;dr++) {
        for (var dc=c-1;dc<=c+1;dc++) {
          if (!(dr in n)) n[dr]=new Object;
          if (!(dc in n[dr])) n[dr][dc]=0;
          n[dr][dc]+=1;
        }
      }
    }

    // Para todas las células vivas, evaluar la viabilidad
    var kill=[];
    var stay=[];
    for (var r in a) {
      for (var c in a[r]) {
        if (n[r][c]-1<2 || n[r][c]-1>3)
          kill.push([Number(r),Number(c)]);
        else
          stay.push([Number(r),Number(c)]);
      }
    }

    // Para los vecinos de células vivas, evaluar el potencial de los nacimientos
    var born=[];
    for (var r in n) {
      for (var c in n[r]) {
        if (!((r in a) && (c in a[r]))) {
          if (n[r][c]==3)
            born.push([Number(r),Number(c)]);
        }
      }
    }

    celdas=stay.concat(born)
  }
}
