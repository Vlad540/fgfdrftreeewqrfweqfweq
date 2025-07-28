package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: sf8  reason: default package */
public final class sf8 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public sf8(zz2 zz2, k3d k3d, ypc ypc, wl9 wl9, kd3 kd3, yz9 yz9, i0a i0a) {
        this.b = zz2;
        this.c = k3d;
        this.d = ypc;
        this.e = wl9;
        this.f = kd3;
        this.g = yz9;
        this.h = i0a;
    }

    public ImageView a() {
        return (ImageView) ((t97) this.i).getValue();
    }

    public void b(int i2) {
        ImageView a2;
        float f2;
        float f3;
        String str = (String) this.d;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, "Media viewer. New state media page: ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "REFRESH" : "LOADING" : "PAUSE" : "PLAY" : "NONE"), (Throwable) null);
        }
        if (i2 != 1) {
            ek8.e(a(), (ViewGroup) this.b);
            c(true);
            if (i2 == 4) {
                a2 = a();
                f2 = (float) 4;
                f3 = dh4.c().getDisplayMetrics().density;
            } else {
                a2 = a();
                f2 = (float) 14;
                f3 = dh4.c().getDisplayMetrics().density;
            }
            me4.o(f2, f3, a2);
        }
        int t = hr1.t(i2);
        if (t == 0) {
            c(false);
        } else if (t == 1) {
            a().setImageDrawable((Drawable) ((t97) this.g).getValue());
        } else if (t == 2) {
            a().setImageDrawable((Drawable) ((t97) this.h).getValue());
        } else if (t == 3) {
            a().setImageDrawable((ov6) this.e);
        } else if (t == 4) {
            a().setImageDrawable((Drawable) ((t97) this.f).getValue());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.a = i2;
    }

    public void c(boolean z) {
        a().setVisibility(z ? 0 : 8);
    }

    public sf8(v6e v6e, za6 za6) {
        this.b = v6e;
        this.c = za6;
        this.d = sf8.class.getName();
        ov6 ov6 = new ov6();
        ov6.b = new int[]{0, rda.d.f.a};
        this.e = ov6;
        this.f = ez3.O(3, new rf8(this, 0));
        this.g = ez3.O(3, new rf8(this, 1));
        this.h = ez3.O(3, new rf8(this, 2));
        this.a = 1;
        this.i = ez3.O(3, new rf8(this, 3));
    }
}
