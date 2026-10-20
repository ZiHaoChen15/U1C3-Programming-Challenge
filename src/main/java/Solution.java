public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        calcModel = model;
        idNumber = id;
    }

    public Solution(int id) {
        idNumber = id;
        calcModel = "TI-84";
    }

    public String getCalcModel() {
        return calcModel;
    }

    public void setCalcModel(String newModel) {
        calcModel = newModel;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int newId) {
        idNumber = newId;
    }

    public void incrementId() {
        idNumber += 1;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public int quotient(int num1, int num2) {
        return num1 / num2;
    }

    public int remainder(int num1, int num2) {
        return num1 % num2;
    }

    public String divisionResult(int num1, int num2) {
        int quo = quotient(num1, num2);
        int rem = remainder(num1, num2);
        return quo + " R " + rem;
    }

    public String coordinatePair(int x, int y) {
        return "(" + x + ", " + y + ")";
    }

    public int average(int num1, int num2) {
        double testValue = ((double) num1 + (double) num2)/2;
        double compValue = ((num1 + num2)/2) + 0.5;
        if (testValue >= compValue) {
            return (int) testValue + 1;
        }
        else {
            return (int) testValue;
        }
    }

    public String info() {
        return "This calculator is a model " + calcModel + " with id " + idNumber;
    }
}