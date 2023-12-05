package HW2.src.homework.task001.RewFabric.Classes.Reward.Ruby;

import HW2.src.homework.task001.RewFabric.Classes.IGameItem;
import HW2.src.homework.task001.RewFabric.Classes.ItemGenerator;

public class RubyFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}