import com.mongodb.*;

import static com.mongodb.client.model.Filters.*;

/**
 * Created by malamute29 on 6/11/15.
 */



public class hw3_1 {

    public static void main(String[] args){
        MongoClient client = new MongoClient();
        DB db = client.getDB("school");
        DBCollection collection = db.getCollection("students");
        BasicDBObject filterDBO = new BasicDBObject("scores.type", 0).append("$eq", "homework");
        BasicDBObject fields = new BasicDBObject().append("scores.homework", true).append("_id", false)
                .append("scores.exam", false).append("scores.quiz", false);


        DBCursor cursor = collection.find();


        while (cursor.hasNext()){
            DBObject cur = cursor.next();
            System.out.println(cur.toString());
        }







    }
}

