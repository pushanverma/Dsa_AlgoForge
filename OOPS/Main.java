
public class Main {

    public class Car {

        // (int , string , char , array , char)

        //---------------------------Attributes------------------------------
        String car_manufacturing_Company;
        String car_model;
        String car_color;
        int car_manufacturing_year;
        int car_engine_number;

        String[] car_type = { "SUV", "HatchBack", "Luxury", "Off" };
        String[] car_engine_type = { "petrol", "diesel", "cng", "electric" };
        String[] car_transmission = { "Automatic", "Manual" };
        int[] currentGear = { -1, 1, 2, 3, 4, 5 };

        // -1 is reverse and all others are normal gears
        int car_horsePower;
        int car_mileage;
        int car_current_speed;
        int car_current_gear;
        Boolean car_running = false;

        //-------------------------------Methods-------------------------------

        // 1. Start engine()
        public static void startEngine() {

            // starting engine means changing the car status running - true and gear would
            // be 1
            // also think about reverse()

        }

        // 2. Accelerate()
        public static void Accelerate() {

        }

        // 2. Apply brakes()
        public static void applyBrakes() {
            // Applying brakes will reduce the current speed by 10 and decrease the

        }

        // 3. Change Gear();
        public static void changeGear() {

        }

        // 4. Display Information (display all the attributes)
        public static void getCarDetails(String car_manufacturing_Company, String car_model) {

            // display all the details of car

        }

        // 6. Check Service Status
        public static Boolean serviceStatus() {

            return false;

        }
    }

    public static void main(String[] args) {

        System.out.println("Hello world...");

        Car c1 = new Car("Mercedes", );

      
    }
}