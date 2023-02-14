public class Main {
    public static void main(String[] args) {
        int x = 370;// средства на счете
        int y = 1700; // пополнение счета
        int t = y / 100; // бонусы

        if (y > 1000) {
            System.out.println("На вашем счете:" + (x + y + t) + "рублей");
            System.out.println("В том числе начислено бонусов:" + t + "рублей");
        } else {
            System.out.println("На вашем счете:" + (x + y) + "рублей");
            System.out.println("В том числе начислено бонусов:" + 0 + "рублей");
        }


    }


}

















































