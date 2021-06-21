package easy.intersectionoftwoarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,1};
        int[] nums2 = {2,2};

        int[] intersectedArray = intersect(nums1,nums2);

        Arrays.stream(intersectedArray).forEach(n->{
            System.out.println(n);
        });

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> firstArrayMap = new HashMap<>();
        List<Integer> intersectedList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if(!firstArrayMap.containsKey(nums1[i])){
                firstArrayMap.put(nums1[i],1);
            }else {
                firstArrayMap.replace(nums1[i], firstArrayMap.get(nums1[i])+1 );
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if(firstArrayMap.containsKey(nums2[i]) && firstArrayMap.get(nums2[i]) != 0){
                intersectedList.add(nums2[i]);
                firstArrayMap.replace(nums2[i], firstArrayMap.get(nums2[i])-1);
            }
        }

        return intersectedList.stream().mapToInt(i -> i).toArray();
    }
}
