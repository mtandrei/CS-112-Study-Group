//Solution adapted from leetcode.com
public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
   
    //Create HashMap
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) { //Check if the current number's difference matches a number in our table
            result[1] = i + 1;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i + 1);
    }
    return result;
}
