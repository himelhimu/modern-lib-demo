package android.sabbir.com.modernlibrarys.test.material.components.activity.dialog;

import android.os.Bundle;
import android.support.v4.p008b.C0227l;
import android.support.v4.p008b.C0343w;
import android.support.v4.p008b.C0365q;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p088c.C2709a;
import com.material.components.p088c.C2709a.C2440a;
import com.material.components.p091e.C2726a;

public class DialogFullscreen extends C0818e {

    class C24391 implements OnClickListener {
        final /* synthetic */ DialogFullscreen f6219a;

        C24391(DialogFullscreen dialogFullscreen) {
            this.f6219a = dialogFullscreen;
        }

        public void onClick(View view) {
            this.f6219a.m11350k();
        }
    }

    class C24412 implements C2440a {
        final /* synthetic */ DialogFullscreen f6220a;

        C24412(DialogFullscreen dialogFullscreen) {
            this.f6220a = dialogFullscreen;
        }

        public void mo1939a(int i, Object obj) {
            if (i == 300) {
                this.f6220a.m11348a((C2726a) obj);
            }
        }
    }

    private void m11348a(C2726a c2726a) {
        ((TextView) findViewById(C1142R.id.tv_email)).setText(c2726a.f6986a);
        ((TextView) findViewById(C1142R.id.tv_name)).setText(c2726a.f6987b);
        ((TextView) findViewById(C1142R.id.tv_location)).setText(c2726a.f6988c);
        ((TextView) findViewById(C1142R.id.tv_from)).setText(c2726a.f6989d);
        ((TextView) findViewById(C1142R.id.tv_to)).setText(c2726a.f6990e);
        ((TextView) findViewById(C1142R.id.tv_allday)).setText(c2726a.f6991f.toString());
        ((TextView) findViewById(C1142R.id.tv_timezone)).setText(c2726a.f6992g);
    }

    private void m11349j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "FullScreen");
        m4370f().mo761a(true);
    }

    private void m11350k() {
        C0365q e = m1917e();
        C0227l c2709a = new C2709a();
        c2709a.m12178c(300);
        C0343w a = e.mo332a();
        a.mo298a(4097);
        a.mo299a(16908290, c2709a).mo303a(null).mo305b();
        c2709a.m12177a(new C24412(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_dialog_fullscreen);
        m11349j();
        ((AppCompatButton) findViewById(C1142R.id.fullscreen_dialog)).setOnClickListener(new C24391(this));
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
