package karanbatra.com.codekamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Batch_Activity extends Activity implements AdapterView.OnItemClickListener {
    ListView batchlistview;
    String[] items={"JAVA-AKGEC" , "JAVA-ABES" , "IOS-ABES" ,"ANDROID"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batch_);

        batchlistview=(ListView)findViewById(R.id.ListView_batch);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,items);
        batchlistview.setAdapter(adapter);
        batchlistview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=new Intent(this,StudentAkgec_Activity.class);
        startActivity(i);


    }
}
