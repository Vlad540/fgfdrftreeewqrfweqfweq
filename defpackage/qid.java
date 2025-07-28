package defpackage;

import android.os.Bundle;

/* renamed from: qid  reason: default package */
public abstract class qid implements z24 {
    public final pid a;

    /* JADX WARNING: type inference failed for: r0v0, types: [g34, pid] */
    public qid() {
        ? g34 = new g34();
        e(g34);
        this.a = g34;
    }

    public final g34 a() {
        return this.a;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!this.a.a.contains(c34)) {
            return null;
        }
        return new j34(str, c34, bundle, 0, c(), d(bundle), 8);
    }

    public abstract h34 c();

    public abstract i34 d(Bundle bundle);

    public abstract void e(pid pid);
}
