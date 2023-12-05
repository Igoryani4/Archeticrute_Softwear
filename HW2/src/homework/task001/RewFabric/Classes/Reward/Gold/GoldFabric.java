package HW2.src.homework.task001.RewFabric.Classes.Reward.Gold;

import HW2.src.homework.task001.RewFabric.Classes.ItemGenerator;
import HW2.src.homework.task001.RewFabric.Classes.IGameItem;

public class GoldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
