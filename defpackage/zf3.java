package defpackage;

import java.util.regex.Pattern;

/* renamed from: zf3  reason: default package */
public final class zf3 {
    public final t97 a;
    public final t97 b;

    public zf3(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    public final String a(tf3 tf3, q00 q00) {
        if (tf3 != null) {
            return tf3.q(((lqc) ((f03) this.b.getValue())).p(), fj0.c);
        }
        if (q00.d.length() > 0) {
            String str = q00.g;
            int length = str.length();
            String str2 = q00.h;
            if (length > 0 || str2.length() > 0) {
                if (str2.length() != 0) {
                    str = str2;
                }
                return at7.y(str);
            }
        }
        return null;
    }

    public final tf3 b(q00 q00) {
        long j = q00.b;
        if (j == 0) {
            return null;
        }
        di3 di3 = ((ap3) this.a.getValue()).a;
        tf3 tf3 = (tf3) di3.a.get(Long.valueOf(j));
        if (tf3 == null) {
            tf3 = di3.i(j, false);
        }
        if (tf3 == null || tf3.w() || tf3.k() != 0) {
            return null;
        }
        return tf3;
    }

    public final CharSequence c(q00 q00) {
        tf3 b2 = b(q00);
        if (b2 != null && ((String) b2.m()).length() > 0) {
            return b2.m();
        }
        String str = q00.d;
        if (str.length() <= 0) {
            return t5a.b("Unknown", (CharSequence) null);
        }
        Pattern pattern = t5a.a;
        return t5a.b(str, q00.e);
    }
}
