class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,n=numbers.length,j=n-1;
        while(i<j){
            if(numbers[i]==numbers[j]) continue;
            if(target == numbers[i]+numbers[j]){
                break;
            }
            else if(target<(numbers[i]+numbers[j])){
                j--;
            }else{
                i++;
            }
        }
        return new int[] {(i+1),(j+1)};
    }
}
