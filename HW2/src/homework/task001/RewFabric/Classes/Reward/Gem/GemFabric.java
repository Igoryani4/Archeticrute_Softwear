package HW2.src.homework.task001.RewFabric.Classes.Reward.Gem;

import HW2.src.homework.task001.RewFabric.Classes.ItemGenerator;
import HW2.src.homework.task001.RewFabric.Classes.IGameItem;

public class GemFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
