package duke;

/**
 * interact with user
 */
public class Ui {

    public Ui() {

    }

    /**
     * greet user
     */
    public void sayHi() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");
    }

    /**
     * bye user
     */
    public void sayBye() {
        System.out.println("Bye. Hope to see you again soon!");
    }
}
