package org.example.tpBankAccount;

public class Account {
        private static long accountNb = 0;
        protected long code;
        protected  double balance;

        public Account(long code, double balance) {
            this.code = ++accountNb;
            this.balance = balance;
        }

        public long getCode() {
            return code;
        }

        public void setCode(long code) {
            this.code = code;
        }

        public double geBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance= balance;
        }

        public static long getAccountNb() {
            return accountNb;
        }

        public static void setAccountNb(long accountNb) {
            Account.accountNb = accountNb;
        }


    @Override
        public String toString() {
            return "Compte{" +
                    "code=" + code +
                    ", solde=" + balance +
                    '}';

        }

}
