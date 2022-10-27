public class Main {
    public static void main(String[] args) {
        System.out.println(" Здравствуйте!");
        Seller seller = new Seller();
        Delivery delivery = new Delivery();
        Customer customer = new Customer();

        seller.showMenu();
        seller.menuChoice();
        seller.timer();
        System.out.println(" Ваш заказ готов, передаем в доставку ");

        delivery.orderDelivery();
        System.out.println(" Курьер получил заказ");
        seller.timer();
        System.out.println(" Заказ доставлен");
        System.out.println(" Приятного аппетита, пожалуйста оцените сервис от 1 до 10 для его улучшения");

        customer.getOrder();

        System.out.println(" Ждем вас снова!");

    }
}