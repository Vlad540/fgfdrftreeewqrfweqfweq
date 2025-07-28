package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: uzc  reason: default package */
public abstract class uzc {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public static final long[] b(ws8 ws8) {
        int i;
        CopyOnWriteArraySet copyOnWriteArraySet = a;
        try {
            i = jjd.D(ws8);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                return null;
            }
            if (t != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th;
        }
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = jjd.J(ws8, 0);
        }
        return jArr;
    }
}
