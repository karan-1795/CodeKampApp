package karanbatra.com.codekamp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import in.codekamp.codekamp.R;
import karanbatra.com.codekamp;

public class Contact extends Activity implements View.OnClickListener {
    TextView techie;

    TextView mr1;
    TextView mr2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        techie = (TextView) findViewById(R.id.TextView_Techie);
        techie.setText(Html.fromHtml("<u>TECHIES</u>"));

        mr1=(TextView)findViewById(R.id.mrprasanat);
        mr2=(TextView)findViewById(R.id.mrahish);
        mr1.setOnClickListener(this);
        mr2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        if(v.getId()==R.id.mrprasanat)
        {
            i.setData(Uri.parse("tel:828-560-166-6"));
        }
        if(v.getId()==R.id.mrahish)
        {
            i.setData(Uri.parse("tel:769-885-852-6"));
        }
        startActivity(i);

    }
}
