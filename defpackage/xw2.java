package defpackage;

import android.util.SparseLongArray;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: xw2  reason: default package */
public final class xw2 implements vy3, wy3, g1e, l4f, f75, g75, h75, i75, d28 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ xw2(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public boolean A() {
        switch (this.a) {
            case 2:
                return true;
            default:
                return true;
        }
    }

    public ape B(int i, int i2) {
        return ((h75) this.c).B(i, i2);
    }

    public long C() {
        switch (this.a) {
            case 2:
                return 0;
            default:
                return 0;
        }
    }

    public long D(long j) {
        switch (this.a) {
            case 2:
                return (long) ((by2) this.c).a;
            default:
                return (long) ((cy2) this.c).a;
        }
    }

    public long E(long j, long j2) {
        switch (this.a) {
            case 2:
                return (long) ((by2) this.c).a;
            default:
                return (long) ((cy2) this.c).a;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [androidx.media3.common.VideoFrameProcessingException, java.lang.Exception] */
    public void F(long j) {
        vhd vhd = (vhd) this.c;
        if (vhd.A0) {
            c(new Exception("onOutputFrameAvailableForRendering() received after onEnded()"));
            return;
        }
        if (j == 0) {
            vhd.C0 = true;
        }
        this.b = j;
        ((vhd) this.c).Y.execute(new q50(this, j, 7));
    }

    public void J() {
    }

    public void K(utc utc) {
        ((h75) this.c).K(new kqd(this, utc));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.media3.common.VideoFrameProcessingException, java.lang.Exception] */
    public void L() {
        vhd vhd = (vhd) this.c;
        if (vhd.A0) {
            c(new Exception("onEnded() received multiple times"));
            return;
        }
        vhd.A0 = true;
        vhd.Y.execute(new pzb(17, this));
    }

    public void M(vtc vtc) {
        ((i75) this.c).M(new lqd(this, vtc, vtc));
    }

    public void P(int i) {
        if (i >= 64) {
            xw2 xw2 = (xw2) this.c;
            if (xw2 != null) {
                xw2.P(i - 64);
                return;
            }
            return;
        }
        this.b &= ~(1 << i);
    }

    public int Q(int i) {
        xw2 xw2 = (xw2) this.c;
        if (xw2 == null) {
            if (i >= 64) {
                return Long.bitCount(this.b);
            }
            return Long.bitCount(((1 << i) - 1) & this.b);
        } else if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        } else {
            return Long.bitCount(this.b) + xw2.Q(i - 64);
        }
    }

    public void R() {
        if (((xw2) this.c) == null) {
            this.c = new xw2(0);
        }
    }

    public boolean S(int i) {
        if (i >= 64) {
            R();
            return ((xw2) this.c).S(i - 64);
        }
        return ((1 << i) & this.b) != 0;
    }

    public int T(long j) {
        long U = U();
        long j2 = 0;
        int i = (U > 0 ? 1 : (U == 0 ? 0 : -1));
        int i2 = 0;
        gg ggVar = (gg) this.c;
        if (i == 0) {
            long j3 = 0;
            while (true) {
                j3 += (long) ggVar.o(i2);
                int i3 = i2 + 1;
                if (0 < j3) {
                    return i2;
                }
                i2 = i3;
            }
        } else if (ggVar.I() != 0 && j / U >= ((long) ggVar.I())) {
            return -1;
        } else {
            long j4 = j % U;
            while (true) {
                j2 += (long) ggVar.o(i2);
                int i4 = i2 + 1;
                if (j4 < j2) {
                    return i2;
                }
                i2 = i4;
            }
        }
    }

    public long U() {
        long j = this.b;
        if (j != -1) {
            return j;
        }
        this.b = 0;
        gg ggVar = (gg) this.c;
        int c2 = ggVar.c();
        for (int i = 0; i < c2; i++) {
            this.b += (long) ggVar.o(i);
        }
        return this.b;
    }

    public long V(long j) {
        long U = U();
        long j2 = 0;
        if (U == 0) {
            return -1;
        }
        gg ggVar = (gg) this.c;
        if (!(ggVar.I() == 0) && j / U >= ((long) ggVar.I())) {
            return -1;
        }
        long j3 = j % U;
        int c2 = ggVar.c();
        for (int i = 0; i < c2 && j2 <= j3; i++) {
            j2 += (long) ggVar.o(i);
        }
        return (j2 - j3) + j;
    }

    public void W(int i, boolean z) {
        if (i >= 64) {
            R();
            ((xw2) this.c).W(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            b0(i);
        } else {
            P(i);
        }
        if (z2 || ((xw2) this.c) != null) {
            R();
            ((xw2) this.c).W(0, z2);
        }
    }

    public void X(String str) {
        long nanoTime = System.nanoTime() - this.b;
        long seconds = TimeUnit.NANOSECONDS.toSeconds(nanoTime);
        float nanos = ((float) (nanoTime - TimeUnit.SECONDS.toNanos(seconds))) / ((float) TimeUnit.MILLISECONDS.toNanos(1));
        ((xwb) this.c).log("OKRTCCall", me4.i(str, " completed in ", seconds == 0 ? String.format(Locale.ROOT, "%.1f ms", new Object[]{Float.valueOf(nanos)}) : String.format(Locale.ROOT, "%d seconds and %.1f ms", new Object[]{Long.valueOf(seconds), Float.valueOf(nanos)})));
    }

    public ye6 Y() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String G = ((at0) this.c).G(this.b);
            this.b -= (long) G.length();
            if (G.length() == 0) {
                break;
            }
            int Z = h0e.Z(G, ':', 1, false, 4);
            if (Z != -1) {
                String substring = G.substring(0, Z);
                String substring2 = G.substring(Z + 1);
                arrayList.add(substring);
                arrayList.add(h0e.B0(substring2).toString());
            } else if (G.charAt(0) == ':') {
                String substring3 = G.substring(1);
                arrayList.add(BuildConfig.FLAVOR);
                arrayList.add(h0e.B0(substring3).toString());
            } else {
                arrayList.add(BuildConfig.FLAVOR);
                arrayList.add(h0e.B0(G).toString());
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new ye6((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean Z(int i) {
        if (i >= 64) {
            R();
            return ((xw2) this.c).Z(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        xw2 xw2 = (xw2) this.c;
        if (xw2 != null) {
            if (xw2.S(0)) {
                b0(63);
            }
            ((xw2) this.c).Z(0);
        }
        return z;
    }

    public void a0() {
        this.b = 0;
        xw2 xw2 = (xw2) this.c;
        if (xw2 != null) {
            xw2.a0();
        }
    }

    public long b(long j) {
        switch (this.a) {
            case 2:
                return ((by2) this.c).e[(int) j] - this.b;
            default:
                return ((cy2) this.c).X[(int) j] - this.b;
        }
    }

    public void b0(int i) {
        if (i >= 64) {
            R();
            ((xw2) this.c).b0(i - 64);
            return;
        }
        this.b |= 1 << i;
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        ((vhd) this.c).Y.execute(new sbc(this, 20, videoFrameProcessingException));
    }

    public void c0(int i, long j) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.c;
        long j2 = sparseLongArray.get(i, -9223372036854775807L);
        int i2 = (j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1));
        if (i2 == 0 || j > j2) {
            sparseLongArray.put(i, j);
            if (i2 == 0 || j2 == this.b) {
                int i3 = oze.a;
                if (sparseLongArray.size() != 0) {
                    long j3 = Long.MAX_VALUE;
                    for (int i4 = 0; i4 < sparseLongArray.size(); i4++) {
                        j3 = Math.min(j3, sparseLongArray.valueAt(i4));
                    }
                    this.b = j3;
                    return;
                }
                throw new NoSuchElementException();
            }
        }
    }

    public wxa d() {
        return wxa.d;
    }

    public long e() {
        return this.b;
    }

    public void f(wxa wxa) {
    }

    public long g() {
        switch (this.a) {
            case 11:
                return ((f75) this.c).g() - this.b;
            default:
                return ((g75) this.c).g() - this.b;
        }
    }

    public int h(long j) {
        return this.b > j ? 0 : -1;
    }

    public boolean i(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case 11:
                return ((f75) this.c).i(bArr, i, i2, z);
            default:
                return ((g75) this.c).i(bArr, i, i2, z);
        }
    }

    public long j(long j, long j2) {
        switch (this.a) {
            case 2:
                return ((by2) this.c).d[(int) j];
            default:
                return ((cy2) this.c).o[(int) j];
        }
    }

    public long k(int i) {
        swb.e(i == 0);
        return this.b;
    }

    public long l(long j, long j2) {
        switch (this.a) {
            case 2:
                return 0;
            default:
                return 0;
        }
    }

    public void m(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 11:
                ((f75) this.c).m(i, bArr, i2);
                return;
            default:
                ((g75) this.c).m(i, bArr, i2);
                return;
        }
    }

    public long n(long j, long j2) {
        switch (this.a) {
            case 2:
                return -9223372036854775807L;
            default:
                return -9223372036854775807L;
        }
    }

    public void o(int i, int i2) {
        ((vhd) this.c).Y.execute(new as0(this, i, i2, 4));
    }

    public mxb p(long j) {
        by2 by2 = (by2) this.c;
        int i = (int) j;
        return new mxb(by2.c[i], (String) null, (long) by2.b[i]);
    }

    public List q(long j) {
        if (j >= this.b) {
            return (ws6) this.c;
        }
        po5 po5 = ws6.b;
        return e8c.X;
    }

    public boolean r(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case 11:
                return ((f75) this.c).r(bArr, i, i2, z);
            default:
                return ((g75) this.c).r(bArr, i, i2, z);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 11:
                return ((f75) this.c).read(bArr, i, i2);
            default:
                return ((g75) this.c).read(bArr, i, i2);
        }
    }

    public void readFully(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 11:
                ((f75) this.c).readFully(bArr, i, i2);
                return;
            default:
                ((g75) this.c).readFully(bArr, i, i2);
                return;
        }
    }

    public long s() {
        switch (this.a) {
            case 11:
                return ((f75) this.c).s() - this.b;
            default:
                return ((g75) this.c).s() - this.b;
        }
    }

    public void t(int i) {
        switch (this.a) {
            case 11:
                ((f75) this.c).t(i);
                return;
            default:
                ((g75) this.c).t(i);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((xw2) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((xw2) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public int u() {
        return 1;
    }

    public long v(long j, long j2) {
        switch (this.a) {
            case 2:
                return (long) mze.f(((by2) this.c).e, j + this.b, true);
            default:
                return (long) oze.f(((cy2) this.c).X, j + this.b, true);
        }
    }

    public void w() {
        switch (this.a) {
            case 13:
                ((h75) this.c).w();
                return;
            default:
                ((i75) this.c).w();
                return;
        }
    }

    public long x() {
        switch (this.a) {
            case 11:
                return ((f75) this.c).x() - this.b;
            default:
                return ((g75) this.c).x() - this.b;
        }
    }

    public void y() {
        switch (this.a) {
            case 11:
                ((f75) this.c).y();
                return;
            default:
                ((g75) this.c).y();
                return;
        }
    }

    public void z(int i) {
        switch (this.a) {
            case 11:
                ((f75) this.c).z(i);
                return;
            default:
                ((g75) this.c).z(i);
                return;
        }
    }

    public /* synthetic */ xw2(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    /* renamed from: B  reason: collision with other method in class */
    public bpe m54B(int i, int i2) {
        return ((i75) this.c).B(i, i2);
    }

    /* renamed from: p  reason: collision with other method in class */
    public nxb m55p(long j) {
        cy2 cy2 = (cy2) this.c;
        int i = (int) j;
        return new nxb(cy2.c[i], (String) null, (long) cy2.b[i]);
    }

    public /* synthetic */ xw2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public xw2(kqc kqc, sic sic) {
        this.a = 9;
        this.c = new AtomicInteger(0);
        int intValue = ((Number) kqc.invoke()).intValue() + 1;
        ((lqc) sic.b).j(intValue, "request_id");
        this.b = ((long) intValue) << 32;
    }

    public xw2(wf wfVar) {
        this.a = 4;
        this.c = wfVar;
        this.b = -1;
    }

    public xw2(at0 at0) {
        this.a = 7;
        this.c = at0;
        this.b = (long) 262144;
    }

    public xw2(q74 q74, long j) {
        this.a = 11;
        this.c = q74;
        swb.e(q74.o >= j);
        this.b = j;
    }

    public xw2(r74 r74, long j) {
        this.a = 12;
        this.c = r74;
        oyb.d(r74.o >= j);
        this.b = j;
    }

    public xw2(int i) {
        this.a = i;
        switch (i) {
            case 6:
                return;
            case 15:
                this.c = new SparseLongArray();
                return;
            default:
                this.b = 0;
                return;
        }
    }
}
