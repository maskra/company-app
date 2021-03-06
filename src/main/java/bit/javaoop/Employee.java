package bit.javaoop;

public class Employee extends AbstractEmployee {

    public Employee(String name, double salary) {
        super(name, salary);
    }

    public boolean isSatisfied() {
        return getSalary() > 10_000;
    }

    @Override
    public String toString(int line) {
        String result = new String();
        for (int i = 0; i < line; i += 1)
            result += '\t';
        result += '\t';
        result += getName() + " - Employee\n";
        return result;
    }

}
