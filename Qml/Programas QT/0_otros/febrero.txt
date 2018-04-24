import QtQuick 2.8
import QtQuick.Window 2.2

Window {
    id: root
    width: 645
    height: 645
    title: qsTr("Juego de la vida")

    Component.onCompleted: {
        console.log("hola");
    }

    Grid{
        anchors.fill: parent
        anchors.margins: 4
        rows: 30
        columns: 30
        spacing: 1

        Timer {
            interval: 1000/60
            running: true
            repeat: true
        }

       Repeater {
            model: 900

            Rectangle {
                id:cuadrito
                x: 0
                y: 0
                width: 20
                height: 20
                color: "GRAY"

                MouseArea{
                    anchors.fill: parent
                    onClicked: {
                        cuadrito.color="GREEN"
                    }
                }

            }

        }

    }

    //console.log("Hola mundo");

}

