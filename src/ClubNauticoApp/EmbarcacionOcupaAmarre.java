package ClubNauticoApp;


/**
 * Class EmbarcacionOcupaAmarre
 */
public class EmbarcacionOcupaAmarre {


  //
  // Fields
  //

  public String fechaAmarre;

  public Embarcacion embarcacion;

  public Amarre amarre;
  //
  // Constructors
  //

  public EmbarcacionOcupaAmarre(String fechaAmarre, Embarcacion embarcacion, Amarre amarre) {
    this.fechaAmarre = fechaAmarre;
    this.embarcacion = embarcacion;
    this.amarre = amarre;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of fechaAmarre
   * @param newVar the new value of fechaAmarre
   */
  public void setFechaAmarre (String newVar) {
    fechaAmarre = newVar;
  }

  /**
   * Get the value of fechaAmarre
   * @return the value of fechaAmarre
   */
  public String getFechaAmarre () {
    return fechaAmarre;
  }

  //
  // Other methods
  //

}
