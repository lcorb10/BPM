/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodo;


import javax.swing.JOptionPane;

public class Lista {

    Nodo cabeza;
    Nodo FINAL;
    String ruta;
    String rutapng;

    public void agregarCancion(Nodo nodo) {
        Nodo nuevo = nodo;
        if (cabeza == null) {
            cabeza = nuevo;
            FINAL = nuevo;
        } else {
            FINAL.setSig(nuevo);
            nuevo.setAnt(FINAL);
            nuevo.setSig(cabeza);
            FINAL = nuevo;

        }
    }


    public void eliminarCancion(String ruta) {
        Nodo eliminar = cabeza;
        while (eliminar != null) {
            if (eliminar.getRuta() == ruta) {
                eliminar = eliminar.getSig().getSig();
                JOptionPane.showMessageDialog(null, "Cancion eliminada de la playlist");
            }
            eliminar.getSig();
        }
    }

    public void buscarCancion(String ruta, String rutafoto) {
        Nodo buscar = new Nodo(ruta,rutafoto);
        while (buscar != null) {
            if (buscar.getRuta() == ruta) {
                buscar = buscar.getSig().getSig();
                JOptionPane.showMessageDialog(null, "La cancion es: " + buscar.getRuta().toString());
            }

        }
    }

    public void pasarCancion() {
        Nodo cancion = cabeza;
        if (cancion != null) {
            cancion.getSig();
        }
    }


    public void cancionAnterior() {
      Nodo cancion =  cabeza.getSig();
      if(cancion !=cabeza) {
          cancion.getAnt();
      }
    }


    public void agregarCancion(String ruta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void buscarCancion(String ruta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


