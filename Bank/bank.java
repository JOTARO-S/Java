class Account {
    int balance; //残高
    double rate; //利率
    String password; //パスワード
    
    boolean withdraw(int money) { //引数で指定された金額のmoneyを引き出す
        if (balance < money) {
            return false;
        } else {
            balance -= money;
            return true;
        }
    }
    
    void calc_interest(int annual) {//フィールドの利率を適用して引数で指定された年数分の利息を計算し、残高に反映させる
        balance += balance * rate * annual;
    }
    
    boolean authenticate(String keybordInput) { // 引数で指定されたパスワードとフィールドのパスワードが一致するか判定する
        if (password.equals(keybordInput)) {
            return true;
        } else {
            return false;
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account tanaka = new Account();
        int flag; //パスワードが通ったか
        String keyboardInput;
        int money; //引落したい金額
        tanaka.balance = 100000;
        tanaka.rate = 0.03;
        tanaka.password = "888-888";
        
        // テスト1
        
        money = 9800;
        keyboardInput = "888-888";
        
        System.out.println("tanakaの残高は[" + tanaka.balance + "]円です。");
        System.out.println("tanakaの利率は[" + (tanaka.rate * 100) + "]%です。");
        System.out.println("tanakaのパスワードとして[" + keyboardInput + "]を入力しました。");
        if (tanaka.authenticate(keyboardInput) == true) {
            System.out.println("tanakaの認証に成功しました。");
            flag = 1;
        } else {
            System.out.println("tanakaの認証に失敗しました。");
            flag = 0;
        }
        if (flag == 1) {
            tanaka.withdraw(money);
            System.out.println(money + "円の引き出しに成功しました。");
        } else {
            System.out.println(money + "円の引き出しに失敗しました。");
        }
        System.out.println("残高は" + tanaka.balance + "円です。");
        System.out.println();
        
        // テスト2
        
        money = 30000;
        keyboardInput = "880-880"; //間違える
        
        System.out.println("tanakaの残高は[" + tanaka.balance + "]円です。");
        System.out.println("tanakaの利率は[" + (tanaka.rate * 100) + "]%です。");
        System.out.println("tanakaのパスワードとして[" + keyboardInput + "]を入力しました。");
        if (tanaka.authenticate(keyboardInput) == true) {
            System.out.println("tanakaの認証に成功しました。");
            flag = 1;
        } else {
            System.out.println("tanakaの認証に失敗しました。");
            flag = 0;
        }
        if (flag == 1) {
            tanaka.withdraw(money);
            System.out.println(money + "円の引き出しに成功しました。");
        } else {
            System.out.println(money + "円の引き出しに失敗しました。");
        }
        System.out.println("残高は" + tanaka.balance + "円です。");
        System.out.println();
    }
}