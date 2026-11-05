/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance1;

/**
 *
 * @author Manny
 */
public class Auto {
    private String  nombre;
    private String carroceria;
    private String motor; 
    private String llanta;

    public Auto(String nombre, String carroceria, String motor, String llanta) {
        this.nombre = nombre;
        this.carroceria = carroceria;
        this.motor = motor;
        this.llanta = llanta;
    }
   
    public Auto(String nombre, String carroceria, String motor) {
        this.nombre = nombre;
        this.carroceria = carroceria;
        this.motor = motor;
       
    }        
    
    

    public String getLlanta() {
        return llanta;
    }

    public void setLlanta(String llanta) {
        this.llanta = llanta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    
}
