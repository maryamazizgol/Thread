/**
 * Created by MM on 1/29/2020.
 */
public class Main {
    public static void main(String[] args) {



        File file = new File();

        Thread t1 = new Thread(file,"File");

        t1.start();

        //////////////////////////

        Database database =new Database();

        Thread t2 =new Thread(database,"database");

        t2.start();

    }

}
}
