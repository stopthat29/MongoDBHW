import com.mongodb.*;

import java.util.Map;

import static com.mongodb.client.model.Filters.*;

/**
 * Created by malamute29 on 6/11/15.
 */



public class hw3_1 {

    public static void main(String[] args){
        MongoClient client = new MongoClient();
        DB db = client.getDB("school");
        DBCollection collection = db.getCollection("students");



        DBCursor cursor = collection.find();


        while (cursor.hasNext()){
            DBObject cur = cursor.next();
           System.out.println(cur.get("scores").toString());
           BasicDBList hwVal =(BasicDBList) cur.get("scores");

          //  System.out.print("Double Value: "+hwVal);
            System.out.println(cur.toString());
        }







    }
}

