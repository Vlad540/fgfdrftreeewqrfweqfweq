package defpackage;

/* renamed from: ja0  reason: default package */
public final class ja0 {
    public final s4b a;
    public final lr6 b;

    public ja0(s4b s4b, lr6 lr6) {
        if (s4b != null) {
            this.a = s4b;
            this.b = lr6;
            return;
        }
        throw new NullPointerException("Null processingRequest");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ja0)) {
            return false;
        }
        ja0 ja0 = (ja0) obj;
        return this.a.equals(ja0.a) && this.b.equals(ja0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
