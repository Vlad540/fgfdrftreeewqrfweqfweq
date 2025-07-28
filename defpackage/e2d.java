package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: e2d  reason: default package */
public final class e2d {
    public final d2d a;

    public e2d(int i, ArrayList arrayList, Executor executor, ys1 ys1) {
        this.a = new d2d(i, arrayList, executor, ys1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e2d)) {
            return false;
        }
        return this.a.equals(((e2d) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
