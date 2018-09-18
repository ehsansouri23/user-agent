package agent.user.useragent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView userAgent;
    String res = "v1: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userAgent = (TextView) findViewById(R.id.user_agent);

        res += new WebView(this).getSettings().getUserAgentString();
        res += "\n\n";
        res += "v2: ";
        res += System.getProperty("http.agent");

        userAgent.setText(res);



    }
}
