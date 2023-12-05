package Entities;

import Entities.Department;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Entities.Person - класс для хранения данных о человеке
 */
public class Person {
    private long id;
    private String lastName;
    private String gender;
    private Date birthday;
    private double salary;
    private Department department;

    /**
     *
     * @param id - id человека
     * @param lastName - фамилия
     * @param gender - пол
     * @param birthday - дата рождения
     * @param salary - зарплата
     * @param department - подразделение
     * @throws ParseException - ошибка парсинга
     */
    public Person(long id, String lastName, String gender, String birthday, double salary, Department department) throws ParseException {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = new SimpleDateFormat("dd.MM.yyyy").parse(birthday);
        this.salary = salary;
        this.department = department;
    }

    /**
     * getId - геттер для id
     * @return id - номер
     */
    long getId(){
        return id;
    }

    /**
     * геттер для фамилии
     * @return lastName - фамилия
     */
    String getLastName(){
        return lastName;
    }
    /**
     * геттер для пола
     * @return gender - пол
     */
    String getGender(){
        return gender;
    }
    /**
     * геттер для подразделения
     * @return department - подразделение
     */
    Department getDepartment(){
        return department;
    }
    /**
     * геттер для зарплаты
     * @return salary - зарплаты
     */
    double getSalary(){
        return salary;
    }
    /**
     * геттер для даты рождения
     * @return birthday - дата рождения
     */
    Date getBirthday(){
        return birthday;
    }
    /**
     * метод для преобразования данных класса к строке
     * @return  - полученная строка
     */
    public String toString(){
        return "id = " + getId() + ", lastName=" + getLastName() + ", gender=" + getGender() + ", birthday=" + getBirthday() + ", department=" + getDepartment().getName() + ", salary= " + getSalary();
    }
}
