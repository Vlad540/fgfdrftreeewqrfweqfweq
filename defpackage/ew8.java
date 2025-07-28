package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ew8  reason: default package */
public final class ew8 {
    public final tt0 a;
    public final long b;
    public final hcd c;
    public final ContextScope d;
    public final s0c e;

    public ew8(long j, tt0 tt0, pae pae) {
        this.a = tt0;
        this.b = j;
        hcd b2 = icd.b(0, 0, 0, 7);
        this.c = b2;
        this.d = n1g.a(((n3a) pae).c().getImmediate());
        tt0.d(this);
        this.e = new s0c(b2);
    }

    @a1e
    public final void onEvent(yga yga) {
        if (yga.b == this.b) {
            xs7.E(this.d, (hu3) null, (ru3) null, new dw8(this, new kp8(Collections.singleton(Long.valueOf(yga.o)), true), (Continuation) null), 3);
        }
    }

    @a1e
    public final void onEvent(gv6 gv6) {
        if (gv6.b == this.b) {
            xs7.E(this.d, (hu3) null, (ru3) null, new dw8(this, new kp8(Collections.singleton(Long.valueOf(gv6.c)), false), (Continuation) null), 3);
        }
    }

    @a1e
    public final void onEvent(ove ove) {
        if (ove.b == this.b) {
            xs7.E(this.d, (hu3) null, (ru3) null, new dw8(this, new pp8(Collections.singleton(Long.valueOf(ove.c))), (Continuation) null), 3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @a1e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(defpackage.l89 r7) {
        /*
            r6 = this;
            long r0 = r7.b
            long r2 = r6.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            long r0 = r7.c
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L_0x001e
            long r4 = r7.o
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x001e
            op8 r7 = new op8
            r7.<init>(r0, r4)
            goto L_0x0030
        L_0x001e:
            java.util.List r7 = r7.X
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002f
            np8 r0 = new np8
            r0.<init>(r7)
            r7 = r0
            goto L_0x0030
        L_0x002f:
            r7 = r3
        L_0x0030:
            if (r7 == 0) goto L_0x003d
            dw8 r0 = new dw8
            r0.<init>(r6, r7, r3)
            r7 = 3
            kotlinx.coroutines.internal.ContextScope r6 = r6.d
            xs7.E(r6, r3, r3, r0, r7)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew8.onEvent(l89):void");
    }

    @a1e
    public final void onEvent(to7 to7) {
        if (to7.X.d(this.b)) {
            xs7.E(this.d, (hu3) null, (ru3) null, new dw8(this, mp8.a, (Continuation) null), 3);
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [qp8, java.lang.Object] */
    @a1e
    public final void onEvent(mw2 mw2) {
        if (mw2.b.contains(Long.valueOf(this.b))) {
            xs7.E(this.d, (hu3) null, (ru3) null, new dw8(this, new Object(), (Continuation) null), 3);
        }
    }
}
