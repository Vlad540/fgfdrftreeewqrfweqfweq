package defpackage;

import android.media.MediaCodec;
import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: y50  reason: default package */
public final class y50 extends qjc {
    public final w54 e;
    public final h50 f;
    public final n24 g;
    public final n24 h;
    public final w30 i;
    public final y30 j;
    public final xu5 k;
    public boolean l;
    public long m;

    public y50(xu5 xu5, xu5 xu52, iqe iqe, gs4 gs4, ws6 ws6, gf6 gf6, l13 l13, ad9 ad9, s39 s39) {
        super(xu5, ad9);
        w30 w30 = new w30(gf6, ws6);
        this.i = w30;
        this.k = xu52;
        this.j = w30.i(gs4, xu52);
        h50 h50 = ((f50) w30.f).d;
        this.f = h50;
        oyb.k(!h50.equals(h50.e));
        uu5 uu5 = new uu5();
        String str = iqe.b;
        if (str == null) {
            str = xu5.n;
            str.getClass();
        }
        uu5.m = c49.l(str);
        uu5.B = h50.a;
        uu5.A = h50.b;
        uu5.C = h50.c;
        uu5.i = xu52.j;
        xu5 xu53 = new xu5(uu5);
        uu5 a = xu53.a();
        a.m = c49.l(qjc.i(xu53, ad9.b.b(1)));
        w54 f2 = l13.f(new xu5(a));
        this.e = f2;
        this.g = new n24(0);
        this.h = new n24(0);
        xu5 xu54 = f2.c;
        if (!oze.a(xu53.n, xu54.n)) {
            wx a2 = iqe.a();
            a2.b(xu54.n);
            iqe = a2.a();
        }
        s39.h(iqe);
    }

    public final ob6 j(gs4 gs4, xu5 xu5, int i2) {
        if (this.l) {
            return this.i.i(gs4, xu5);
        }
        this.l = true;
        oyb.k(xu5.equals(this.k));
        return this.j;
    }

    public final n24 k() {
        n24 n24 = this.h;
        w54 w54 = this.e;
        ByteBuffer c = w54.c();
        n24.X = c;
        MediaCodec.BufferInfo bufferInfo = null;
        if (c == null) {
            return null;
        }
        if (w54.f(false)) {
            bufferInfo = w54.a;
        }
        bufferInfo.getClass();
        n24.Z = bufferInfo.presentationTimeUs;
        n24.b = 1;
        return n24;
    }

    public final xu5 l() {
        w54 w54 = this.e;
        w54.f(false);
        return w54.j;
    }

    public final boolean m() {
        return this.e.d();
    }

    public final boolean n() {
        boolean z;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        boolean z2 = true;
        w30 w30 = this.i;
        long j2 = -9223372036854775807L;
        if (w30.b) {
            z = true;
        } else {
            boolean z3 = w30.a;
            i44 i44 = (i44) w30.e;
            if (!z3) {
                try {
                    i44.d((h50) w30.g);
                    w30.a = true;
                } catch (AudioProcessor$UnhandledAudioFormatException e2) {
                    throw ExportException.b(e2, "Error while configuring mixer");
                }
            }
            w30.b = true;
            int i2 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) w30.d;
                if (i2 >= arrayList.size()) {
                    break;
                }
                v30 v30 = (v30) arrayList.get(i2);
                if (v30.b == -1) {
                    y30 y30 = v30.a;
                    try {
                        y30.l();
                        long j3 = y30.e.get();
                        if (j3 == -9223372036854775807L) {
                            w30.b = false;
                        } else if (j3 != Long.MIN_VALUE) {
                            v30.b = i44.a(y30.a, j3);
                        }
                    } catch (AudioProcessor$UnhandledAudioFormatException e3) {
                        throw ExportException.b(e3, "Unhandled format while adding source " + v30.b);
                    }
                }
                i2++;
            }
            z = w30.b;
        }
        if (!z) {
            byteBuffer = k50.a;
        } else {
            if (!((i44) w30.e).e()) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = (ArrayList) w30.d;
                    if (i3 >= arrayList2.size()) {
                        break;
                    }
                    v30 v302 = (v30) arrayList2.get(i3);
                    int i4 = v302.b;
                    i44 i442 = (i44) w30.e;
                    i442.c();
                    SparseArray sparseArray = i442.c;
                    if (oze.l(sparseArray, i4)) {
                        y30 y302 = v302.a;
                        if (!y302.m() && y302.d.isEmpty() && (y302.l == j2 ? y302.j || y302.k : y302.o && (y302.j || y302.k))) {
                            i442.c();
                            long j4 = i442.l;
                            SparseArray sparseArray2 = i442.c;
                            oyb.j("Source not found.", oze.l(sparseArray2, i4));
                            i442.l = Math.max(j4, ((h44) sparseArray2.get(i4)).a);
                            sparseArray.delete(i4);
                            v302.b = -1;
                            w30.c++;
                        } else {
                            try {
                                i442.f(i4, y302.l());
                            } catch (AudioProcessor$UnhandledAudioFormatException e4) {
                                throw ExportException.b(e4, "AudioGraphInput (sourceId=" + i4 + ") reconfiguration");
                            }
                        }
                    }
                    i3++;
                    j2 = -9223372036854775807L;
                }
            }
            if (!((ByteBuffer) w30.h).hasRemaining()) {
                i44 i443 = (i44) w30.e;
                i443.c();
                if (i443.e()) {
                    byteBuffer2 = k50.a;
                } else {
                    long j5 = i443.k;
                    if (i443.c.size() == 0) {
                        j5 = Math.min(j5, i443.l);
                    }
                    for (int i5 = 0; i5 < i443.c.size(); i5++) {
                        j5 = Math.min(j5, ((h44) i443.c.valueAt(i5)).a);
                    }
                    if (j5 <= i443.j) {
                        byteBuffer2 = k50.a;
                    } else {
                        ir1 ir1 = i443.g[0];
                        long min = Math.min(j5, ir1.b);
                        ByteBuffer duplicate = ((ByteBuffer) ir1.c).duplicate();
                        duplicate.position(((int) (i443.j - ir1.a)) * i443.e.d).limit(((int) (min - ir1.a)) * i443.e.d);
                        ByteBuffer order = duplicate.slice().order(ByteOrder.nativeOrder());
                        if (min == ir1.b) {
                            ir1[] ir1Arr = i443.g;
                            ir1 ir12 = ir1Arr[1];
                            ir1Arr[0] = ir12;
                            ir1Arr[1] = i443.b(ir12.b);
                        }
                        i443.j = min;
                        i443.i = Math.min(i443.k, min + ((long) i443.f));
                        order.remaining();
                        LinkedHashMap linkedHashMap = b24.a;
                        synchronized (b24.class) {
                        }
                        byteBuffer2 = order;
                    }
                }
                w30.h = byteBuffer2;
            }
            if (((f50) w30.f).f()) {
                boolean h2 = w30.h();
                f50 f50 = (f50) w30.f;
                if (h2) {
                    f50.h();
                } else {
                    f50.i((ByteBuffer) w30.h);
                }
                byteBuffer = ((f50) w30.f).d();
            } else {
                byteBuffer = (ByteBuffer) w30.h;
            }
        }
        if (!this.e.e(this.g)) {
            return false;
        }
        w30 w302 = this.i;
        f50 f502 = (f50) w302.f;
        if (f502.f() ? f502.e() : w302.h()) {
            b24.a();
            n24 n24 = this.g;
            ByteBuffer byteBuffer3 = n24.X;
            byteBuffer3.getClass();
            if (byteBuffer3.position() != 0) {
                z2 = false;
            }
            oyb.k(z2);
            long j6 = this.m;
            h50 h50 = this.f;
            n24.Z = ((j6 / ((long) h50.d)) * 1000000) / ((long) h50.a);
            n24.a(4);
            n24.y();
            this.e.g(n24);
            return false;
        } else if (!byteBuffer.hasRemaining()) {
            return false;
        } else {
            n24 n242 = this.g;
            ByteBuffer byteBuffer4 = n242.X;
            byteBuffer4.getClass();
            int limit = byteBuffer.limit();
            byteBuffer.limit(Math.min(limit, byteBuffer4.capacity() + byteBuffer.position()));
            byteBuffer4.put(byteBuffer);
            long j7 = this.m;
            h50 h502 = this.f;
            n242.Z = ((j7 / ((long) h502.d)) * 1000000) / ((long) h502.a);
            this.m = j7 + ((long) byteBuffer4.position());
            n242.b = 0;
            n242.y();
            byteBuffer.limit(limit);
            this.e.g(n242);
            return true;
        }
    }

    public final void o() {
        w30 w30;
        ArrayList arrayList;
        int i2 = 0;
        while (true) {
            w30 = this.i;
            arrayList = (ArrayList) w30.d;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((v30) arrayList.get(i2)).a.h.j();
            i2++;
        }
        arrayList.clear();
        i44 i44 = (i44) w30.e;
        i44.c.clear();
        i44.d = 0;
        h50 h50 = h50.e;
        i44.e = h50;
        i44.f = -1;
        i44.g = new ir1[0];
        i44.h = -9223372036854775807L;
        i44.i = -1;
        long j2 = 0;
        i44.j = 0;
        i44.k = Long.MAX_VALUE;
        if (i44.a) {
            j2 = Long.MAX_VALUE;
        }
        i44.l = j2;
        ((f50) w30.f).j();
        w30.c = 0;
        w30.h = k50.a;
        w30.g = h50;
        this.e.h();
    }

    public final void p() {
        this.e.i();
    }
}
