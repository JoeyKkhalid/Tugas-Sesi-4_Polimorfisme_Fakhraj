package .vscode;

public class classTanah {
    class Tanah {
        void sifat() {
            System.out.println("Tanah adalah permukaan bumi yang solid.");
        }
    }
    
    class Gunung extends Tanah {
        @Override
        void sifat() {
            System.out.println("Gunung adalah elevasi tanah yang tinggi.");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Tanah tanah1 = new Tanah();
            tanah1.sifat();
    
            Gunung gunung1 = new Gunung();
            gunung1.sifat();
        }
    }
}
