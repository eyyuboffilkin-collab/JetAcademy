package task4;

public class Main {
    static void main(String[] args) {

    Notification email = new Email();
    Notification sms = new Sms();
    sms.sendmessage("Ilkin", "Java");
    email.sendmessage("eyyubofilkin@gmail.com", "Java");





        /*
            PascalCase = class adlari
            camelCase = variable
            snakeCase = final field
            kebabCase = url
                     */
    }

}
//        int num = 1254;
//        int sum = 0;
//
//        while(num > 0){
//            sum += num % 10;
//            num /= 10;
//        }
//        System.out.println(sum);
//
//    }
//}

//FIBONACCI
//        int n = 10;
//
//        int a = 0;
//        int b = 1;
//
//        for(int i =1; i <= n; i++){
//            System.out.print(a + " ");
//
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//    }
//}
//FACTORIAL
//        int num = 5;
//        int fact = 1;
//
//        for(int i = 1; i < num; i++){
//            fact *= i;
//        }
//        System.out.println(fact);
//
//
//    }
//
//}
// PRIME NUMBER
//        int num = 29;
//        boolean isPrime = true;
//
//        if (num <= 1) {
//            isPrime = false;
//        }
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        System.out.println(isPrime);
//
//
//    }
//}

//FIZZBUZZ
//        for(int i = 0; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0 ) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//        }

