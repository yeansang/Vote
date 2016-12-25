package test.com.vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    int imagevote[] = new int[3];
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyclickListener listener = new MyclickListener();

        imageView1 = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        button1 = (Button) findViewById(R.id.button);

        imageView1.setOnClickListener(listener);
        imageView2.setOnClickListener(listener);
        imageView3.setOnClickListener(listener);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Resultpage.class);
                intent.putExtra("image1",imagevote[0]);
                intent.putExtra("image2",imagevote[1]);
                intent.putExtra("image3",imagevote[2]);
                Log.d("intent", imagevote[0]+"/"+imagevote[1]+"/"+imagevote[2]);
                startActivity(intent);
            }
        });
    }

    class MyclickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            if(view == imageView1){
                imagevote[0]++;
            }else if(view == imageView2){
                imagevote[1]++;
            }else if(view == imageView3){
                imagevote[2]++;
            }
            Toast.makeText(getApplicationContext(),"image voted", Toast.LENGTH_SHORT).show();
        }
    }
}
