/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jornada;

/**
 *
 * @author Luis Miguel
 */
public class objJugador {

     int idJugador;
     int FkEquipo;
     String nombre;
     String Apaterno;
     String Amaterno;
     int dia;
     String mes;
     int anio;
     String correo;
      String telefono;
     String calle;
     String colonia;
     int NumeroCasa;
     int NumJugador; 

    public objJugador(int idJugador, int FkEquipo, String nombre, String Apaterno, String Amaterno, int dia, String mes, int anio, String correo, String telefono, String calle, String colonia, int NumeroCasa, int NumJugador) {
        this.idJugador = idJugador;
        this.FkEquipo = FkEquipo;
        this.nombre = nombre;
        this.Apaterno = Apaterno;
        this.Amaterno = Amaterno;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.correo = correo;
        this.telefono = telefono;
        this.calle = calle;
        this.colonia = colonia;
        this.NumeroCasa = NumeroCasa;
        this.NumJugador = NumJugador;
    }
    
    
    
    
}
