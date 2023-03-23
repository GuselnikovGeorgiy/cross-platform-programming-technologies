import java.util.Objects;

/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Location)) return false;
        Location loc = (Location) obj;

        return xCoord == loc.xCoord && yCoord == loc.yCoord;
    }

    @Override
    public int hashCode()
    {
        int result = 17;
        result = 21 * result + xCoord;
        result = 21 * result + yCoord;
        return result;
    }
}