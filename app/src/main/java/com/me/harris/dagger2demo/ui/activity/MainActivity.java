package com.me.harris.dagger2demo.ui.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.me.harris.dagger2demo.App;
import com.me.harris.dagger2demo.R;
import com.me.harris.dagger2demo.databinding.ActivityMainBinding;
import com.me.harris.dagger2demo.injector.components.ActivityComponent;
import com.me.harris.dagger2demo.injector.components.DaggerActivityComponent;
import com.me.harris.dagger2demo.injector.modules.UserModule;
import com.me.harris.dagger2demo.model.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private ActivityComponent mActivityComponent;


    @Inject
    User user;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mActivityComponent = DaggerActivityComponent.builder()
                .appComponent(((App) getApplication()).getmAppcomponent()).
                        userModule(new UserModule(new User(1,"Main")))
                .build();

        mActivityComponent.inject(this);


        setSupportActionBar(binding.toolbar);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Intent intent = new Intent(MainActivity.this, DaggerBasicImageActivity.class);
                startActivity(intent);
            }
        });
        // Example of a call to a native method
        binding.included.sampleText.setText(" " + user.getName() + "\n" + user.getId() + "\n");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}
