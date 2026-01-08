// Given a string s of length n, find all the possible non-empty subsequences of the string s in lexicographically-sorted order.


class Solution {
    
    public void subsets(String ans, String s, int idx, List<String>list ){
        if(idx==s.length()){
            if(ans.length() != 0) list.add(ans);
            return;
        }
        
        char ch=s.charAt(idx);
        subsets(ans+ch,s,idx+1,list); //pick
        subsets(ans,s,idx+1,list); //skip
        
    }
    
    public List<String> AllPossibleStrings(String s) {
        
        List<String>list = new ArrayList<>();
        subsets("", s,0,list);
        Collections.sort(list);     // for lexicographically order
        
        return list;
        
    
    }
}