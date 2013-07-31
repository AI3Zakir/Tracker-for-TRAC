package test.java.itattractor.forms;

import test.java.itattractor.ConnectionProvider;
import test.java.itattractor.forms.tasks.TasksForm;

import javax.swing.*;

public class TasksFormUsageExample {
    public static void main(String[] args) {
        ConnectionProvider provider = new ConnectionProvider("http://tracker-trac.demo.esdp.it-attractor.net/", "beknazar", "beknazar31");
        JFrame frame = new JFrame("tasks form");
        TasksForm tasksForm = new TasksForm(provider);
        frame.add(tasksForm.getContentPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setVisible(true);
    }
}
