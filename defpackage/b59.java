package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: b59  reason: default package */
public final class b59 extends l5e implements i26 {
    public final /* synthetic */ dy X;
    public final /* synthetic */ m18 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b59(dy dyVar, m18 m18, Continuation continuation) {
        super(2, continuation);
        this.X = dyVar;
        this.Y = m18;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b59) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b59(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        try {
            return this.X.d();
        } catch (FileNotFoundException unused) {
            String c = this.Y.c();
            dy dyVar = this.X;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                File file = dyVar.c;
                fn6.d(tn7, c, "file " + file + " not found", (Throwable) null);
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Throwable th) {
            udd.s(this.Y.c(), "load failed", th);
            return null;
        }
    }
}
