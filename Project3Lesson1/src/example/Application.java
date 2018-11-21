/*****************************************************************
* package name - has to correspond with directory name
* имя пакета - должно соответствовать имени каталога
******************************************************************/
package example;

/******************************************************************
* imports - what classes or packages has to be included in our code
* импорт - какие классы или пакеты должны быть включены в наш код
********************************************************************/
import example.Person;

/******************************************************************
* public class - basic block of code. Its name has to be the same as file name.
* You could have only one public class per file. базовый блок кода. Его имя
* 
* открытый класс - должно совпадать с именем файла. У вас может быть только один
* открытый класс для каждого файла.
********************************************************************/
public class Application {
    /********************************************************
    * static class variables are going to be explained later статические переменные
    * класса будут объяснены позже
    *********************************************************/ 
    // CHANGE HERE: write "English" or "русский"
    // ИЗМЕНИТЕ ЗДЕСЬ: напишите "English" или "русский",
    private static String language = "English";
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

     /********************************************************
     * main method - entry point to our application. 
     * основной метод - вход в нашу программу.
     *********************************************************/
    public static void main(String[] args) {
        /********************************************************
         * configuration 
         * конфигурация
         *********************************************************/
        if(args.length!=0){
            Application.language=args[0];
        }

        String[] questions=null;
        switch(Application.language){
            case "English":
                questions=Application.questionsEnglish;
                break;
            case "русский":
                questions=Application.questionsRussian;
                break;
            default:
                questions=Application.questionsRussian;
                break;
        }
        /********************************************************
         * asking questions and collecting responses
         * задавать вопросы и собирать ответы
         *********************************************************/
        System.out.println(questions[0]);
        String name = System.console().readLine();
        
        // asking задавать
        System.out.println(questions[1]);
        // collecting собирать
        String surname = System.console().readLine();

        System.out.println(questions[2]);
        int age = Integer.parseInt(System.console().readLine());

        System.out.println(questions[3]);
        boolean likeJava = Boolean.parseBoolean(System.console().readLine());        

        System.out.println(questions[4]);
        String country = System.console().readLine();

        /********************************************************
         * Instantiation (creation) of type Person object
         * конкретизации объектa типа Person
         *********************************************************/
        Person student = new Person(name, surname, age, likeJava, country, Application.language);
        System.out.println(student);
    }
}