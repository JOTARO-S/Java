public class Chapter06 {
    public static void main(String[] args) {
        
        int val = 2 + 5;
        System.out.println("2 + 5 = " + val);
        
        val++;
        System.out.println("val = " + val);
        
        val *= 5;
        System.out.println("val * 5 = " + val);
        
        boolean bool = (val ==  50);
        System.out.println("val は 50 と等しいか？ ⇒ " + bool);
        
        bool = (val < 50) && (val % 10 == 0);
        System.out.println("val は 50 よりも小さい かつ val を 10 で割った余りが 0 ⇒ " + bool);
    }
}
