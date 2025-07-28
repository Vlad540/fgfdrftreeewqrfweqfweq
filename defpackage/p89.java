package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: p89  reason: default package */
public final class p89 extends ol implements qce, tna {
    public static final /* synthetic */ int C0 = 0;
    public final String A0;
    public final String B0;
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final ls8 w0;
    public final List x0;
    public final List y0;
    public final boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p89(long j, long j2, long j3, long j4, long j5, String str, String str2, ls8 ls8, List list, List list2, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.w0 = ls8;
        this.x0 = list;
        this.y0 = list2;
        this.z0 = z;
        String str3 = "";
        this.A0 = str == null ? str3 : str;
        this.B0 = str2 != null ? str2 : str3;
    }

    public final void c(lbe lbe) {
        ym8 ym8;
        q89 q89 = (q89) lbe;
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        to8 d = plVar.d();
        long j = this.X;
        vo8 q = d.q(j);
        if (q != null && q.z0 != ls8.DELETED && (ym8 = q89.c) != null) {
            pl plVar3 = this.c;
            if (plVar3 == null) {
                plVar3 = null;
            }
            to8 d2 = plVar3.d();
            ((hz3) d2.a).c.a.m().p(new wdc(1, new cp((Object) d2, (Object) ym8, (Object) q, (Object) this, 3)));
            pl plVar4 = this.c;
            if (plVar4 == null) {
                plVar4 = null;
            }
            t52 c = plVar4.c();
            long j2 = this.o;
            i22 B = c.B(j2);
            if (q.Y0.b() && B != null && B.b.j == j) {
                pl plVar5 = this.c;
                if (plVar5 == null) {
                    plVar5 = null;
                }
                plVar5.c().v(j2);
            }
            pl plVar6 = this.c;
            if (plVar6 != null) {
                plVar2 = plVar6;
            }
            plVar2.b().c(new ove(this.o, q.b, 0));
        }
    }

    public final void d(uae uae) {
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        vo8 q = plVar.d().q(this.X);
        if (q != null && q.z0 != ls8.DELETED) {
            String str = uae.b;
            if (!iu7.F(str)) {
                if ("attachment.not.ready".equals(str)) {
                    pl plVar3 = this.c;
                    if (plVar3 == null) {
                        plVar3 = null;
                    }
                    ((w10) plVar3.B.getValue()).b(q);
                } else {
                    f();
                    pl plVar4 = this.c;
                    if (plVar4 == null) {
                        plVar4 = null;
                    }
                    plVar4.b().c(new jh0(this.a, uae));
                }
            }
            pl plVar5 = this.c;
            if (plVar5 != null) {
                plVar2 = plVar5;
            }
            plVar2.b().c(new ove(this.o, q.b, 0));
        }
    }

    public final int e() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        to8 d = plVar.d();
        long j = this.X;
        vo8 q = d.q(j);
        pl plVar2 = this.c;
        if (plVar2 == null) {
            plVar2 = null;
        }
        t52 c = plVar2.c();
        long j2 = this.o;
        i22 B = c.B(j2);
        pl plVar3 = this.c;
        if (plVar3 == null) {
            plVar3 = null;
        }
        jee e = plVar3.e();
        una una = una.TYPE_MSG_EDIT;
        long j3 = this.a;
        for (zde zde : e.h(j3, una)) {
            p89 p89 = (p89) zde.f;
            if (p89.o == j2 && p89.X == j) {
                udd.q("p89", "onPreExecute: later edit task found, REMOVE");
                return 3;
            }
        }
        if (q == null || q.z0 == ls8.DELETED || B == null || (!B.A() && !B.O())) {
            udd.q("p89", "onPreExecute: message or chat not found, REMOVE");
            return 3;
        }
        long j4 = this.Z;
        if (j4 == 0) {
            udd.q("p89", "onPreExecute: message serverId == 0, REMOVE");
            return 3;
        }
        jj7 jj7 = q.D0;
        String str = "onPreExecute: attaches not ready, SKIP";
        boolean z = this.z0;
        if (z && q.l(j10.c)) {
            List<o10> list = jj7 != null ? (List) jj7.a : null;
            if (list == null) {
                list = hw4.a;
            }
            for (o10 o10 : list) {
                if (o10.f()) {
                    a10 a10 = o10.b;
                    String str2 = str;
                    if (a10.w0 == 0 || !r1g.p(a10.Z)) {
                        str = str2;
                    } else {
                        pl plVar4 = this.c;
                        if (plVar4 == null) {
                            plVar4 = null;
                        }
                        if (plVar4.e().j(j3).c > 20) {
                            udd.q("p89", "onPreExecute: taskDb.failsCount > 20, REMOVE");
                            f();
                            return 3;
                        }
                        pl plVar5 = this.c;
                        if (plVar5 == null) {
                            plVar5 = null;
                        }
                        ((gy9) plVar5.a()).E(this.Y, Collections.singletonList(Long.valueOf(j4)));
                        pl plVar6 = this.c;
                        (plVar6 != null ? plVar6 : null).e().c(j3);
                        udd.q("p89", str2);
                        return 2;
                    }
                }
            }
        }
        String str3 = str;
        if (z) {
            if (!((!q.o() && q.m()) ? w10.a(jj7) : true)) {
                udd.q("p89", str3);
                return 2;
            }
        }
        return 1;
    }

    public final void f() {
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        plVar.e().d(this.a);
        pl plVar3 = this.c;
        if (plVar3 == null) {
            plVar3 = null;
        }
        vo8 q = plVar3.d().q(this.X);
        if (q != null) {
            pl plVar4 = this.c;
            if (plVar4 == null) {
                plVar4 = null;
            }
            plVar4.d().x(q, bp8.SENT);
            pl plVar5 = this.c;
            if (plVar5 != null) {
                plVar2 = plVar5;
            }
            ((wr4) plVar2.D.getValue()).a(this.X, this.o, this.B0, this.y0, this.w0, this.x0, this.z0);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, p10] */
    public final byte[] g() {
        Tasks.MsgEdit msgEdit = new Tasks.MsgEdit();
        msgEdit.requestId = this.a;
        msgEdit.chatId = this.o;
        msgEdit.messageId = this.X;
        msgEdit.chatServerId = this.Y;
        msgEdit.messageServerId = this.Z;
        msgEdit.text = this.A0;
        msgEdit.oldText = this.B0;
        msgEdit.oldStatus = this.w0.a;
        msgEdit.editAttaches = this.z0;
        List list = this.x0;
        if (list != null) {
            ? obj = new Object();
            obj.a = list;
            msgEdit.oldAttaches = b.f(obj.c());
        }
        List list2 = this.y0;
        if (list2 != null) {
            msgEdit.oldElements = gp8.c(list2);
        }
        return gr8.toByteArray(msgEdit);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_MSG_EDIT;
    }

    public final int h() {
        return 1000000;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ibe i() {
        /*
            r13 = this;
            pl r0 = r13.c
            r1 = 0
            if (r0 == 0) goto L_0x0006
            goto L_0x0007
        L_0x0006:
            r0 = r1
        L_0x0007:
            t52 r0 = r0.c()
            long r2 = r13.o
            i22 r0 = r0.B(r2)
            pl r2 = r13.c
            if (r2 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r2 = r1
        L_0x0017:
            to8 r2 = r2.d()
            long r3 = r13.X
            vo8 r2 = r2.q(r3)
            if (r0 == 0) goto L_0x0053
            if (r2 != 0) goto L_0x0026
            goto L_0x0053
        L_0x0026:
            boolean r3 = r13.z0
            if (r3 == 0) goto L_0x0039
            jj7 r3 = r2.D0
            zy r3 = defpackage.fu7.f(r3)
            if (r3 != 0) goto L_0x0037
            zy r3 = new zy
            r3.<init>()
        L_0x0037:
            r10 = r3
            goto L_0x003a
        L_0x0039:
            r10 = r1
        L_0x003a:
            java.util.List r3 = r2.V0
            if (r3 == 0) goto L_0x0042
            java.util.ArrayList r1 = defpackage.fu7.v(r3)
        L_0x0042:
            r11 = r1
            pn2 r1 = new pn2
            o62 r0 = r0.b
            long r5 = r0.a
            nd4 r12 = r2.X0
            long r7 = r13.Z
            java.lang.String r9 = r13.A0
            r4 = r1
            r4.<init>(r5, r7, r9, r10, r11, r12)
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p89.i():ibe");
    }
}
