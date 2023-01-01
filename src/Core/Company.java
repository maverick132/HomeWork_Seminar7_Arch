import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Company {
    private String name;
    private String address;
    private ArrayList<Worker> workers;
    private int capital;
    private int income;

    public Company(){
        for (int i = 0; i < 10; i++) {
            workers.add(new Worker());
        }
        Random rd = new Random();
        this.capital = rd.nextInt(100000);
        this.income = rd.nextInt(1000000);
    }




}
