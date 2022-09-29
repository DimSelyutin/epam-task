package by.element.task.appliance.bean.appliance;

import by.element.task.appliance.bean.appliance.bean.computer.Computer;
import by.element.task.appliance.bean.appliance.bean.computer.Notebook;
import by.element.task.appliance.bean.appliance.dao.Data;


public class Main {
    static Data data = new Computer();
    public static void main(String[] args) {
        
        Computer comp = new Computer("Asus", 220, 4, 16, 500);
        System.out.println(comp.toString());
        Computer note = new Notebook("Lenovo",  220, 4, 16, 500, 3500,2);
        System.out.println(note.toString());
    }
}
