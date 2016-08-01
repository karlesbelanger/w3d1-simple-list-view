package ca.kgb.simplelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 8/1/2016.
 */
public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, int resource) {
        super(context, resource);
    }

    public CustomAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public CustomAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
    }

    public CustomAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public CustomAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

    public CustomAdapter(Context context, int resource, int textViewResourceId, List<String> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //ImageView imageView = (ImageView)parent.getContext().findViewById(R.id.l_item_image);
        parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.list_item, parent, false);

        String name = getItem(position);
        TextView textView = (TextView)customView.findViewById(R.id.l_item_txt);

        textView.setText(name);
        if (name.toLowerCase().charAt(0) == 'a' ||
                name.toLowerCase().charAt(0) == 'e' ||
                name.toLowerCase().charAt(0) == 'i' ||
                name.toLowerCase().charAt(0) == 'o' ||
                name.toLowerCase().charAt(0) == 'u') {
            ImageView imageView = (ImageView) customView.findViewById(R.id.l_item_image);
            imageView.setImageResource(R.drawable.ic_class_black_24dp);
        }
        return customView;
        //String name = String.valueOf(parent.getI)
        //Get the actual String <----- arraylist + position

        //Create an inflater with the context <-- XML to View
        //currentString.charAt(); <-- if vowel ---> show icon
        //Get the reference for the TextView and the ImageView with findViewById
        //return the view that you just inflated
        //String currentString = arrayList.get(position);
        //return super.getView(position, convertView, parent);

    }
}
