
// T.C => O(n)
// S.C => O(1)

// Optimization

class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five = 0, ten = 0;

        for(int bil : bills) {

            if(bil == 5) {
                five++;
            }
            else if(bil == 10) {
                if(five > 0) {
                    five--;
                    ten++;
                }
                else return false;
            }
            else {
                if(five > 0 && ten > 0) {
                    five--;
                    ten--;
                }
                else if(five > 2) {
                    five = five - 3;
                }
                else return false;
            }
        }
        return true;
    }
}

//- Time complexity: O(n^2) in the worst case.
//- Space complexity: O(n)
// Brute Force 

class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < bills.length; i++) {

            if(bills[i] == 5) {
                list.add(5);
            }
            else if(bills[i] == 10) {
                if(!list.contains(5)) {
                    return false;
                }
                else {
                    list.remove((Integer)5);
                    list.add(10);
                }
            }
            else {
                
                if(list.contains(10) && list.contains(5)) {
                    list.remove((Integer)5);
                    list.remove((Integer)10);
                }
                else if(Collections.frequency(list, 5) >= 3) {
                    list.remove((Integer)5);
                    list.remove((Integer)5);
                    list.remove((Integer)5);
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
