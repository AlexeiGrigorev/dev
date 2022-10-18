package lessen2;

public class TankTowerLine implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        return new TankTower();
    }
}
