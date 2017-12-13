package android.sabbir.com.modernlibrarys.test.material.components.p093g;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0986g;
import android.support.v7.widget.RecyclerView.C1005t;
import android.view.View;

public class C2757c extends C0986g {
    private int f7071a;
    private int f7072b;
    private boolean f7073c;

    public C2757c(int i, int i2, boolean z) {
        this.f7071a = i;
        this.f7072b = i2;
        this.f7073c = z;
    }

    public void mo979a(Rect rect, View view, RecyclerView recyclerView, C1005t c1005t) {
        int g = recyclerView.m397g(view);
        int i = g % this.f7071a;
        if (this.f7073c) {
            rect.left = this.f7072b - ((this.f7072b * i) / this.f7071a);
            rect.right = ((i + 1) * this.f7072b) / this.f7071a;
            if (g < this.f7071a) {
                rect.top = this.f7072b;
            }
            rect.bottom = this.f7072b;
            return;
        }
        rect.left = (this.f7072b * i) / this.f7071a;
        rect.right = this.f7072b - (((i + 1) * this.f7072b) / this.f7071a);
        if (g >= this.f7071a) {
            rect.top = this.f7072b;
        }
    }
}
