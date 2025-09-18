public class CeilandFloor {

    public static void main(String[] args) {

        // sorted array
        int[] arr = { 1, 7, 9, 13, 18, 23, 35 };

        // intially both are extreme ends
        int ceil = Integer.MAX_VALUE;  // since ceil means top of the building , thats why it stores infinity(Maximum value of Integer)
        int floor = Integer.MIN_VALUE; // since floow means base of the building , thats why it stores -infinity(Minimum value of Infinity)
        

        int target = 40;
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            // if i got the target at mid
            if (target == arr[mid]) {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            } else if (target > arr[mid]) {
                // go right
                floor = arr[mid]; // since i am going to right , this can be my floor value
                si = mid + 1;
            } else {
                // go left
                ceil = arr[mid]; // since i am going to left , this can be my ceil value
                ei = mid - 1;
            }

        }

        System.out.println("Ceil value of " + target + "=" + ceil);
        System.out.println("Floor value of " + target + "=" + floor);

    }
}