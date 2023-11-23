package org.example.bankAccount;

public class Account {
        int code;
        long balance;

        public Account(int code, long balance) {
            this.code = code;
            this.balance = balance;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public long geBalance() {
            return balance;
        }

        public void setBalance(long balance) {
            this.balance= balance;
        }

        @Override
        public String toString() {
            return "Compte{" +
                    "code=" + code +
                    ", solde=" + balance +
                    '}';

        }

}
