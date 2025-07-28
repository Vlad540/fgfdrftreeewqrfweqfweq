package defpackage;

import java.util.Objects;

/* renamed from: mac  reason: default package */
public final class mac implements ahc {
    public final boolean a;

    public mac(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mac.class != obj.getClass()) {
            return false;
        }
        return this.a == ((mac) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return "RequestAsr{isEnabled=" + this.a + '}';
    }
}
