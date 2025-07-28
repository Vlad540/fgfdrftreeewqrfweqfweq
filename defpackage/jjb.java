package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: jjb  reason: default package */
public final class jjb {
    public static final /* synthetic */ k77[] e;
    public static final String f;
    public final xzc a;
    public final AtomicLong b = new AtomicLong();
    public final nj4 c;
    public final nj4 d;

    static {
        Class<jjb> cls = jjb.class;
        e = new k77[]{new khb(cls, "connectionController", "getConnectionController()Lru/ok/tamtam/controllers/ConnectionController;", 0), wn6.e(m7c.a, cls, "device", "getDevice()Lru/ok/tamtam/Device;", 0)};
        f = cls.getName();
    }

    public jjb(xzc xzc, nj4 nj4, nj4 nj42) {
        this.a = xzc;
        this.c = nj4;
        this.d = nj42;
    }

    public final rf4 a() {
        k77 k77 = e[1];
        return (rf4) this.d.get();
    }
}
