package Segundo_Parcial;

public class RemindersTester {
    public static void main(String[] args) {
        Reminders reminders = new Reminders();
        reminders.addTask("ITBA", "Consultar Intercambio");
        reminders.addTask("ITBA", "Entregar el TPE");
        reminders.addTask("Casa", "Llamar Electricista");
        reminders.addTask("Casa", "Cambiar filtro");
        reminders.addTask("Casa", "Pagar Expensas");
        System.out.println("----------");
        for(String task : reminders.tasks("Casa")) {
            System.out.println(task);
        }
        System.out.println("----------");

        for(String task : reminders.tasks()) {
            System.out.println(task);
        }
        System.out.println("----------");

        reminders.done("Casa", "Pagar Expensas");

        for(String task : reminders.pendingTasks("Casa")) {
            System.out.println(task);
        }
        System.out.println("----------");

        reminders.done("ITBA");
        System.out.println(reminders.pendingTasks("ITBA").isEmpty()); // true
        System.out.println("----------");
        try {
            reminders.tasks("Trabajo");
        } catch (CategoryNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("----------");
    }
}
