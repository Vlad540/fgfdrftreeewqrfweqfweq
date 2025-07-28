package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: m1e  reason: default package */
public final class m1e implements e75 {
    public final ija X = new ija();
    public byte[] Y = oze.f;
    public bpe Z;
    public final u1e a;
    public final m54 b = new Object();
    public final xu5 c;
    public final ArrayList o;
    public int w0;
    public int x0;
    public long[] y0;
    public long z0;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, m54] */
    public m1e(u1e u1e, xu5 xu5) {
        this.a = u1e;
        uu5 a2 = xu5.a();
        a2.m = c49.l("application/x-media3-cues");
        a2.i = xu5.n;
        a2.G = u1e.R();
        this.c = new xu5(a2);
        this.o = new ArrayList();
        this.x0 = 0;
        this.y0 = oze.g;
        this.z0 = -9223372036854775807L;
    }

    public final void S(i75 i75) {
        oyb.k(this.x0 == 0);
        bpe B = i75.B(0, 3);
        this.Z = B;
        B.e(this.c);
        i75.w();
        i75.M(new rv6(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.x0 = 1;
    }

    public final void a(l1e l1e) {
        oyb.l(this.Z);
        byte[] bArr = l1e.b;
        int length = bArr.length;
        ija ija = this.X;
        ija.getClass();
        ija.E(bArr.length, bArr);
        this.Z.b(ija, length, 0);
        this.Z.a(l1e.a, 1, length, 0, (zoe) null);
    }

    public final void d(long j, long j2) {
        int i = this.x0;
        oyb.k((i == 0 || i == 5) ? false : true);
        this.z0 = j2;
        if (this.x0 == 2) {
            this.x0 = 1;
        }
        if (this.x0 == 4) {
            this.x0 = 3;
        }
    }

    public final int g(g75 g75, le4 le4) {
        int i = this.x0;
        oyb.k((i == 0 || i == 5) ? false : true);
        if (this.x0 == 1) {
            int l = ((r74) g75).c != -1 ? xie.l(((r74) g75).c) : 1024;
            if (l > this.Y.length) {
                this.Y = new byte[l];
            }
            this.w0 = 0;
            this.x0 = 2;
        }
        int i2 = this.x0;
        ArrayList arrayList = this.o;
        if (i2 == 2) {
            byte[] bArr = this.Y;
            if (bArr.length == this.w0) {
                this.Y = Arrays.copyOf(bArr, bArr.length + LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
            byte[] bArr2 = this.Y;
            int i3 = this.w0;
            r74 r74 = (r74) g75;
            int read = r74.read(bArr2, i3, bArr2.length - i3);
            if (read != -1) {
                this.w0 += read;
            }
            long j = r74.c;
            if ((j != -1 && ((long) this.w0) == j) || read == -1) {
                try {
                    long j2 = this.z0;
                    this.a.Q(this.Y, 0, this.w0, j2 != -9223372036854775807L ? new t1e(j2, true) : t1e.c, new sic(19, this));
                    Collections.sort(arrayList);
                    this.y0 = new long[arrayList.size()];
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        this.y0[i4] = ((l1e) arrayList.get(i4)).a;
                    }
                    this.Y = oze.f;
                    this.x0 = 4;
                } catch (RuntimeException e) {
                    throw ParserException.a(e, "SubtitleParser failed.");
                }
            }
        }
        if (this.x0 == 3) {
            if (((r74) g75).f(((r74) g75).c != -1 ? xie.l(((r74) g75).c) : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == -1) {
                long j3 = this.z0;
                for (int f = j3 == -9223372036854775807L ? 0 : oze.f(this.y0, j3, true); f < arrayList.size(); f++) {
                    a((l1e) arrayList.get(f));
                }
                this.x0 = 4;
            }
        }
        return this.x0 == 4 ? -1 : 0;
    }

    public final boolean n(g75 g75) {
        return true;
    }

    public final void release() {
        if (this.x0 != 5) {
            this.a.reset();
            this.x0 = 5;
        }
    }
}
