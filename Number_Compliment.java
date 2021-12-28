class Solution {
    public int findComplement(int num) {
        if(num == 0){
            return 1;
        }
       int num_bits =(int)(Math.log(num)/Math.log(2))+1;   //counting bits of the given number
        int mask = (1<<num_bits)-1;                        // creating a mask of 1s for the given number of bits
        return num^mask;                                   // XORing with the mask (XORing a bit with 1 flips the bit, compliment of a number needs bits to be fliped)
    }
}
