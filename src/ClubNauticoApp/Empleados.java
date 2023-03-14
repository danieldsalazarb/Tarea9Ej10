package ClubNauticoApp;

import java.util.*;


/**
 * Class Empleados
 */
public class Empleados {

  //
  // Fields
  //

  public int codigoEmpleado;
  public String nombre;
  public String direccion;
  public int telefono;
  public String especialidad;
  // Relación entre Empleados y ZonasClubNautico
  // Relación entre Empleados y Embarcaciones
  
  //
  // Constructors
  //
  public Empleados () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of codigoEmpleado
   * @param newVar the new value of codigoEmpleado
   */
  public void setCodigoEmpleado (int newVar) {
    codigoEmpleado = newVar;
  }

  /**
   * Get the value of codigoEmpleado
   * @return the value of codigoEmpleado
   */
  public int getCodigoEmpleado () {
    return codigoEmpleado;
  }

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
   * Set the value of especialidad
   * @param newVar the new value of especialidad
   */
  public void setEspecialidad (String newVar) {
    especialidad = newVar;
  }

  /**
   * Get the value of especialidad
   * @return the value of especialidad
   */
  public String getEspecialidad () {
    return especialidad;
  }

  //
  // Other methods
  //

}
