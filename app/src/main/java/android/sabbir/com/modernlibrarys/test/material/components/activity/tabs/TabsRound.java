package android.sabbir.com.modernlibrarys.test.material.components.activity.tabs;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p089f.C2754e;

public class TabsRound extends C0818e {
    private View f6937m;

    private void m12107j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Home");
        m4370f().mo761a(true);
    }

    private void m12108k() {
        this.f6937m = findViewById(C1142R.id.main_content);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_1), (int) C1142R.drawable.image_8);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_2), (int) C1142R.drawable.image_9);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_3), (int) C1142R.drawable.image_15);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_4), (int) C1142R.drawable.image_14);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_5), (int) C1142R.drawable.image_12);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_6), (int) C1142R.drawable.image_2);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_7), (int) C1142R.drawable.image_5);
    }

    public void onButtonTabClick(View view) {
        CharSequence b = C2746d.m12262b(((Button) view).getText().toString());
        switch (view.getId()) {
            case C1142R.id.tab_home:
                Snackbar.m1021a(this.f6937m, b, -1).m1012a();
                break;
            case C1142R.id.tab_top_artists:
                Snackbar.m1021a(this.f6937m, b, -1).m1012a();
                break;
            case C1142R.id.tab_top_albums:
                Snackbar.m1021a(this.f6937m, b, -1).m1012a();
                break;
            case C1142R.id.tab_new_releases:
                Snackbar.m1021a(this.f6937m, b, -1).m1012a();
                break;
            case C1142R.id.tab_top_songs:
                Snackbar.m1021a(this.f6937m, b, -1).m1012a();
                break;
        }
        m4370f().mo760a(b);
        C2754e.m12275g((NestedScrollView) findViewById(C1142R.id.nested_content));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_tabs_round);
        m12107j();
        m12108k();
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
