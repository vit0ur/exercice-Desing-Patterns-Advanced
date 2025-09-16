package adapter.banco;

public class MySQLRepository implements Repository {
    public void salvar(String dado) { System.out.println("MySQL: salvando " + dado); }
    public String buscar(String id) { return "MySQL: dado " + id; }
}
