package defpackage;

import android.graphics.drawable.Animatable;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: g06  reason: default package */
public final class g06 implements eo7, bs3 {
    public final /* synthetic */ dh0 a = new Object();
    public final bs b = kjd.d("WrappingUtils");
    public int c = 6;

    public final void a(String str, oq6 oq6, Animatable animatable) {
        this.a.getClass();
    }

    public final void b(String str) {
        new Throwable();
        if (!o23.R(this.b, str)) {
            "Fresco:".concat(str);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (!o23.R(this.b, str)) {
            String concat = "Fresco:".concat(str);
            String j = th instanceof f06 ? BuildConfig.FLAVOR : dr9.j(th);
            udd.T(concat, str2 + j, new Object[0]);
        }
    }

    public final void d(String str, Throwable th) {
        String concat = "Fresco:".concat("ControllerListener");
        udd.s(concat, "onFailure " + str, th);
    }

    public final void e(Object obj, String str) {
        this.a.getClass();
    }

    public final void f(String str, String str2) {
        c(str, str2, new Throwable());
    }

    public final void g(String str) {
        this.a.getClass();
    }

    public final void h(String str, oq6 oq6) {
        this.a.getClass();
    }

    public final boolean i(int i) {
        return this.c <= i;
    }

    public final void j(int i) {
        this.c = i;
    }

    public final void k(String str, Throwable th) {
        String concat = "Fresco:".concat("ControllerListener");
        udd.s(concat, "onIntermediateImageFailed " + str, th);
    }

    public final void w(String str, String str2, Throwable th) {
        if (!o23.R(this.b, str)) {
            String concat = "Fresco:".concat(str);
            String j = th instanceof f06 ? BuildConfig.FLAVOR : dr9.j(th);
            udd.T(concat, str2 + j, new Object[0]);
        }
    }

    public final void e(String str, String str2, Throwable th) {
        if (!o23.R(this.b, str)) {
            udd.u("Fresco:".concat(str), th, str2, new Object[0]);
        }
    }

    public final void d(String str, String str2, Throwable th) {
        if (!o23.R(this.b, str)) {
            String concat = "Fresco:".concat(str);
            String j = th instanceof f06 ? BuildConfig.FLAVOR : dr9.j(th);
            udd.p(concat, str2 + j, new Object[0]);
        }
    }

    public final void e(String str, String str2) {
        e(str, str2, new Throwable());
    }

    public final void w(String str, String str2) {
        w(str, str2, new Throwable());
    }

    public final void d(String str, String str2) {
        d(str, str2, new Throwable());
    }
}
