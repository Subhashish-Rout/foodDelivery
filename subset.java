public class subset {
    public static void main(String[] args) {
        String s = "011011110010111";
        int max = 0 ;
        int count = 0;
        for(int i = 1 ; i< s.length(); i++){
            
            if(s.charAt(i)=='1' && s.charAt(i-1)=='1'){
                count++;
                // System.out.println("hi");
            }else{
                count=0;
            }
            max = Math.max(count, max);
        }
        System.out.println(max+1);
    }
}
