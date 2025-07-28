package defpackage;

/* renamed from: zuc  reason: default package */
public final class zuc extends iic {
    public final zv0 A0;
    public final yuc w0;
    public final iv0 x0;
    public final xuc y0;
    public final byte[] z0;

    public zuc(yuc yuc, iv0 iv0, xuc xuc, byte[] bArr) {
        this.w0 = yuc;
        this.x0 = iv0;
        this.y0 = xuc;
        this.z0 = bArr;
        this.A0 = new zv0(iv0, yuc.b, bArr, xuc);
    }

    public final void b() {
        this.A0.j = true;
    }

    public final Object d() {
        this.A0.a();
        xuc xuc = this.y0;
        if (xuc == null) {
            return null;
        }
        xuc.X++;
        ((ll4) xuc.a).b(xuc.b(), xuc.b, xuc.o);
        return null;
    }
}
