public class Solution{
  public HashMap<String, Integer> buildDictionary(String[] book){
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    for(String word: book){
      //Convert to lowercase (lets us count "Dog" and "dog" as the same word)
      word = word.toLowerCase();
      if(word.trim() != ""){ //Filter out whitespace and punctuation with trim()
        if(!map.contains(word)){
          map.put(word, 1);
        }else{
          map.put(word, map.get(word) + 1);
        }
      }
    }
    return map;
  }
}
