package .vscode;

public class classApi {
    class Api {
        void sifat() {
            System.out.println("Api adalah panas yang membakar.");
        }
    }
    
    class GunungBerapi extends Api {
        @Override
        void sifat() {
            System.out.println("Gunung berapi adalah letusan magma yang dahsyat.");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Api api1 = new Api();
            api1.sifat();
    
            GunungBerapi gunung1 = new GunungBerapi();
            gunung1.sifat();
        }
    }
}
