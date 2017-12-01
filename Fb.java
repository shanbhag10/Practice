import java.util.*;

class Fb{
	
	public static void main(String[] args){
	String pat = "abab";
	String str = "Pune Mumbai Pune Mumbai ghgh Pune";

	Map<String,Character> pattern = new HashMap<String,Character>();
	char g='a';
	String ptt="";
	String[] sent = str.split(" ");
	//int[] patt=new int[patc.length];
	//char[] a=new char[sent.length];
	for(int i=0;i<sent.length;i++){
		if(!pattern.containsKey(sent[i])){
			pattern.put(sent[i],g);
			ptt = ptt + g;
			g++;
		}
		else{
			ptt= ptt + pattern.get(sent[i]);
		}
	}



		System.out.println(ptt);
	
}
}