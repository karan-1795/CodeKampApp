package karanbatra.com.codekamp;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textview;

    ImageView contact, course, about, batch, intern;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView) findViewById(R.id.TextView1);
        textview.setText(Html.fromHtml("<u>CODEKAMP</u>"));

        contact = (ImageView) findViewById(R.id.Image_Contact);
        contact.setOnClickListener(this);

        course = (ImageView) findViewById(R.id.Image_Course);
        course.setOnClickListener(this);

        about = (ImageView) findViewById(R.id.Image_ck);
        about.setOnClickListener(this);

        batch = (ImageView) findViewById(R.id.Image_Batch);
        batch.setOnClickListener(this);

        intern = (ImageView) findViewById(R.id.Image_intern);
        intern.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.Image_Batch) {
            Intent i = new Intent(this, Batch_Activity.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.Image_Contact)
        {
            Intent i = new Intent(this, Contact.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.Image_ck)
        {
            Intent i = new Intent(this, CodeKamp_Activity.class);
            startActivity(i);

        }
        else if(v.getId()==R.id.Image_Course)
        {
            Intent i = new Intent(this, Courses_activity.class);
            startActivity(i);

        }
        else if(v.getId()==R.id.Image_intern)
        {
            Intent i = new Intent(this, Intent_Activity.class);
            startActivity(i);

        }


    }
}