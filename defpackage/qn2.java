package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: qn2  reason: default package */
public final class qn2 extends lbe {
    public final Long X;
    public final List c;
    public final boolean o;

    public qn2(Long l, List list, boolean z) {
        this.c = list;
        this.o = z;
        this.X = l;
    }

    public static final qn2 c(ws8 ws8) {
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
        zy zyVar = hw4.a;
        Long l = null;
        boolean z = false;
        zy zyVar2 = zyVar;
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
                int hashCode = str.hashCode();
                if (hashCode != -1950992144) {
                    if (hashCode != -1081306054) {
                        if (hashCode == 696739087 && str.equals("hasMore")) {
                            Boolean bool = Boolean.FALSE;
                            try {
                                bool = Boolean.valueOf(jjd.E(ws8));
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
                            z = bool.booleanValue();
                        }
                    } else if (str.equals("marker")) {
                        try {
                            long J = jjd.J(ws8, -1);
                            Long valueOf = Long.valueOf(J);
                            if (J < 0) {
                                valueOf = null;
                            }
                            l = valueOf;
                        } catch (Throwable th4) {
                            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = uzc.a.iterator();
                            while (it4.hasNext()) {
                                ((ny9) it4.next()).getClass();
                                ny9.a(th4);
                            }
                            int t4 = hr1.t(m4b.a);
                            if (t4 == 0) {
                                l = null;
                            } else if (t4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th4;
                            }
                        }
                    }
                } else if (str.equals("commonChats")) {
                    try {
                        zyVar2 = zy.b(ws8);
                    } catch (Throwable th5) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = uzc.a.iterator();
                        while (it5.hasNext()) {
                            ((ny9) it5.next()).getClass();
                            ny9.a(th5);
                        }
                        int t5 = hr1.t(m4b.a);
                        if (t5 == 0) {
                            zyVar2 = zyVar;
                        } else if (t5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th5;
                        }
                    }
                }
                try {
                    ws8.z();
                } catch (Throwable th6) {
                    udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                    Iterator it6 = uzc.a.iterator();
                    while (it6.hasNext()) {
                        ((ny9) it6.next()).getClass();
                        ny9.a(th6);
                    }
                    int t6 = hr1.t(m4b.a);
                    if (t6 != 0) {
                        if (t6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th6;
                    }
                }
            }
        }
        return new qn2(l, zyVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn2)) {
            return false;
        }
        qn2 qn2 = (qn2) obj;
        return hhd.f(this.c, qn2.c) && this.o == qn2.o && hhd.f(this.X, qn2.X);
    }

    public final int hashCode() {
        int f = th2.f(this.c.hashCode() * 31, 31, this.o);
        Long l = this.X;
        return f + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Response(commonChats=" + this.c + ", hasMore=" + this.o + ", marker=" + this.X + ")";
    }
}
