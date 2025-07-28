package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* renamed from: h4g  reason: default package */
public abstract class h4g {
    public static final jn a = new jn("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        u5g.l(context).h();
        Set set = fzf.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            synchronized (qa6.F0) {
                try {
                    qa6 qa6 = qa6.G0;
                    if (qa6 != null) {
                        qa6.x0.incrementAndGet();
                        z59 z59 = qa6.B0;
                        z59.sendMessageAtFrontOfQueue(z59.obtainMessage(10));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ((fzf) it.next()).getClass();
        throw new UnsupportedOperationException();
    }
}
