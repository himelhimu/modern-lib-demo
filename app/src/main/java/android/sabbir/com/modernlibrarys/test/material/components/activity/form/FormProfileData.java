package android.sabbir.com.modernlibrarys.test.material.components.activity.form;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.C0817d.C0816a;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class FormProfileData extends C0818e {
    private String[] f6280m;

    class C24641 implements OnClickListener {
        final /* synthetic */ FormProfileData f6277a;

        C24641(FormProfileData formProfileData) {
            this.f6277a = formProfileData;
        }

        public void onClick(View view) {
            this.f6277a.m11404a((Button) view);
        }
    }

    private void m11404a(final Button button) {
        C0816a c0816a = new C0816a(this);
        c0816a.m4351a(true);
        c0816a.m4352a(this.f6280m, 0, new DialogInterface.OnClickListener(this) {
            final /* synthetic */ FormProfileData f6279b;

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                button.setTextColor(-16777216);
                button.setText(this.f6279b.f6280m[i]);
            }
        });
        c0816a.m4356c();
    }

    private void m11407j() {
        m4362a((Toolbar) findViewById(C1142R.id.toolbar));
        m4370f().mo760a((CharSequence) "Profile");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.pink_400);
    }

    private void m11408k() {
        ((Button) findViewById(C1142R.id.spn_state)).setOnClickListener(new C24641(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_form_profile_data);
        this.f6280m = getResources().getStringArray(C1142R.array.states);
        m11407j();
        m11408k();
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
