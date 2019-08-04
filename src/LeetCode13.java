
/**
 * @Author shilikun
 * @date 2019/08/04
 * <p>
 * Describe: LeetCode13
 */
public class LeetCode13 {
    public static void main(String[] args) {
        LeetCode13 leetCode13 = new LeetCode13();
        int mcmxciv = leetCode13.romanToInt("III");
        System.out.println(mcmxciv);
    }
    public int romanToInt(String s) {
        int[] ints = toInt(s);
        int sum = getNumber(ints);
        return sum;
    }

    private int getNumber(int[] ints) {
        int sum = 0;
        for(int i = 0;i<ints.length;i++){
            if(i==ints.length-1){
                sum = sum + ints[i];
            }else{
                if(ints[i]<ints[i+1]){
                    sum = sum + ints[i+1]-ints[i];
                    i++;
                }else{
                    sum = sum + ints[i];
                }
            }

        }
        return sum;
    }

    private int[] toInt(String s) {
        char[] chars = s.toCharArray();
        int[] ints = new int [chars.length];
        for (int i = 0; i<chars.length;i++){
            switch (chars[i]){
                case 'I':ints[i]=1;break;
                case 'V':ints[i]=5;break;
                case 'X':ints[i]=10;break;
                case 'L':ints[i]=50;break;
                case 'C':ints[i]=100;break;
                case 'D':ints[i]=500;break;
                case 'M':ints[i]=1000;break;
            }
        }
        return ints;
    }
}
