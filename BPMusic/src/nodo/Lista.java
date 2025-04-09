/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodo;

import interfaces.IplayList;
import javax.swing.JOptionPane;

public class Lista implements IplayList {

    Nodo cabeza;
    Nodo FINAL;
    String ruta;

    @Override
    public void agregarCancion(String ruta) {
        Nodo nuevo = new Nodo(ruta);
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

    @Override
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

    @Override
    public void buscarCancion(String ruta) {
        Nodo buscar = new Nodo(ruta);
        while (buscar != null) {
            if (buscar.getRuta() == ruta) {
                buscar = buscar.getSig().getSig();
                JOptionPane.showMessageDialog(null, "La cancion es: " + buscar.getRuta().toString());
            }

        }
    }

    @Override
    public void pasarCancion() {
        Nodo cancion = cabeza;
        if (cancion != null) {
            cancion.getSig();
        }
    }

    @Override
    public void cancionAnterior() {
      Nodo cancion =  cabeza.getSig();
      if(cancion !=cabeza) {
          cancion.getAnt();
      }
    }
}
