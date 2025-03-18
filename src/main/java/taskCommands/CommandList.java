package taskCommands;

/**
 * An enumeration that contains all valid commands for the application.
 * Each command in this enum implements a method to print its usage and description.
 */
public enum CommandList {
    MARK {
        @Override
        public void printCommand() {
            System.out.println("MARK: Marks a task as done. Usage: MARK <task_number>");
        }
    }, UNMARK {
        @Override
        public void printCommand() {
            System.out.println("UNMARK: Marks a task as undone. Usage: UNMARK <task_number>");
        }
    }, TODO {
        @Override
        public void printCommand() {
            System.out.println("TODO: Creates a new todo task. Usage: TODO <task_description>");
        }
    }, EVENT {
        @Override
        public void printCommand() {
            System.out.println("EVENT: Creates a task with an event. Usage: EVENT <task_description> /from <start_time> /to <end_time>");
        }
    }, LIST {
        @Override
        public void printCommand() {
            System.out.println("LIST: Displays all tasks.");
        }
    }, BYE {
        @Override
        public void printCommand() {
            System.out.println("BYE: Exits the application.");
        }
    }, DELETE {
        @Override
        public void printCommand() {
            System.out.println("DELETE: Deletes a task. Usage: DELETE <task_number>");
        }
    }, FIND {
        @Override
        public void printCommand() {
            System.out.println("FIND: Finds a task based on the keyword given. Usage: FIND <keyword>");
        }
    }, RENAME {
        @Override
        public void printCommand() {
            System.out.println("RENAME: Renames a task based on the task number give . Usage: RENAME <task_number>");
        }
    }, NEWSTUDENT {
        @Override
        public void printCommand() {
            System.out.println("NEWSTUDENT: Adds a new student to the student list using the provided information. Usage: NEWSTUDENT <name> <dob> <gender> <contact> <matric_number> <tutorial_class>");
        }
    }, CHANGEREMARK {
        @Override
        public void printCommand() {
            System.out.println("CHANGEREMARK: Updates the remark of a student. Usage: CHANGEREMARK <matric_number> <new_remark>");
        }
    }, DELETESTUDENT {
        @Override
        public void printCommand() {
            System.out.println("DELETESTUDENT: Deletes a student from the student list. Usage: DELETESTUDENT <matric_number>");
        }
    }, FINDSTUDENT {
        @Override
        public void printCommand() {
            System.out.println("FINDSTUDENT: Finds a student based on the keyword (name or matric number). Usage: FINDSTUDENT <keyword>");
        }
    };

    public abstract void printCommand();
}