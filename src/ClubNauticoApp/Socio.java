package ClubNauticoApp;


import java.util.ArrayList;

/**
 * Class Socios
 */
public class Socio {

  //
  // Fields
  //

  public String nombre;
  public String direccion;
  public String dni;
  public int telefono;
  public String fechaIngresoClub;

  public ArrayList<Amarre> amarres = new ArrayList<Amarre>();

  public ArrayList<SocioCompraAmarre> socioCompraAmarres = new ArrayList<SocioCompraAmarre>();


  //
  // Constructors
  //


  public Socio(String nombre, String direccion, String dni, int telefono, String fechaIngresoClub) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.dni = dni;
    this.telefono = telefono;
    this.fechaIngresoClub = fechaIngresoClub;
  }

  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of direccion
   * @param newVar the new value of direccion
   */
  public void setDireccion (String newVar) {
    direccion = newVar;
  }

  /**
   * Get the value of direccion
   * @return the value of direccion
   */
  public String getDireccion () {
    return direccion;
  }

  /**
   * Set the value of dni
   * @param newVar the new value of dni
   */
  public void setDni (String newVar) {
    dni = newVar;
  }

  /**
   * Get the value of dni
   * @return the value of dni
   */
  public String getDni () {
    return dni;
  }

  /**
   * Set the value of telefono
   * @param newVar the new value of telefono
   */
  public void setTelefono (int newVar) {
    telefono = newVar;
  }

  /**
   * Get the value of telefono
   * @return the value of telefono
   */
  public int getTelefono () {
    return telefono;
  }

  /**
   * Set the value of fechaIngresoClub
   * @param newVar the new value of fechaIngresoClub
   */
  public void setFechaIngresoClub (String newVar) {
    fechaIngresoClub = newVar;
  }

  /**
   * Get the value of fechaIngresoClub
   * @return the value of fechaIngresoClub
   */
  public String getFechaIngresoClub () {
    return fechaIngresoClub;
  }

  //
  // Other methods
  //

  /**
   * @return       SocioCompraAmarre
   */
  public SocioCompraAmarre comprarAmarre (String fecha, Amarre amarre) {

    this.amarres.add(amarre);

    return  new SocioCompraAmarre (fecha, this, amarre);
  }


}
