package task6;

public class Main {
    public static void main(String[] args) {
    DataBase db1 = new MySQLDatabase();
    UserService userService = new UserService(db1);
    userService.saveUser();

        System.out.println("--------");


        DataBase db2 = new PostgresSQLDatabase();
        UserService userService1 = new UserService(db2);
        userService1.saveUser();





















//        int[] arr = {12, 5, 8, 3, 20, 1};
//
//
//        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i];
//            int count = 0;
//
//            for(int j = 1; j <= num; j++){
//                if(num % j == 0){
//                    count ++;
//                }
//            }
//            if(count == 2){
//                System.out.println(num + " Sadedir");
//            } else if (num > 1) {
//                System.out.println(num + " Murekkebdir");
//            }else {
//                System.out.println(num + " Ne sadedir ne murekkeb");
//            }
//        }
    }
}