package defpackage;

import java.io.File;

/* renamed from: iwe  reason: default package */
public final /* synthetic */ class iwe implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bt8 b;

    public /* synthetic */ iwe(bt8 bt8, int i) {
        this.a = i;
        this.b = bt8;
    }

    public final void accept(Object obj) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        m00 m00 = (m00) obj;
        switch (this.a) {
            case 0:
                m00.k = 100.0f;
                m00.i = g10.c;
                bt8 bt8 = this.b;
                wve wve = bt8.a;
                String str = wve.b;
                m00.m = str;
                m00.u = lp.x(str);
                j10 j10 = m00.a;
                int i = j10 == null ? -1 : jwe.$EnumSwitchMapping$0[j10.ordinal()];
                qxe qxe = wve.h;
                if (i == 1) {
                    a10 a10 = m00.b;
                    if (a10 == null) {
                        a10 = a10.A0;
                    }
                    z00 b2 = a10.b();
                    b2.g = qxe.a;
                    m00.b = new a10(b2);
                    return;
                } else if (i == 2) {
                    l00 l00 = m00.e;
                    if (l00 == null) {
                        l00 = l00.j;
                    }
                    k00 a2 = l00.a();
                    a2.e = qxe.a;
                    a2.a = qxe.b;
                    m00.e = new l00(a2);
                    return;
                } else if (i == 3) {
                    k10 a3 = m00.c().a();
                    a3.a = qxe.b;
                    a3.l = qxe.a;
                    m00.d = new n10(a3);
                    return;
                } else if (i == 4) {
                    u00 a4 = m00.b().a();
                    a4.a = qxe.b;
                    a4.d = qxe.a;
                    m00.r = new v00(a4);
                    return;
                } else if (i != 5) {
                    udd.s("UploadDraftMediaWorker", "Unknown attach type " + m00.a, (Throwable) null);
                    return;
                } else {
                    m00.f = fu7.s(bt8.b);
                    return;
                }
            case 1:
                m00.i = g10.X;
                wve wve2 = this.b.a;
                fwe fwe = wve2.a;
                m00.m = fwe.a;
                m00.u = fwe.b;
                m00.k = wve2.e;
                m00.o = wve2.f;
                return;
            default:
                m00.k = 100.0f;
                m00.i = g10.c;
                j10 j102 = m00.a;
                int i2 = j102 == null ? -1 : wwe.$EnumSwitchMapping$0[j102.ordinal()];
                bt8 bt82 = this.b;
                wve wve3 = bt82.a;
                if (i2 == 1) {
                    String str2 = wve3.h.a;
                    a10 a102 = m00.b;
                    if (a102 == null) {
                        a102 = a10.A0;
                    }
                    z00 b3 = a102.b();
                    b3.g = str2;
                    m00.b = new a10(b3);
                    String str3 = wve3.b;
                    m00.m = str3;
                    try {
                        l = Long.valueOf(new File(str3).lastModified());
                    } catch (Throwable th) {
                        l = new kcc(th);
                    }
                    if (l instanceof kcc) {
                        l = 0L;
                    }
                    m00.u = l.longValue();
                    return;
                } else if (i2 == 2) {
                    qxe qxe2 = wve3.h;
                    long j = qxe2.b;
                    l00 l002 = m00.e;
                    if (l002 == null) {
                        l002 = l00.j;
                    }
                    k00 a5 = l002.a();
                    a5.e = qxe2.a;
                    a5.a = j;
                    m00.e = new l00(a5);
                    String str4 = wve3.b;
                    m00.m = str4;
                    try {
                        l2 = Long.valueOf(new File(str4).lastModified());
                    } catch (Throwable th2) {
                        l2 = new kcc(th2);
                    }
                    if (l2 instanceof kcc) {
                        l2 = 0L;
                    }
                    m00.u = l2.longValue();
                    return;
                } else if (i2 == 3) {
                    qxe qxe3 = wve3.h;
                    long j2 = qxe3.b;
                    k10 a6 = m00.c().a();
                    a6.a = j2;
                    a6.l = qxe3.a;
                    m00.d = new n10(a6);
                    String str5 = wve3.b;
                    m00.m = str5;
                    try {
                        l3 = Long.valueOf(new File(str5).lastModified());
                    } catch (Throwable th3) {
                        l3 = new kcc(th3);
                    }
                    if (l3 instanceof kcc) {
                        l3 = 0L;
                    }
                    m00.u = l3.longValue();
                    return;
                } else if (i2 == 4) {
                    qxe qxe4 = wve3.h;
                    long j3 = qxe4.b;
                    u00 a7 = m00.b().a();
                    a7.a = j3;
                    a7.d = qxe4.a;
                    m00.r = new v00(a7);
                    String str6 = wve3.b;
                    m00.m = str6;
                    try {
                        l4 = Long.valueOf(new File(str6).lastModified());
                    } catch (Throwable th4) {
                        l4 = new kcc(th4);
                    }
                    if (l4 instanceof kcc) {
                        l4 = 0L;
                    }
                    m00.u = l4.longValue();
                    return;
                } else if (i2 == 5) {
                    m00.f = fu7.s(bt82.b);
                    String str7 = wve3.b;
                    m00.m = str7;
                    try {
                        l5 = Long.valueOf(new File(str7).lastModified());
                    } catch (Throwable th5) {
                        l5 = new kcc(th5);
                    }
                    if (l5 instanceof kcc) {
                        l5 = 0L;
                    }
                    m00.u = l5.longValue();
                    return;
                } else {
                    return;
                }
        }
    }
}
