package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: hjb  reason: default package */
public final class hjb implements pp7 {
    public final t97 A0;
    public final ContextScope B0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    public hjb(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978, t97 t979, t97 t9710, t97 t9711, t97 t9712, pae pae, ku3 ku3) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.o = t974;
        this.X = t975;
        this.Y = t976;
        this.Z = t977;
        this.w0 = t978;
        this.x0 = t979;
        this.y0 = t9710;
        this.z0 = t9711;
        this.A0 = t9712;
        this.B0 = n1g.a(((n3a) pae).b().limitedParallelism(1, "push").plus(ku3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.hjb r4, defpackage.cb5 r5, defpackage.oa5 r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof defpackage.fjb
            if (r0 == 0) goto L_0x0016
            r0 = r7
            fjb r0 = (defpackage.fjb) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x001b
        L_0x0016:
            fjb r0 = new fjb
            r0.<init>(r4, r7)
        L_0x001b:
            java.lang.Object r7 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            wx3.H(r7)     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            goto L_0x0051
        L_0x002a:
            r4 = move-exception
            goto L_0x004a
        L_0x002c:
            r4 = move-exception
            goto L_0x0054
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            wx3.H(r7)
            t97 r4 = r4.x0     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            mr9 r4 = (defpackage.mr9) r4     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            r0.Y = r3     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            java.lang.Object r4 = r4.f(r5, r6, r0)     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            if (r4 != r1) goto L_0x0051
            goto L_0x0053
        L_0x004a:
            java.lang.String r5 = "hjb"
            java.lang.String r6 = "notifyTracker: failed"
            udd.s(r5, r6, r4)
        L_0x0051:
            jue r1 = jue.a
        L_0x0053:
            return r1
        L_0x0054:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjb.b(hjb, cb5, oa5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a() {
        lp.e(this.B0.getCoroutineContext(), new CancellationException("logout"));
    }

    public final boolean c() {
        if (!((rf4) this.b.getValue()).d()) {
            t97 t97 = this.a;
            return ((ad3) t97.getValue()).e() || ((!((ad3) t97.getValue()).d() || !((ad3) t97.getValue()).a().g()) && !((ad3) t97.getValue()).c());
        }
    }

    public final boolean d(long j, long j2) {
        kp0 c2 = ((zy9) this.z0.getValue()).c();
        boolean z = c2.b;
        boolean z2 = c2.a;
        if (z2 && !z) {
            return false;
        }
        udd.U("hjb", "onMessagePush: skipped (authorized=" + z2 + ", external=" + z + "), chatServerId=" + j + ", messageId=" + j2);
        return true;
    }

    public final void e(cb5 cb5, oa5 oa5) {
        long j = cb5.a;
        long j2 = cb5.b;
        if (!d(j, j2)) {
            StringBuilder k = hr1.k(j, "onMessagePush: chatServerId=", ", messageId=");
            k.append(j2);
            udd.q("hjb", k.toString());
            xs7.E(this.B0, (hu3) null, (ru3) null, new gjb(this, cb5, oa5, (Continuation) null), 3);
            f(false, c());
        }
    }

    public final void f(boolean z, boolean z2) {
        udd.q("hjb", "onPush: callPush=" + z + ", forceConnection=" + z2);
        t97 t97 = this.c;
        ((j2b) ((g2b) t97.getValue())).a.k("app.last.firebase_push_time", Long.valueOf(System.currentTimeMillis()));
        if (z2) {
            ((j2b) ((g2b) t97.getValue())).a.w(true);
            ((gy9) ((pk) this.Z.getValue())).H(((rf4) this.b.getValue()).d());
            ((gee) this.X.getValue()).a();
        }
        ((bd) this.Y.getValue()).f("ACTION_FCM_PUSH");
    }
}
