package android.sabbir.com.modernlibrarys.test.material.components.activity.bottomsheet;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2344y;
import com.material.components.p086a.C2344y.C2342a;
import com.material.components.p088c.C2712b;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;

public class BottomSheetFull extends C0818e {
    private RecyclerView f6067m;
    private C2344y f6068n;

    class C23751 implements C2342a {
        final /* synthetic */ BottomSheetFull f6066a;

        C23751(BottomSheetFull bottomSheetFull) {
            this.f6066a = bottomSheetFull;
        }

        public void mo1929a(View view, C2733h c2733h, int i) {
            C2712b c2712b = new C2712b();
            c2712b.m12190a(c2733h);
            c2712b.mo1467a(this.f6066a.m1917e(), "dialog");
        }
    }

    private void m11208j() {
        this.f6067m = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6067m.setLayoutManager(new LinearLayoutManager(this));
        this.f6068n = new C2344y(this, C2700a.m12159c(this));
        this.f6067m.setAdapter(this.f6068n);
        this.f6068n.m11129a(new C23751(this));
        C2712b c2712b = new C2712b();
        c2712b.m12190a(this.f6068n.m11131f(0));
        c2712b.mo1467a(m1917e(), "dialog");
    }

    private void m11209k() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Full");
        m4370f().mo761a(true);
        C2746d.m12252a((Activity) this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_bottom_sheet_full);
        m11208j();
        m11209k();
        Toast.makeText(this, "Swipe up bottom sheet", 0).show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_basic, menu);
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
