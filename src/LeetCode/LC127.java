package LeetCode;
//ok广度优先搜索
import java.util.ArrayList;
import java.util.List;

public class LC127 {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		int times = 1;
		if(isExistInVocabulary(endWord,wordList))
			wordList.remove(endWord);
		else
			return 0;
		if(!isExistInVocabulary(beginWord,wordList))
			wordList.add(beginWord);
		List<String> list = new ArrayList<String>();
		list.add(endWord);
		return wideSearch(beginWord,list,wordList,times);
    }
	
	public boolean isExistInVocabulary(String str,List<String> wordList) {
		return wordList.contains(str);
	}
	
	public void OOD(String str,List<String> list,List<String> wordList) {
		for(int i = 0;i < wordList.size();i++) {
			int different = 0;
			for(int j = 0;j < str.length();j++) {
				if(wordList.get(i).charAt(j) != str.charAt(j))
					different++;
			}
			if(different == 1) {
				list.add(wordList.get(i));
				wordList.remove(i--);
			}
		}
		
	}
	
	public int wideSearch(String beginWord,List<String> list,List<String> wordList,int times) {
		List<String> newList = new ArrayList<String>();
		for(int i = 0;i < list.size();i++) {
			if(list.get(i).equals(beginWord)) {
				return times;
			}
		}
		for(int i = 0;i < list.size();i++) {
			OOD(list.get(i),newList,wordList);
		}
		if(newList.isEmpty()) {
			return 0;
		}
		times++;
		return wideSearch(beginWord,newList,wordList,times);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC127 lc = new LC127();
		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = new ArrayList<String>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		System.out.println(lc.ladderLength(beginWord, endWord, wordList));
	}

}
