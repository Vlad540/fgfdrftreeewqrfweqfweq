package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: p7c  reason: default package */
public final class p7c implements Serializable {
    public final Pattern a;

    public p7c(Pattern pattern) {
        this.a = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        return this.a.matcher(charSequence).matches();
    }

    public final String b(String str, CharSequence charSequence) {
        return this.a.matcher(charSequence).replaceAll(str);
    }

    public final String toString() {
        return this.a.toString();
    }

    public p7c(String str) {
        this(Pattern.compile(str));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p7c(java.lang.String r2, int r3) {
        /*
            r1 = this;
            r3 = 2
            switch(r3) {
                case 1: goto L_0x0016;
                case 2: goto L_0x0013;
                case 3: goto L_0x0010;
                case 4: goto L_0x000e;
                case 5: goto L_0x000c;
                case 6: goto L_0x0009;
                case 7: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            throw r1
        L_0x0006:
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0017
        L_0x0009:
            r3 = 32
            goto L_0x0017
        L_0x000c:
            r3 = 4
            goto L_0x0017
        L_0x000e:
            r3 = 1
            goto L_0x0017
        L_0x0010:
            r3 = 16
            goto L_0x0017
        L_0x0013:
            r3 = 8
            goto L_0x0017
        L_0x0016:
            r3 = 2
        L_0x0017:
            r0 = r3 & 2
            if (r0 == 0) goto L_0x001d
            r3 = r3 | 64
        L_0x001d:
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7c.<init>(java.lang.String, int):void");
    }
}
