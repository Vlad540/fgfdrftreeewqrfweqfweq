package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: a99  reason: default package */
public final class a99 extends lbe {
    public final vr8 c;
    public final String o;

    public a99(vr8 vr8, String str) {
        this.c = vr8;
        this.o = str;
    }

    public static final a99 c(ws8 ws8) {
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
        vr8 vr8 = null;
        String str2 = null;
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
                if (str.equals("reactionInfo")) {
                    vr8 = n1g.G(ws8);
                } else if (str.equals("error")) {
                    try {
                        str2 = jjd.M(ws8);
                    } catch (Throwable th3) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = uzc.a.iterator();
                        while (it3.hasNext()) {
                            ((ny9) it3.next()).getClass();
                            ny9.a(th3);
                        }
                        int t3 = hr1.t(m4b.a);
                        if (t3 == 0) {
                            str2 = null;
                        } else if (t3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                } else {
                    try {
                        ws8.z();
                    } catch (Throwable th4) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = uzc.a.iterator();
                        while (it4.hasNext()) {
                            ((ny9) it4.next()).getClass();
                            ny9.a(th4);
                        }
                        int t4 = hr1.t(m4b.a);
                        if (t4 != 0) {
                            if (t4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new a99(vr8, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a99)) {
            return false;
        }
        a99 a99 = (a99) obj;
        return hhd.f(this.c, a99.c) && hhd.f(this.o, a99.o);
    }

    public final int hashCode() {
        int i = 0;
        vr8 vr8 = this.c;
        int hashCode = (vr8 == null ? 0 : vr8.hashCode()) * 31;
        String str = this.o;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Response(reactionInfo=" + this.c + ", error=" + this.o + ")";
    }
}
