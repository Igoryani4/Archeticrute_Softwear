package HW2.src.homework.task001.RewFabric.Classes.Reward.Platinum;

import HW2.src.homework.task001.RewFabric.Classes.IGameItem;
import HW2.src.homework.task001.RewFabric.Classes.ItemGenerator;

public class PlatinumFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
}
