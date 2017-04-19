#Week 12

##Review of Djikstra's Algorithm
- Purpose: Find the shortest path to a vertex in a graph.
- Idea: Assign tentative distances to vertices and mark vertices as DONE once we know that we've found a shortest path to that vertex.
- When is this the case?
- When a vertex has the minimal tentative distance among all unvisited vertices, we know that we've found the shortest path.
- Why? Because if there was a shorter path, it would be through one of the other unvisited vertices, which would mean that a different vertex would have the miminal distance.
- We keep removing vertices until we've visited the target node.
- Runtime: O(E + Vlog(V)) Why?
- We visit each vertex at most once and we retrieve it from a min-heap AND we visit each vertex at most once.

##Problems

###Graph cycle: Given a graph, design an algorithm to detect if there is a cycle in the graph.
- Recall the definition of a cycle: A path within a graph which starts and ends at the same vertex.
- What algorithm allows us to SEARCH through a graph?
- Can use BFS or DFS (Which one would be better?)
- If a cycle takes up a lot of edges OR the graph is sparse, DFS is good. If the graph is dense and we expect the cycles to be shorter, BFS might be better.
- Idea: Run a search starting from each vertex with that vertex as the target. If a search returns true, return true. Otherwise, return false
- Exercise: Try to code this solution. Then, try to return all of the cycles found (What additional information would we need?)

###Evaluate division: Given a set of equations of the form a/b and corresponding values and a set of queries, evaluate the queries. Assume for simplicity that there are no invalid queries (i.e. no division by zero, etc.)
- Example: Suppose a / b = 2.0 and b / c = 3.0 and our queries are a / c, b / a, and a / e. We can compute a / c as 6 and b / a as .5, but there is no valid way to compute a / e, so we return an error (say -1.0).
- How can we use the information that we've gone over so far to model this situation?
- Model: Think of the individual variables as vertices in a graph, an equation as an edge, and the value as an edge weight.
- Idea: Given a query (i.e. a / c), we can perform a DFS and use the path between 2 nodes.
- If DFS fails, no way to compute the value so return -1.0
- Runtime: With q queries, it's O(q*V + q*E)
