package map;

public class CarRoute implements RouteStrategy {
    @Override
    public String getRoute() {
        return "Route by car ...";
    }

    @Override
    public String getRouteName() {
        return "Car";
    }
}
