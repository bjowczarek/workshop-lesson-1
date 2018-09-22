package example;

import example.Person;

public class Application {
    // English, русский
    private static String language = "русский";
    private static String[] questionsEnglish = {
        "What is your name?",
        "What is your surname?",
        "How old are you?",
        "Do you like Java? (true, false)",
        "Where are you from?"
    };
    private static String[] questionsRussian = { 
        "Как вас зовут?",
        "Какая у тебя фамилия?",
        "Сколько тебе лет?",
        "Вам нравится Java? (Напиши \"true\", если да и \"false\", если нет.)",
        "Откуда вы?"
     };

    public static void main(String[] args) {
        String[] questions=Application.language.equals("English")?Application.questionsEnglish:Application.questionsRussian;
        
        System.out.println(questions[0]);
        String name = System.console().readLine();
        
        System.out.println(questions[1]);
        String surname = System.console().readLine();

        System.out.println(questions[2]);
        int age = Integer.parseInt(System.console().readLine());

        System.out.println(questions[3]);
        boolean likeJava = Boolean.parseBoolean(System.console().readLine());        

        System.out.println(questions[4]);
        String country = System.console().readLine();

        Person student = new Person(name, surname, age, likeJava, country, Application.language);
        System.out.println(student);
    }
}