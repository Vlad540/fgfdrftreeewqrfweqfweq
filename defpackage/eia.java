package defpackage;

/* renamed from: eia  reason: default package */
public final class eia extends gia {
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eia(int i, int i2, int i3, byte[] bArr) {
        super(bArr, i, i2);
        this.d = i3;
    }

    public final short a(int i) {
        switch (this.d) {
            case 0:
                int i2 = (i << 1) + this.c;
                byte[] bArr = this.b;
                return (short) (((bArr[i2 + 1] << 8) & 65280) + (bArr[i2] & 255));
            default:
                return (short) ((this.b[i + this.c] * 257) + 128);
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                StringBuilder sb = new StringBuilder("PCM 16 bit (");
                int i = this.a;
                sb.append(i);
                sb.append(") {");
                if (i > 0) {
                    sb.append(a(0));
                    for (int i2 = 1; i2 < i; i2++) {
                        sb.append(", ");
                        sb.append(a(i2));
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder("PCM 8 bit (");
                int i3 = this.a;
                sb2.append(i3);
                sb2.append(") {");
                if (i3 > 0) {
                    byte[] bArr = this.b;
                    int i4 = this.c;
                    sb2.append(bArr[i4]);
                    for (int i5 = 1; i5 < i3; i5++) {
                        sb2.append(", ");
                        sb2.append(bArr[i5 + i4]);
                    }
                }
                sb2.append('}');
                return sb2.toString();
        }
    }
}
