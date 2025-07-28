package defpackage;

import java.util.Objects;

/* renamed from: fl9  reason: default package */
public final class fl9 {
    public final long a;
    public final e00 b;

    public fl9(long j, e00 e00) {
        this.a = j;
        this.b = e00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl9)) {
            return false;
        }
        fl9 fl9 = (fl9) obj;
        return this.a == fl9.a && this.b == fl9.b;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
