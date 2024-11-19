package lessons.six.interfaces.space;

import lessons.six.interfaces.space.machine.Shuttle;

public class Launch {

    public static void main(String[] args) {

        Shuttle shuttle = new Shuttle();

        new SpacePort().launch(shuttle);

    }
}
