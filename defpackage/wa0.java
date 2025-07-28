package defpackage;

/* renamed from: wa0  reason: default package */
public final class wa0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public wa0(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0 = (wa0) obj;
        return this.a == wa0.a && this.b == wa0.b && this.c == wa0.c && this.d == wa0.d;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (this.d) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
        sb.append(this.a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.b);
        sb.append(", previewStabilizationOn=");
        sb.append(this.c);
        sb.append(", ultraHdrOn=");
        return hr1.j(sb, this.d, "}");
    }
}
