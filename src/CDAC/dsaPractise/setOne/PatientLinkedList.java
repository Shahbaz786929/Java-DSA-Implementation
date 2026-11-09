package CDAC.dsaPractise.setOne;

public class PatientLinkedList {

   private static class Node {
        Patient data;
        Node next;

        Node(Patient data) {
            this.data = data;
            this.next = null;
        }
    }

   private Node head;

    public void insertSortedByAge(Patient patient) {

        Node n = new Node(patient);

        if (head == null || patient.getAge() < head.data.getAge()) {
            n.next = head;
            head = n;
            return;
        }

        Node curr = head;

        while (curr.next != null && curr.next.data.getAge() <= patient.getAge() ) {
            curr = curr.next;
        }
        n.next = curr.next;
        curr.next = n;
    }


    public  boolean deleteById(int id) {
        if (head == null) {
            return false;
        }

        if (head.data.getId() == id) {
            head = head.next;
            return true;
        }

        Node curr = head;

        while (curr.next != null && curr.next.data.getId() != id) {
            curr = curr.next;
        }

        if (curr.next == null) {
            return false;
        }

        curr.next = curr.next.next;

        return true;
    }

    public int countByAilment(String ailment) {

        if (ailment == null) {
            return 0;
        }

        int count = 0;
        Node current = head;

        while (current != null) {
            if (current.data.getAilment() != null && current.data.getAilment().equalsIgnoreCase(ailment)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public void display() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        PatientLinkedList list = new PatientLinkedList();
         list.insertSortedByAge(new Patient(101, "Rahul", 45, "Fever"));
        list.insertSortedByAge(new Patient(101, "Rahul", 45, "Fever"));

        list.insertSortedByAge(new Patient(102, "Amit", 25, "Diabetes"));

        list.insertSortedByAge(new Patient(103, "Neha", 35, "Fever"));

        list.insertSortedByAge(new Patient(104, "Priya", 20, "Asthma"));

        System.out.println("Patients sorted by age:");
        list.display();

        System.out.println("\nFever patients: " + list.countByAilment("Fever"));

        System.out.println("\nDeleting patient ID 103:");
        System.out.println(list.deleteById(103));

        System.out.println("\nUpdated patient list:");
        list.display();
    }
}
