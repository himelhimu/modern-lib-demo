package android.sabbir.com.modernlibrarys.test.material.components.p087d;

import android.graphics.Canvas;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.p025a.C1045a.C1042a;

public class C2724a extends C1042a {
    private final C2291a f6983a;

    public interface C2289b {
        void mo1916y();

        void mo1921z();
    }

    public interface C2291a {
        boolean mo1922d(int i, int i2);
    }

    public C2724a(C2291a c2291a) {
        this.f6983a = c2291a;
    }

    public int mo1975a(RecyclerView recyclerView, C0102w c0102w) {
        return recyclerView.getLayoutManager() instanceof GridLayoutManager ? C1042a.m5935b(15, 0) : C1042a.m5935b(3, 48);
    }

    public void mo1976a(Canvas canvas, RecyclerView recyclerView, C0102w c0102w, float f, float f2, int i, boolean z) {
        if (i == 1) {
            c0102w.f361a.setAlpha(1.0f - (Math.abs(f) / ((float) c0102w.f361a.getWidth())));
            c0102w.f361a.setTranslationX(f);
            return;
        }
        super.mo1976a(canvas, recyclerView, c0102w, f, f2, i, z);
    }

    public void mo1977a(C0102w c0102w, int i) {
    }

    public boolean mo1978a() {
        return true;
    }

    public void mo1979b(C0102w c0102w, int i) {
        if (i != 0 && (c0102w instanceof C2289b)) {
            ((C2289b) c0102w).mo1916y();
        }
        super.mo1979b(c0102w, i);
    }

    public boolean mo1980b() {
        return false;
    }

    public boolean mo1981b(RecyclerView recyclerView, C0102w c0102w, C0102w c0102w2) {
        if (c0102w.m560h() != c0102w2.m560h()) {
            return false;
        }
        this.f6983a.mo1922d(c0102w.m557e(), c0102w2.m557e());
        return true;
    }

    public void mo1982d(RecyclerView recyclerView, C0102w c0102w) {
        super.mo1982d(recyclerView, c0102w);
        c0102w.f361a.setAlpha(1.0f);
        if (c0102w instanceof C2289b) {
            ((C2289b) c0102w).mo1921z();
        }
    }
}
