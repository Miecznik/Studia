public class Main {
    public static void main(String[] args) {



        System.out.println("Hello world!");

        Person osoba1 = new Person("Pawel", 30);
        Person osoba2 = new Person("Janusz", 35);

        System.out.println(osoba1.name);

        System.out.println(osoba2.name);

        Dog pies1 = new Dog("Faflunio", "mieszaniec");
        Dog pies2 = new Dog("Jasiek", "Kundel");
        System.out.println(pies1.name);
        pies1.setName("Faflunio2");
        System.out.println(pies1.name);


    }
}