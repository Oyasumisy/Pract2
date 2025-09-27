public class Main {
    public static void main(String[] args) {

        User user1 = new User("U001", "Артем Ракітенко", "artem@email.com",
                "regular", "verified", 1500.50, "Transaction history...");

        Currency btc = new Currency("BTC", "Bitcoin", 8, 0.0001, 100.0, 45000.0);
        Currency uah = new Currency("UAH", "Українська гривня", 2, 10.0, 100000.0, 1.0);

        Operation operation = new Operation("OP001", "general", "completed",
                "U001", "UAH", 1000.0, 10.0);

        Transfer transfer = new Transfer("T001", "transfer", "pending",
                "U001", "UAH", 500.0, 5.0, "U002");

        Deposit deposit = new Deposit("D001", "deposit", "completed",
                "U001", "BTC", 0.1, 0.001, "abc123hash");

        Withdrawal withdrawal = new Withdrawal("W001", "withdrawal", "processing",
                "U001", "UAH", 200.0, 2.0, "UA123456789");

        Exchange exchange = new Exchange("E001", "exchange", "completed",
                "U001", "UAH", 1000.0, 10.0, 0.000022, "BTC");

        System.out.println("=== Демонстрация объектов криптобанкинга ===\n");

        System.out.println("1. Користувач:");
        System.out.println(user1.toString());

        System.out.println("\n2. Валюта (BTC):");
        System.out.println(btc.toString());

        System.out.println("\n3. Валюта (UAH):");
        System.out.println(uah.toString());

        System.out.println("\n4. Базова операція:");
        System.out.println(operation.toString());

        System.out.println("\n5. Переказ:");
        System.out.println(transfer.toString());

        System.out.println("\n6. Поповнення:");
        System.out.println(deposit.toString());

        System.out.println("\n7. Виведення:");
        System.out.println(withdrawal.toString());

        System.out.println("\n8. Обмін:");
        System.out.println(exchange.toString());
    }
}