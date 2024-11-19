package lessons.six.interfaces.spaceSystem;

import lessons.six.interfaces.spaceSystem.spaceMachine.Shuttle;

public class Launch {

    public static void main(String[] args) {

        Shuttle shuttle = new Shuttle();

        new SpacePort().launch(shuttle);

    }
}
