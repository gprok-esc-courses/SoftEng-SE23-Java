package map;

public class BusRoute implements RouteStrategy {
    @Override
    public String getRoute() {
        return "Route by bus ...";
    }

    @Override
    public String getRouteName() {
        return "Bus";
    }
}
