package com.example.kirill.p0051_layoutfile;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class ActivityAction extends ActivityPrepare implements View.OnClickListener  {

    MyApp app;
    boolean check;
    int i = 0;
    final Random random = new Random();
    String data = "Casino";

    String spy = "ШПИОН";
    ArrayList<String> role;
    ArrayList<Player> listOfPlayers;
    TextView textView,textViewRole;
    EditText editText;
    Button takeName;
    Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app=(MyApp)getApplication();
        setContentView(R.layout.activity_activity_action);
        textView = (TextView)findViewById(R.id.playerivew);
        editText = (EditText)findViewById(R.id.enterText);
        takeName = (Button)findViewById(R.id.takename);
        nextButton = (Button)findViewById(R.id.nextBUtton);
        textViewRole = (TextView) findViewById(R.id.role);

        takeName.setOnClickListener(this);


        nextButton.setOnClickListener(this);
        textView.setText("Игрок №" + (app.getGame().getCurrentcounter()+1) + "Введите свое имя");
        editText.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // сохраняем текст, введенный до нажатия Enter в переменную

                        app.addPlayer(editText.getText().toString());

                        takeName.setVisibility(View.VISIBLE);

                        return true;
                    }
                    else
                    {

                    }



                return false;
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.takename:
                textViewRole.setText("              Роль:" + app.getGame().getListOfPlayers().get(app.getGame().getCurrentcounter()-1).getRole());
                nextButton.setVisibility(View.VISIBLE);
                break;
            case R.id.nextBUtton:
                    if (app.getGame().getCount()>app.getGame().getCurrentcounter())
                    {
                        editText.setText("");
                        textView.setText("Игрок №" + (app.getGame().getCurrentcounter()+1) + "Введите свое имя");
                        takeName.setVisibility(View.INVISIBLE);
                        textViewRole.setText("");
                       // Toast.makeText(getApplicationContext(), "current"+app.getGame().getCurrentcounter()+","+app.getGame().getCount(), Toast.LENGTH_LONG).show();

                    }
                if ((app.getGame().getCurrentcounter() == app.getGame().getCount())) {

                    Intent intent = new Intent(this, GameActivity.class);
                    startActivity(intent);
                }
            default:
                break;
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_action, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
