package android.sabbir.com.modernlibrarys.test.material.components.activity.noitem;

import android.app.Activity;
import android.graphics.PorterDuff.Mode;
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

public class NoItemBgCactus extends C0818e {
    private ImageView f6385m;

    class C24971 implements OnClickListener {
        final /* synthetic */ NoItemBgCactus f6384a;

        C24971(NoItemBgCactus noItemBgCactus) {
            this.f6384a = noItemBgCactus;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6384a.getApplicationContext(), "Add Account clicked", 0).show();
        }
    }

    private void m11521j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_ATOP);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Account");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }

    private void m11522k() {
        this.f6385m = (ImageView) findViewById(C1142R.id.bg_image);
        LayoutParams layoutParams = this.f6385m.getLayoutParams();
        layoutParams.height = C2746d.m12247a();
        this.f6385m.setLayoutParams(layoutParams);
        ((FloatingActionButton) findViewById(C1142R.id.fab_add)).setOnClickListener(new C24971(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_no_item_bg_cactus);
        m11521j();
        m11522k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_setting, menu);
        C2746d.m12257a(menu, getResources().getColor(C1142R.color.grey_60));
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
