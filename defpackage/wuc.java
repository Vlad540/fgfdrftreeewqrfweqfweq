package defpackage;

import android.net.Uri;

/* renamed from: wuc  reason: default package */
public final class wuc extends iic {
    public final /* synthetic */ qz3 w0;
    public final /* synthetic */ yz3 x0;
    public final /* synthetic */ avc y0;

    public wuc(avc avc, iv0 iv0, yz3 yz3) {
        this.y0 = avc;
        this.w0 = iv0;
        this.x0 = yz3;
    }

    /* JADX INFO: finally extract failed */
    public final Object d() {
        lja lja = this.y0.b;
        qz3 qz3 = this.w0;
        fsd fsd = new fsd(qz3);
        yi7.b.getAndIncrement();
        fsd.b = 0;
        tz3 tz3 = new tz3((qz3) fsd, this.x0);
        try {
            tz3.m();
            Uri uri = qz3.getUri();
            uri.getClass();
            Object k = lja.k(uri, tz3);
            oze.h(tz3);
            k.getClass();
            return (qg5) k;
        } catch (Throwable th) {
            oze.h(tz3);
            throw th;
        }
    }
}
