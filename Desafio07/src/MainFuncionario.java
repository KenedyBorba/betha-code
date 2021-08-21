import model.Funcionario;
import repository.FuncionarioRepository;
import service.FuncionarioService;

import java.sql.SQLException;

public class MainFuncionario {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Funcionario funcionario = new Funcionario(10, "Joao","5994466149",1000.0);

        FuncionarioService service = new FuncionarioService();

        service.save(funcionario);

        funcionario.setNome(funcionario.getNome() + " - alterado");

        service.update(funcionario);

        FuncionarioRepository repository = new FuncionarioRepository();

        repository.findAll();

        repository.findById(10);

    }
}
