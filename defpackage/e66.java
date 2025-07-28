package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: e66  reason: default package */
public final class e66 extends l5e implements i26 {
    public final /* synthetic */ m66 X;
    public final /* synthetic */ rwc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e66(m66 m66, rwc rwc, Continuation continuation) {
        super(2, continuation);
        this.X = m66;
        this.Y = rwc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e66(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        rwc rwc;
        int i;
        Uri uri;
        String path;
        wx3.H(obj);
        m66 m66 = this.X;
        Iterator it = ((List) m66.A0.getValue()).iterator();
        int i2 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            rwc = this.Y;
            if (!hasNext) {
                i2 = -1;
                break;
            }
            if (ct0.c(((h56) it.next()).c.b, rwc.a.c())) {
                break;
            }
            i2++;
        }
        Integer num = new Integer(i2);
        if (num.intValue() < 0) {
            num = null;
        }
        jue jue = jue.a;
        if (num != null) {
            int intValue = num.intValue();
            grd grd = m66.A0;
            h56 h56 = (h56) ((List) grd.getValue()).get(intValue);
            kpa kpa = rwc.c;
            f3f f3f = rwc.b;
            ArrayList arrayList = new ArrayList((Collection) grd.getValue());
            kpa kpa2 = rwc.c;
            Uri uri2 = kpa2 != null ? kpa2.X : null;
            tk7 tk7 = rwc.a;
            int i3 = tk7.X;
            Uri uri3 = h56.l;
            if (kpa.b(kpa, tk7)) {
                uri = kpa.a(kpa, tk7);
                if (uri == null || (path = uri.getPath()) == null || path.equals(tk7.c)) {
                    i = 0;
                } else {
                    i = 0;
                    ArrayList arrayList2 = arrayList;
                    arrayList2.set(intValue, h56.b(h56, kpa, f3f, uri2, 0, false, i, uri, 455));
                    grd.m((Object) null, arrayList2);
                    ArrayList t = pfa.t(m66.J0);
                    f56 f56 = m66.Y;
                    f56.getClass();
                    taf.o(f56.c, new z46(t));
                }
            } else {
                i = i3;
            }
            uri = uri3;
            ArrayList arrayList22 = arrayList;
            arrayList22.set(intValue, h56.b(h56, kpa, f3f, uri2, 0, false, i, uri, 455));
            grd.m((Object) null, arrayList22);
            ArrayList t2 = pfa.t(m66.J0);
            f56 f562 = m66.Y;
            f562.getClass();
            taf.o(f562.c, new z46(t2));
        }
        return jue;
    }
}
