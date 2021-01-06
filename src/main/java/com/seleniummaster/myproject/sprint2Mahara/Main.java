package com.seleniummaster.myproject.sprint2Mahara;

public class Main {
    public static void main(String[] args) {
        MaharaLogin.loginAs("student");
        Plans.addPlan("My first plan","This is my first plan.");
        Tasks task01=new Tasks();
        task01.addTasks("First task","2020/12/28",
                "2020/12/31","This is my first task.");
        Tasks task02=new Tasks();
        task02.addTasks("Second task","2020/12/27",
                "2020/12/31","This is my second task");
        Tasks task03=new Tasks();
        task03.addTasks("Third task","2020/12/26",
                "2020/12/31","This is my third task");
        Tasks edit=new Tasks();
        edit.editTasks("Last task","2020/12/25",
                "2020/12/31","This is the last task");

        Tasks view=new Tasks();
        view.viewTasks("First task","Second task","Last task");
    }
}
