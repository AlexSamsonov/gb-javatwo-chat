package three.online;

import java.util.Objects;
import java.lang.Comparable;

public class Box implements Comparable {
    int width;
    int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
//        return String.format("Box(%d, %d)", width, heght);
        return "Box(" + width + ", " + height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) return true;
        if (!(obj instanceof Box)) return false;
        Box box = (Box) obj;
        return width == box.width && height == box.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    private int square() {
        return width * height;
    }

    @Override
    public int compareTo(Object o) {
        Box box = (Box) o;
        int sq = square();
        int bSq = box.square();
//        if (sq < bSq)
//            return -1;
//        else if (sq > bSq)
//            return 1;
//        else
//            return 0;
        return sq - bSq;
    }
}
