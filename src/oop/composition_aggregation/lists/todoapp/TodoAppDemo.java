package oop.composition_aggregation.lists.todoapp;


import java.util.ArrayList;
import java.util.Scanner;

public class TodoAppDemo {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<TodoItem> todos = new ArrayList<>();
        showMenu();
        TodoMenu selectedMenu = readMenu();

        while (selectedMenu != TodoMenu.EXIT) {
            switch (selectedMenu) {
                case ADD -> addNewTodo(todos);
                case MODIFY -> modifyTodo(todos);
                case REMOVE -> removeTodo(todos);
                case FIND_ONE -> findOne(todos);
                case FIND_ALL -> findAll(todos);
                case CLEAR_ALL -> clearAll(todos);
            }
            showMenu();
            selectedMenu = readMenu();
        }

        System.out.println("Aplikacioni po mbyllet!");

    }

    private static void findAll(ArrayList<TodoItem> todos) {
        System.out.println("Lista me todos");
        System.out.println("---------------------------------------------------");
        int index = 0;
        for (TodoItem todo : todos) {
            System.out.printf("#%d. %s%n", index, todo);
            index++;
        }
        System.out.println("---------------------------------------------------");
        System.out.printf("Total todos: %d%n", todos.size());
        System.out.println("---------------------------------------------------");
    }

    private static void clearAll(ArrayList<TodoItem> todos) {
        System.out.println("A je i sigurt qe deshironi me i fshi te gjitha todos: " + todos.size());
        System.out.println("Shkruaj PO per vazhdim, tjeter per pishmanllek!");
        String response = reader.nextLine();
        if (response.equalsIgnoreCase("PO"))
            todos.clear();
        else
            System.out.println("Haxhi Pishmani!");
    }


    private static void findOne(ArrayList<TodoItem> todos) {
        findAll(todos);
        TodoItem item = findByIndex(todos);
        if (item != null) {
            System.out.println("Ju keni zgjedhur: ");
            System.out.println(item);
            System.out.println("-----------------------------------");
        }
    }

    private static void removeTodo(ArrayList<TodoItem> todos) {
        findAll(todos);
        TodoItem item = findByIndex(todos);
        if (item != null) {
            todos.remove(item);
        }
    }

    private static void modifyTodo(ArrayList<TodoItem> todos) {
        findAll(todos);
        TodoItem item = findByIndex(todos);

        if (item != null) {
            item.setCompleted(!item.isCompleted());
        }
    }

    private static TodoItem findByIndex(ArrayList<TodoItem> todos) {
        System.out.println("Zgjedh njeren nga todo sipas numrit #: ");
        int index = Integer.parseInt(reader.nextLine());

        if (index >= 0 && index < todos.size()) {
            return todos.get(index);
        } else {
            System.out.println("Jasht rangut!");
        }
        return null;
    }

    private static void addNewTodo(ArrayList<TodoItem> todos) {
        System.out.println("Shkruaj titullin e todos: ");
        String title = reader.nextLine();
        TodoItem newTodo = new TodoItem(title);
        todos.add(newTodo);
    }

    private static TodoMenu readMenu() {
        System.out.println("Shkruaj opsionin qe po e zgjedhni (numer): ");
        int index = Integer.parseInt(reader.nextLine());
        if (index >= 0 && index < TodoMenu.values().length) {
            return TodoMenu.values()[index];
        }
        return TodoMenu.EXIT;
    }

    private static void showMenu() {
        System.out.println("-----------------------------------");
        int index = 0;
        for (TodoMenu menu : TodoMenu.values()) {
            System.out.printf("%d - per %s%n", index, menu);
            index++;
        }
        System.out.println("-----------------------------------");
    }


}













