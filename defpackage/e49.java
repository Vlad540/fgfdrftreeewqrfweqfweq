package defpackage;

import org.apache.http.entity.ContentLengthStrategy;

/* renamed from: e49  reason: default package */
public final class e49 implements pi7 {
    public final l34 a = new l34(1);
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public int g;

    public e49(ve veVar) {
        String name = e49.class.getName();
        this.b = ((long) veVar.a) * 1000;
        this.c = ((long) veVar.b) * 1000;
        this.d = ((long) veVar.c) * 1000;
        this.e = ((long) veVar.d) * 1000;
        this.f = veVar.e;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, toString(), (Throwable) null);
        }
    }

    public final boolean a() {
        return false;
    }

    public final boolean b(long j) {
        boolean z = j > this.c ? false : j < this.b ? true : true;
        return z || (z && !(this.a.a() >= this.g));
    }

    public final void c(cza cza) {
        this.g = 0;
        l34 l34 = this.a;
        synchronized (l34) {
            if (l34.b) {
                l34.c(0);
            }
        }
    }

    public final void d(cza cza) {
        this.g = 0;
        l34 l34 = this.a;
        synchronized (l34) {
            if (l34.b) {
                l34.c(0);
            }
        }
    }

    public final boolean e(long j, boolean z) {
        long j2 = z ? this.e : this.d;
        return j2 <= 0 || j >= j2;
    }

    public final long f() {
        return 0;
    }

    public final void g(cza cza) {
        this.g = 0;
    }

    public final void h(cza cza, qi0[] qi0Arr, g55[] g55Arr) {
        int i;
        int i2;
        this.g = 0;
        int length = qi0Arr.length;
        for (int i3 = 0; i3 < length; i3++) {
            g55 g55 = g55Arr[i3];
            if (g55 != null) {
                xu5 j = g55.j();
                int i4 = this.g;
                int i5 = j.o;
                if (i5 != -1) {
                    i = this.f * i5;
                } else {
                    int i6 = qi0Arr[i3].b;
                    i = 65536;
                    switch (i6) {
                        case ContentLengthStrategy.CHUNKED /*-2*/:
                            i = 0;
                            break;
                        case 0:
                            i2 = 5373952;
                            break;
                        case 1:
                        case 3:
                            break;
                        case 2:
                            i2 = 5242880;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i = 131072;
                            break;
                        default:
                            throw new IllegalArgumentException(wn6.h(i6, "Unexpected type of the track="));
                    }
                    i = i2;
                }
                this.g = i4 + i;
                continue;
            }
        }
        this.a.c(this.g);
    }

    public final l34 j() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MinSizeLoadControl(\n        minBufferUs=");
        sb.append(this.b);
        sb.append("\n        maxBufferUs=");
        sb.append(this.c);
        sb.append("\n        playbackBufferUs=");
        sb.append(this.d);
        sb.append("\n        playbackBufferAfterRebufferUs=");
        sb.append(this.e);
        sb.append("\n        formatMaxInputSizeScaleUpFactor=");
        return wn6.j(sb, this.f, "\n        )\n        ");
    }
}
