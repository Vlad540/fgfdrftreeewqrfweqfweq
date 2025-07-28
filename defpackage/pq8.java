package defpackage;

import android.text.Layout;

/* renamed from: pq8  reason: default package */
public final class pq8 implements qq8 {
    public final Layout a;

    public pq8(Layout layout) {
        this.a = layout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pq8) && hhd.f(this.a, ((pq8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Simple(bodyLayout=" + this.a + ")";
    }
}
