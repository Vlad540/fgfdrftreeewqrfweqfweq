package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: alb  reason: default package */
public final class alb {
    public final boolean a;
    public final Set b;
    public final Set c;

    public alb(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.a = z;
        this.b = hashSet == null ? Collections.emptySet() : new HashSet(hashSet);
        this.c = hashSet2 == null ? Collections.emptySet() : new HashSet(hashSet2);
    }

    public final boolean a(Class cls, boolean z) {
        if (this.b.contains(cls)) {
            return true;
        }
        if (this.c.contains(cls)) {
            return false;
        }
        return this.a && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alb)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        alb alb = (alb) obj;
        return this.a == alb.a && Objects.equals(this.b, alb.b) && Objects.equals(this.c, alb.c);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), this.b, this.c});
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.c + '}';
    }
}
