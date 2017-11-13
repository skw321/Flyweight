// This factory only creates a new rectangle if it 
// uses a color not previously used

// Intrinsic State: Color
// Extrinsic State: X & Y Values

import java.util.HashMap;
import java.awt.Color;
import java.util.Map;

public class RectFactory {

    // The HashMap uses the color as the key for every
    // rectangle it will make up to 8 total

    private static final Map<Color, Shape> rectsByColor = new HashMap<>();

    public static Rect getRect(Color color) {
        Rect rect = (Rect)rectsByColor.get(color);

        // Checks if a rectangle with a specific
        // color has been made. If not it makes a
        // new one, otherwise it returns one made already

        if(rect == null) {
            rect = new Rect(color);

            // Add new rectangle to HashMap

            rectsByColor.put(color, rect);

        }
        return rect;
    }
}