package android.sabbir.com.modernlibrarys.test.material.components.p093g;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0986g;
import android.support.v7.widget.RecyclerView.C1005t;
import android.view.View;

public class C2756b extends C0986g {
    private int f7070a;

    public C2756b(int i) {
        this.f7070a = i;
    }

    public void mo979a(Rect rect, View view, RecyclerView recyclerView, C1005t c1005t) {
        rect.left = this.f7070a;
        rect.right = this.f7070a;
        rect.bottom = this.f7070a;
        if (recyclerView.m393f(view) == 0) {
            rect.top = this.f7070a;
        }
    }
}
