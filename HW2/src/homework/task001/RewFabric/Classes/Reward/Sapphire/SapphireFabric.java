package HW2.src.homework.task001.RewFabric.Classes.Reward.Sapphire;

import HW2.src.homework.task001.RewFabric.Classes.IGameItem;
import HW2.src.homework.task001.RewFabric.Classes.ItemGenerator;

public class SapphireFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
}
