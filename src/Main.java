public class Main {
    public static void main(String[] args) {
        try {
            controller.check("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException exception){
            System.out.println("неверные данные: " + exception.getMessage());
        }
    }
}