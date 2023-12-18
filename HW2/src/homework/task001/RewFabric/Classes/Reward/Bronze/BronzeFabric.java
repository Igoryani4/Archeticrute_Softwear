package HW2.src.homework.task001.RewFabric.Classes.Reward.Bronze;

import HW2.src.homework.task001.RewFabric.Classes.IGameItem;
import HW2.src.homework.task001.RewFabric.Classes.ItemGenerator;

public class BronzeFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}