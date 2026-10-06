class Solution {
    public boolean lemonadeChange(int[] bills){
        int change = 0;
        int five = 0;
        int ten = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                five++;
                change += 5;
            }
            else if(bills[i] == 10){
                if(five == 0){
                    return false;
                }
                five--;
                ten++;
                change -= 5;
            }
            else{
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                    change -= 15;
                }
                else if(five >= 3){
                    five -= 3;
                    change -= 15;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}