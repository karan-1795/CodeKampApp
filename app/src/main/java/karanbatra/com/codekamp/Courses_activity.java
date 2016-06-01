package karanbatra.com.codekamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class Courses_activity extends Activity {
    TextView course,explain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_activity);

        course= (TextView) findViewById(R.id.course1);
        course.setText(Html.fromHtml("<u>COURSES</u>"));

        explain=(TextView)findViewById(R.id.Course_explain);


    }

    public void php(View v)
    {
        if(v.getId()==R.id.course_php)
        {

            Intent i=new Intent(this,Explain_Activity.class);
            i.putExtra(Explain_Activity.key_item,"PHP:");
            startActivity(i);
        }
        else
        if(v.getId()==R.id.Course_java)
        {
            Intent i=new Intent(this,Explain_Activity.class);
            i.putExtra(Explain_Activity.key_item,"JAVA:");
            startActivity(i);
        }
        else
        if(v.getId()==R.id.Course_game)
        {
            Intent i=new Intent(this,Explain_Activity.class);
            i.putExtra(Explain_Activity.key_item,"GAME DEVELOPMENT:");
            startActivity(i);
        }
        else
        if(v.getId()==R.id.Course_mobile)
        {
            Intent i=new Intent(this,Explain_Activity.class);
            i.putExtra(Explain_Activity.key_item,"MOBILE DEVELOPMENT:");
            startActivity(i);
        }



    }
}
