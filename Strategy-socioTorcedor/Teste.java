public class Teste {
    
    public static void main(String[] args) {
        
        Plano bronze = new PlanoBronze();
        Plano prata = new PlanoPrata();
        Plano ouro = new PlanoOuro();

        Torcedor torcedor = new Torcedor("Daniel");

        SocioTorcedor socio = new SocioTorcedor();

        socio.mensagem(torcedor, ouro);
        socio.mensagem(torcedor, prata);
        socio.mensagem(torcedor, bronze);
    }
}
