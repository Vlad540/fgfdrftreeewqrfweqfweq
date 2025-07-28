package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: p56  reason: default package */
public final /* synthetic */ class p56 implements nwc {
    public final /* synthetic */ m66 a;

    public /* synthetic */ p56(m66 m66) {
        this.a = m66;
    }

    public final void B1(Set set) {
        m66 m66 = this.a;
        m66.z0.m((Object) null, Boolean.valueOf(set.size() >= 100));
        int size = set.size();
        udd.q("m66", "onSelectedMediasChangeListener(), selectedCount " + size);
        if (!set.isEmpty()) {
            qod qod = m66.P0;
            if (qod != null) {
                qod.cancel((CancellationException) null);
            }
            m66.P0 = taf.n(m66, m66.o, (ru3) null, new g66(m66, set, (Continuation) null), 2);
        } else {
            m66.r(m66, false, 1);
        }
        ArrayList t = pfa.t(m66.J0);
        f56 f56 = m66.Y;
        f56.getClass();
        taf.o(f56.c, new z46(t));
    }
}
