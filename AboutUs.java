package navdurgaaarti.app.hmp.aarti.com.navratriaarti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txt1= (TextView)findViewById(R.id.txt);
        txt2=(TextView)findViewById(R.id.txtx);
        txt3=(TextView)findViewById(R.id.txt2);
    }
}
