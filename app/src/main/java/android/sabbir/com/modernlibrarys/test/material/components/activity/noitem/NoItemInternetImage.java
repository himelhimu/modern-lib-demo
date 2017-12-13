package android.sabbir.com.modernlibrarys.test.material.components.activity.noitem;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class NoItemInternetImage extends C0818e {
    private ProgressBar f6394m;
    private LinearLayout f6395n;
    private AppCompatButton f6396o;

    class C25021 implements OnClickListener {
        final /* synthetic */ NoItemInternetImage f6393a;

        class C25011 implements Runnable {
            final /* synthetic */ C25021 f6392a;

            C25011(C25021 c25021) {
                this.f6392a = c25021;
            }

            public void run() {
                this.f6392a.f6393a.f6394m.setVisibility(8);
                this.f6392a.f6393a.f6395n.setVisibility(0);
            }
        }

        C25021(NoItemInternetImage noItemInternetImage) {
            this.f6393a = noItemInternetImage;
        }

        public void onClick(View view) {
            this.f6393a.f6394m.setVisibility(0);
            this.f6393a.f6395n.setVisibility(8);
            new Handler().postDelayed(new C25011(this), 1000);
        }
    }

    private void m11531j() {
        this.f6394m = (ProgressBar) findViewById(C1142R.id.progress_bar);
        this.f6395n = (LinearLayout) findViewById(C1142R.id.lyt_no_connection);
        this.f6396o = (AppCompatButton) findViewById(C1142R.id.bt_retry);
        this.f6394m.setVisibility(8);
        this.f6395n.setVisibility(0);
        this.f6396o.setOnClickListener(new C25021(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_no_item_internet_image);
        m11531j();
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }
}
