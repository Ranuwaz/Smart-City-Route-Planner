# Smart City Route Planner

A Java console application that models a city's transport network using graph data structures.

## Features
- Graph-based city representation (Adjacency List)
- AVL Tree for efficient location management
- Add/remove locations and roads
- Display city connections and locations
- Menu-driven interface

## Team Members
- 22UG3-0873- H.G.PUNARA PUNSISI: Graph Data Structure (Graph.java)
- 22UG3-0229- Y.A.D.HASITH ROOSARA: Location and Road Management (Graph.java operations)  
- 22UG3-0557- PAWAN METHSARA UDUKUMBURA: AVL Tree Implementation (LocationTree.java, AVLNode.java)
- 22UG3-0203  RANDIKA LAKSHAN : User Interface & Integration (SmartCityMain.java)

## How to Run
1. Compile all Java files: `javac *.java`
2. Run the application: `java SmartCityMain`

## Data Structures Used
- **Graph** (Adjacency List with HashMap)
- **AVL Tree** (Self-balancing Binary Search Tree)
- **HashMap & ArrayList** (For efficient data storage)
- **Scanner** (For user input handling)

## Project Structure
- `Graph.java` - Graph operations and city network management
- `LocationTree.java` - AVL tree implementation for location storage
- `AVLNode.java` - Node structure for AVL tree
- `SmartCityMain.java` - Main application with menu interface

## Usage
The application provides a menu system to:
- Add new locations to the city
- Remove existing locations
- Connect locations with roads
- Remove roads between locations
- View all city connections
- Display locations in sorted order (AVL Tree)
