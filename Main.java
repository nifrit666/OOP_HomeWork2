import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Создаем Животных
        Cat cat = new Cat("Тыгыдык", LocalDate.of(2023, 6, 6), new ArrayList<>(), "Чумка", "Баюн", 4);
        Duck duck = new Duck("Дафи", LocalDate.of(2022, 5, 3), new ArrayList<>(), "Фу, какая гадость", "Дак");
        Penguin penguin = new Penguin("Ковальски", LocalDate.of(2007, 6, 26), new ArrayList<>(), "Фу, какая гадость", "Прапор");
        Animal eagle = new Eagle("Кеша", LocalDate.of(2003, 6, 6), new ArrayList<>(), "Чумка", "Вовка");
        Fish fish = new Fish("Немо", LocalDate.of(2006, 2, 6), new ArrayList<>(), "Фу, какая гадость", "Фишман");

        // Сохраняем Животных
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(eagle);
        animals.add(penguin);
        animals.add(duck);
        animals.add(fish);

        // Создаем Клинику
        VeterinaryClinic clinic = new VeterinaryClinic();

        // Создаем Мед персонал
        Doctor ivanov = new Doctor("Ivanov", LocalDate.of(1973, 8, 2), "Институт Склифасовского");
        Nurse dariya = new Nurse("Dariya", LocalDate.of(1983, 5, 7), "Школа фельдшеров");
        Nurse marina = new Nurse("Marina", LocalDate.of(1993, 3, 1), "Курсы Медсестёр");

        //Печатаем персонал
        System.out.println(ivanov.name);
        System.out.println(dariya.name);
        System.out.println(marina.name);

        //Печатаем пациентов
        clinic.addPatients(cat, eagle, penguin, duck, fish);
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoables());
        System.out.println(clinic.getFlyables());
        System.out.println(clinic.getSwimbles());
    }
}