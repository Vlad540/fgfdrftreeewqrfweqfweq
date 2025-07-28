package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* renamed from: ju3  reason: default package */
public abstract class ju3 extends e0 implements fr3 {
    public static final iu3 Key = new iu3(cqc.c, new t13(11));

    public ju3() {
        super(cqc.c);
    }

    public static /* synthetic */ ju3 limitedParallelism$default(ju3 ju3, int i, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            return ju3.limitedParallelism(i, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
    }

    public abstract void dispatch(hu3 hu3, Runnable runnable);

    public void dispatchYield(hu3 hu3, Runnable runnable) {
        dispatch(hu3, runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <E extends defpackage.fu3> E get(defpackage.gu3 r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.iu3
            r1 = 0
            if (r0 == 0) goto L_0x0027
            iu3 r4 = (defpackage.iu3) r4
            gu3 r0 = r3.getKey()
            if (r0 == r4) goto L_0x0014
            gu3 r2 = r4.b
            if (r2 != r0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r0 = 0
            goto L_0x0018
        L_0x0014:
            r4.getClass()
        L_0x0017:
            r0 = 1
        L_0x0018:
            if (r0 == 0) goto L_0x002e
            u16 r4 = r4.a
            java.lang.Object r3 = r4.invoke(r3)
            fu3 r3 = (defpackage.fu3) r3
            boolean r4 = r3 instanceof defpackage.fu3
            if (r4 == 0) goto L_0x002e
            goto L_0x002d
        L_0x0027:
            cqc r0 = cqc.c
            if (r0 != r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r3 = r1
        L_0x002d:
            r1 = r3
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju3.get(gu3):fu3");
    }

    public final <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation) {
        return new DispatchedContinuation(this, continuation);
    }

    public boolean isDispatchNeeded(hu3 hu3) {
        return true;
    }

    public ju3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return new LimitedDispatcher(this, i, str);
    }

    public hu3 minusKey(gu3 gu3) {
        boolean z;
        boolean z2 = gu3 instanceof iu3;
        bw4 bw4 = bw4.a;
        if (z2) {
            iu3 iu3 = (iu3) gu3;
            gu3 key = getKey();
            if (key == iu3) {
                iu3.getClass();
            } else if (iu3.b != key) {
                z = false;
                if (!z || ((fu3) iu3.a.invoke(this)) == null) {
                    return this;
                }
            }
            z = true;
            return this;
        } else if (cqc.c != gu3) {
            return this;
        }
        return bw4;
    }

    public final ju3 plus(ju3 ju3) {
        return ju3;
    }

    public final void releaseInterceptedContinuation(Continuation<?> continuation) {
        ((DispatchedContinuation) continuation).release$kotlinx_coroutines_core();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a24.F(this);
    }

    public /* synthetic */ ju3 limitedParallelism(int i) {
        return limitedParallelism(i, (String) null);
    }
}
