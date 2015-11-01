package satyaki.com.imageslist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by satyaki on 31/10/15.
 */


public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final Button bookmark;

    public CustomListAdapter(Activity context, String[] itemname, Integer [] imgid, Button bookmark) {
        super(context, R.layout.mylist, itemname);

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.bookmark=bookmark;

    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null, true);


        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);
        Button bookmark = (Button) rowView.findViewById(R.id.bookmark);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("Description"+itemname[position]);
        return rowView;

    };


}
