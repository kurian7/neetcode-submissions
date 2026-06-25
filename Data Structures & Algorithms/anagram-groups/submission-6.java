class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> ana = new HashMap<>();
        for( String s: strs){
            int[] arr = new int [26];
            for(char c : s.toCharArray()){
                arr[c-'a']++;              
            }
            StringBuilder sb = new StringBuilder();
            for(int i:arr){
                sb.append(i).append('#');
            }
            String key = sb.toString();
            if(!ana.containsKey(key)){
                ana.put(key, new ArrayList<>());
            }
            ana.get(key).add(s);
        }
        return new ArrayList<>(ana.values());
    }
}
