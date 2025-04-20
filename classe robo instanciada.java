package poo1.exercicio4;

public class MainRoboAspirador {
    public static void main(String[] args) {


        RoboAspirador r1 = new RoboAspirador(1, 100);


        RoboAspirador r2 = new RoboAspirador(2, 50);

        System.out.println(r1);

        r1.ligar();

        System.out.println(r1);

        r1.andar(5, 5);

        System.out.println(r1);

        r1.parar();

        System.out.println(r1);

        r1.aspirar(30);

        System.out.println(r1);

        r1.desligar();

        System.out.println(r1);


        System.out.println();


        System.out.println(r2);

        r2.ligar();

        System.out.println(r2);

        r2.andar(3, 4);

        System.out.println(r2);

        r2.aspirar(60);

        System.out.println(r2);

        r2.parar();

        System.out.println(r2);

        r2.desligar();
        
        System.out.println(r2);

    }
}
