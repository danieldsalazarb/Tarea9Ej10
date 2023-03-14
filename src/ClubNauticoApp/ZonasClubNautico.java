package ClubNauticoApp;

import java.util.*;


/**
 * Class ZonasClubNautico
 */
public class ZonasClubNautico {

  //
  // Fields
  //

  public String letra;
  public String tipobarcoasignado;
  public int numeroBarcosAsignados;
  public float profundidad;
  public float anchoAmarres;
  // Relacion entre zonasClubNautico y Amarres
  // Relación entre Empleados y ZonasClubNautico
  
  //
  // Constructors
  //
  public ZonasClubNautico () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of letra
   * @param newVar the new value of letra
   */
  public void setLetra (String newVar) {
    letra = newVar;
  }

  /**
   * Get the value of letra
   * @return the value of letra
   */
  public String getLetra () {
    return letra;
  }

  /**
   * Set the value of tipobarcoasignado
   * @param newVar the new value of tipobarcoasignado
   */
  public void setTipobarcoasignado (String newVar) {
    tipobarcoasignado = newVar;
  }

  /**
   * Get the value of tipobarcoasignado
   * @return the value of tipobarcoasignado
   */
  public String getTipobarcoasignado () {
    return tipobarcoasignado;
  }

  /**
   * Set the value of numeroBarcosAsignados
   * @param newVar the new value of numeroBarcosAsignados
   */
  public void setNumeroBarcosAsignados (int newVar) {
    numeroBarcosAsignados = newVar;
  }

  /**
   * Get the value of numeroBarcosAsignados
   * @return the value of numeroBarcosAsignados
   */
  public int getNumeroBarcosAsignados () {
    return numeroBarcosAsignados;
  }

  /**
   * Set the value of profundidad
   * @param newVar the new value of profundidad
   */
  public void setProfundidad (float newVar) {
    profundidad = newVar;
  }

  /**
   * Get the value of profundidad
   * @return the value of profundidad
   */
  public float getProfundidad () {
    return profundidad;
  }

  /**
   * Set the value of anchoAmarres
   * @param newVar the new value of anchoAmarres
   */
  public void setAnchoAmarres (float newVar) {
    anchoAmarres = newVar;
  }

  /**
   * Get the value of anchoAmarres
   * @return the value of anchoAmarres
   */
  public float getAnchoAmarres () {
    return anchoAmarres;
  }

  //
  // Other methods
  //

}
