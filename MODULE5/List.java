import java.text.*;
import java.util.*;
class ToDoList {
    public static void main(String[] args) {
        Task t1 = new Task("Module 5 Assign 1", "Need to finish Assignment", "24/09/2019", "incomplete");
        Task t2 = new Task("Module 6", "Understand how date should be handled", "23/09/2019", "complete");
        Task t3 = new Task("Module 7", "Understand arrays", "23/09/2019", "in process");
        Task t4 = new Task("Module 8", "Task Task", "11/11/2019", "incomplete");
        List listObj = new List();
        listObj.addTask(t1);
        listObj.addTask(t2);
        listObj.addTask(t3);
        listObj.addTask(t4);
        listObj.displayAll();
        listObj.removeTask(t3);
        System.out.println();
        listObj.displayAll();
        listObj.updateStatus(t4, "inprocess");
        System.out.println();
        listObj.displayAll();
        System.out.println();
        Task [] sampleTask = new Task[10];
        sampleTask = listObj.displayIncomplete();
        for (int i=0; i<sampleTask.length; i++) {
            if (sampleTask[i] != null){
                System.out.println(sampleTask[i]);
            }
        }
        listObj.addTask(t3);
        System.out.println();
        Task [] sampleTask1 = new Task[10];
        sampleTask1 = listObj.displayTaskByDate("23/09/2019");
        for (int i=0; i<sampleTask1.length; i++) {
            if (sampleTask1[i] != null){
                System.out.println(sampleTask1[i]);
            }
        }

        System.out.println();
        listObj.displayAll();
        System.out.println((listObj.getATask("Module 6")).status);
        System.out.println();
        Task [] sampleTask2 = new Task[10];
        sampleTask2 = listObj.getOverDue("12/11/2019");
        for (int i=0; i<sampleTask2.length; i++) {
            if (sampleTask2[i] != null){
                System.out.println(sampleTask2[i]);
            }
        }
    } 
        
}


class Task {
    String name, description, dueDate, status, strDate;
    Task(String name, String description, String dueDate, String status) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }
    public String toString() {
        return "Name: "+this.name+", Description: "+this.description+", Due Date: "+this.dueDate+", Status: "+this.status;
    }
}

class List {
    Task [] taskArray = new Task[10];
    int count = 0;
    public void addTask(Task t) {
        this.taskArray[this.count] = t;
        this.count += 1;
    }

    public void removeTask(Task t) {
        String n = t.name;
        for (int i=0; i<this.count; i++) {
            if (taskArray[i].name.equals(n)) {
                for (int j=i; j<this.count; j++) {
                    taskArray[j] = taskArray[j+1];
                }
                taskArray[this.count-1] = null;
                this.count--;
            }
        }
    }

    public void updateStatus(Task t1, String stat) {
        String n = t1.name;
        for (int i=0; i<this.count; i++) {
            if (taskArray[i].name.equals(n)) {
                taskArray[i].status = stat;
            }
        }
    }

    public Task [] displayIncomplete() {
        int c = 0;
        Task [] sample = new Task[this.count];
        for (int i=0; i<this.count; i++) {
            if (taskArray[i].status.equals("incomplete")) {
                sample[c] = taskArray[i];
                c += 1;
            }
        }
        return sample;
    }

    public Task [] displayTaskByDate(String dueD) {
        int c = 0;
        Task [] sample = new Task[this.count];
        for (int i=0; i<this.count; i++) {
            if (taskArray[i].dueDate.equals(dueD)) {
                sample[c] = taskArray[i];
                c += 1;
            }
        }
        return sample;
    }

    public Task getATask(String name) {
        for (int i=0; i<this.count; i++) {
            if(taskArray[i] == null){
                System.out.println("Null came");
                return null;
            }
            if(taskArray[i].name.equals(name)) {
                return taskArray[i];
            }
        }
        return null;
    }

    public Task [] getOverDue(String dueDate) {
        int c = 0;
        Task [] sample = new Task[this.count];
        int date = Integer.valueOf(dueDate.substring(0,2));
        int month = Integer.valueOf(dueDate.substring(3,5));
        for (int i=0; i<this.count; i++) {
            int d = Integer.valueOf(taskArray[i].dueDate.substring(0,2));
            int m = Integer.valueOf(taskArray[i].dueDate.substring(3,5));
            if(m<month){
                sample[c] = taskArray[i];
                c += 1;
            } else if(m == month && d<=date){
                sample[c] = taskArray[i];
                c += 1;
            }
            }
            return sample; 
        }
   

    public void displayAll() {
        for (int i=0; i<this.count; i++) {
            System.out.println(taskArray[i]);
        }
    }
}