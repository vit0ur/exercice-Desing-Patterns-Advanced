package adapter.banco;

public class MongoAdapter implements Repository {
    private MongoDBRepository mongo;
    public MongoAdapter(MongoDBRepository m) { mongo = m; }
    public void salvar(String dado) { mongo.insert(dado); }
    public String buscar(String id) { return mongo.find(id); }
}
