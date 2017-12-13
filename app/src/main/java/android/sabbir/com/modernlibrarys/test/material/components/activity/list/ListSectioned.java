package android.sabbir.com.modernlibrarys.test.material.components.activity.list;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2320t;
import com.material.components.p086a.C2320t.C2317a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;
import java.util.List;

public class ListSectioned extends C0818e {
    private View f6336m;
    private RecyclerView f6337n;
    private C2320t f6338o;

    class C24801 implements C2317a {
        final /* synthetic */ ListSectioned f6335a;

        C24801(ListSectioned listSectioned) {
            this.f6335a = listSectioned;
        }

        public void mo1932a(View view, C2733h c2733h, int i) {
            Snackbar.m1021a(this.f6335a.f6336m, "Item " + c2733h.f7027c + " clicked", -1).m1012a();
        }
    }

    private void m11474j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Sectioned");
        m4370f().mo761a(true);
    }

    private void m11475k() {
        int i = 0;
        this.f6337n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6337n.setLayoutManager(new LinearLayoutManager(this));
        this.f6337n.setHasFixedSize(true);
        List c = C2700a.m12159c(this);
        c.addAll(C2700a.m12159c(this));
        c.addAll(C2700a.m12159c(this));
        List b = C2700a.m12158b((Context) this);
        int i2 = 0;
        int i3 = 0;
        while (i < c.size() / 6) {
            c.add(i3, new C2733h((String) b.get(i2), true));
            i3 += 5;
            i2++;
            i++;
        }
        this.f6338o = new C2320t(this, c);
        this.f6337n.setAdapter(this.f6338o);
        this.f6338o.m11084a(new C24801(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_list_sectioned);
        this.f6336m = findViewById(16908290);
        m11474j();
        m11475k();
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
