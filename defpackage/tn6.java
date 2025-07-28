package defpackage;

/* renamed from: tn6  reason: default package */
public final class tn6 {
    public final Object a;
    public int b;
    public final boolean c;
    public final hs0 d;
    public byte[] e;
    public char[] f;
    public char[] g;
    public char[] h;

    public tn6(hs0 hs0, Object obj, boolean z) {
        this.d = hs0;
        this.a = obj;
        this.c = z;
    }

    public final void a(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = this.e;
            if (bArr == bArr2 || bArr.length >= bArr2.length) {
                this.e = null;
                this.d.a.set(0, bArr);
                return;
            }
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }
}
