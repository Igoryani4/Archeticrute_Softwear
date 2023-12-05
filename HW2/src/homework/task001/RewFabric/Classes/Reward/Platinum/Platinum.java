package HW2.src.homework.task001.RewFabric.Classes.Reward.Platinum;

import HW2.src.homework.task001.RewFabric.Classes.IGameItem;

public class Platinum implements IGameItem {
    @Override
    public void open() {
        System.out.println("Platinum!");
    }
}