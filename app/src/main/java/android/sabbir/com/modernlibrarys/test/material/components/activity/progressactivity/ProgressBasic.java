package android.sabbir.com.modernlibrarys.test.material.components.activity.progressactivity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.Toast;
import butterknife.C1142R;

public class ProgressBasic extends C0818e {
    private ProgressBar f6596m;
    private ProgressBar f6597n;
    private ProgressBar f6598o;
    private ProgressBar f6599p;

    private void m11727j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Basic");
        m4370f().mo761a(true);
    }

    private void m11728k() {
        this.f6596m = (ProgressBar) findViewById(C1142R.id.progress_determinate);
        this.f6597n = (ProgressBar) findViewById(C1142R.id.progress_indeterminate_circular);
        this.f6598o = (ProgressBar) findViewById(C1142R.id.progress_buffered);
        this.f6599p = (ProgressBar) findViewById(C1142R.id.progress_indeterminate_determinate);
        m11729l();
        m11730m();
        m11731n();
        m11732o();
        m11733p();
    }

    private void m11729l() {
        final Handler handler = new Handler();
        handler.post(new Runnable(this) {
            final /* synthetic */ ProgressBasic f6587b;

            public void run() {
                int progress = this.f6587b.f6596m.getProgress() + 10;
                this.f6587b.f6596m.setProgress(progress);
                if (progress > 100) {
                    this.f6587b.f6596m.setProgress(0);
                }
                handler.postDelayed(this, 1000);
            }
        });
    }

    private void m11730m() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable(this) {
            final /* synthetic */ ProgressBasic f6589b;

            public void run() {
                int progress = this.f6589b.f6598o.getProgress() + 5;
                this.f6589b.f6598o.setProgress(progress);
                if (progress > 100) {
                    this.f6589b.f6598o.setProgress(0);
                }
                handler.postDelayed(this, 500);
            }
        }, 500);
    }

    private void m11731n() {
        final Handler handler = new Handler();
        handler.post(new Runnable(this) {
            final /* synthetic */ ProgressBasic f6591b;

            public void run() {
                int secondaryProgress = this.f6591b.f6598o.getSecondaryProgress() + 5;
                this.f6591b.f6598o.setSecondaryProgress(secondaryProgress);
                if (secondaryProgress > 100 && this.f6591b.f6598o.getProgress() <= 10) {
                    this.f6591b.f6598o.setSecondaryProgress(0);
                }
                handler.postDelayed(this, 250);
            }
        });
    }

    private void m11732o() {
        final Handler handler = new Handler();
        handler.post(new Runnable(this) {
            final /* synthetic */ ProgressBasic f6593b;

            public void run() {
                if (this.f6593b.f6599p.isIndeterminate()) {
                    this.f6593b.f6599p.setIndeterminate(false);
                    handler.postDelayed(this, 1000);
                    return;
                }
                int progress = this.f6593b.f6599p.getProgress() + 20;
                this.f6593b.f6599p.setProgress(progress);
                if (progress > 100) {
                    this.f6593b.f6599p.setProgress(0);
                    this.f6593b.f6599p.setIndeterminate(true);
                    handler.postDelayed(this, 4000);
                    return;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }

    private void m11733p() {
        final Handler handler = new Handler();
        handler.post(new Runnable(this) {
            final /* synthetic */ ProgressBasic f6595b;

            public void run() {
                int progress = this.f6595b.f6597n.getProgress() + 10;
                this.f6595b.f6597n.setProgress(progress);
                if (progress > 100) {
                    this.f6595b.f6597n.setProgress(0);
                }
                handler.postDelayed(this, 1000);
            }
        });
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_progress_basic);
        m11727j();
        m11728k();
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
