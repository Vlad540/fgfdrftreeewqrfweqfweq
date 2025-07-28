package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: n89  reason: default package */
public final class n89 extends lbe {
    public final j22 c;

    public n89(j22 j22) {
        this.c = j22;
    }

    public static final n89 c(ws8 ws8) {
        int i;
        String str;
        if (!ws8.m()) {
            return null;
        }
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return null;
        }
        j22 j22 = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th2) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th2);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 == 0) {
                    str = null;
                } else if (t2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("chat")) {
                    j22 = j22.a(ws8);
                } else {
                    try {
                        ws8.z();
                    } catch (Throwable th3) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = uzc.a.iterator();
                        while (it3.hasNext()) {
                            ((ny9) it3.next()).getClass();
                            ny9.a(th3);
                        }
                        int t3 = hr1.t(m4b.a);
                        if (t3 != 0) {
                            if (t3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    }
                }
            }
        }
        return new n89(j22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n89) && hhd.f(this.c, ((n89) obj).c);
    }

    public final int hashCode() {
        j22 j22 = this.c;
        if (j22 == null) {
            return 0;
        }
        return j22.hashCode();
    }

    public final String toString() {
        return "Response(chat=" + this.c + ")";
    }
}
