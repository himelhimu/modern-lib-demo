package android.sabbir.com.modernlibrarys.test.material.components.activity.shopping;

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
import com.material.components.p086a.C2324u;
import com.material.components.p086a.C2324u.C2322a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2738l;

public class ShoppingCategoryList extends C0818e {
    private View f6710m;
    private RecyclerView f6711n;
    private C2324u f6712o;

    class C26181 implements C2322a {
        final /* synthetic */ ShoppingCategoryList f6709a;

        C26181(ShoppingCategoryList shoppingCategoryList) {
            this.f6709a = shoppingCategoryList;
        }

        public void mo1972a(View view, C2738l c2738l, int i) {
            Snackbar.m1021a(this.f6709a.f6710m, "Item " + c2738l.f7042c + " clicked", -1).m1012a();
        }
    }

    private void m11851j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Categories");
        m4370f().mo761a(true);
    }

    private void m11852k() {
        this.f6711n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6711n.setLayoutManager(new LinearLayoutManager(this));
        this.f6711n.setHasFixedSize(true);
        this.f6711n.setNestedScrollingEnabled(false);
        this.f6712o = new C2324u(this, C2700a.m12163g(this));
        this.f6711n.setAdapter(this.f6712o);
        this.f6712o.m11092a(new C26181(this));
    }

    public void onButtonTabClick(View view) {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_shopping_category_list);
        this.f6710m = findViewById(C1142R.id.parent_view);
        m11851j();
        m11852k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_cart_setting, menu);
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
