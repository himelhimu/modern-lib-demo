package android.sabbir.com.modernlibrarys.test.material.components.p087d;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.p025a.C1045a.C1042a;
import android.view.View;

public class C2725b extends C1042a {
    private int f6984a = -3355444;
    private final C2335a f6985b;

    public interface C2333b {
        void mo1916y();

        void mo1921z();
    }

    public interface C2335a {
        void mo1923f(int i);
    }

    public C2725b(C2335a c2335a) {
        this.f6985b = c2335a;
    }

    public int mo1975a(RecyclerView recyclerView, C0102w c0102w) {
        return recyclerView.getLayoutManager() instanceof GridLayoutManager ? C1042a.m5935b(15, 0) : C1042a.m5935b(3, 48);
    }

    public void mo1976a(Canvas canvas, RecyclerView recyclerView, C0102w c0102w, float f, float f2, int i, boolean z) {
        if (i == 1) {
            View view = c0102w.f361a;
            Drawable colorDrawable = new ColorDrawable();
            ((ColorDrawable) colorDrawable).setColor(m12223d());
            if (f > 0.0f) {
                colorDrawable.setBounds(view.getLeft(), view.getTop(), (int) f, view.getBottom());
            } else {
                colorDrawable.setBounds(view.getRight() + ((int) f), view.getTop(), view.getRight(), view.getBottom());
            }
            colorDrawable.draw(canvas);
        }
        super.mo1976a(canvas, recyclerView, c0102w, f, f2, i, z);
    }

    public void mo1977a(C0102w c0102w, int i) {
        this.f6985b.mo1923f(c0102w.m557e());
    }

    public boolean mo1978a() {
        return false;
    }

    public void mo1979b(C0102w c0102w, int i) {
        if (i != 0 && (c0102w instanceof C2333b)) {
            ((C2333b) c0102w).mo1916y();
        }
        super.mo1979b(c0102w, i);
    }

    public boolean mo1980b() {
        return true;
    }

    public boolean mo1981b(RecyclerView recyclerView, C0102w c0102w, C0102w c0102w2) {
        return c0102w.m560h() == c0102w2.m560h();
    }

    public int m12223d() {
        return this.f6984a;
    }

    public void mo1982d(RecyclerView recyclerView, C0102w c0102w) {
        super.mo1982d(recyclerView, c0102w);
        c0102w.f361a.setAlpha(1.0f);
        if (c0102w instanceof C2333b) {
            ((C2333b) c0102w).mo1921z();
        }
    }
}
