package satyaki.com.imageslist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView list;

    String[] itemname={
            "Fruit",
            "Milk",
            "Fruit",
            "Milk",
            "Fruit",
            "Milk",
            "Fruit",
            "Milk"
    };

    Integer[] imgid={

            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic1,
            R.drawable.pic2,
    };

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid);
        list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id){
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }

        });
        /*this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.mylist,
                R.id.Itemname, itemname));*/
    }
}
