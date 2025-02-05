import java.util.Scanner;

class ContaTerminal{
    public static void main (String [] args) throws Exception{
        int numeroDaConta = 0;
        double saldo = 0;
        boolean erro = true;   // variavel para controlar o while 
        Scanner scanner = new Scanner(System.in);
        // pede o nome
        System.out.println( "Por favor, digite o seu nome");
        String nome = scanner.next();

        // adicionei esse loop para caso digite algum caracter invalido, peça para redigitar ao invés de quebrar o código
        System.out.println( "Por favor, digite o número da sua conta!");
        while(erro){
            try{
                numeroDaConta = scanner.nextInt();
                erro = false;
            }
            catch (Exception e){   
                scanner.nextLine();
                System.out.println( "Por favor, digite apenas números!");   
            }
        } 
        // pede o numero da agencia
        System.out.println( "Por favor, digite o número da agencia!");
        String numeroAgencia = scanner.next();

        // o mesmo loop foi feito para o saldo
        System.out.println( "Por favor, digite o saldo da sua conta");
        erro = true;
        while(erro){
            try{
                saldo = scanner.nextDouble();
                erro = false;
            }
            catch (Exception e){   
                scanner.nextLine();
                System.out.println( "Por favor, digite apenas números e não use ponto, opte pela vírgula!");   
            }
        } 
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}