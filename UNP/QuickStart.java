public class QuickStart {
    public static void main(String[] args) {

        int idade;
        idade = 15;
        System.out.println("idade: "+idade);

        int	idadeNoAnoQueVem;
        idadeNoAnoQueVem	=	idade	+	1;

        System.out.println("Idade no proximo ano: "+idadeNoAnoQueVem);

        double media = (double)(idade + idadeNoAnoQueVem)/2;

        System.out.println("A media das idades é: "+media);

        boolean maiorIdade = (idade >= 18);

        if(maiorIdade){
            System.out.println("Pessoa de Maior");
        }else{
            System.out.println("pessoa de menor");
        }

        String nome = "Maria Jose da Silva";
        System.out.println("O nome da pessoa é: "+nome);
        
    } 
}
