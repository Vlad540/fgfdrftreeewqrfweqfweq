package defpackage;

import java.io.Serializable;

/* renamed from: ad6  reason: default package */
public final class ad6 implements Serializable {
    public static final ad6 b = new ad6(false);
    public final boolean a;

    public ad6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad6) && this.a == ((ad6) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("GroupOptions(isPremium="), this.a, ")");
    }
}
