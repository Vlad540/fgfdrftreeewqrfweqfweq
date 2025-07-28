package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: u24  reason: default package */
public final class u24 implements q6c {
    public final RecyclerView a;
    public View b;
    public final Rect c = new Rect();

    public u24(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(MotionEvent motionEvent) {
    }

    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2.H(x, y) != null) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        int i = 0;
        while (true) {
            if (i >= recyclerView2.getChildCount()) {
                view = null;
                break;
            }
            int i2 = i + 1;
            view = recyclerView2.getChildAt(i);
            if (view != null) {
                a layoutManager = recyclerView2.getLayoutManager();
                Rect rect = this.c;
                if (layoutManager != null) {
                    layoutManager.A(rect, view);
                }
                if (rect.contains((int) x2, (int) y2)) {
                    break;
                }
                i = i2;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        boolean z = recyclerView.getScrollState() != 0;
        if (motionEvent.getAction() == 0) {
            this.b = view;
        }
        View view2 = this.b;
        if (view2 == null) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (z || !hhd.f(view, view2)) {
            obtain.setAction(3);
        }
        obtain.offsetLocation((-motionEvent.getX()) + 1.0f, (-motionEvent.getY()) + ((float) (view2.getMeasuredHeight() / 2)));
        view2.dispatchTouchEvent(obtain);
        obtain.recycle();
        return false;
    }

    public final void e(boolean z) {
    }
}
