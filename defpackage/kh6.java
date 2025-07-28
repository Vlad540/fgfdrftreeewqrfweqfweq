package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: kh6  reason: default package */
public final class kh6 implements h36 {
    public final String a;

    public /* synthetic */ kh6(String str) {
        this.a = str;
    }

    public static String b(long j) {
        return j == Long.MAX_VALUE ? "Long.MAX_VALUE" : j == Long.MIN_VALUE ? "Long.MIN_VALUE" : j < 0 ? String.valueOf(j) : String.format(Locale.ENGLISH, "%td.%tm/%tH:%tM:%tS", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(j), Long.valueOf(j), Long.valueOf(j), Long.valueOf(j)}, 5));
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        p2d p2d = (p2d) obj;
    }

    public void c(String str) {
        udd.q(this.a, str);
    }

    public void e(Throwable th) {
        ez3.k0("custom command " + this.a + " produced an error: " + th.getMessage(), th);
    }
}
