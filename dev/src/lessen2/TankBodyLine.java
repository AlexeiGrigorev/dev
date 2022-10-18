package lessen2;

public class TankBodyLine implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        return new TankBody();
    }
}
