package karanbatra.com.codekamp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Explain_Activity extends Activity {
    TextView explain;
    public static final String key_item="abcd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);

        explain=(TextView)findViewById(R.id.Course_Title);

String s=getIntent().getStringExtra(key_item);
        explain.setText(s);

    }
}
