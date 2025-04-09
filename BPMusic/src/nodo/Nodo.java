/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodo;

public class Nodo {

    private Nodo sig;
    private Nodo ant;
    private String rutaCan;
    private String rutaPNG;

    public Nodo(String ruta, String rutafoto) {
        this.rutaCan = ruta;
        this.sig = null;
        this.ant = null;
        this.rutaPNG = rutafoto;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public String getRuta() {
        return rutaCan;
    }

    public String getRutaPNG() {
        return rutaPNG;
    }
    

}
