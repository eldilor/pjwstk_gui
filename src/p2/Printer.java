package p2;

public class Printer {
    private String string = "";

    public Printer addLine(String line) {
        this.string += line + "\n";

        return this;
    }

    public Printer addLine() {
        return this.addLine("");
    }

    public Printer addText(String text) {
        this.string += text;

        return this;
    }

    public Printer addText(String text, int space) {
        int spaces = space - text.length();

        for (int i = 0; i < spaces; i++) {
            this.string += " ";
        }

        if (spaces < 0) text = text.substring(0, space);

        this.string += text;

        return this;
    }

    @Override
    public String toString() {
        return this.string;
    }
}
