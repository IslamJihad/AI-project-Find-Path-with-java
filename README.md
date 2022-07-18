# AI-project-Find-Path-with-java
Search Algorithms for Route Navigation


We have a graph with each node representing a location (City) in 
Palestine. The directed edge between nodes(A B) represents the existence of a path 
between A and B and the link is labelled by the cost of moving from A to B by car 
(CarDist(A,B). One of the nodes is a start node (S) and another is the goal (G). 
For each pair of nodes we have: CarDist(A,B), WalkDist(A,B) plus for each node n we 
have h1(n): the aerial (straight line distance) between n and G, which is an admissible 
heuristic. Another heuristic h2(n) is the Walking distance from n to G. Clearly, h2
dominates h1. So for each city pair we have W,X,Y are street distance (km), Aerial 
distance (km), Walking Distance (KM). One of the nodes is start node. One or more are 
goal nodes (e.g. A is start, D,E are goals)
