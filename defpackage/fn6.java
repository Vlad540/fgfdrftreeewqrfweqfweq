package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: fn6  reason: default package */
public interface fn6 {
    static /* synthetic */ void b(fn6 fn6, tn7 tn7, String str, String str2, Object[] objArr, Throwable th, int i) {
        fn6.a(tn7, str, str2, (i & 8) != 0 ? null : objArr, (i & 16) != 0 ? null : th);
    }

    void a(tn7 tn7, String str, String str2, Object[] objArr, Throwable th) {
        String concat;
        String str3 = str2 == null ? "" : str2;
        if (!(str2 == null || objArr == null)) {
            try {
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                concat = String.format(locale, str2, Arrays.copyOf(copyOf, copyOf.length));
            } catch (Throwable unused) {
                concat = str2.concat(cs.d0(objArr, (String) null, 63));
            }
            str3 = concat;
        }
        if (th != null) {
            str3 = hr1.g(str3, dr9.j(th));
        }
        if (str3.length() > 0) {
            d(tn7, str, str3, th);
        }
    }

    boolean c();

    void d(tn7 tn7, String str, String str2, Throwable th);
}
