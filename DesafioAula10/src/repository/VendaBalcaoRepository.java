package repository;

public class VendaBalcaoRepository implements Buscavel{
    @Override
    public void findById(Long id) {
        System.out.println("Listando por ID");
    }

    @Override
    public void findAll(Long id) {
        System.out.println("Listando");
    }
}