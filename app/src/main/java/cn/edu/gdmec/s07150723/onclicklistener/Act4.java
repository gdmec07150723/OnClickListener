package cn.edu.gdmec.s07150723.onclicklistener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Act4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
    }
    public void myClick(View v){
        Toast.makeText(this,"布局的定义",Toast.LENGTH_LONG).show();
    }
}
