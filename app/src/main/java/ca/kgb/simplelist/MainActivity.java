package ca.kgb.simplelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private ListView mListView;
    private String[] name = {"karles", "aldo", "Mike", "Chris", "Edwin", "Libu", "karles", "aldo", "Mike", "Chris", "Edwin", "Libu", "karles", "aldo", "Mike", "Chris", "Edwin", "Libu"};
    private ArrayList<String> arrayList = new ArrayList<String>();
    //private List<String> arrayList =  Arrays.asList(name);
    private EditText mEditText;
    private ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList.addAll(Arrays.asList(name));
        mListView = (ListView)findViewById(R.id.listViewSimple);
        arrayAdapter = new CustomAdapter(
                        this,
                        R.layout.list_item,
                        R.id.l_item_txt,
                        arrayList);
        arrayAdapter.sort( comp );
        mListView.setAdapter(arrayAdapter);
        mEditText = (EditText) findViewById(R.id.editTextAddName);
    }
    public void doMagic(View view) {
        Log.d(TAG, "doMagic: " );
        if(!mEditText.getText().toString().equals("")) {
            //arrayList.add(mEditText.getText().toString());

            arrayList.add(mEditText.getText().toString());
            arrayAdapter.sort(comp);
            arrayAdapter.notifyDataSetChanged();
        }

    }
    final private Comparator<String> comp = new Comparator<String>() {
        public int compare(String e1, String e2) {
            return e1.toString().toLowerCase().compareTo(e2.toString().toLowerCase());
        }
    };


}
