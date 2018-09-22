/*****************************************************************
* package name - has to correspond with directory name
* имя пакета - должно соответствовать имени каталога
******************************************************************/
package example;

/******************************************************************
 * public class - basic block of code. Its name has to be the same as file name.
 * You could have only one public class per file. базовый блок кода. Его имя
 * 
 * открытый класс - должно совпадать с именем файла. У вас может быть только
 * один открытый класс для каждого файла.
 ********************************************************************/
// person = человек
public class Person {
    /********************************************************
     * Object variables describes its features 
     * Объектные переменные описывают его функции
     */
    // имя
    private String name;
    // фамилия
    private String surname;
    // возраст
    private int age;
    // нравитьсяJava
    private boolean likeJava;
    // страна
    private String country;
    // язык
    private String language; 

    /*
     * Constructor - Instantiate (create) object of this type 
     * Конструктор - создать объект этого типа
     */
    public Person(String name, String surname, int age, boolean likeJava, String country, String language) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.likeJava = likeJava;
        this.country = country;
        this.language = language;
    }

    @Override
    public String toString() {
        if(language.equals("English")){
            return "I speak English. Personal data are:\n{" + " name='" + getName() + "'" + ", surname='" + getSurname() + "'" + ", age='" + getAge() + "'"
                    + ", likeJava='" + getLikeJava() + "'" + ", country='" + getCountry() + "'" + "}";
        }
        else if(language.equals("русский")){
            return "Я говорю по-русски. Личные данные:\n{" + " имя='" + getName() + "'" + ", фамилия='" + getSurname() + "'" + ", возраст='" + getAge() + "'"
                    + ", нравитьсяJava='" + getLikeJava() + "'" + ", страна='" + getCountry() + "'" + "}";
        }
        else{
            return "Nie znam tego języka :( wypisuję dane\n{" + " name='" + getName() + "'" + ", surname='" + getSurname() + "'" + ", age='" + getAge() + "'"
                    + ", likeJava='" + getLikeJava() + "'" + ", country='" + getCountry() + "'" + "}";
        }
        
    }

    /**
     * "Getters" are for reading objects private variables from outside 
     * «Getters» предназначены для чтения частных переменных объектa извне
     */
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getLikeJava() {
        return this.likeJava;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public String getCountry() {
        return this.country;
    }
    

}