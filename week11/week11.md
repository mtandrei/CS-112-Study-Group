#Week 11

#Review Exam (20 min)

##Graph review
- Graph: A set of vertices/nodes and edges that connect them
- An edge indicates a relationshiip between two vertices
- Can be used to represent road networks, friendship, etc.
- Can be stored in two ways
- Adjacency matrix: nxn matrix where a 1 indicates an edge and 0 indicates a lack thereof.
- Adjacency linked list: Array of n linked lists where each list represents a vertex and the vertices to which it connects to
- While the former has faster search, it takes up a LOT of space.
- Two ways to search through a graph: BFS and DFS.
- BFS: Search in "waves" (visit neighbors of a vertex, then the neightbors of the neighbors, etc.). Done with a Queue
- DFS: Go as deep as you can in the graph and then back out. (Done recursively, which implies the use of a stack).
- Both of these take O(|V| + |E|) time.

##Problems

###Given a directed graph, determine if there exists a path between two vertices.
- Implement BFS or DFS
- Recall use of recursion for DFS
- Recall use of queue for BFS
- DFS Solution can be found under Sesh's sakai resources (4/4), BFS attached.

###Cycle detection: Given a directed graph stored as an adjacency linked list, detect if there is a cycle in a graph
- A cycle is defined as a path that starts and ends at a given node (visually this is a loop)
- Which algorithm would be best suited for this? DFS, because if cycles are deep (i.e. span more than 2 or 3 edges), BFS will take a while to discover them.
- Idea: Run a DFS from each vertex and see if we can't find the start node again
- O(V(V+E))
- Other idea: Run a single dfs. If an adjacent node has been visited and is NOT the parent of the current vertex, then we have a cycle.
- O(V+E): One DFS

###Bipartite Graph: Given a graph stored as an adjacency list, determine if the graph is bipartitie, that is, if the vertices in the graph can be partitioned into two disjoint sets where all of the graph's edges connect a vertex in the first set to a vertex in the second set.
- Hint: Another way to think of the problem is seeing if we can color the graph with 2 colors such that adjacent vertices don't have the same color.
- How can we go through our graph?
- Idea: Use BFS or DFS to go through the graph. If using DFS, just color vertices with alternating colors. If using BFS, color a given vertex's neighbor with the opposite color.
- When do we know that we've failed?
- If we've visited a neighboring vertex already and the two vertices (source and neighbor) share the same color, then the graph is NOT bipartite.
- Runtime: O(V + E). Doesn't matter which search we use (attached solution uses BFS).
