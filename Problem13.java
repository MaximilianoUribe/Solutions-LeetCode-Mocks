

class Problem13 {
	public int romanToInt(String s) {
        int[] romanNums = new int[s.length()];
        for(int i = 0; i<s.length(); i++) {
            switch(s.charAt(i)){
                case 'I':
                    romanNums[i] = 1;
                    break;
                case 'V':
                    romanNums[i] = 5;
                    break;
                case 'X':
                    romanNums[i] = 10;
                    break;
                case 'L':
                    romanNums[i] = 50;
                    break;
                case 'C':
                    romanNums[i] = 100;
                    break;
                case 'D':
                    romanNums[i] = 500;
                    break;
                case 'M':
                    romanNums[i] = 1000;
                    break;
            } 
        }
        int sumOfRoman = 0;
        for(int j = romanNums.length-1; j>=0;j--) {
            if(j == 0){
                sumOfRoman = sumOfRoman + romanNums[j];
                break;
            } 
                
            if(romanNums[j]>romanNums[j-1]){
                sumOfRoman = sumOfRoman + (romanNums[j] - romanNums[j-1]);
                j--;
            }else{
                sumOfRoman = sumOfRoman + romanNums[j];
            }
            
        }
        return sumOfRoman;
    }
    
}