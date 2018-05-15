package week15.userDefinedException;


class BadThingsHappened extends Exception {

}

public class UserDefinedException {
    public static void main(String[] args) {
        int[] values;
        if (Math.random() > 0.9) {
            int[] nums = {5, 8, 1, -9, 3, 45, -7, 12};
            values = nums;
        } else {
            values = new int[0];
        }

        try{
            int minValue = findMin(values);
            System.out.println("Min value is: " + minValue);
        } catch (BadThingsHappened bth) {
            System.out.println("No min value exists.");
        }
    }

    private static int findMin(int[] numbers) throws BadThingsHappened {
        if (numbers.length == 0) {
            throw new BadThingsHappened();
        }

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
