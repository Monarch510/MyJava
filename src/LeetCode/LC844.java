package LeetCode;
//ok
public class LC844 {
	
	public boolean backspaceCompare(String S, String T) {
	     boolean isSimilar = false;
	     String acs = removeCharacter(S);
	     String act = removeCharacter(T);
	     if(acs.equals(act)) {
	    	 isSimilar = true;
	     }
	     return isSimilar;
	}
	
	public String removeCharacter(String a) {
		String aca = "";
		int index = 0;
		int len = 0;
		for(int i = 0;i < a.length();i++) {
			if(len != 0 && a.charAt(i) != '#') {
				int dl = i - 2 * len;
				if(dl >= index)
					aca += a.substring(index,dl);
				else {
					System.out.println(i + " " + index + " " + len);
					int rl = aca.length() + i - index - 2 * len;
					
					if(rl < 0)
						rl = 0;
					aca = aca.substring(0,rl);
				}
				index = i;
				len = 0;
			}
			
			if(a.charAt(i) == '#') {
				len++;
			}
			
			if(i == a.length() - 1) {
				if(a.charAt(i) == '#') {
					int dl = i - 2 * len + 1;
					if(dl >= index)
						aca += a.substring(index,dl);
					else {
						int rl = aca.length() + i - index - 2 * len + 1;
						if(rl < 0)
							rl = 0;
						aca = aca.substring(0,rl);
					}
				}
				else {
					aca += a.substring(index,i + 1);
				}
			}
		}
		return aca;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC844 lc = new LC844();
		String a = "bxj##tw";
				
		String b = "bxo#j##tw";
		System.out.println(lc.removeCharacter(a));
		System.out.println(lc.removeCharacter(b));
		System.out.println(lc.backspaceCompare(a, b));
	}

}
