package school.sptech;

public class Time {
    String nome;
    int vitorias;
    int empates;
    int derrotas;

    public Time(){
        vitorias = 0;
        empates =0;
        derrotas =0;
    }

    public void registrarVitoria(){
        vitorias++;
    }

    public void registrarEmpate(){
        empates++;
    }

    public void registrarDerrota(){
        derrotas++;
    }

    public int getPontos(){
        int pontos=(vitorias*3)+(empates);
        return (pontos);
    }

    public int getTotalPartidas(){
        int partidas = vitorias + empates + derrotas;
        return (partidas);
    }

    public int getAproveitamento(){
        int partidas= getTotalPartidas();
        int aproveitamento = (vitorias*100)/partidas;
        return (aproveitamento);
    }

    public void compararAproveitamento(Time adversario){
        int aproveitamentoP=adversario.getAproveitamento();
        int aproveitamento=getAproveitamento();
        if (aproveitamento>aproveitamentoP){
            System.out.println("O time "+ nome + " tem um aproveitamento maior que o time " + adversario.nome);
        } else if (aproveitamento<aproveitamentoP) {
            System.out.println("O time "+ adversario.nome + " tem um aproveitamento maior que o time " +nome);
        } else{
            System.out.println("Os times "+ nome +" e "+ adversario.nome +" têm o mesmo aproveitamento");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Time: " + nome);
        System.out.println("Vitória: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println(" ");
        System.out.println("Pontos: " + getPontos());
        System.out.println("Total de Partidas: " + getTotalPartidas());
        System.out.println("Aproveitamento: " + getAproveitamento() + "%");
        System.out.println("___");
    }


}
