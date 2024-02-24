import java.util.ArrayList;
public class Algorithms {
    public int numLessThanZero(ArrayList<Integer> nums){
        int count = 0;
        for (int i: nums){
            if (i < 0) count++;
        }
        return count;
    }
    public boolean stringInArray(ArrayList<String> words, String string){
        for (String word: words){
            if (word.equals(string)) return true;
        }
        return false;
    }
    public boolean sameValues(ArrayList<Integer> nums1, ArrayList<Integer> nums2){
        for (int i:nums1){
            for (int n = 0;n < nums2.size();n++){
                if (i == nums2.get(n)) return true;
            }
        }
        return false;
    }
    public int indexOfFirstAppearance(ArrayList<Integer> nums1, int target){
        for (int i = 0; i < nums1.size(); i++){
            if (nums1.get(i) == target) return i;
        }
        return -1;
    }
    public int indexOfFirstAppearanceArray(int[] nums, int target){
        for (int i = 0; i < nums.length;i++){
            if (nums[i] == target) return i;
        }
        return -1;
    }
    public ArrayList<Integer> createTestCase(int[] nums){
        ArrayList<Integer> newNum = new ArrayList<Integer>();
        for (int i: nums){
            newNum.add(i);
        }
        return newNum;
    }
    public ArrayList<String> createTestCase(String[] words) {
        ArrayList<String> newNum = new ArrayList<String>();
        for (String i : words) {
            newNum.add(i);
        }
        return newNum;
    }
}



