package com.developerstudyjams.veitsi.appboyhunting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ViewFlipper;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    TextView quantityTextView;
    int stage=0;
    final String[] stages=new String[]{"Intro", "1.What (to dress)?","2.Where (to go)?",
    "3.Who (is target)?", "4.Why (he answers)?","5.When (to meet next time)?"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        quantityTextView = (TextView) findViewById(
                R.id.txtStatus);
        ListView listView = (ListView) findViewById(R.id.lstGreeting);

        // определяем массив типа String
        final String[] catnames = new String[]{
                "Переходим к java-коду. Сначала мы получаем экземпляр элемента ListView в методе onCreate(). Далее мы определяем массив типа String. И, наконец, используем адаптер данных, чтобы сопоставить данные с шаблоном разметки. Выбор адаптера зависит от типа используемых данных. В нашем случае мы использовали класс ArrayAdapter.",
                "А будет еще лучше, если вы воспользуетесь специально предназначенным для этого случая типом ресурса",
                "Мурзик", "Мурка", "Васька","Томасина"
        };
        final String[] events = new String[]{
                "Java, how to improve perfomance","Swinger party","QA for beginners"
        };

        // используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, catnames);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                Toast.makeText(getApplicationContext(), ((TextView) itemClicked).getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void order(View view) {
        display("some text");
        if (stage<5){
            stage+=1;
            this.setTitle(stages[stage]);
            viewFlipper.showNext();
        }

    }

    public void nextView(View view) {
        viewFlipper.showNext();
    }

    public void display(String m) {
        quantityTextView.setText(m);
    }

    public void eventClick(View view) {
        switch (view.getId()) {
            case R.id.chbJava:
                display("You are extremally smart :)");
        }
    }

    public void guyClick(View view) {
        //view.setVisibility(View.INVISIBLE);
        view.setClickable(false);

        switch (view.getId()) {
            case R.id.imgGuy01:
                display("Good choice. Go ahead!");
                break;
            case R.id.imgGuy03:
                display("probably he is not a human");
                break;
            case R.id.imgGuy02:
                display("He probably is a deputy");
                break;
            case R.id.imgGuy04:
                display("You are great!");
                break;
        }
    }
}
