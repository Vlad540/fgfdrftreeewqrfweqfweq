package defpackage;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: iie  reason: default package */
public final class iie implements zqd {
    public final /* synthetic */ kie a;

    public iie(kie kie) {
        this.a = kie;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.rj5 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.hie
            if (r0 == 0) goto L_0x0013
            r0 = r10
            hie r0 = (defpackage.hie) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            hie r0 = new hie
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            rj5 r8 = r0.X
            iie r9 = r0.o
            defpackage.wx3.H(r10)
        L_0x002d:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0044
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            rj5 r8 = r0.X
            iie r9 = r0.o
            defpackage.wx3.H(r10)
            goto L_0x005d
        L_0x0041:
            defpackage.wx3.H(r10)
        L_0x0044:
            hu3 r10 = r0.b
            defpackage.lp.m(r10)
            java.util.List r10 = r8.getValue()
            r0.o = r8
            r0.X = r9
            r0.w0 = r4
            java.lang.Object r10 = r9.a(r10, r0)
            if (r10 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x005d:
            r0.o = r9
            r0.X = r8
            r0.w0 = r3
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = ek8.q(r5, r0)
            if (r10 != r1) goto L_0x002d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iie.c(rj5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: e */
    public final List getValue() {
        int i;
        kie kie = this.a;
        kie.getClass();
        ArrayList C = p23.C(new z14(kie.a, new hge(mtb.oneme_settings_dump_threads), phc.s, (mge) null, w14.f, 8));
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map n = z3d.n(allStackTraces);
        Iterator it = gie.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            i = 0;
            if (!u1Var.hasNext()) {
                break;
            }
            Thread.State state = (Thread.State) u1Var.next();
            long longValue = ((Long) kie.e.computeIfAbsent(state, new di(19, new u1c(21)))).longValue();
            int i2 = mtb.oneme_settings_thread_state_count;
            String name = state.name();
            Integer num = (Integer) n.get(state);
            if (num != null) {
                i = num.intValue();
            }
            z14 z14 = r8;
            z14 z142 = new z14(longValue, new jge(i2, cs.g0(new Object[]{name, Integer.valueOf(i)})), phc.b1, (mge) null, (n06) null, 24);
            C.add(z14);
        }
        int i3 = mtb.oneme_settings_thread_state_count;
        int i4 = 0;
        for (Number intValue : n.values()) {
            i4 += intValue.intValue();
        }
        C.add(new z14(kie.b, new jge(i3, cs.g0(new Object[]{"Total", Integer.valueOf(i4)})), phc.b1, (mge) null, (n06) null, 24));
        if (!allStackTraces.isEmpty()) {
            int i5 = 0;
            for (Map.Entry<Thread, StackTraceElement[]> key : allStackTraces.entrySet()) {
                if (p0e.Q(((Thread) key.getKey()).getName(), "tracer-", false)) {
                    i5++;
                }
            }
            i = i5;
        }
        C.add(new z14(kie.c, new jge(mtb.oneme_settings_thread_tracer, cs.g0(new Object[]{Integer.valueOf(i)})), phc.U0, (mge) null, (n06) null, 24));
        C.add(new z14(kie.d, new jge(mtb.oneme_settings_thread_viewer_state, cs.g0(new Object[]{Integer.valueOf(i)})), phc.U1, (mge) null, (n06) null, 24));
        return C;
    }
}
