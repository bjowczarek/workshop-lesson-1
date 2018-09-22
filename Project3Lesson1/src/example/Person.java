package example;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean likeJava;
    private String country;
    private String language; 

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