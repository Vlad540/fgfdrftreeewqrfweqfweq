package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* renamed from: eq0  reason: default package */
public final class eq0 extends zp0 {
    public final Boolean a;
    public final nsf b;
    public Window c;
    public boolean d;

    public eq0(View view, nsf nsf) {
        ColorStateList colorStateList;
        this.b = nsf;
        lw7 lw7 = BottomSheetBehavior.C(view).i;
        if (lw7 != null) {
            colorStateList = lw7.a.c;
        } else {
            WeakHashMap weakHashMap = eaf.a;
            colorStateList = t9f.g(view);
        }
        if (colorStateList != null) {
            this.a = Boolean.valueOf(vx3.z(colorStateList.getDefaultColor()));
            return;
        }
        ColorStateList n = js.n(view.getBackground());
        Integer valueOf = n != null ? Integer.valueOf(n.getDefaultColor()) : null;
        if (valueOf != null) {
            this.a = Boolean.valueOf(vx3.z(valueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    public final void a(View view) {
        d(view);
    }

    public final void b(View view) {
        d(view);
    }

    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        nsf nsf = this.b;
        if (top < nsf.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                new qsf(window, window.getDecorView()).b(bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), nsf.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                new qsf(window2, window2.getDecorView()).b(this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c != window) {
            this.c = window;
            if (window != null) {
                this.d = new qsf(window, window.getDecorView()).a.t();
            }
        }
    }
}
