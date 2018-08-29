class search{
	static int forceSearch(String text,String pat){
		int csr_text = 0;
		int csr_pat = 0;
		
		while(csr_text != text.length() && csr_pat != pat.length()){
			if(text.charAt(csr_text) == pat.charAt(csr_pat)){
				csr_text++;
				csr_pat++;
			}
			else{
				csr_text = csr_text - csr_pat + 1;
				csr_pat = 0;
			}
		}
		
		if(csr_pat == pat.length()){
			return csr_text - csr_pat;
		}
		else{
			return -1;
		}
	}
}
