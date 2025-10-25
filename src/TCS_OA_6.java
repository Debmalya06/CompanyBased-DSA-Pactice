import java.util.ArrayList;
import java.util.List;

public class TCS_OA_6 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        List<Integer> temp= new ArrayList<Integer>();
        findsubset(temp,arr,0,ans);
        for (List<Integer> subset : ans) {
            System.out.println(subset);
        }
    }


    private static void findsubset(List<Integer> temp, int[] arr,int i, List<List<Integer>>ans) {
        if (arr.length == i) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        //incliude->i
        temp.add(arr[i]);
        findsubset(temp,arr,i+1,ans);
        //backtracking
        temp.removeLast();
        //ecluded->i
        findsubset(temp,arr,i+1,ans);
    }
}
