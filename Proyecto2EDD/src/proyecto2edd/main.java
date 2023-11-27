
package proyecto2edd;

import Interfaces.VentanaCargar;


public class main {

    public static void main(String[] args) {

        VentanaCargar cargar = new VentanaCargar();
        cargar.setVisible(true);

        BinaryHeap monticulo = new BinaryHeap();
        monticulo.insertNodo(34);
        monticulo.print();

    }
}
