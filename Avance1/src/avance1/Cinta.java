/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance1;

/**
 *
 * @author Manny
 */
public class Cinta {
    public ColaMaterial materiaAleatorio(int max) {
        ColaMaterial material = new ColaMaterial();
        int contador = 0;
        while (contador != max) {
            int numeroAleatorio = (int) (Math.random() * 6) + 1;
            switch (numeroAleatorio) {
                case 1:
                    material.encolar("Motor de lujo", 500);
                    break;
                case 2:
                    material.encolar("Motor deportivo", 2000);
                    break;
                case 3:
                    material.encolar("Carroceria", 500);
                    break;
                case 4:
                    material.encolar("Carroceria especial", 800);
                    break;
                case 5:
                    material.encolar("Llantas deportivas", 2000);
                    break;
                case 6:
                    material.encolar("Llantas de trabajo", 800);
                    break;    

                default:
                    throw new AssertionError();
            }
            ++contador;
        }
        return material;

    }
}
