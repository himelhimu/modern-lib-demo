package android.sabbir.com.modernlibrarys.test.material.components.activity.noitem;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.p008b.C0227l;
import android.support.v4.p008b.C0365q;
import android.support.v4.p008b.C0378u;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0510j;
import android.support.v4.view.ab;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import java.util.ArrayList;
import java.util.List;

public class NoItemTabs extends C0818e {
    public static String[] f6404m = new String[]{"No Feed, yet", "No Friend, yet", "No Message, yet"};
    public static String[] f6405n = new String[]{"No post in your feed yet!\nTap button and add your first", "No friend in your friend list yet!\nSearch and discover new friend", "No messages in your inbox yet!\nStart chatting with your friends"};
    public static int[] f6406o = new int[]{C1142R.drawable.img_no_feed, C1142R.drawable.img_no_friend, C1142R.drawable.img_no_chat};
    private ViewPager f6407p;
    private TabLayout f6408q;
    private FloatingActionButton f6409r;
    private Toolbar f6410s;

    class C25031 extends C0510j {
        final /* synthetic */ NoItemTabs f6397a;

        C25031(NoItemTabs noItemTabs) {
            this.f6397a = noItemTabs;
        }

        public void mo182b(int i) {
            this.f6397a.m11545b(i);
            this.f6397a.f6410s.setTitle(this.f6397a.f6408q.m1120a(i).m1080d().toString());
            super.mo182b(i);
        }
    }

    class C25042 implements OnClickListener {
        final /* synthetic */ NoItemTabs f6398a;

        C25042(NoItemTabs noItemTabs) {
            this.f6398a = noItemTabs;
        }

        public void onClick(View view) {
            CharSequence charSequence = "";
            switch (this.f6398a.f6407p.getCurrentItem()) {
                case 0:
                    charSequence = "Add new post";
                    break;
                case 1:
                    charSequence = "Add new friend";
                    break;
                case 2:
                    charSequence = "Add new chat";
                    break;
            }
            Toast.makeText(this.f6398a.getApplicationContext(), charSequence, 0).show();
        }
    }

    public static class C2506a extends C0227l {
        public static C2506a m11535c(int i) {
            C2506a c2506a = new C2506a();
            Bundle bundle = new Bundle();
            bundle.putInt("section_number", i);
            c2506a.mo1505g(bundle);
            return c2506a;
        }

        public View mo1503a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View inflate = layoutInflater.inflate(C1142R.layout.fragment_no_item_tabs, viewGroup, false);
            int i = m1308h().getInt("section_number");
            TextView textView = (TextView) inflate.findViewById(C1142R.id.brief);
            ImageView imageView = (ImageView) inflate.findViewById(C1142R.id.image);
            ((TextView) inflate.findViewById(C1142R.id.title)).setText(NoItemTabs.f6404m[i]);
            textView.setText(NoItemTabs.f6405n[i]);
            imageView.setImageResource(NoItemTabs.f6406o[i]);
            return inflate;
        }
    }

    private class C2507b extends C0378u {
        final /* synthetic */ NoItemTabs f6401a;
        private final List<C0227l> f6402b = new ArrayList();
        private final List<String> f6403c = new ArrayList();

        public C2507b(NoItemTabs noItemTabs, C0365q c0365q) {
            this.f6401a = noItemTabs;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6402b.get(i);
        }

        public void m11538a(C0227l c0227l, String str) {
            this.f6402b.add(c0227l);
            this.f6403c.add(str);
        }

        public int mo1933b() {
            return this.f6402b.size();
        }

        public CharSequence mo1959c(int i) {
            return (CharSequence) this.f6403c.get(i);
        }
    }

    private void m11542a(ViewPager viewPager) {
        ab c2507b = new C2507b(this, m1917e());
        c2507b.m11538a(C2506a.m11535c(0), "FEEDS");
        c2507b.m11538a(C2506a.m11535c(1), "FRIENDS");
        c2507b.m11538a(C2506a.m11535c(2), "CHATS");
        viewPager.setAdapter(c2507b);
    }

    private void m11545b(final int i) {
        this.f6409r.m994b();
        new Handler().postDelayed(new Runnable(this) {
            final /* synthetic */ NoItemTabs f6400b;

            public void run() {
                switch (i) {
                    case 0:
                        this.f6400b.f6409r.setImageResource(C1142R.drawable.ic_wrap_text);
                        break;
                    case 1:
                        this.f6400b.f6409r.setImageResource(C1142R.drawable.ic_person_add);
                        break;
                    case 2:
                        this.f6400b.f6409r.setImageResource(C1142R.drawable.ic_chat);
                        break;
                }
                this.f6400b.f6409r.m990a();
            }
        }, 400);
    }

    private void m11548j() {
        this.f6410s = (Toolbar) findViewById(C1142R.id.toolbar);
        this.f6410s.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(this.f6410s);
        m4370f().mo760a((CharSequence) "FEEDS");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.orange_600);
    }

    private void m11549k() {
        this.f6407p = (ViewPager) findViewById(C1142R.id.view_pager);
        m11542a(this.f6407p);
        this.f6408q = (TabLayout) findViewById(C1142R.id.tab_layout);
        this.f6408q.setupWithViewPager(this.f6407p);
        this.f6409r = (FloatingActionButton) findViewById(C1142R.id.fab_add);
        this.f6407p.m2551a(new C25031(this));
        this.f6409r.setOnClickListener(new C25042(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_no_item_tabs);
        m11548j();
        m11549k();
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
