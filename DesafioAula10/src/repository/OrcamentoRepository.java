package repository;

public class OrcamentoRepository implements Buscavel{
    @Override
    public void findById(Long id) {
        System.out.println("Listando por ID");
    }

    @Override
    public void findAll(Long id) {
        System.out.println("Listando");
    }
}