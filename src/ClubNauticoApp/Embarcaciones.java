package ClubNauticoApp;

import java.util.*;


/**
 * Class Embarcaciones
 */
public class Embarcaciones {

  //
  // Fields
  //

  public String matricula;
  public String nombre;
  public String tipo;
  public Float dimensiones;
  public int codigoEmpleadoEncargado;
  // Relacion entre Socio y Embarcación
  // Relacion entre Embarcacion y Amarre
  // Relación entre Empleados y Embarcaciones
  
  //
  // Constructors
  //
  public Embarcaciones () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of matricula
   * @param newVar the new value of matricula
   */
  public void setMatricula (String newVar) {
    matricula = newVar;
  }

  /**
   * Get the value of matricula
   * @return the value of matricula
   */
  public String getMatricula () {
    return matricula;
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
   * Set the value of tipo
   * @param newVar the new value of tipo
   */
  public void setTipo (String newVar) {
    tipo = newVar;
  }

  /**
   * Get the value of tipo
   * @return the value of tipo
   */
  public String getTipo () {
    return tipo;
  }

  /**
   * Set the value of dimensiones
   * @param newVar the new value of dimensiones
   */
  public void setDimensiones (Float newVar) {
    dimensiones = newVar;
  }

  /**
   * Get the value of dimensiones
   * @return the value of dimensiones
   */
  public Float getDimensiones () {
    return dimensiones;
  }

  /**
   * Set the value of codigoEmpleadoEncargado
   * @param newVar the new value of codigoEmpleadoEncargado
   */
  public void setCodigoEmpleadoEncargado (int newVar) {
    codigoEmpleadoEncargado = newVar;
  }

  /**
   * Get the value of codigoEmpleadoEncargado
   * @return the value of codigoEmpleadoEncargado
   */
  public int getCodigoEmpleadoEncargado () {
    return codigoEmpleadoEncargado;
  }

  //
  // Other methods
  //

}
