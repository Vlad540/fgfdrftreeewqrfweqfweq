package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: jve  reason: default package */
public final class jve extends ol implements qce, tna {
    public static final /* synthetic */ int w0 = 0;
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;

    public jve(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
    }

    public final void c(lbe lbe) {
        udd.q("jve", "onSuccess: " + ((q89) lbe));
        vo8 q = p().q(this.X);
        if (q != null && q.z0 != ls8.DELETED) {
            p().x(q, bp8.SENT);
            l().c(new ove(this.o, this.X, 0));
        }
    }

    public final void d(uae uae) {
        udd.p("jve", "onFail", new Object[]{uae});
        vo8 q = p().q(this.X);
        if (q != null && q.z0 != ls8.DELETED && !iu7.F(uae.b)) {
            f();
            l().c(new jh0(this.a, uae));
        }
    }

    public final int e() {
        long j;
        long j2;
        Object obj;
        List<zde> h = t().h(this.a, una.TYPE_UPDATE_FIRE_TIME);
        ArrayList arrayList = new ArrayList();
        for (zde zde : h) {
            jve jve = (jve) zde.f;
            if (jve != null) {
                arrayList.add(jve);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j = this.X;
            j2 = this.o;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            jve jve2 = (jve) obj;
            if (jve2.o == j2 && jve2.X == j) {
                break;
            }
        }
        if (((jve) obj) != null) {
            udd.q("jve", "onPreExecute: found later task, REMOVE");
            return 3;
        }
        vo8 q = p().q(j);
        i22 B = m().B(j2);
        if (q == null || q.z0 == ls8.DELETED || B == null || (!B.A() && !B.O())) {
            udd.q("jve", "onPreExecute: message or chat not found, REMOVE");
            return 3;
        } else if (q.c == 0) {
            udd.q("jve", "onPreExecute: message serverId == 0, REMOVE");
            return 3;
        } else if (B.b.a != 0 || m().P(B)) {
            return 1;
        } else {
            udd.q("jve", "onPreExecute: chat serverId == 0, SKIP");
            return 2;
        }
    }

    public final void f() {
        t().d(this.a);
        vo8 q = p().q(this.X);
        if (q != null) {
            p().x(q, bp8.ERROR);
            l().c(new ove(this.o, this.X, 0));
        }
    }

    public final byte[] g() {
        Tasks.UpdateFireTimeProtoTask updateFireTimeProtoTask = new Tasks.UpdateFireTimeProtoTask();
        updateFireTimeProtoTask.requestId = this.a;
        updateFireTimeProtoTask.chatId = this.o;
        updateFireTimeProtoTask.messageId = this.X;
        updateFireTimeProtoTask.fireTime = this.Y;
        updateFireTimeProtoTask.notifySender = this.Z;
        return gr8.toByteArray(updateFireTimeProtoTask);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_UPDATE_FIRE_TIME;
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ibe i() {
        /*
            r12 = this;
            to8 r0 = r12.p()
            long r1 = r12.X
            vo8 r0 = r0.q(r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            goto L_0x0049
        L_0x000e:
            t52 r2 = r12.m()
            long r3 = r12.o
            i22 r2 = r2.B(r3)
            if (r2 != 0) goto L_0x001b
            goto L_0x0049
        L_0x001b:
            o62 r2 = r2.b
            long r4 = r2.a
            jj7 r2 = r0.D0
            zy r2 = defpackage.fu7.f(r2)
            if (r2 != 0) goto L_0x002c
            zy r2 = new zy
            r2.<init>()
        L_0x002c:
            r9 = r2
            java.util.List r2 = r0.V0
            if (r2 == 0) goto L_0x0035
            java.util.ArrayList r1 = defpackage.fu7.v(r2)
        L_0x0035:
            r10 = r1
            nd4 r11 = new nd4
            long r1 = r12.Y
            boolean r12 = r12.Z
            r11.<init>(r1, r12)
            pn2 r1 = new pn2
            long r6 = r0.c
            java.lang.String r8 = r0.w0
            r3 = r1
            r3.<init>(r4, r6, r8, r9, r10, r11)
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jve.i():ibe");
    }
}
