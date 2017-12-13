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

public class ProgressCircleCenter extends C0818e {
    private View f6604m;
    private RecyclerView f6605n;
    private C2303q f6606o;

    class C25752 implements Runnable {
        final /* synthetic */ ProgressCircleCenter f6602a;

        C25752(ProgressCircleCenter progressCircleCenter) {
            this.f6602a = progressCircleCenter;
        }

        public void run() {
            this.f6602a.m11739l();
        }
    }

    class C25763 implements C2300a {
        final /* synthetic */ ProgressCircleCenter f6603a;

        C25763(ProgressCircleCenter progressCircleCenter) {
            this.f6603a = progressCircleCenter;
        }

        public void mo1966a(View view, C2727b c2727b, int i) {
            Snackbar.m1021a(this.f6603a.f6604m, "Item " + c2727b.f6994b + " clicked", -1).m1012a();
        }
    }

    private void m11737j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a(null);
        m4370f().mo761a(true);
    }

    private void m11738k() {
        final LinearLayout linearLayout = (LinearLayout) findViewById(C1142R.id.lyt_progress);
        linearLayout.setVisibility(0);
        linearLayout.setAlpha(1.0f);
        this.f6605n.setVisibility(8);
        new Handler().postDelayed(new Runnable(this) {
            final /* synthetic */ ProgressCircleCenter f6601b;

            public void run() {
                C2754e.m12271c(linearLayout);
            }
        }, 2000);
        new Handler().postDelayed(new C25752(this), 2400);
    }

    private void m11739l() {
        this.f6605n.setVisibility(0);
        this.f6605n.setLayoutManager(new LinearLayoutManager(this));
        this.f6605n.setHasFixedSize(true);
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
        this.f6606o = new C2303q(this, arrayList, 2);
        this.f6605n.setAdapter(this.f6606o);
        this.f6606o.m11044a(new C25763(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_progress_circle_center);
        this.f6604m = findViewById(16908290);
        this.f6605n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        m11737j();
        m11738k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_refresh_setting, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else if (menuItem.getItemId() == C1142R.id.action_refresh) {
            m11738k();
        } else {
            Toast.makeText(getApplicationContext(), menuItem.getTitle(), 0).show();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
