package defpackage;

/* renamed from: l06  reason: default package */
public final class l06 implements kq6 {
    public static final l06 a = new Object();
    public static final byte[] b = e07.b("<svg");
    public static final byte[] c = e07.b("<?xm");
    public static final int d;

    /* JADX WARNING: type inference failed for: r0v0, types: [l06, java.lang.Object] */
    static {
        int length = "<svg".getBytes(e22.b).length;
        d = length;
    }

    public final lq6 a(int i, byte[] bArr) {
        return (e07.x(bArr, b, 0) || e07.x(bArr, c, 0)) ? gp0.g : lq6.c;
    }

    public final int b() {
        return d;
    }
}
