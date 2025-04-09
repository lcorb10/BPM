/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

public interface IplayList {
    void agregarCancion(String ruta);
    void eliminarCancion(String ruta);
    void buscarCancion(String ruta);
    void pasarCancion();
    void cancionAnterior();
}
