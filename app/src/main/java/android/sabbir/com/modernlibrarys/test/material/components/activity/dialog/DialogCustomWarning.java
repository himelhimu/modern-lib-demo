package android.sabbir.com.modernlibrarys.test.material.components.activity.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.Toast;
import butterknife.C1142R;

public class DialogCustomWarning extends C0818e {

    class C24371 implements OnClickListener {
        final /* synthetic */ DialogCustomWarning f6216a;

        C24371(DialogCustomWarning dialogCustomWarning) {
            this.f6216a = dialogCustomWarning;
        }

        public void onClick(View view) {
            this.f6216a.m11343k();
        }
    }

    private void m11342j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Custom Warning");
        m4370f().mo761a(true);
    }

    private void m11343k() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C1142R.layout.dialog_warning);
        dialog.setCancelable(true);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -2;
        layoutParams.height = -2;
        ((AppCompatButton) dialog.findViewById(C1142R.id.bt_close)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DialogCustomWarning f6218b;

            public void onClick(View view) {
                Toast.makeText(this.f6218b.getApplicationContext(), ((AppCompatButton) view).getText().toString() + " Clicked", 0).show();
                dialog.dismiss();
            }
        });
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_dialog_custom_warning);
        m11342j();
        ((AppCompatButton) findViewById(C1142R.id.custom_dialog)).setOnClickListener(new C24371(this));
        m11343k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search_setting, menu);
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
