package lesson4;

public class L4Task2 {
    public static void main(String[] args) {
        // data_type[] massivAdi = {value1, value2, value3};

        int [] massiv = {1,2,3,4,5};
        int cem =0;
        for (int i = 0; i< massiv.length; i++){
            cem += massiv[i];
        }
        System.out.println(cem);



    }
}
