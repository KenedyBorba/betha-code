import model.Diretor;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;

public class MainDiretor {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Diretor diretor = new Diretor(7, "Joao","5994466149",1000.0, 100.00);

        DiretorService service = new DiretorService();

        service.save(diretor);

        diretor.setNome(diretor.getNome() + " - alterado");

        service.update(diretor);

        DiretorRepository repository = new DiretorRepository();

        repository.findAll();

        repository.findById(10);

    }
}
