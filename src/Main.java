public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mario", "Rossi", 1);

        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Identification Number: " + student.getIdentificationNumber());

        student.setName("Giovanni");
        student.setSurname("Verdi");
        student.setIdentificationNumber(56);

        System.out.println("Updated name: " + student.getName());
        System.out.println("Updated surname: " + student.getSurname());
        System.out.println("Updated identification number: " + student.getIdentificationNumber());
    }
}