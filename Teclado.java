public class Teclado{
    public String marca;
    public String cor;
    public int tamanho;
    public boolean temLed;
    public String conexao;
    public String material;
    public String tipoSwitch;
    public boolean mecanico;
    public boolean ledLigado;
    

    public Teclado(String marca, String cor, int tamanho, boolean temLed,
     String conexao, String material, boolean mecanico){
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.temLed = temLed;
        this.conexao = conexao;
        this.material = material;
        this.mecanico = mecanico;
     }

    public void ligarLed(){
        if(temLed){
            System.out.println("led ligado");
            ledLigado = true;}
        else{
            System.out.println("seu teclado nao possui led");
        }
    }
    public void conectar(){
        System.out.println("teclado conectado via" + conexao);
    }
    public void desligarLed(){
        if(ledLigado){
            ledLigado = false;
            System.out.println("led desligado");
        }
    }
}