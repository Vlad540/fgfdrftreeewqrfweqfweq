package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tf4  reason: default package */
public final class tf4 extends rf4 {
    public static int m = -1;
    public static Size n;
    public final ezd g;
    public final t97 h;
    public final t97 i;
    public final t97 j;
    public uye k;
    public final AtomicReference l = new AtomicReference((Object) null);

    public tf4(Context context, g2b g2b, ezd ezd, t97 t97, t97 t972, t97 t973) {
        super(context, g2b, t973);
        this.g = ezd;
        this.h = t97;
        this.i = t972;
        this.j = t973;
    }

    public static Size i(Context context) {
        Size size = n;
        if (size == null) {
            size = new Size(gwf.w(context).getWidth(), gwf.w(context).getHeight());
        }
        n = size;
        return size;
    }

    public final boolean c() {
        kdf kdf = (kdf) this.j.getValue();
        return kdf != null && kdf.h > 0;
    }

    public final void e() {
        t97 t97 = this.h;
        ((q0a) t97.getValue()).getClass();
        ((q0a) t97.getValue()).getClass();
    }

    public final void f(String str) {
        kdf kdf = (kdf) this.j.getValue();
        if (kdf != null) {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, "kdf", "onForegroundServiceStarted:".concat(str), (Throwable) null);
            }
            kdf.h++;
        }
    }

    public final void g(String str) {
        int i2;
        kdf kdf = (kdf) this.j.getValue();
        if (kdf != null) {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, "kdf", "onForegroundServiceStropped:".concat(str), (Throwable) null);
            }
            int i3 = kdf.h;
            if (i3 <= 0) {
                i2 = 0;
            } else {
                i2 = i3 - 1;
                kdf.h = i2;
            }
            kdf.h = i2;
        }
    }

    public final uye h() {
        String str;
        j2b j2b = (j2b) this.b;
        j2b.a.j.getClass();
        y0f.a.b().getClass();
        ((q0a) this.h.getValue()).getClass();
        uye uye = this.k;
        if (!hhd.f(uye != null ? uye.b : null, "25.7.2")) {
            this.k = null;
        }
        uye uye2 = this.k;
        if (uye2 == null) {
            String format = String.format(Locale.ENGLISH, "Android %s", Arrays.copyOf(new Object[]{Build.VERSION.RELEASE}, 1));
            String q = j2b.a.q();
            if (r1g.p(q)) {
                q = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
            }
            String language = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
            String i2 = me4.i(Build.MANUFACTURER, " ", Build.MODEL);
            DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
            int i3 = displayMetrics.densityDpi;
            if (i3 == 120) {
                str = "ldpi";
            } else if (i3 == 160) {
                str = "mdpi";
            } else if (i3 == 240) {
                str = "hdpi";
            } else if (i3 == 320) {
                str = "xhdpi";
            } else if (i3 == 480) {
                str = "xxhdpi";
            } else if (i3 != 640) {
                str = i3 + "dpi";
            } else {
                str = "xxxhdpi";
            }
            this.g.getClass();
            uye2 = new uye(format, q, language, i2, str + " " + i3 + "dpi " + displayMetrics.widthPixels + "x" + displayMetrics.heightPixels);
            this.k = uye2;
        }
        return uye2;
    }

    public final int j() {
        int i2 = m;
        if (i2 != -1) {
            return i2;
        }
        Context context = this.a;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
        m = dimensionPixelSize;
        return dimensionPixelSize;
    }
}
