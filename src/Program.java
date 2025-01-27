public class Program {

    public static void main (String[] args) {
        Entrada entrada = new Entrada();
        System.out.println("-------- Bem vindo ao programa --------");
        boolean flag = true;
        do{
            System.out.println("1 - Cadastrar estudante");
            System.out.println("2 - Listar estudantes");
            System.out.println("3 - Cadastrar professor");
            System.out.println("4 - Listar professores");
            System.out.println("5 - Cadastrar Disciplina");
            System.out.println("6 - Cadastrar Turma");
            System.out.println("7 - Listar Turmas");
            System.out.println("0 - Sair");
            int opcao = entrada.numero();
            switch(opcao){
                case 1:
                    System.out.println("Cadastrar estudante");
                    break;
                case 2:
                    System.out.println("Listar estudantes");
                    break;
                case 3:
                    System.out.println("Cadastrar professor");
                    break;
                case 4:
                    System.out.println("Listar professores");
                    break;
                case 5:
                    System.out.println("Cadastrar disciplina");
                    break;
                case 6:
                    System.out.println("Cadastrar turma");
                    break;
                case 7:
                    System.out.println("Listar turmas");
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    break;
            }
        }while(flag);
    }
}
