//Note: Solution adapted from Leetcode: https://leetcode.com/problems/sort-characters-by-frequency/#/solutions
public class Solution {
    public String frequencySort(String s) {
	//Populate HashMap with words and frequencies
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

	//Initialize heap by defining custom comparator and putting all of Map entries in Heap
	//NOTE: We have to use the type Map.Entry<Character, Integer> so that we keep the characters associated with their counts within the same data entry.
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            new Comparator<Map.Entry<Character, Integer>>() {
                @Override
                public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                    return b.getValue() - a.getValue();
                }
            }
        );
        pq.addAll(map.entrySet());

	//Build String
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry e = pq.poll();
            for (int i = 0; i < (int)e.getValue(); i++) {
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }
}
