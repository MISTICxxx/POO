import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class LojaVp {
    private double valorantPoints;
    private Random random;
    private List<Skin> skins;

    public LojaVp(double valorantPoints) {
        this.valorantPoints = valorantPoints;
        this.random = new Random();
        this.skins = new ArrayList<>();
        gerarSkins();
    }

    private void gerarSkins() {
        skins.add(new Skin("Ares", "Brinquedo", 1775));
        skins.add(new Skin("Vandal", "Préludio do Caos", 1275));
        skins.add(new Skin("Phantom", "Champions 2024", 875));
        skins.add(new Skin("Operator", "AnciFogo", 4350));
        skins.add(new Skin("Judge", "AnciFogo", 1200));
        skins.add(new Skin("Spectre", "Saqueadora", 1850));
        skins.add(new Skin("Bucky", "Dourada", 1600));
        skins.add(new Skin("Shorty", "Préludio do Caos", 950));
        skins.add(new Skin("Marshal", "Velho Oeste", 2100));
        skins.add(new Skin("Guardian", "Espectral", 1450));
    }

    public List<Skin> getSkinsDaLoja() {
        List<Skin> skinsDaLoja = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            skinsDaLoja.add(skins.get(random.nextInt(skins.size())));
        }
        return skinsDaLoja;
    }

    public boolean comprarSkin(Skin skin) {
        if (valorantPoints >= skin.getPreco()) {
            valorantPoints -= skin.getPreco();
            System.out.println("Skin comprada: " + skin.getNome());
            return true;
        } else {
            System.out.println("VP insuficientes para comprar: " + skin.getNome());
            return false;
        }
    }

    public void adicionarValorantPoints(double quantidade) {
        valorantPoints += quantidade;
        System.out.println("VP adicionados: " + quantidade + ". Total VP: " + valorantPoints);
    }

    public double getValorantPoints() {
        return valorantPoints;
    }

    public String tempoParaAtualizacao() {
        LocalTime agora = LocalTime.now();
        LocalTime atualizacao = LocalTime.of(21, 0);
        if (agora.isBefore(atualizacao)) {
            Duration duration = Duration.between(agora, atualizacao);
            return "Faltam " + duration.toHours() + " horas e " + duration.toMinutesPart() + " minutos para a próxima atualização.";
        } else {
            LocalTime proximaAtualizacao = atualizacao.plusHours(24);
            Duration duration = Duration.between(agora, proximaAtualizacao);
            return "Faltam " + duration.toHours() + " horas e " + duration.toMinutesPart() + " minutos para a próxima atualização.";
        }
    }
}
