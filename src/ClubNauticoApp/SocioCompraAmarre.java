package ClubNauticoApp;

import java.util.*;


/**
 * Class SocioCompraAmarre
 */
public class SocioCompraAmarre {

  //
  // Fields
  //

  public String fechaCompraAmarre;

  public Socio socio;

  public Amarre amarre;
  
  //
  // Constructors
  //

  public SocioCompraAmarre(String fechaCompraAmarre, Socio socio, Amarre amarre) {
    this.fechaCompraAmarre = fechaCompraAmarre;
    this.socio = socio;
    this.amarre = amarre;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of fechaCompraAmarre
   * @param newVar the new value of fechaCompraAmarre
   */
  public void setFechaCompraAmarre (String newVar) {
    fechaCompraAmarre = newVar;
  }

  /**
   * Get the value of fechaCompraAmarre
   * @return the value of fechaCompraAmarre
   */
  public String getFechaCompraAmarre () {
    return fechaCompraAmarre;
  }

  //
  // Other methods
  //

}
