/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato;

/**
 *
 * @author Juana García
 */
public class Dato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciar objeto y asignar  argumentos o valores
        Informacion info = new Informacion("Martin","Sistemas",3);
        //encapsular
        String  NumCon = info.getNombre()+""+info.getCarrera()+""+info.getSemestre()+"";
        System.out.println("Datos del alumno:"+NumCon);
         System.out.println("TEC 2");          
    }
    
}
