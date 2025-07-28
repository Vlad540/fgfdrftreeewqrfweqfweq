package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.ExceptionHandler;

/* renamed from: r4a  reason: default package */
public final class r4a implements g15 {
    public static final AtomicInteger c = new AtomicInteger();
    public final t97 a;
    public final grd b;

    public r4a(t97 t97, t97 t972, pae pae) {
        this.a = t972;
        ContextScope a2 = n1g.a(((n3a) pae).b().limitedParallelism(1, "excp"));
        grd a3 = hrd.a(0);
        this.b = a3;
        ez3.N(new ck5(new nl5(ez3.x(a3, 300), 0), new q4a(t97, (Continuation) null), 5), a2);
    }

    public final void c(Throwable th, boolean z) {
        String str;
        AtomicInteger atomicInteger;
        int i;
        int i2;
        String str2 = null;
        if (z) {
            String name = r4a.class.getName();
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            udd.s(name, "Got exception for handle", cause);
            do {
                atomicInteger = c;
                i = atomicInteger.get();
                i2 = i + 1;
                if (i2 > 2147483645) {
                    i2 = 1;
                }
            } while (!atomicInteger.compareAndSet(i, i2));
            this.b.m((Object) null, Integer.valueOf(i));
        }
        pv3 c2 = ((b9e) this.a.getValue()).c();
        Throwable cause2 = th.getCause();
        boolean z2 = th instanceof ExceptionHandler.HandledException;
        if (!z2) {
            cause2 = null;
        }
        if (cause2 == null) {
            cause2 = th;
        }
        ExceptionHandler.HandledException handledException = z2 ? (ExceptionHandler.HandledException) th : null;
        if (handledException == null || (str = handledException.a) == null) {
            ExceptionHandler.HandledException cause3 = th.getCause();
            ExceptionHandler.HandledException handledException2 = cause3 instanceof ExceptionHandler.HandledException ? cause3 : null;
            if (handledException2 != null) {
                str2 = handledException2.a;
            }
        } else {
            str2 = str;
        }
        c2.a(str2, cause2);
    }
}
