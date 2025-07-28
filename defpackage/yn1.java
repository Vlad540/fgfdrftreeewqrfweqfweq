package defpackage;

import me.leolin.shortcutbadger.BuildConfig;
import ru.ok.android.externcalls.sdk.audio.Logger;

/* renamed from: yn1  reason: default package */
public final class yn1 implements Logger {
    public final void d(String str, String str2) {
        udd.p(str, str2, new Object[0]);
    }

    public final void e(String str, String str2, Throwable th) {
        udd.s(str, str2, th);
    }

    public final void i(String str, String str2) {
        udd.H(str, str2, (Throwable) null);
    }

    public final void v(String str, String str2) {
        udd.P(str, str2, new Object[0]);
    }

    public final void w(String str, String str2) {
        udd.T(str, str2, new Object[0]);
    }

    public final void d(String str, String str2, Throwable th) {
        udd.o(str, str2, th);
    }

    public final void e(String str, String str2) {
        udd.s(str, str2, (Throwable) null);
    }

    public final void i(String str, String str2, Throwable th) {
        udd.H(str, str2, (Throwable) null);
    }

    public final void v(String str, String str2, Throwable th) {
        fn6 fn6 = udd.e;
        if (fn6 != null) {
            tn7 tn7 = tn7.o;
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            fn6.b(fn6, tn7, str, str2, (Object[]) null, th, 8);
        }
    }

    public final void w(String str, String str2, Throwable th) {
        udd.S(str, str2, th);
    }

    public final void w(String str, Throwable th) {
        udd.T(str, th.getMessage(), new Object[0]);
    }
}
