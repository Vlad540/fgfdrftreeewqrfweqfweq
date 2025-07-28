package defpackage;

import java.util.List;

/* renamed from: e6b  reason: default package */
public final class e6b extends g6b {
    public final List b;

    public e6b(lg7 lg7) {
        this.b = lg7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6b) && hhd.f(this.b, ((e6b) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShowContextMenu(actions=" + this.b + ")";
    }
}
