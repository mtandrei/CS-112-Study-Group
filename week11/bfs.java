//NOTE: We assume that the graph is stored as an adjacency list
public static boolean search(Graph g, Node start, Node end){
  Queue<Node> q = new Queue<Node>();

  //Mark all nodes as unviisted
  for(Node u: g.getNodes()){
    u.visited = false;
  }
  
  //Enqueue start vertex
  start.visited = true;
  q.enqueue(start);
  Node temp;

  //Keep going until there are no more neighbors to visit
  while(!q.isEmpty()){
    temp = q.dequeue();
    if(temp != null){
      for(Node v: u.getAdjacent()){
        if(v.visited && v == end){ //found target
          return true;
        }

        //if not seen, mark it as visited and enqueue
        if(!v.visited){
          v.visited = true;
          q.enqueue(v);
        }
        temp.visited = true;
      }
    }
  }
  //if we've gone through everything and haven't return true, then no such path exists
  return false;
}
