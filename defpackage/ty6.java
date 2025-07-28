package defpackage;

/* renamed from: ty6  reason: default package */
public abstract class ty6 {
    public static final kc9 a = new kc9();

    static {
        int i = mlc.a;
    }

    public static final void a() {
        kc9 kc9 = a;
        Object[] objArr = kc9.b;
        long[] jArr = kc9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((rrd) objArr[(i << 3) + i3]).e();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
