package lesson6.interfaces.spaceSystem;

import lesson6.interfaces.spaceSystem.spaceMachine.Shuttle;

public class Launch {

    public static void main(String[] args) {

        Shuttle shuttle = new Shuttle();

        new SpacePort().launch(shuttle);

    }
}
