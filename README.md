Smart City Route Planner 🗺️

A Java console application that models a city's transport network using graph data structures with AVL Tree integration for efficient location management.

![Java](https://img.shields.io/badge/Java-17+-blue.svg)
![Data Structures](https://img.shields.io/badge/Data%20Structures-Graph%20%26%20AVL%20Tree-orange.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen.svg)

🌟 Features

- Graph-Based City Representation: Adjacency List implementation for efficient road network modeling
- AVL Tree Integration: Self-balancing binary search tree for optimized location management
- Complete CRUD Operations: Add, remove, and manage locations and roads
- Menu-Driven Interface: User-friendly console interface for easy interaction
- Efficient Data Storage: HashMap and ArrayList for optimal performance
- Real-time Network Visualization: Display all city connections and relationships

🚀 Quick Start

Prerequisites

- Java JDK 17 or higher
- Command Line/Terminal access

 Installation & Running

1. Clone or download the project files
   ```bash
   # Ensure all Java files are in the same directory:
   # Graph.java, LocationTree.java, AVLNode.java, SmartCityMain.java
   ```

2. Compile all Java files
   ```bash
   javac *.java
   ```

3. Run the application
   ```bash
   java SmartCityMain
   ```

 📁 Project Structure

```
Smart-City-Route-Planner/
├── src/
│   ├── Graph.java              # Graph operations and city network management
│   ├── LocationTree.java       # AVL tree implementation for location storage
│   ├── AVLNode.java           # Node structure for AVL tree
│   └── SmartCityMain.java     # Main application with menu interface
├── README.md
└── (compiled .class files)
```

🏗️ Architecture Overview

 Data Structures Used

- Graph (Adjacency List): `HashMap<String, ArrayList<String>>` for efficient road network representation
- AVL Tree: Self-balancing binary search tree for location storage and retrieval
- HashMap & ArrayList: For efficient data storage and manipulation
- Scanner: For user input handling in console interface

 Core Components

- Graph.java: Handles all graph operations including add/remove locations and roads
- LocationTree.java: AVL tree implementation with balancing operations
- AVLNode.java: Node structure supporting AVL tree operations
- SmartCityMain.java: Main driver class with comprehensive menu system

🎮 Usage

The application provides an interactive menu system with the following options:

1. Add New Locations - Insert locations into both graph and AVL tree
2. Remove Existing Locations - Delete locations and all connected roads
3. Connect Locations - Add roads between existing locations
4. Remove Roads - Disconnect locations by removing roads
5. View City Network - Display all connections in the city graph
6. Display Sorted Locations - Show locations in sorted order using AVL tree traversal
7. Exit Application - Cleanly terminate the program

Example Usage Flow

```java
// Sample interaction:
1. Add Location: "Downtown"
2. Add Location: "University" 
3. Connect Road: "Downtown" - "University"
4. View Connections: Shows Downtown ↔ University
5. Display Sorted: Shows locations in alphabetical order
```

👥 Team Members & Contributions

| Member | Name | Contribution |
|--------|------|--------------|
| 22UG3-0873 | H.G. PUNARA PUNSISI | Graph Data Structure (Graph.java) |
| 22UG3-0229 | Y.A.D. HASITH ROOSARA | Location and Road Management (Graph.java operations) |
| 22UG3-0557 | PAWAN METHSARA UDUKUMBURA | AVL Tree Implementation (LocationTree.java, AVLNode.java) |
| 22UG3-0203 | RANDIKA LAKSHAN | User Interface & Integration (SmartCityMain.java) |

🔧 Technical Implementation

 Graph Operations
```java
// Adjacency List Representation
HashMap<String, ArrayList<String>> adjacencyList;

// Key Methods
addLocation(String location)
addRoad(String location1, String location2) 
removeLocation(String location)
removeRoad(String location1, String location2)
displayConnections()
```

AVL Tree Operations
```java
// Self-balancing Tree Structure
class AVLNode {
    String location;
    AVLNode left, right;
    int height;
}

// Key Methods
insert(String location)
delete(String location)
traverseInOrder() // for sorted display
balanceTree()
```

 🧪 Testing

Run the application and test with various scenarios:

```bash
# Compile and run
javac *.java
java SmartCityMain

# Test cases to try:
1. Add multiple locations
2. Create complex road networks
3. Test AVL tree balancing with sorted input
4. Remove locations and verify cleanup
5. Check sorted display functionality
```

📊 Performance Characteristics

- Time Complexity:
  - Graph Operations: O(1) average for add/remove, O(V+E) for traversal
  - AVL Tree Operations: O(log n) for insert, delete, and search
- **Space Complexity**: O(V + E) for graph, O(n) for AVL tree

 🤝 Future Enhancements

- GUI interface for visual representation
- Shortest path algorithms (Dijkstra's)
- Real-time traffic data integration
- Database persistence for city data
- Web-based interface using Spring Boot

📝 License

This project is licensed under the MIT License - see the repository for details.

---

Built with ❤️ using Java and advanced data structures for efficient city planning simulations.
