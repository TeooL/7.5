import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        Algorithms a = new Algorithms();
        ArrayList<Integer> testcase1 = a.createTestCase(new int[]{-1,0,1});
        ArrayList<Integer> testcase2 = a.createTestCase(new int[]{-1,-2,1});
        ArrayList<Integer> testcase3 = a.createTestCase(new int[]{1,2,3});
        System.out.println(a.numLessThanZero(testcase1));
        System.out.println(a.numLessThanZero(testcase2));
        System.out.println(a.numLessThanZero(testcase3));

        ArrayList<String> testcase4 = a.createTestCase(new String[]{"String"});
        ArrayList<String> testcase5 = a.createTestCase(new String[]{"word","four"});
        ArrayList<String> testcase6 = a.createTestCase(new String[]{"five","six","seven"});
        System.out.println(a.stringInArray(testcase4, "string"));
        System.out.println(a.stringInArray(testcase5, "four"));
        System.out.println(a.stringInArray(testcase6, "six"));

        ArrayList<Integer> testcase7 = a.createTestCase(new int[]{1,2});
        ArrayList<Integer> testcase8 = a.createTestCase(new int[]{2,3});
        ArrayList<Integer> testcase9 = a.createTestCase(new int[]{1,2,5});
        ArrayList<Integer> testcase10 = a.createTestCase(new int[]{4,3,1});
        ArrayList<Integer> testcase11 = a.createTestCase(new int[]{5,4,6});
        ArrayList<Integer> testcase12 = a.createTestCase(new int[]{2,3,7});
        System.out.println(a.sameValues(testcase7,testcase8));
        System.out.println(a.sameValues(testcase9,testcase10));
        System.out.println(a.sameValues(testcase11,testcase12));

        ArrayList<Integer> testcase13 = a.createTestCase(new int[]{1,2,3});
        ArrayList<Integer> testcase14 = a.createTestCase(new int[]{4,5,6,2,1});
        ArrayList<Integer> testcase15 = a.createTestCase(new int[]{3,4,2,5});
        System.out.println(a.indexOfFirstAppearance(testcase13, 2));
        System.out.println(a.indexOfFirstAppearance(testcase14, 1));
        System.out.println(a.indexOfFirstAppearance(testcase15, 4));

        int[] testcase16 = new int[]{1,2,3};
        int[] testcase17 = new int[]{1,5,7};
        int[] testcase18 = new int[]{5,8,1,4};
        System.out.println(a.indexOfFirstAppearanceArray(testcase16,2));
        System.out.println(a.indexOfFirstAppearanceArray(testcase17,4));
        System.out.println(a.indexOfFirstAppearanceArray(testcase18,4));

    }
}

