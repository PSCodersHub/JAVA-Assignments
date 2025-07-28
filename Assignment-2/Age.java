// Question-2
class Age {
    public static void main(String args[]) {
        String name = "PS";
        int currentAge = 21;
        int nextAge = currentAge + (currentAge % 10);
        int previousAge = currentAge - (currentAge / 10);
        System.out.println("Name:" + name + " Current Age:" + currentAge + " Next Age:" + nextAge + " Previous Age:"
                + previousAge);
    }
}