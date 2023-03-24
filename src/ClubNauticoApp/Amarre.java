package ClubNauticoApp;

import java.util.*;


/**
 * Class Amarre
 */
public class Amarre {

  //
  // Fields
  //

  public int numeroAmarre;
  public float lecturaContadorAgua;
  public float lecturaContadorLuz;
  public boolean serviciosContratados;

  public ArrayList<EmbarcacionOcupaAmarre> embarcacionOcupaAmarres = new ArrayList<EmbarcacionOcupaAmarre>();

  public ArrayList<SocioCompraAmarre> socioCompraAmarres = new ArrayList<SocioCompraAmarre>();
  
  //
  // Constructors
  //

  public Amarre(int numeroAmarre, float lecturaContadorAgua, float lecturaContadorLuz, boolean serviciosContratados) {
    this.numeroAmarre = numeroAmarre;
    this.lecturaContadorAgua = lecturaContadorAgua;
    this.lecturaContadorLuz = lecturaContadorLuz;
    this.serviciosContratados = serviciosContratados;
  }


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

  /**
   * @return       EmbarcacionOcupaAmarre
   */
  public EmbarcacionOcupaAmarre amarrar (String fecha, Embarcacion embarcacion) {

    return new EmbarcacionOcupaAmarre (fecha, embarcacion, this);
  }


}
