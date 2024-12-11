package lessons.eight.exceptions.customers;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class CustomerStorage
{
    private HashMap<String, Customer> storage;

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public void addCustomer(String data)
    {
        String[] components = data.split("\\s+");
        if(components.length != 4){
            throw new IllegalArgumentException("Wrong format. Correct format: \n"+
                    "add Василий Петров vasily_petrov@gmail.com +79215637722");
        }


        if (!Pattern.matches("^\\+7\\d{10}$",components[3])) {
            throw new InputMismatchException("Wrong phone number. Please repeat add operation and use right format.");
        }

        if (!Pattern.matches("^[a-zA-Z0-9_.]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$",components[2])) {
            throw new InputMismatchException("Wrong email. Please repeat add operation and use right format.");
        }

        String name = components[0] + " " + components[1];
        storage.put(name, new Customer(name, components[3], components[2]));
    }

    public void listCustomers()
    {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name)
    {
        storage.remove(name);
    }

    public int getCount()
    {
        return storage.size();
    }
}