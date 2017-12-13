package android.sabbir.com.modernlibrarys.test.material.components.p093g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0959i;
import android.support.v7.widget.RecyclerView.C0986g;
import android.support.v7.widget.RecyclerView.C1005t;
import android.view.View;

public class C2755a extends C0986g {
    private static final int[] f7067a = new int[]{16843284};
    private Drawable f7068b;
    private int f7069c;

    public C2755a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f7067a);
        this.f7068b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        m12277a(i);
    }

    public void m12277a(int i) {
        if (i == 0 || i == 1) {
            this.f7069c = i;
            return;
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public void mo979a(Rect rect, View view, RecyclerView recyclerView, C1005t c1005t) {
        if (this.f7069c == 1) {
            rect.set(0, 0, 0, this.f7068b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f7068b.getIntrinsicWidth(), 0);
        }
    }

    public void mo981b(Canvas canvas, RecyclerView recyclerView, C1005t c1005t) {
        if (this.f7069c == 1) {
            m12280c(canvas, recyclerView);
        } else {
            m12281d(canvas, recyclerView);
        }
    }

    public void m12280c(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            C0959i c0959i = (C0959i) childAt.getLayoutParams();
            int bottom = c0959i.bottomMargin + childAt.getBottom();
            this.f7068b.setBounds(paddingLeft, bottom, width, this.f7068b.getIntrinsicHeight() + bottom);
            this.f7068b.draw(canvas);
        }
    }

    public void m12281d(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            C0959i c0959i = (C0959i) childAt.getLayoutParams();
            int right = c0959i.rightMargin + childAt.getRight();
            this.f7068b.setBounds(right, paddingTop, this.f7068b.getIntrinsicHeight() + right, height);
            this.f7068b.draw(canvas);
        }
    }
}
