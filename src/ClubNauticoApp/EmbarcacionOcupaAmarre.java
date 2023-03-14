package ClubNauticoApp;

/**
 * Class EmbarcacionOcupaAmarre
 */
public class EmbarcacionOcupaAmarre extends Embarcaciones, Amarre {

  //
  // Fields
  //

  public String fechaAmarre;
  
  //
  // Constructors
  //
  public EmbarcacionOcupaAmarre () { };
  
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
