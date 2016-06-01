package karanbatra.com.codekamp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StudentAkgec_Activity extends Activity implements AdapterView.OnItemClickListener {

    ListView StudentList;
    String[] items={"KARAN" ,"HIMANSHU" ,"ASHISH" ,"AMIT" ,"PRAVEEN" ,"PARAS" ,"RAHUL" ,"KARTIK" ,"SHUBHI" ,"RAMBABU" ,"ANMOL" ,"KUNAL" ,"HEMANT" ,"SHAKTI" ,"AMAN" ,"KRITI" ,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_akgec_);

        StudentList=(ListView)findViewById(R.id.listviewStudent);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,items);
        StudentList.setAdapter(adapter);
        StudentList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=new Intent(Intent.ACTION_DIAL);
switch (position)
{
    case 0:
        i.setData(Uri.parse("tel:941-127-567-6"));
         break;
    case 1:
       i.setData(Uri.parse("tel:999-068-439-4"));
        break;
    case 2:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 3:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 4:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 5:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 6:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 7:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 8:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 9:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 10:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 11:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 12:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 13:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;
    case 14:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;

    case 15:
        i.setData(Uri.parse("tel:941-127-567-6"));
        break;


}
        Intent chooseapp=Intent.createChooser(i,"choose calling app ");
        startActivity(chooseapp);

    }
}

