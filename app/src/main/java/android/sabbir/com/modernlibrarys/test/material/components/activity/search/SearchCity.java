package android.sabbir.com.modernlibrarys.test.material.components.activity.search;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class SearchCity extends C0818e {
    private void m11769j() {
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_1), (int) C1142R.drawable.image_8);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_2), (int) C1142R.drawable.image_9);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_3), (int) C1142R.drawable.image_15);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_4), (int) C1142R.drawable.image_14);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_5), (int) C1142R.drawable.image_12);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_6), (int) C1142R.drawable.image_2);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_7), (int) C1142R.drawable.image_5);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_search_city);
        m11769j();
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
