package ClubNauticoApp;


import java.util.ArrayList;

/**
 * Class ZonasClubNautico
 */
public class ZonaClubNautico {

  //
  // Fields
  //

  public String letra;

  public String tipoEmbarcacionAsignada;

  public int cantidadEmbarcacionContenida;
  public float profundidad;
  public float anchoAmarre;

  public ArrayList<Amarre> amarres = new ArrayList<Amarre>();

  public ArrayList<Empleado> empleados = new ArrayList<Empleado>();
  
  //
  // Constructors
  //


  public ZonaClubNautico(String letra, String tipoEmbarcacionAsignada, int cantidadEmbarcacionContenida, float profundidad, float anchoAmarre) {
    this.letra = letra;
    this.tipoEmbarcacionAsignada = tipoEmbarcacionAsignada;
    this.cantidadEmbarcacionContenida = cantidadEmbarcacionContenida;
    this.profundidad = profundidad;
    this.anchoAmarre = anchoAmarre;
  }
  
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
   * Set the value of tipoEmbarcacionesAsignadas
   * @param newVar the new value of tipoEmbarcacionesAsignadas
   */
  public void setTipoEmbarcacionesAsignadas (String newVar) {
    tipoEmbarcacionAsignada = newVar;
  }

  /**
   * Get the value of tipoEmbarcacionesAsignadas
   * @return the value of tipoEmbarcacionesAsignadas
   */
  public String getTipoEmbarcacionesAsignadas () {
    return tipoEmbarcacionAsignada;
  }

  /**
   * Set the value of cantidadEmbarcacionesContenidas
   * @param newVar the new value of cantidadEmbarcacionesContenidas
   */
  public void setCantidadEmbarcacionesContenidas (int newVar) {
    cantidadEmbarcacionContenida = newVar;
  }

  /**
   * Get the value of cantidadEmbarcacionesContenidas
   * @return the value of cantidadEmbarcacionesContenidas
   */
  public int getCantidadEmbarcacionesContenidas () {
    return cantidadEmbarcacionContenida;
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
   * Set the value of anchoAmarre
   * @param newVar the new value of anchoAmarre
   */
  public void setAnchoAmarre (float newVar) {
    anchoAmarre = newVar;
  }

  /**
   * Get the value of anchoAmarre
   * @return the value of anchoAmarre
   */
  public float getAnchoAmarre () {
    return anchoAmarre;
  }

  //
  // Other methods
  //

}
