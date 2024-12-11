package lessons.six.links.abstruct.shapes;

public enum Color {

    RED("red", "\u001B[31m"),
    BLUE("blue", "\u001B[36m"),
    YELLOW("yellow", "\u001B[33m"),
    GREEN("green", "\"\\u001B[32m\"");


    private String name;
    private String ansi;

    Color(String name, String ansi) {
        this.name = name;
        this.ansi = ansi;
    }


    public String getName() {
        return name;
    }

    public String getAnsi() {
        return ansi;
    }

}
