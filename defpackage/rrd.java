package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: rrd  reason: default package */
public class rrd {
    public final View a;
    public final sy6 b;
    public final u16 c;
    public final int d;
    public nsf e;
    public int f;
    public boolean g;
    public final Rect h;
    public final Rect i;

    public /* synthetic */ rrd(View view, sy6 sy6, u16 u16) {
        this(view, sy6, u16, 7);
    }

    public final void a(qy6 qy6, up0 up0) {
        int max = Math.max(qy6.d, this.f);
        int t = hr1.t(up0.a);
        if (t != 0) {
            View view = this.a;
            if (t == 1) {
                view.setTranslationY(-((float) max));
            } else if (t == 2) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.h.bottom + max);
            } else if (t == 3) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), max);
            } else if (t == 4) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = this.i.bottom + max;
                    view.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public void b(nsf nsf, up0 up0) {
        a(nsf.a.f(this.d), up0);
    }

    public void c(nsf nsf) {
        sy6 sy6 = this.b;
        int i2 = sy6.a;
        if (i2 != 0) {
            qy6 f2 = nsf.a.f(this.d);
            int t = hr1.t(i2);
            if (t != 0) {
                int i3 = f2.b;
                View view = this.a;
                if (t == 1) {
                    view.setTranslationY((float) i3);
                } else if (t == 2) {
                    view.setPadding(view.getPaddingLeft(), this.h.top + i3, view.getPaddingRight(), view.getPaddingBottom());
                } else if (t == 3) {
                    view.setPadding(view.getPaddingLeft(), i3, view.getPaddingRight(), view.getPaddingBottom());
                } else if (t == 4) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = this.i.top + i3;
                        view.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        up0 up0 = sy6.b;
        if (up0 != null) {
            b(nsf, up0);
        }
        u16 u16 = this.c;
        if (u16 != null) {
            u16.invoke(nsf);
        }
    }

    public nsf d(nsf nsf) {
        return nsf;
    }

    public void e() {
        this.g = false;
    }

    public rrd(View view, sy6 sy6, u16 u16, int i2) {
        Rect rect;
        this.a = view;
        this.b = sy6;
        this.c = u16;
        this.d = i2;
        sic sic = new sic(12, this);
        this.h = new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            rect = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            rect = new Rect(0, 0, 0, 0);
        }
        this.i = rect;
        WeakHashMap weakHashMap = eaf.a;
        t9f.u(view, sic);
        if (view.isAttachedToWindow()) {
            r9f.c(view);
            ty6.a.a(this);
        }
        view.addOnAttachStateChangeListener(new ck(9, this));
    }
}
