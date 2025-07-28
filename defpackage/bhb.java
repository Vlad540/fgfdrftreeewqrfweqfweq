package defpackage;

/* renamed from: bhb  reason: default package */
public final class bhb implements qe8 {
    public final nz3 a;
    public final ss8 b;
    public final ydc c;
    public final mk9 d;
    public final int e = 1048576;

    public bhb(nz3 nz3, t74 t74) {
        ss8 ss8 = new ss8(24, t74);
        ydc ydc = new ydc(6);
        mk9 mk9 = new mk9(9);
        this.a = nz3;
        this.b = ss8;
        this.c = ydc;
        this.d = mk9;
    }

    public final qe8 a() {
        oyb.h((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final qe8 c() {
        oyb.h((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final zh0 e(l68 l68) {
        l68.b.getClass();
        return new dhb(l68, this.a, this.b, this.c.v(l68), this.d, this.e);
    }
}
