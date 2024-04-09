package pe.edu.upeu.poo.claseinterna;

public class Principal {

    public static void main(String[] args) {
        mama objm = new mama();
        objm.alimentar();
        mama.Bebe bb = objm.new Bebe();
        bb.moverse();
    }
}
