class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;int sum =0;
        while(i<j){
            if(numbers[i]==numbers[j]) continue;
            sum = numbers[i]+numbers[j];
            if(target == sum){
                return new int[] {(i+1),(j+1)};
            }
            if(target<sum) j--;
            else i++;
        }
        return new int[]{};
    }
}
