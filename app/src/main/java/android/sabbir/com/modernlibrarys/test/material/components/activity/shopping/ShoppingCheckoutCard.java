package android.sabbir.com.modernlibrarys.test.material.components.activity.shopping;

import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import butterknife.C1142R;

public class ShoppingCheckoutCard extends C0818e {
    private void m11853j() {
        m4362a((Toolbar) findViewById(C1142R.id.toolbar));
        m4370f().mo760a((CharSequence) "Checkout");
        m4370f().mo761a(true);
    }

    private void m11854k() {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_shopping_checkout_card);
        m11853j();
        m11854k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_done, menu);
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
