package HW2.src.homework.task001.RewFabric.Classes.Reward.Silver;

import HW2.src.homework.task001.RewFabric.Classes.IGameItem;
import HW2.src.homework.task001.RewFabric.Classes.ItemGenerator;

public class SilverFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
