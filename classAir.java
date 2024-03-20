package .vscode;

public class classAir {
    class Air {
        void sifat() {
            System.out.println("Air adalah cairan.");
        }
    }
    
    class Danau extends Air {
        @Override
        void sifat() {
            System.out.println("Danau adalah perairan yang luas.");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Air air1 = new Air();
            air1.sifat();
    
            Danau danau1 = new Danau();
            danau1.sifat();
        }
    }
}
