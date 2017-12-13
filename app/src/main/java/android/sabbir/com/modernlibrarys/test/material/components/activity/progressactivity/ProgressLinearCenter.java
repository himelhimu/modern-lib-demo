package android.sabbir.com.modernlibrarys.test.material.components.activity.progressactivity;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2303q;
import com.material.components.p086a.C2303q.C2300a;
import com.material.components.p089f.C2754e;
import com.material.components.p091e.C2727b;
import java.util.ArrayList;
import java.util.List;

public class ProgressLinearCenter extends C0818e {
    private View f6611m;
    private RecyclerView f6612n;
    private C2303q f6613o;

    class C25782 implements Runnable {
        final /* synthetic */ ProgressLinearCenter f6609a;

        C25782(ProgressLinearCenter progressLinearCenter) {
            this.f6609a = progressLinearCenter;
        }

        public void run() {
            this.f6609a.m11745l();
        }
    }

    class C25793 implements C2300a {
        final /* synthetic */ ProgressLinearCenter f6610a;

        C25793(ProgressLinearCenter progressLinearCenter) {
            this.f6610a = progressLinearCenter;
        }

        public void mo1966a(View view, C2727b c2727b, int i) {
            Snackbar.m1021a(this.f6610a.f6611m, "Item " + c2727b.f6994b + " clicked", -1).m1012a();
        }
    }

    private void m11743j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a(null);
        m4370f().mo761a(true);
        m11744k();
    }

    private void m11744k() {
        final LinearLayout linearLayout = (LinearLayout) findViewById(C1142R.id.lyt_progress);
        linearLayout.setVisibility(0);
        linearLayout.setAlpha(1.0f);
        this.f6612n.setVisibility(8);
        new Handler().postDelayed(new Runnable(this) {
            final /* synthetic */ ProgressLinearCenter f6608b;

            public void run() {
                C2754e.m12271c(linearLayout);
            }
        }, 2000);
        new Handler().postDelayed(new C25782(this), 2400);
    }

    private void m11745l() {
        this.f6612n.setVisibility(0);
        this.f6612n.setLayoutManager(new LinearLayoutManager(this));
        this.f6612n.setHasFixedSize(true);
        List arrayList = new ArrayList();
        arrayList.add(new C2727b("Folders", true));
        arrayList.add(new C2727b("Photos", "Jan 9, 2014", C1142R.drawable.ic_folder, true));
        arrayList.add(new C2727b("Recipes", "Jan 17, 2014", C1142R.drawable.ic_folder, true));
        arrayList.add(new C2727b("Work", "Jan 28, 2014", C1142R.drawable.ic_folder, true));
        arrayList.add(new C2727b("Files", true));
        arrayList.add(new C2727b("Vacation itinerary", "Jan 20, 2014", C1142R.drawable.ic_insert_drive, false));
        arrayList.add(new C2727b("Kitchen Remodel", "Jan 10, 2014", C1142R.drawable.ic_insert_drive, false));
        arrayList.add(new C2727b("To Do Note", "Des 25, 2013", C1142R.drawable.ic_insert_drive, false));
        arrayList.add(new C2727b("", true));
        this.f6613o = new C2303q(this, arrayList, 2);
        this.f6612n.setAdapter(this.f6613o);
        this.f6613o.m11044a(new C25793(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_progress_linear_center);
        this.f6611m = findViewById(16908290);
        this.f6612n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        m11743j();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_refresh_setting, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else if (menuItem.getItemId() == C1142R.id.action_refresh) {
            m11744k();
        } else {
            Toast.makeText(getApplicationContext(), menuItem.getTitle(), 0).show();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
