public class Chapter07 {
    public static void main(String[] args) {
        
        int distance;
        distance = (int)(Math.random() * 10);
        
        if (distance <= 5) {
            System.out.println(distance + "km とても近いです");
        } else if (distance <= 10) {
            System.out.println(distance + "km 近いです");
        } else if (distance <= 15) {
            System.out.println(distance + "km 遠いです");
        } else {
            System.out.println(distance + "km とても遠いです");
        }
        
        String color = "red";
        switch(color) {
            case "red" :
                System.out.println("赤信号です");
                break;
            case "yellow" :
                System.out.println("赤信号です");
                break;
            case "blue" :
                System.out.println("赤信号です");
                break;
            default :
                System.out.println("信号の色ではありません");
        }
    }
}