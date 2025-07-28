package defpackage;

/* renamed from: jhc  reason: default package */
public final class jhc implements ihc {
    public final xwb a;

    public jhc(xwb xwb) {
        if (xwb != null) {
            this.a = xwb;
            return;
        }
        throw new IllegalArgumentException("Illegal 'logger' value: null");
    }

    public final void a(int i, byte[] bArr) {
        int i2 = cxf.a[hr1.t(i)];
        this.a.log("RtcNotifications", "<- ".concat(i2 != 1 ? i2 != 2 ? "<unknown>" : tf6.a(bArr) : new String(bArr)));
    }

    public final void b(hhc hhc) {
        this.a.log("RtcNotifications", "<- " + hhc);
    }

    public final void c(Throwable th) {
        this.a.log("RtcNotifications", "<- " + th);
    }
}
