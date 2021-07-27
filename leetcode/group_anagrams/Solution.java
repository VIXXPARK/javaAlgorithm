class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map = new HashMap<>();
        for(String word:strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String keyword = new String(chars);
            if(map.containsKey(keyword)){
                (map.get(keyword)).add(word);
            }else{
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(keyword,list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}