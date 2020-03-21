package c3.z2;

import java.util.Comparator;

public class MyColorCompar implements Comparator<MyColor> {
    private ColComponent sortBy;

    public MyColorCompar(ColComponent sortBy) {
        this.sortBy = sortBy;
    }

    @Override
    public int compare(MyColor color1, MyColor color2) {
        if (this.sortBy == ColComponent.RED) {
            return color1.getRed() - color2.getRed();
        }

        if (this.sortBy == ColComponent.GREEN) {
            return color1.getGreen() - color2.getGreen();
        }

        if (this.sortBy == ColComponent.BLUE) {
            return color1.getBlue() - color2.getBlue();
        }

        return 0;
    }
}
