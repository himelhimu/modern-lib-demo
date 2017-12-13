package android.sabbir.com.modernlibrarys.test.material.components.activity.noitem;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class NoItemBgCity extends C0818e {
    private ImageView f6387m;

    class C24981 implements OnClickListener {
        final /* synthetic */ NoItemBgCity f6386a;

        C24981(NoItemBgCity noItemBgCity) {
            this.f6386a = noItemBgCity;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6386a.getApplicationContext(), "Add City clicked", 0).show();
        }
    }

    private void m11523j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "City");
        m4370f().mo761a(true);
    }

    private void m11524k() {
        this.f6387m = (ImageView) findViewById(C1142R.id.bg_image);
        LayoutParams layoutParams = this.f6387m.getLayoutParams();
        layoutParams.height = C2746d.m12247a();
        this.f6387m.setLayoutParams(layoutParams);
        ((FloatingActionButton) findViewById(C1142R.id.fab_add)).setOnClickListener(new C24981(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_no_item_bg_city);
        m11523j();
        m11524k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_setting, menu);
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
