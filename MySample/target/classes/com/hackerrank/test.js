/*
 * Complete the function below.
 */

    static TreeSet<String> generatePermutations(int[] telephoneNumber) {
		TreeSet<String> allPermutations=new TreeSet<String>(); // I want unique
																// sorted
																// permutations
HashMap<Integer, String> map = new HashMap<Integer, String>();
map.put(2, "abc");
map.put(3, "def");
map.put(4, "ghi");
map.put(5, "jkl");
map.put(6, "mno");
map.put(7, "pqrs");
map.put(8, "tuv");
map.put(9, "wxyz");
map.put(0, "");

if(digits == null || digits.length() == 0)
return allPermutations;
TreeSet<Character> temp=new TreeSet<Character>();
getString(digits, temp, result, map);
      
      
      	return allPermutations;
    }
public void getString(String digits, TreeSet<Character> temp, TreeSet<String> allPermutations, HashMap<Integer, String> map){
if(digits.length() == 0){
char[] arr = new char[temp.size()];
for(int i=0; i<temp.size(); i++){
arr[i] = temp.get(i);
}
result.add(String.valueOf(arr));
return;
}
Integer curr = Integer.valueOf(digits.substring(0,1));
String letters = map.get(curr);
for(int i=0; i<letters.length(); i++){
temp.add(letters.charAt(i));
getString(digits.substring(1), temp, result, map);
temp.remove(temp.size()-1);
}
}
