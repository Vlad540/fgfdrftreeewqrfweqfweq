package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: r56  reason: default package */
public final class r56 extends l5e implements i26 {
    public final /* synthetic */ m66 X;
    public final /* synthetic */ boolean Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r56(m66 m66, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = m66;
        this.Y = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new r56(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        m66 m66 = this.X;
        Iterable<h56> iterable = (Iterable) m66.A0.getValue();
        ArrayList arrayList = new ArrayList(q23.H(iterable, 10));
        for (h56 h56 : iterable) {
            if (h56.h != 0) {
                h56 = h56.b(h56, (kpa) null, (f3f) null, (Uri) null, 0, false, 0, (Uri) null, 1983);
            }
            h56 h562 = h56;
            if (this.Y) {
                h562 = h56.b(h562, (kpa) null, (f3f) null, (Uri) null, 0, false, 0, h562.c.z0, 991);
            }
            arrayList.add(h562);
        }
        m66.A0.m((Object) null, arrayList);
        return jue.a;
    }
}
