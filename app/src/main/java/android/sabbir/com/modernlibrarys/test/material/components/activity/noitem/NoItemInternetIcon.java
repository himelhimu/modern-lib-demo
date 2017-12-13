package android.sabbir.com.modernlibrarys.test.material.components.activity.noitem;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import butterknife.C1142R;

public class NoItemInternetIcon extends C0818e {
    private ProgressBar f6390m;
    private LinearLayout f6391n;

    class C25001 implements OnClickListener {
        final /* synthetic */ NoItemInternetIcon f6389a;

        class C24991 implements Runnable {
            final /* synthetic */ C25001 f6388a;

            C24991(C25001 c25001) {
                this.f6388a = c25001;
            }

            public void run() {
                this.f6388a.f6389a.f6390m.setVisibility(8);
                this.f6388a.f6389a.f6391n.setVisibility(0);
            }
        }

        C25001(NoItemInternetIcon noItemInternetIcon) {
            this.f6389a = noItemInternetIcon;
        }

        public void onClick(View view) {
            this.f6389a.f6390m.setVisibility(0);
            this.f6389a.f6391n.setVisibility(8);
            new Handler().postDelayed(new C24991(this), 1000);
        }
    }

    private void m11527j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Search");
        m4370f().mo761a(true);
    }

    private void m11528k() {
        this.f6390m = (ProgressBar) findViewById(C1142R.id.progress_bar);
        this.f6391n = (LinearLayout) findViewById(C1142R.id.lyt_no_connection);
        this.f6390m.setVisibility(8);
        this.f6391n.setVisibility(0);
        this.f6391n.setOnClickListener(new C25001(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_no_item_internet_icon);
        m11527j();
        m11528k();
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
