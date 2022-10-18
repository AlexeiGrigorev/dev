package lessen2;

public class TheEnd {
    public static void main(String[] Args) {
        System.out.println("Начинаем сборку");
        IAssemblyLine line = new TankIAssemblyLIne();
        IProduct product = (IProduct) line.assembleProduct();
    }
}
