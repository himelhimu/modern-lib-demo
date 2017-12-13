package android.sabbir.com.modernlibrarys.test.material.components.activity.gridlist;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2252g;
import com.material.components.p086a.C2252g.C2249a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2737k;
import java.util.ArrayList;
import java.util.List;

public class GridSectioned extends C0818e {
    private View f6294m;
    private RecyclerView f6295n;
    private C2252g f6296o;

    class C24691 implements C2249a {
        final /* synthetic */ GridSectioned f6293a;

        C24691(GridSectioned gridSectioned) {
            this.f6293a = gridSectioned;
        }

        public void mo1945a(View view, C2737k c2737k, int i) {
        }
    }

    private void m11424j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Sectioned");
        m4370f().mo761a(true);
    }

    private void m11425k() {
        int i = 0;
        this.f6295n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6295n.setLayoutManager(new StaggeredGridLayoutManager(3, 1));
        this.f6295n.setHasFixedSize(true);
        List<Integer> a = C2700a.m12156a((Context) this);
        a.addAll(C2700a.m12156a((Context) this));
        a.addAll(C2700a.m12156a((Context) this));
        a.addAll(C2700a.m12156a((Context) this));
        a.addAll(C2700a.m12156a((Context) this));
        List arrayList = new ArrayList();
        for (Integer num : a) {
            arrayList.add(new C2737k(num.intValue(), "IMG_" + num + ".jpg", false));
        }
        List b = C2700a.m12158b((Context) this);
        int i2 = 0;
        int i3 = 0;
        while (i < arrayList.size() / 10) {
            arrayList.add(i3, new C2737k(-1, (String) b.get(i2), true));
            i3 += 10;
            i2++;
            i++;
        }
        this.f6296o = new C2252g(this, arrayList);
        this.f6295n.setAdapter(this.f6296o);
        this.f6296o.m10946a(new C24691(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_grid_sectioned);
        this.f6294m = findViewById(16908290);
        m11424j();
        m11425k();
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
