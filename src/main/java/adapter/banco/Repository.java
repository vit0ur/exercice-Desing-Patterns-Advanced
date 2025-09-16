package adapter.banco;

public interface Repository {
    void salvar(String dado);
    String buscar(String id);
}
