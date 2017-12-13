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
import com.material.components.p086a.C2328v;
import com.material.components.p086a.C2328v.C2326a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2738l;

public class ShoppingCategoryImage extends C0818e {
    private View f6706m;
    private RecyclerView f6707n;
    private C2328v f6708o;

    class C26171 implements C2326a {
        final /* synthetic */ ShoppingCategoryImage f6705a;

        C26171(ShoppingCategoryImage shoppingCategoryImage) {
            this.f6705a = shoppingCategoryImage;
        }

        public void mo1971a(View view, C2738l c2738l, int i) {
            Snackbar.m1021a(this.f6705a.f6706m, "Item " + c2738l.f7042c + " clicked", -1).m1012a();
        }
    }

    private void m11847j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Categories");
        m4370f().mo761a(true);
    }

    private void m11848k() {
        this.f6707n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6707n.setLayoutManager(new LinearLayoutManager(this));
        this.f6707n.setHasFixedSize(true);
        this.f6707n.setNestedScrollingEnabled(false);
        this.f6708o = new C2328v(this, C2700a.m12163g(this));
        this.f6707n.setAdapter(this.f6708o);
        this.f6708o.m11099a(new C26171(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_shopping_category_image);
        this.f6706m = findViewById(C1142R.id.parent_view);
        m11847j();
        m11848k();
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
