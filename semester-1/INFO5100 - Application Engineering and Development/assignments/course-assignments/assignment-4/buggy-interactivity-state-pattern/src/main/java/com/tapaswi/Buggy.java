package com.tapaswi;

class Buggy {

    public static void main(String[] args) {
        BuggyOperations buggyOperations = new BuggyOperations();
        System.out.println("Buggy is at rest.");

        buggyOperations.pressLeftPedal(1); // Simulate holding for 1 second
        System.out.println("Buggy is accelerating forward slowly.");

        buggyOperations.pressLeftPedal(3); // Simulate holding for 3 seconds
        System.out.println("Buggy is accelerating forward quickly.");

        buggyOperations.pressRightPedal(2); // Simulate holding for 2 seconds
        System.out.println("Buggy is slowing down.");

        buggyOperations.pressRightPedal(4); // Simulate holding for 4 seconds
        System.out.println("Buggy is now at constant forward speed.");
    }
}
