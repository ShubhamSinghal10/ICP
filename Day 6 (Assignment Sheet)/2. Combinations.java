
// T.C => O(C(n, k) * k)
// S.C => O(C(n, k) * k)

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> l = new ArrayList<>();

        helper(1, n, k, l, list);

        return list;
    }

    public void helper(int idx, int n, int k, List<Integer> l, List<List<Integer>> list) {

        if(k == 0) {
            list.add(new ArrayList<>(l));
            return;
        }

        for(int i = idx; i <= n; i++) {

            l.add(i);

            helper(i+1, n, k-1, l, list);

            l.remove(l.size()-1);
        }
    }
}
