package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ryd  reason: default package */
public final class ryd extends l6c {
    public final oyd A0 = new oyd(this, 0);
    public final RecyclerView X;
    public final boolean Y = true;
    public final Rect Z = new Rect();
    public final SparseBooleanArray a = new SparseBooleanArray();
    public final f6c b;
    public final syd c;
    public final l83 o;
    public final Rect w0 = new Rect();
    public final x3a x0 = new x3a(16);
    public pyd y0;
    public final AtomicBoolean z0 = new AtomicBoolean(true);

    /* JADX WARNING: type inference failed for: r0v4, types: [l83, java.lang.Object] */
    public ryd(RecyclerView recyclerView, f6c f6c, syd syd) {
        this.b = f6c;
        boolean z = f6c instanceof syd;
        this.c = syd;
        ? obj = new Object();
        obj.d = new SparseArray();
        obj.e = new SparseArray();
        obj.f = new SparseArray();
        obj.a = recyclerView;
        obj.b = f6c;
        obj.c = syd;
        nyd nyd = new nyd(obj, 0, recyclerView);
        f6c.z(nyd);
        obj.g = nyd;
        this.o = obj;
        this.X = recyclerView;
        pyd pyd = new pyd(this, recyclerView, 0);
        f6c.z(pyd);
        this.y0 = pyd;
    }

    public static final void i(ryd ryd) {
        ryd.a.clear();
        if (ryd.z0.compareAndSet(true, false)) {
            oyd oyd = ryd.A0;
            RecyclerView recyclerView = ryd.X;
            z3d.L(recyclerView, oyd);
            recyclerView.post(new oyd(ryd, 1));
        }
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, x6c x6c) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        boolean k = k(R);
        x3a x3a = this.x0;
        if (k) {
            l83 l83 = this.o;
            if (l83.n(R) != null) {
                myd o2 = l83.o(R);
                int i = o2.c;
                if (i < 0) {
                    rect.top -= i;
                }
                rect.top = o2.a.getMeasuredHeight() + rect.top;
                x3a.E(rect, view, recyclerView);
                return;
            }
        }
        x3a.E(rect, view, recyclerView);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        f6c f6c = this.b;
        int j = f6c.j();
        if (childCount > 0 && j > 0) {
            int i = 0;
            while (true) {
                if (i < recyclerView.getChildCount()) {
                    int i2 = i + 1;
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt != null) {
                        int R = RecyclerView.R(childAt);
                        if (R != -1) {
                            l83 l83 = this.o;
                            if (l83.n(R) != null) {
                                boolean k = k(R);
                                x3a x3a = this.x0;
                                Rect rect = this.Z;
                                x3a.w(rect, childAt, R);
                                boolean z = rect.top <= 0 && rect.bottom > 0;
                                if (k || z) {
                                    myd o2 = l83.o(R);
                                    boolean z2 = z && this.Y;
                                    int measuredHeight = l83.o(R).a.getMeasuredHeight();
                                    x3a.w(rect, childAt, R);
                                    Rect rect2 = this.w0;
                                    x3a.x(rect2, childAt, R);
                                    if (z2) {
                                        if (R >= f6c.j() - 1 || !k(R + 1)) {
                                            this.c.getClass();
                                            if (!k || rect2.top < 0) {
                                                rect2.offsetTo(rect2.left, 0);
                                            }
                                        } else {
                                            int i3 = rect.bottom;
                                            if (measuredHeight > i3) {
                                                rect2.offsetTo(rect2.left, i3 - measuredHeight);
                                            } else {
                                                rect2.offsetTo(rect2.left, 0);
                                            }
                                        }
                                    }
                                    int save = canvas.save();
                                    canvas.translate(0.0f, (float) rect2.top);
                                    try {
                                        View view = o2.a;
                                        if (xy6.w(view)) {
                                            canvas.translate((float) ((canvas.getWidth() - view.getMeasuredWidth()) - o2.b), 0.0f);
                                        } else {
                                            canvas.translate((float) o2.b, 0.0f);
                                        }
                                        view.draw(canvas);
                                    } finally {
                                        canvas.restoreToCount(save);
                                    }
                                }
                            }
                        }
                        i = i2;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void j() {
        l83 l83 = this.o;
        ((SparseArray) l83.e).clear();
        ((SparseArray) l83.d).clear();
        ((SparseArray) l83.f).clear();
    }

    public final boolean k(int i) {
        Object n;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return sparseBooleanArray.get(i);
        }
        l83 l83 = this.o;
        Object n2 = l83.n(i);
        boolean z = false;
        if (n2 != null && (i <= 0 || (n = l83.n(i - 1)) == null || !n2.equals(n))) {
            z = true;
        }
        sparseBooleanArray.put(i, z);
        return z;
    }
}
