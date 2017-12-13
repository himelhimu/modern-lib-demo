package android.sabbir.com.modernlibrarys.test.material.components.activity.chip;

import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import butterknife.C1142R;
import com.hootsuite.nachos.NachoTextView;
import java.util.ArrayList;
import java.util.List;

public class ChipTag extends C0818e {
    private void m11300j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Tag");
        m4370f().mo761a(true);
    }

    private void m11301k() {
        NachoTextView nachoTextView = (NachoTextView) findViewById(C1142R.id.et_tag);
        List arrayList = new ArrayList();
        arrayList.add("black");
        arrayList.add("building");
        arrayList.add("city");
        nachoTextView.setText(arrayList);
        nachoTextView.m10757a('\n', 0);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_chip_tag);
        m11300j();
        m11301k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_done, menu);
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
