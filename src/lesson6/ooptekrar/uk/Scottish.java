package lesson6.ooptekrar.uk;

public class Scottish {
        String name;
        int age;
        String furColor;

        void qachmaq(){
            System.out.println("Qach");
        }

        void ozunuTani (){
            System.out.println("Menim adim " + name);
            System.out.println("Menim yashim " + age);
            System.out.println("Menim xezim " + furColor);
        }
        int calculator (int x, int y) {
            return x+y;}


        @Override
        public String toString() {
            return "OrangePersianCat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", furColor='" + furColor + '\'' +
                    '}';
        }




    }

