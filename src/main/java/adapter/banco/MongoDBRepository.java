package adapter.banco;

public class MongoDBRepository {
    public void insert(String dado) { System.out.println("MongoDB: inserindo " + dado); }
    public String find(String id) { return "MongoDB: dado " + id; }
}
