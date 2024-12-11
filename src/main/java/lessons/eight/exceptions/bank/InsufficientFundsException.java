package lessons.eight.exceptions.bank;
/*     3. **Создайте пользовательское исключение InsufficientFundsException:**
        - Этот класс должен наследоваться от Exception и принимать сообщение в конструкторе.
*/
public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message) {
        super(message);
    }
}
