package map;

public class BikeRoute implements RouteStrategy {
    @Override
    public String getRoute() {
        return "Route by bike ...";
    }

    @Override
    public String getRouteName() {
        return "Bike";
    }
}
