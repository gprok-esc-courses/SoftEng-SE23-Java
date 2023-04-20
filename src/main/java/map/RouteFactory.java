package map;

import java.util.HashMap;

public class RouteFactory {

    public static HashMap<Integer, RouteStrategy> routeMap = new HashMap<Integer, RouteStrategy>();

    public static void populateMap() {
        routeMap.put(1, new BusRoute());
        routeMap.put(2, new CarRoute());
        routeMap.put(3, new WalkRoute());
        routeMap.put(4, new BikeRoute());
        routeMap.put(5, new DroneRoute());
    }

    public static RouteStrategy getRouteStrategy(int code) {
        if(routeMap.size() == 0) {
            populateMap();
        }
        if(routeMap.containsKey(code)) {
            return routeMap.get(code);
        }
        else {
            return null;
        }
    }
}
