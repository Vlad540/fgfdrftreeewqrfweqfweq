package defpackage;

import java.util.List;

/* renamed from: x2b  reason: default package */
public final class x2b extends lbe implements co7 {
    public final List c;

    public x2b(List list) {
        this.c = list;
    }

    public final String a(boolean z, boolean z2) {
        return "PRESET_AVATARS.Response(presets=" + gwf.A(this.c, z, z2) + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2b) && hhd.f(this.c, ((x2b) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return a(false, false);
    }
}
