package task3;

public class Main {
    static void main(String[] args) {

        int num = 1254;

        String[] ones = {
                "", "bir", "iki", "uc", "dord", "bes",
                "alti", "yeddi", "sekkiz", "doqquz"
        };
        String[] tens = {
                "", "on", "iyirmi", "otuz", "qirx","elli",
                "altmis", "yetmis", "seksen", "doxsan"
        };

        String result = "";

        if(num >= 1000){
            result += ones[num / 1000] + " min ";
            num = num % 1000;
        }
        if(num >= 100){
            result += ones[num / 100] + " yuz ";
            num = num % 100;
        }
        if(num >= 10){
            result += tens[num / 10] + " ";
            num = num % 10;
        }
        if(num > 0){
            result += ones[num];
        }
        System.out.println(result.trim());


    }
}