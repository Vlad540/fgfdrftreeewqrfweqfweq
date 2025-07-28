package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: s56  reason: default package */
public final class s56 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ Set Y;
    public final /* synthetic */ m66 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s56(m66 m66, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = set;
        this.Z = m66;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        s56 s56 = new s56(this.Z, this.Y, continuation);
        s56.X = obj;
        return s56;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        ArrayList arrayList = new ArrayList(this.Y);
        m66 m66 = this.Z;
        Iterable iterable = (Iterable) m66.A0.getValue();
        ArrayList arrayList2 = new ArrayList(q23.H(iterable, 10));
        Iterator it = iterable.iterator();
        boolean z = false;
        while (true) {
            boolean hasNext = it.hasNext();
            jue jue = jue.a;
            if (hasNext) {
                h56 h56 = (h56) it.next();
                if (!n1g.A(ou3)) {
                    return jue;
                }
                if (!arrayList.isEmpty()) {
                    Uri uri = h56.c.b;
                    Iterator it2 = arrayList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        Uri c = ((rwc) it2.next()).a.c();
                        if (ct0.c(uri, c) || String.valueOf(c).length() > 0) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1) {
                        arrayList.remove(i);
                        int t = m66.t(h56.c);
                        if (h56.h != t) {
                            h56 = h56.b(h56, (kpa) null, (f3f) null, (Uri) null, t, false, 0, (Uri) null, 1983);
                            z = true;
                        }
                    }
                }
                arrayList2.add(h56);
            } else {
                if (n1g.A(ou3) && z) {
                    m66.A0.m((Object) null, arrayList2);
                }
                return jue;
            }
        }
    }
}
