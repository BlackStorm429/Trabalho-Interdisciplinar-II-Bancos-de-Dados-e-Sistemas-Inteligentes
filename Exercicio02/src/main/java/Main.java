public class Main 
{
    public static void main (String [] args) 
    {
        Moto moto = new Moto ();  
        DAO dao = new DAO ();
        dao.conectar ();
        int opcao;
        System.out.println ("MENU:\n");
        System.out.println ("OPÇÕES:\n");
        System.out.println (
                "1-listar\n" + "2-Inserir\n" + "3-Excluir\n" + "4-Atualizar\n" + "5-Sair\n");
        opcao = MyIO.readInt ();
        
        switch (opcao) 
        {
            case 1:
                // Mostrar usuários
                Moto [] motos = dao.getMotos ();
                System.out.println ("==== Mostrar usuários === ");
                
                for (int i = 0; i < motos.length; i++) 
                {
                    System.out.println (motos [i].toString ());
                }
                
            case 2:
                // Inserir um elemento na tabela
                if (dao.inserirMoto (moto) == true) 
                {
                    System.out.println ("Inserção com sucesso -> " + moto.toString());
                }
                
            case 3:
                // Excluir usuário
                dao.excluirCarro (moto.getId ());
                break;
                
            case 4:
                // Atualizar usuário
                carro.setModelo ("scooter");
                dao.atualizarCarro (moto);
                
            case 5:
                dao.close ();
                break;

            default:
                break;
        }
        
        dao.close ();
    }
}
