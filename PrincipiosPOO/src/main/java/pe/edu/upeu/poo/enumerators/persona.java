
package pe.edu.upeu.poo.enumerators;

enum GENEROD {Femenino, Masculino}
enum ESTADO_CIVIL{Soltero, Casado, Divorciado, Viudo}

public class persona {
    String nombre;
    String dni;
    String genero=GENEROD.Femenino.name();
    String estadoc;
    public static void main(String[] args) {
        persona p=new persona();
                System.out.println("Genero:"+p.genero);
                for(ESTADO_CIVIL ec:ESTADO_CIVIL.values())
                    System.out.println("EC:"+ec);
    }
}
