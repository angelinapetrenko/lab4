import Entities.Department;
import Entities.Person;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void printPersonsDB(List<Person> persons) {
        for (Person temp : persons) {
            System.out.println(temp.toString());
        }
    }

    private static Department founder(String str, List<Department> departments) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getName().charAt(0) == str.charAt(0)) {
                return departments.get(i);
            }
        }
        Department tmp = new Department(str.charAt(0) - 'A', str);
        departments.add(tmp);
        return tmp;
    }

    private static Person getPersonByStr(String line1, List<Department> departments) throws ParseException {
        String separator = ";";
        String[] line = line1.split(separator);
        return new Person(Long.parseLong(line[0]), line[1], line[2], line[3], Double.parseDouble(line[5]), founder(line[4], departments));
    }

    public static void task() {
        List<Person> persons = new ArrayList<>();
        List<Department> departments = new ArrayList<>();
        String csvFilePath = "C:\\Users\\АНГЕЛИНА\\Documents\\GitHub\\lab4\\lab4\\src\\main\\resources\\foreign_names.csv";

        try {
            CSVReader reader = new CSVReader(new FileReader(csvFilePath));
            String[] nextLine;
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine != null) {
                    String nextLine1 = "";
                    for (int i = 0; i < nextLine.length; i++) {
                        nextLine1 += nextLine[i];
                    }
                    Person temp = getPersonByStr(nextLine1, departments);
                    persons.add(temp);
                }
            }

            printPersonsDB(persons);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        task();
    }
}