public class Principal {

    public static void main(String[] args) 
    {
        Carro carro = new Carro();  
        DAO dao = new DAO();
        dao.conectar();
        int opcao;
        System.out.println("MENU:\n");
        System.out.println("OPÇÕES:\n");
        System.out.println(
                "1-listar\n" + "2-Inserir\n" + "3-Excluir\n" + "4-Atualizar\n" + "5-Sair\n");
        opcao = MyIO.readInt();
        switch (opcao) {
            case 1:
                // Mostrar usuários
                Carro[] carros = dao.getCarros();
                System.out.println("==== Mostrar usuários === ");
                for (int i = 0; i < carros.length; i++) {
                    System.out.println(carros[i].toString());
                }
            case 2:
                // Inserir um elemento na tabela
                if (dao.inserirCarro(carro) == true) {
                    System.out.println("Inserção com sucesso -> " + carro.toString());
                }
            case 3:
                // Excluir usuário
                dao.excluirCarro(carro.getId());
                break;
            case 4:
                // Atualizar usuário
                carro.setModelo("picape");
                dao.atualizarCarro(carro);
            case 5:
                dao.close();
                break;

            default:
                break;
        }
        dao.close();
    }
}
