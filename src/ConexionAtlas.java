
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;




// "mongodb+srv://enriqueAdmin:enrique1@cluster0.0f59n.mongodb.net/ejemplo1?retryWrites=true&w=majority"
public class ConexionAtlas extends MongoClient{
    
    public ConexionAtlas (MongoClientURI direccionURI){
        super(direccionURI);
    }
    
}
