import java.util.*;

public class Graph {
    private final Map<String, List<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // Add a new location
    public void addLocation(String location) {
        if (!adjList.containsKey(location)) {
            adjList.put(location, new ArrayList<>());
            System.out.println(location + " added successfully.");
        } else {
            System.out.println("Location already exists.");
        }
    }

    // Remove a location
    public void removeLocation(String location) {
        if (adjList.containsKey(location)) {
            adjList.remove(location);
            for (List<String> neighbors : adjList.values()) {
                neighbors.remove(location);
            }
            System.out.println(location + " removed successfully.");
        } else {
            System.out.println("Location not found.");
        }
    }

    // Add a road
    public void addRoad(String from, String to) {
        if (adjList.containsKey(from) && adjList.containsKey(to)) {
            adjList.get(from).add(to);
            adjList.get(to).add(from);
            System.out.println("Road added between " + from + " and " + to);
        } else {
            System.out.println("One or both locations not found.");
        }
    }

    // Remove a road
    public void removeRoad(String from, String to) {
        if (adjList.containsKey(from) && adjList.get(from).remove(to)) {
            adjList.get(to).remove(from);
            System.out.println("Road removed between " + from + " and " + to);
        } else {
            System.out.println("Road not found.");
        }
    }

    // Display all connections
    public void displayConnections() {
        System.out.println("\n--- City Connections ---");
        for (String location : adjList.keySet()) {
            System.out.println(location + " -> " + adjList.get(location));
        }
    }

    // Get all locations
    public Set<String> getLocations() {
        return adjList.keySet();
    }
}
