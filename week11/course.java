//Solution using DFS: Adapated from leetcode.com
public class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
	    //Build an adjacency list from the prereqs
            ArrayList[] graph = new ArrayList[numCourses];
            for(int i=0;i<numCourses;i++)
                graph[i] = new ArrayList();
                
            boolean[] visited = new boolean[numCourses];
            for(int i=0; i<prerequisites.length;i++){
                graph[prerequisites[i][1]].add(prerequisites[i][0]);
            }
	    
   	    //Run DFS and see if everything can be reached
            for(int i=0; i<numCourses; i++){
                if(!dfs(graph,visited,i))
                    return false;
            }
            return true;
        }

	//DFS Helper
        private boolean dfs(ArrayList[] graph, boolean[] visited, int course){
	    //If visited, then we know that there exists a cycle/codependence
            if(visited[course])
                return false;
            else
                visited[course] = true;;

	    //Recursive calls to DFS
            for(int i=0; i<graph[course].size();i++){
                if(!dfs(graph,visited,(int)graph[course].get(i)))
                    return false;
            }
            visited[course] = false;
            return true;
        }
    }
