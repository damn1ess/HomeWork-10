public class Main {
    public static void main(String[] args) {
        //Task 1
        String firstName = "Ivan";
        String lastName = "Ivanovich";
        String middleName = "Ivanov";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("Task 1\nФ.И.О. сотрудника — " + fullName);


        //Task 2
        System.out.println("\nTask 2\nФ.И.О. сотрудника — " + fullName.toUpperCase());


        //Task 3
        String anotherFullName = "Иванов Семён Семёнович";
        String anotherFullNameTrue = anotherFullName.replace("ё", "е");
        System.out.println("\nTask 3\nДанные Ф.И.О. сотрудника — " + anotherFullNameTrue);

    }

}
