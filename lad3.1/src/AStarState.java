import java.util.HashMap;

public class AStarState
{
    private Map2D map;
    private HashMap<Location, Waypoint> open = new HashMap<>();
    private HashMap<Location, Waypoint> close = new HashMap<>();

    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
    }
    public Map2D getMap()
    {
        return map;
    }
    public int numOpenWaypoints()
    {
        return open.size();
    }
    public Waypoint getMinOpenWaypoint()
    {
        if ( open.size() ==0)
        return null;
        else {
            Waypoint min;
            Waypoint massWaypoin[] = new Waypoint[numOpenWaypoints()];
            int i = 0;

            for(Waypoint a : open.values())
            {
                massWaypoin[i]=a;
                i++;
            }

            min=massWaypoin[0];

            for(i=1; i<numOpenWaypoints(); i++)
            {
                if(massWaypoin[i].getTotalCost()<min.getTotalCost())
                {
                    min = massWaypoin[i];
                }
            }
            return min;
        }
    }
    public boolean addOpenWaypoint(Waypoint newWP)
    {
        Location newLoc = newWP.getLocation();
        Waypoint w = open.get(newLoc);
        if (w == null || newWP.getPreviousCost() < w.getPreviousCost())
        {
            open.put(newLoc, newWP);
            return true;
        }
        return false;
    }

    public void closeWaypoint(Location loc)
    {
        close.put(loc,open.get(loc));
        open.remove(loc);
    }
    public boolean isLocationClosed(Location loc)
    {
        if(close.containsKey(loc)) return true;
        return false;
    }
}

