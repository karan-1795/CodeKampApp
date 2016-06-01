package in.codekamp.codekamp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import karanbatra.com.codekamp.Contact;

public class SecondActivity extends CodeKampActivity {

    private TextView mDummyTextView;
    public static final int a=1;

    private static final String EXTRA_CONTACT_ID = "contact_id";
    private static final String RESULT_CONTACT = "contact_result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mDummyTextView = (TextView)findViewById(R.id.dummy_text_view);

        String contactId = getIntent().getStringExtra(EXTRA_CONTACT_ID);

        mDummyTextView.setText("detail of contact: " + contactId);
    }

    public static Intent newIntent(Context context, String contactId) {
        Intent intent = new Intent(context, SecondActivity.class);

        intent.putExtra(EXTRA_CONTACT_ID, contactId);

        return intent;
    }

    public static Contact getContact(Intent intent) {
        return (Contact)intent.getSerializableExtra(RESULT_CONTACT);
    }

}
