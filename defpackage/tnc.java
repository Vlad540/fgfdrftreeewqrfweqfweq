package defpackage;

import java.util.Objects;

/* renamed from: tnc  reason: default package */
public final class tnc {
    public final snc a;
    public final aq6 b;

    public tnc(snc snc, aq6 aq6) {
        this.a = snc;
        this.b = aq6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnc)) {
            return false;
        }
        tnc tnc = (tnc) obj;
        return this.a == tnc.a && Objects.equals(this.b, tnc.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }
}
