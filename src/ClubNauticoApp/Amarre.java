package ClubNauticoApp;

import java.util.*;


/**
 * Class Amarre
 */
public class Amarre extends Socios {

  //
  // Fields
  //

  public int numeroAmarre;
  public float lecturaContadorAgua;
  public float lecturaContadorLuz;
  public boolean serviciosContratados;
  // Relacion entre Embarcacion y Amarre
  // Relacion entre zonasClubNautico y Amarres
  
  //
  // Constructors
  //
  public Amarre () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of numeroAmarre
   * @param newVar the new value of numeroAmarre
   */
  public void setNumeroAmarre (int newVar) {
    numeroAmarre = newVar;
  }

  /**
   * Get the value of numeroAmarre
   * @return the value of numeroAmarre
   */
  public int getNumeroAmarre () {
    return numeroAmarre;
  }

  /**
   * Set the value of lecturaContadorAgua
   * @param newVar the new value of lecturaContadorAgua
   */
  public void setLecturaContadorAgua (float newVar) {
    lecturaContadorAgua = newVar;
  }

  /**
   * Get the value of lecturaContadorAgua
   * @return the value of lecturaContadorAgua
   */
  public float getLecturaContadorAgua () {
    return lecturaContadorAgua;
  }

  /**
   * Set the value of lecturaContadorLuz
   * @param newVar the new value of lecturaContadorLuz
   */
  public void setLecturaContadorLuz (float newVar) {
    lecturaContadorLuz = newVar;
  }

  /**
   * Get the value of lecturaContadorLuz
   * @return the value of lecturaContadorLuz
   */
  public float getLecturaContadorLuz () {
    return lecturaContadorLuz;
  }

  /**
   * Set the value of serviciosContratados
   * @param newVar the new value of serviciosContratados
   */
  public void setServiciosContratados (boolean newVar) {
    serviciosContratados = newVar;
  }

  /**
   * Get the value of serviciosContratados
   * @return the value of serviciosContratados
   */
  public boolean getServiciosContratados () {
    return serviciosContratados;
  }

  //
  // Other methods
  //

}
