package HW2.src.homework.task001.RewFabric.Classes.Reward.Gem;



import HW2.src.homework.task001.RewFabric.Classes.IGameItem;

public class Gem  implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gem!");
    }
}
