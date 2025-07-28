package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: cg0  reason: default package */
public final class cg0 extends l5e implements i26 {
    public final /* synthetic */ fg0 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cg0(fg0 fg0, Continuation continuation) {
        super(2, continuation);
        this.X = fg0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cg0) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cg0(this.X, continuation);
    }

    /* JADX INFO: finally extract failed */
    public final Object o(Object obj) {
        wx3.H(obj);
        dpa c = ((oec) ((w94) this.X.c.getValue()).a.getValue()).c();
        c.getClass();
        boolean z = false;
        pec a = pec.a(0, "SELECT COUNT(*) FROM phones");
        aec aec = c.a;
        aec.b();
        Cursor o = aec.o(a, (CancellationSignal) null);
        try {
            long j = o.moveToFirst() ? o.getLong(0) : 0;
            o.close();
            a.m();
            if (j == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            o.close();
            a.m();
            throw th;
        }
    }
}
