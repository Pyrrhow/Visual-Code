import java.util.HashMap;
import java.util.Map;

public class Challenge {
    public static String colorizeWordle(String guess, String word) {
        Map<Integer, Character> wordMap = new HashMap<>();
        Map<Integer, Character> guessMap = new HashMap<>();
        Map<Integer, Character> resultMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        // map of the word
        for (int i = 0; i < word.length(); i++) {
            wordMap.put(i, word.charAt(i));
        }
        // map of the guess
        for (int i = 0; i < guess.length(); i++) {
            guessMap.put(i, guess.charAt(i));
        }
      
        // Check for Greens
        for (int i = 0; i < guess.length(); i++) {
            char g = guess.charAt(i);
            char w = word.charAt(i);
          
            if (g == w) {
                resultMap.put(i, 'G');
                wordMap.remove(i);
                guessMap.remove(i);
            }
        }
      
        // Check each letter in the guess
        for (int i = 0; i < guess.length(); i++) {
            char g = guess.charAt(i);
          
            if (guessMap.get(i)!=null) {
              if(wordMap.containsValue(g)) {
                resultMap.put(i, 'Y');
                
                guessMap.remove(i);
                for (int j = 0; j < 5; j++) {
                  if (wordMap.get(j)!=null) {
                    if(wordMap.get(j) == g) {
                      wordMap.remove(j);
                      break;
                    }
                  }
                }
              }
            }
        }
      
      

        // Build result string
        for (int i = 0; i < 5; i++) {
          if(resultMap.get(i) == null){
            sb.append('B');
          }else{
            sb.append(resultMap.get(i));            
          }
        }

        return sb.toString();
    }
}
