package Static;

public class Counter {//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

    public class BankAccount {
        private int balance = 0;

        public BankAccount() {
        }

        public void deposit(int amount) {
            if (this.isAmountValid(amount)) {
                this.balance += amount;
            } else {
                System.out.println("유효하지 않은 금액입니다.");
            }

        }

        public void withdraw(int amount) {
            if (this.isAmountValid(amount) && this.balance - amount >= 0) {
                this.balance -= amount;
            } else {
                System.out.println("유효하지 않음 금액이거나 잔액이 부족합니다.");
            }

        }

        public int getBalance() {
            return this.balance;
        }

        private boolean isAmountValid(int amount) {
            return amount > 0;
        }
    }

}
