package map;

public class WalkRoute implements RouteStrategy {
    @Override
    public String getRoute() {
        return "Route walking ...";
    }

    @Override
    public String getRouteName() {
        return "Walk";
    }
}
