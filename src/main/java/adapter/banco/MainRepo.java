package adapter.banco;

public class MainRepo {
    public static void main(String[] args) {
        Repository repo = new MongoAdapter(new MongoDBRepository());
        repo.salvar("Usuário1");
        System.out.println(repo.buscar("123"));
    }
}
