public class Delivery extends Seller {
    String order;
    String chequeOrder;


    public void orderDelivery() {
        String order = orderNum + numberItem;
        String orderInfo = orderNum + street + house + flat;

        timer();

        if (numberItem == 1) {
            double cheque = 0;
            double chequeOrder = cheque + 100;
        } else if (numberItem == 2) {
            double cheque = 0;
            double chequeOrder = cheque + 160;
        } else if (numberItem == 3) {
            double cheque = 0;
            double chequeOrder = cheque + 210;
        }
    }
}

