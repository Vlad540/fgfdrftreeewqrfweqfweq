package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: kb7  reason: default package */
public final class kb7 extends l5e implements i26 {
    public final /* synthetic */ ga0 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kb7(ga0 ga0, Continuation continuation) {
        super(2, continuation);
        this.X = ga0;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((kb7) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kb7(this.X, continuation);
    }

    /* JADX INFO: finally extract failed */
    public final Object o(Object obj) {
        wx3.H(obj);
        di3 di3 = (di3) ((t97) this.X.g).getValue();
        do3 x = ((a04) di3.f.get()).d.x();
        x.getClass();
        int i = 0;
        pec a = pec.a(0, "SELECT COUNT(*) FROM contact_title");
        aec aec = x.a;
        aec.b();
        Cursor o = aec.o(a, (CancellationSignal) null);
        try {
            if (o.moveToFirst()) {
                i = o.getInt(0);
            }
            o.close();
            a.m();
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                fn6.d(tn7, "ContactController", "ContactController contacts.size=" + di3.a.size() + " titlesCount=" + i, (Throwable) null);
            }
            if (i < di3.a.size()) {
                try {
                    ((a04) di3.f.get()).a();
                    di3.a.forEach(new h03(1, di3));
                    ((a04) di3.f.get()).c();
                } finally {
                    ((a04) di3.f.get()).b();
                }
            }
            return jue.a;
        } catch (Throwable th) {
            o.close();
            a.m();
            throw th;
        }
    }
}
