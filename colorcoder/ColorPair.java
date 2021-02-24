package colorcoder;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;

    final static String MajorColorNames[] = { "White", "Red", "Black", "Yellow", "Violet" };
    final static String MinorColorNames[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

    final static int numberOfMajorColors = MajorColorNames.length;
    final static int numberOfMinorColors = MinorColorNames.length;


    public ColorPair(MajorColor major, MinorColor minor) {
        majorColor = major;
        minorColor = minor;
    }

    public MajorColor getMajor() {
        return majorColor;
    }

    public MinorColor getMinor() {
        return minorColor;
    }

    String ToString() {
        String colorPairStr = MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
}
