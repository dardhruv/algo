package com.dhruv.queue;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",456);
        Employee marySmith = new Employee("Mary","Smith",897);
        Employee mikeWilson = new Employee("Mike","Wilson",891);
        Employee billEnd = new Employee("Bill","End",265);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        queue.printQueue();

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

        Employee dardruv = new Employee("Dhruv","Dhar",265);
        queue.add(dardruv);
        Employee bunnydar = new Employee("Bunny","Dhar",265);
        queue.add(bunnydar);
        queue.remove();
        Employee kdhar = new Employee("Kishan","Dhar",265);
        queue.add(kdhar);
        queue.remove();
        queue.add(dardruv);
        queue.add(dardruv);
    }
}
