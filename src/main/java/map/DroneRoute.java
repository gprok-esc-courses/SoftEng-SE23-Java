package map;

public class DroneRoute implements RouteStrategy {
    @Override
    public String getRoute() {
        return "Route by drone ...";
    }

    @Override
    public String getRouteName() {
        return "Drone";
    }
}
