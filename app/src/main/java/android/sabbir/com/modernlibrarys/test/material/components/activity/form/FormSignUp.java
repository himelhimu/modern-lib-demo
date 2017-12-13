package android.sabbir.com.modernlibrarys.test.material.components.activity.form;

import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import butterknife.C1142R;

public class FormSignUp extends C0818e {
    private void m11409j() {
        m4362a((Toolbar) findViewById(C1142R.id.toolbar));
        m4370f().mo760a((CharSequence) "Sign Up");
        m4370f().mo761a(true);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_form_sign_up);
        m11409j();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_setting, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), menuItem.getTitle(), 0).show();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
