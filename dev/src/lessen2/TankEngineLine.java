package lessen2;

public class TankEngineLine implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        return new TankEngine();
    }
}
