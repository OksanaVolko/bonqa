public class Main {
    public static void main(String[] args) {
        int account = 370;// средства на счете
        int refill = 1700; // пополнение счета
        int bonus = refill / 100; // бонусы

        if (refill > 1000) {
            System.out.println("На вашем счете:" + (account + refill + bonus) + "рублей");
            System.out.println("В том числе начислено бонусов:" + bonus + "рублей");
        } else {
            System.out.println("На вашем счете:" + (account + refill) + "рублей");
            System.out.println("В том числе начислено бонусов:" + 0 + "рублей");
        }


    }


}

















































