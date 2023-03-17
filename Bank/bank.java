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
