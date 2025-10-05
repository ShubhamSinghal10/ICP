
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> l = new ArrayList<>();
        Arrays.sort(candidates);

        sum(candidates, 0, target, l, list);

        return list;
    }

    public void sum(int[] arr, int idx, int target, List<Integer> l, List<List<Integer>> list) {

        if(target == 0) {
            list.add(new ArrayList<>(l));
            return;
        }

        for(int i = idx; i < arr.length; i++) {

            if(i > idx && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            l.add(arr[i]);

            sum(arr, i+1, target-arr[i], l, list);

            l.remove(l.size()-1);
        }
    }
}
