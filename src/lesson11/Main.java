package lesson11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        File folder = new File("firstfile");
        File file = new File(folder,"text.txt");
        File file2 = new File(folder, "test.txt");
//
//        try {
//            if (!folder.exists()) {
//                System.out.println("fayl movcud deyil yaradilir");
//                folder.mkdir();
//            } else {
//                System.out.println("fayl var");
//            }
//
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            if (!file2.exists()){
//                file2.createNewFile();
//            }
//            System.out.println("File path "+ file.getAbsolutePath());
//            System.out.println("file adi "+file.getName());
//            System.out.println();
//            System.out.println("file path "+ file2.getAbsolutePath());
//            System.out.println("file adi "+file2.getName());
//

//        System.out.println("Adı: " + file.getName());
//        System.out.println("Path: " + file.getAbsolutePath());
//        System.out.println("Yazıla bilərmi? " + file.canWrite());
//        System.out.println("Oxuna bilərmi? " + file.canRead());


////file2.delete(); //folder.delete
//            //  System.out.println("fayl silindi");
//        }
//        catch (IOException e ){
//            System.out.println("Xeta");
//        }


//        try (FileOutputStream fos1 = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\untitled\\firstfile\\test.txt")) {
//            fos1.write(77);
//            fos1.close();
//        }
//        catch (IOException e){
//            System.out.println("xeta");
//        }

//        try FileOutputStream fos2 = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\untitled\\firstfile\\test.txt") {
//            fos2.write(77);
//            fos2.close();
//        };
//        catch (IOException){
//            System.out.println("xeta");
//        }





        byte [] symbol= {65,77,88,99,100,35};
        String name ="peoiks";
        byte [ ] nameArr = name.getBytes();


        try (FileOutputStream fos1 = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\untitled\\firstfile\\test.txt")) {
            fos1.write(symbol);

            fos1.write(nameArr);
        }
        catch (IOException e){
            System.out.println("xeta");
        }



    }
}
