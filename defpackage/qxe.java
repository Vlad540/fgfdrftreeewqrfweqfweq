package defpackage;

/* renamed from: qxe  reason: default package */
public final class qxe {
    public final String a;
    public final long b;

    public qxe(pxe pxe) {
        this.a = pxe.a;
        this.b = pxe.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadResult{token='");
        sb.append(r1g.v(this.a));
        sb.append("', attachId=");
        return m4b.i(sb, this.b, '}');
    }
}
