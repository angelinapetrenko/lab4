/**
 * Класс подразделения
 */
public class Department {
    private long id;
    private String name;

    /**
     * Констуктор класса
     * @param id - номер подразделения
     * @param name- название
     */
    public Department(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * геттер для названия подразделения
     * @return name- название подразделения
     */
    public String getName() {
        return name;
    }

}
