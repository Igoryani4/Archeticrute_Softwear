package HW2.src.homework.task001.RewFabric.Classes.Reward.Gold;

import HW2.src.homework.task001.RewFabric.Classes.IGameItem;

public class Gold implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gold!");
    }
}