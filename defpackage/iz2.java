package defpackage;

import com.jakewharton.processphoenix.ProcessPhoenix;

/* renamed from: iz2  reason: default package */
public final class iz2 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public iz2(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
    }

    public final void a() {
        t97 t97 = this.a;
        String f = ((zy9) t97.getValue()).f();
        t97 t972 = this.b;
        long s = ((lqc) ((f03) t972.getValue())).s();
        if (f != null && f.length() != 0 && s != -1) {
            ((jp7) this.c.getValue()).a(false);
            ((lqc) ((f03) t972.getValue())).A(Long.valueOf(s));
            ((zy9) t97.getValue()).h(f, false);
            udd.q("bp7", "Run onDropCache");
            ProcessPhoenix.b(((l1c) this.d.getValue()).a);
        }
    }
}
