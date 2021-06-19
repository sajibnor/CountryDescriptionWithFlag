package com.example.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String [] countryName;
    private int [] flags={R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,
            R.drawable.bahrain,R.drawable.bangladesh,R.drawable.bhutan,R.drawable.china,
            R.drawable.india,R.drawable.japan,R.drawable.nepal,R.drawable.pakistan,R.drawable.srilanka
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.settingid){
            Toast.makeText(MainActivity.this,"There is no setting",Toast.LENGTH_SHORT).show();
            return true;
        } if(item.getItemId()==R.id.aboutid){
            Toast.makeText(MainActivity.this,"Devloper Sajib Mridha",Toast.LENGTH_SHORT).show();
            return true;
        } if(item.getItemId()==R.id.shareid){
            Toast.makeText(MainActivity.this,"There is no share",Toast.LENGTH_SHORT).show();
        return true;
        } if(item.getItemId()==R.id.contractid){
            Toast.makeText(MainActivity.this,"Mobile no: 01744213411",Toast.LENGTH_SHORT).show();
        return true;
        } if(item.getItemId()==R.id.feedbackid){
            Toast.makeText(MainActivity.this,"There is no need",Toast.LENGTH_SHORT).show();
        return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        listView=findViewById(R.id.listviewid);
        countryName=getResources().getStringArray(R.array.country_names);
        CustomAdapter customadapter=new CustomAdapter(this,countryName,flags);
        listView.setAdapter(customadapter);



    }
}
