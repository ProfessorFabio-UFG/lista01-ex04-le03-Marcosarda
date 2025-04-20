package poo1.exercicio4;

public class RoboAspirador {
    private int id;
    private String status;
    private int posX;
    private int posY;
    private int quantidadePo;
    private int limitePo;

    public RoboAspirador(int id, int limitePo) {
        this.id = id;
        this.limitePo = limitePo;
        this.status = "DESLIGADO";
        this.posX = 0;
        this.posY = 0;
        this.quantidadePo = 0;
    }

    public void ligar() {
        status = "LIGADO";
    }

    public void desligar() {
        status = "DESLIGADO";
    }

    public void andar(int dx, int dy) {
        if ("DESLIGADO".equals(status)) return;
        posX += dx;
        posY += dy;
        status = "ANDANDO";
    }

    public void parar() {
        if ("DESLIGADO".equals(status)) return;
        status = "PARADO";
    }

    public void aspirar(int quantidade) {
        if ("DESLIGADO".equals(status)) return;
        quantidadePo += quantidade;
        if (quantidadePo >= limitePo) {
            quantidadePo = limitePo;
            desligar();
            System.out.println("Limite de pó atingido. Robô desligado.");
        }
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %d | Status: %s | X: %d | Y: %d | Pó: %d/%d",
            id, status, posX, posY, quantidadePo, limitePo
        );
    }
}
