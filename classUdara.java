package .vscode;

public class classUdara {
    class Udara {
        void sifat() {
            System.out.println("Udara adalah gas yang mengelilingi bumi.");
        }
    }
    
    class Angin extends Udara {
        @Override
        void sifat() {
            System.out.println("Angin adalah pergerakan udara yang terjadi karena perbedaan tekanan.");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Udara udara1 = new Udara();
            udara1.sifat();
    
            Angin angin1 = new Angin();
            angin1.sifat();
        }
    }
}
