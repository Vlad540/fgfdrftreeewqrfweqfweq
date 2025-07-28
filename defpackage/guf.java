package defpackage;

import java.util.HashMap;

/* renamed from: guf  reason: default package */
public final class guf {
    public static final String e = a24.e0("WorkTimer");
    public final gvf a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    public guf(gvf gvf) {
        this.a = gvf;
    }

    public final void a(btf btf) {
        synchronized (this.d) {
            try {
                if (((fuf) this.b.remove(btf)) != null) {
                    a24 B = a24.B();
                    String str = e;
                    B.t(str, "Stopping timer for " + btf);
                    this.c.remove(btf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
