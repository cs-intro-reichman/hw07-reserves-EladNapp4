

public class HashTagTokenizer {

	public static void main(String[] args) {

		String hashTag = args[0];
		String []dictionary = readDictionary("dictionary.txt");
		breakHashTag(hashTag, dictionary);

       //String hashTag = "iLoverecursion";

		//String[] dictionary = readDictionary("dictionary.txt");

		//breakHashTag(hashTag, dictionary);
	}

	public static String[] readDictionary(String fileName) {
		String[] dictionary = new String[3000];

		In in = new In(fileName);

		for ( int i = 0; i < dictionary.length; i++) {
			dictionary[i] = in.readLine();
		}
		return dictionary;
	}

	public static boolean existInDictionary(String word, String[] dictionary) {

		word = word.toLowerCase();
		
		for ( int i = 0; i < dictionary.length; i++) {
			
			if ( dictionary[i] == word )
			    return true;

		}
		return false;
	}

	public static void breakHashTag(String hashtag, String[] dictionary) {
		breakHashTag(hashtag, dictionary, 0, "");
		
	}

	public static void breakHashTag(String hashtag, String[] dictionary, int i, String temp) {

		if (i >= hashtag.length()) {
			return;
		}

		if (hashtag.isEmpty()) {
            return;
        }
 
        //int N = hashtag.length();

		if (existInDictionary(temp, dictionary)) {
		    System.out.println(temp);
			temp = "";
		} else {
			temp += hashtag.charAt(i);
		} 
		breakHashTag(hashtag, dictionary, i++, temp);
    }

}
