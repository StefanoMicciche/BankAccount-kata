import org.example.Account;
import org.junit.jupiter.api.Test;
public class testAccount {
    @Test
    void whenaccountIsCreated_thenBalanceIsZero(){
        Account account = new Account();
        double balance = account.getBalance();
    }
    @Test
    void createAccount(){
        Account account = new Account(1000);

        double balance = account.getBalance();
    }
    @Test
    void whenDepositAccountMustBeInBalance(){
        Account account = new Account(1000);
        account.deposit(500);

        double balance = account.getBalance();

    }
    @Test
    void whenDepositAccountBalanceIsNegative(){
        Account account = new Account(1000);
        account.deposit(-500);

        double balance = account.getBalance();
    }
}
