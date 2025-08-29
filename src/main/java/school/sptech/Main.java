package school.sptech;

public class Main {

    public static void main(String[] args) {
        Time estrela = new Time();
        estrela.nome="Estrela do Norte";
        estrela.vitorias=10;
        estrela.empates=5;
        estrela.derrotas=2;
        estrela.exibirInformacoes();

        Time aguia = new Time();
        aguia.nome="Águia Branca";
        aguia.vitorias=7;
        aguia.empates=4;
        aguia.derrotas=6;
        aguia.exibirInformacoes();

        estrela.compararAproveitamento(aguia);

        Time vento = new Time();
        vento.nome="Vento Forte";
        vento.vitorias=2;
        vento.empates=3;
        vento.derrotas=12;
        vento.exibirInformacoes();

        Time mare = new Time();
        mare.nome="Maré Alta";
        mare.vitorias=5;
        mare.empates=5;
        mare.derrotas=7;
        mare.exibirInformacoes();

        vento.compararAproveitamento(mare);

        Time rocha = new Time();
        rocha.nome="Rocha sólida";
        rocha.vitorias=4;
        rocha.empates=3;
        rocha.derrotas=10;
        rocha.exibirInformacoes();

        Time fogo = new Time();
        fogo.nome="Fogo Ardente";
        fogo.vitorias=4;
        fogo.empates=5;
        fogo.derrotas=8;
        fogo.exibirInformacoes();

        rocha.compararAproveitamento(fogo);
    }
}