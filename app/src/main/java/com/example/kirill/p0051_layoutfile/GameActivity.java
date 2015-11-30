package com.example.kirill.p0051_layoutfile;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends ActivityPrepare {
    TextView name1,name2,name3,name4,name5,name6,name7,name8,starting;
    TextView role1,role2,role3,role4,role5,role6,role7,role8;
    Button button1,button2, button3, button4, button5, button6,button7,button8,endgame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app=(MyApp)getApplication();
        setContentView(R.layout.activity_game);
        Random random = new Random();
        name1 = (TextView)findViewById(R.id.name1);
        name2 = (TextView)findViewById(R.id.name2);
        name3 = (TextView)findViewById(R.id.name3);
        name4 = (TextView)findViewById(R.id.name4);
        name5 = (TextView)findViewById(R.id.name5);
        name6 = (TextView)findViewById(R.id.name6);
        name7 = (TextView)findViewById(R.id.name7);
        name8 = (TextView)findViewById(R.id.name8);
        role1 = (TextView)findViewById(R.id.role1);
        role2 = (TextView)findViewById(R.id.role2);
        role3 = (TextView)findViewById(R.id.role3);
        role4 = (TextView)findViewById(R.id.role4);
        role5 = (TextView)findViewById(R.id.role5);
        role6 = (TextView)findViewById(R.id.role6);
        role7 = (TextView)findViewById(R.id.role7);
        role8 = (TextView)findViewById(R.id.role8);
        button1 =(Button)findViewById(R.id.button1);
        button2 =(Button)findViewById(R.id.button2);
        button3 =(Button)findViewById(R.id.button3);
        button4 =(Button)findViewById(R.id.button4);
        button5 =(Button)findViewById(R.id.exitButton);
        button6 =(Button)findViewById(R.id.button6);
        button7 =(Button)findViewById(R.id.button7);
        button8 =(Button)findViewById(R.id.button8);
        endgame = (Button) findViewById(R.id.endGame);
        starting = (TextView)findViewById(R.id.starting);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        endgame.setOnClickListener(this);
        starting.setText("Начинает " + app.getGame().getListOfPlayers().get(random.nextInt(app.getGame().getCount())).getName());
        name1.setVisibility(View.VISIBLE);
        name2.setVisibility(View.VISIBLE);
        name3.setVisibility(View.VISIBLE);
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);

        name1.setText(app.getGame().getListOfPlayers().get(0).getName());
        name2.setText(app.getGame().getListOfPlayers().get(1).getName());
        name3.setText(app.getGame().getListOfPlayers().get(2).getName());

        switch(app.getGame().getCount())
        {

            case 4 :
                name4.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                name4.setText(app.getGame().getListOfPlayers().get(3).getName());
                break;
            case 5:
                name4.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                name4.setText(app.getGame().getListOfPlayers().get(3).getName());
                name5.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                name5.setText(app.getGame().getListOfPlayers().get(4).getName());
                break;
            case 6:
                name4.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                name4.setText(app.getGame().getListOfPlayers().get(3).getName());
                name5.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                name5.setText(app.getGame().getListOfPlayers().get(4).getName());
                name6.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);
               name6.setText(app.getGame().getListOfPlayers().get(5).getName());
                break;
            case 7:
                name4.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                name4.setText(app.getGame().getListOfPlayers().get(3).getName());
                name5.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                name5.setText(app.getGame().getListOfPlayers().get(4).getName());
                name6.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);
                name6.setText(app.getGame().getListOfPlayers().get(5).getName());
                name7.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);
                name7.setText(app.getGame().getListOfPlayers().get(6).getName());
                break;
            case 8:
                name4.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                name4.setText(app.getGame().getListOfPlayers().get(3).getName());
                name5.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                name5.setText(app.getGame().getListOfPlayers().get(4).getName());
                name6.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);
                name6.setText(app.getGame().getListOfPlayers().get(5).getName());
                name7.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);
                name7.setText(app.getGame().getListOfPlayers().get(6).getName());
                name8.setVisibility(View.VISIBLE);
                button8.setVisibility(View.VISIBLE);
               name8.setText(app.getGame().getListOfPlayers().get(7).getName());
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }
@Override
public void onClick (View v)
    {
        switch(v.getId())
        {
            case R.id.button1:
                role1.setVisibility(View.VISIBLE);
                role1.setText(app.getGame().getListOfPlayers().get(0).getRole());
                break;
            case R.id.button2:
                role2.setVisibility(View.VISIBLE);
                role2.setText(app.getGame().getListOfPlayers().get(1).getRole());
                break;
            case R.id.button3:
                role3.setVisibility(View.VISIBLE);
                role3.setText(app.getGame().getListOfPlayers().get(2).getRole());
                break;
            case R.id.button4:
                role4.setVisibility(View.VISIBLE);
                role4.setText(app.getGame().getListOfPlayers().get(3).getRole());
                break;
            case R.id.exitButton:
                role5.setVisibility(View.VISIBLE);
                role5.setText(app.getGame().getListOfPlayers().get(4).getRole());
                break;
            case R.id.button6:
                role6.setVisibility(View.VISIBLE);
                role6.setText(app.getGame().getListOfPlayers().get(5).getRole());
                break;
            case R.id.button7:
                role7.setVisibility(View.VISIBLE);
                role7.setText(app.getGame().getListOfPlayers().get(6).getRole());
                break;
            case R.id.button8:
                role8.setVisibility(View.VISIBLE);
                role8.setText(app.getGame().getListOfPlayers().get(7).getRole());
                break;
            case R.id.endGame:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }

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
