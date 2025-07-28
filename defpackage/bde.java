package defpackage;

import java.util.HashMap;
import java.util.concurrent.ThreadFactory;

/* renamed from: bde  reason: default package */
public final class bde implements cde {
    public final cde a;
    public final HashMap b = new HashMap();

    public bde(cde cde) {
        this.a = cde;
    }

    public final ThreadFactory a(String str) {
        HashMap hashMap = this.b;
        ThreadFactory threadFactory = (ThreadFactory) hashMap.get(str);
        if (threadFactory != null) {
            return threadFactory;
        }
        ThreadFactory a2 = this.a.a(str);
        hashMap.put(str, a2);
        return a2;
    }
}
