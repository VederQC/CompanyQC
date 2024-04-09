
package pe.edu.upeu.poo.encapinterface;


public class Loro implements Animal{

    @Override
    public void emitirSonido() {
        System.out.println("Esto es la implementacion"
        +"...no te olvides pues");
    }

    @Override
    public void dormir() {
        System.out.println("zzz...zzzz");
        
    }
    public void habla(){
        System.out.println("hola broer k fue como van los visnes ");
    }
    
}
