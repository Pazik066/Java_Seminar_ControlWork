public class Sem5 {
    public static void main(String[] args) {
        Passports passports = new Passports();
        passports.add("123456","Иванов");
        passports.add("321456","Васильев");
        passports.add("234561","Петрова");
        passports.add("234432","Иванов");
        passports.add("654321","Петрова");
        passports.add("345678","Иванов");
        System.out.println(passports.getByPassNum("321456"));
        System.out.println(passports.getByLastName("Иванов"));
        System.out.println(passports.getAll());
    }
    static void task0(){

    }
}

