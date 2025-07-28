package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: e2c  reason: default package */
public final class e2c {
    public final long a;
    public final d2c b;
    public final String c;

    public e2c(long j, d2c d2c, String str) {
        this.a = j;
        this.b = d2c;
        this.c = str;
    }

    public static final e2c a(ws8 ws8) {
        int i;
        String str;
        Object obj;
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            Throwable th2 = th;
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th2);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        if (i == 0) {
            return null;
        }
        String str2 = null;
        long j = 0;
        d2c d2c = d2c.UNKNOWN;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th4);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 == 0) {
                    str = null;
                } else if (t2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th4;
                }
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3355) {
                    if (hashCode != 3575610) {
                        if (hashCode == 111972721 && str.equals("value")) {
                            try {
                                str2 = jjd.M(ws8);
                            } catch (Throwable th5) {
                                Throwable th6 = th5;
                                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                Iterator it3 = uzc.a.iterator();
                                while (it3.hasNext()) {
                                    ((ny9) it3.next()).getClass();
                                    ny9.a(th6);
                                }
                                int t3 = hr1.t(m4b.a);
                                if (t3 == 0) {
                                    str2 = null;
                                } else if (t3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th6;
                                }
                            }
                        }
                    } else if (str.equals("type")) {
                        d2c = d2c.UNKNOWN;
                        try {
                            bqc bqc = d2c.b;
                            String M = jjd.M(ws8);
                            bqc.getClass();
                            u1 it4 = d2c.Z.iterator();
                            while (true) {
                                u1 u1Var = it4;
                                if (!u1Var.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = u1Var.next();
                                if (hhd.f(((d2c) obj).a, M)) {
                                    break;
                                }
                            }
                            d2c d2c2 = (d2c) obj;
                            if (d2c2 == null) {
                                d2c2 = d2c.UNKNOWN;
                            }
                            d2c = d2c2;
                        } catch (Throwable th7) {
                            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                            Iterator it5 = uzc.a.iterator();
                            while (it5.hasNext()) {
                                ((ny9) it5.next()).getClass();
                                ny9.a(th7);
                            }
                            int t4 = hr1.t(m4b.a);
                            if (t4 != 0) {
                                if (t4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th7;
                            }
                        }
                    }
                } else if (str.equals(ApiProtocol.KEY_ID)) {
                    try {
                        j = jjd.J(ws8, 0);
                    } catch (Throwable th8) {
                        Throwable th9 = th8;
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                        Iterator it6 = uzc.a.iterator();
                        while (it6.hasNext()) {
                            ((ny9) it6.next()).getClass();
                            ny9.a(th9);
                        }
                        int t5 = hr1.t(m4b.a);
                        if (t5 == 0) {
                            j = 0;
                        } else if (t5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th9;
                        }
                    }
                }
                try {
                    ws8.z();
                } catch (Throwable th10) {
                    Throwable th11 = th10;
                    udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                    Iterator it7 = uzc.a.iterator();
                    while (it7.hasNext()) {
                        ((ny9) it7.next()).getClass();
                        ny9.a(th11);
                    }
                    int t6 = hr1.t(m4b.a);
                    if (t6 != 0) {
                        if (t6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th11;
                    }
                }
            }
            ws8 ws82 = ws8;
        }
        if (j == 0 && d2c == d2c.UNKNOWN && str2 == null) {
            return null;
        }
        return new e2c(j, d2c, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2c)) {
            return false;
        }
        e2c e2c = (e2c) obj;
        return this.a == e2c.a && this.b == e2c.b && hhd.f(this.c, e2c.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentEmojiItem(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", value=");
        return wn6.l(sb, this.c, ")");
    }
}
