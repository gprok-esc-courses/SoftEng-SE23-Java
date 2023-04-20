package map;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

    private RouteStrategy routeStrategy;

    public Map() {
        routeStrategy = null;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void printRoute() {
        if(routeStrategy != null) {
            System.out.println(routeStrategy.getRoute());
        }
    }

    public static void main(String[] args) {
        Map map = new Map();
        RouteFactory.populateMap();
        Scanner in = new Scanner(System.in);
        while(true) {
            for (HashMap.Entry<Integer, RouteStrategy> route : RouteFactory.routeMap.entrySet()) {
                System.out.println(route.getKey() + ". " + route.getValue().getRouteName());
            }
            System.out.println("0. EXIT");
            int choice = in.nextInt();

            if(choice == 0) {
                System.out.println("Bye!");
                break;
            }
            else {
                RouteStrategy rs = RouteFactory.getRouteStrategy(choice);
                if(rs != null) {
                    map.setRouteStrategy(rs);
                    map.printRoute();
                }
            }
        }
    }

}
