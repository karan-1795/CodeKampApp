package karanbatra.com.codekamp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Intent_Activity extends Activity implements View.OnClickListener {
    ImageView share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

share=(ImageView)findViewById(R.id.share);
        share.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent();
        i.setAction(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_TEXT, "i want to share my text!");
        i.setType("text/plain");
startActivity(Intent.createChooser(i,"OOPS! no app found"));

    }
}
