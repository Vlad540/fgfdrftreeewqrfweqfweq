package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: pjc  reason: default package */
public final class pjc {
    public final /* synthetic */ int a = 2;
    public int b;
    public long c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public /* synthetic */ pjc() {
    }

    public static tx e(tx txVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= txVar.c) {
            txVar = (tx) txVar.X;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (txVar.c - j));
            wc wcVar = (wc) txVar.o;
            byteBuffer.put(wcVar.a, ((int) (j - txVar.b)) + wcVar.b, min);
            i -= min;
            j += (long) min;
            if (j == txVar.c) {
                txVar = (tx) txVar.X;
            }
        }
        return txVar;
    }

    public static tx f(tx txVar, long j, byte[] bArr, int i) {
        while (j >= txVar.c) {
            txVar = (tx) txVar.X;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (txVar.c - j));
            wc wcVar = (wc) txVar.o;
            System.arraycopy(wcVar.a, ((int) (j - txVar.b)) + wcVar.b, bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == txVar.c) {
                txVar = (tx) txVar.X;
            }
        }
        return txVar;
    }

    public static tx g(tx txVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= txVar.c) {
            txVar = (tx) txVar.X;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (txVar.c - j));
            xc xcVar = (xc) txVar.o;
            byteBuffer.put(xcVar.a, ((int) (j - txVar.b)) + xcVar.b, min);
            i -= min;
            j += (long) min;
            if (j == txVar.c) {
                txVar = (tx) txVar.X;
            }
        }
        return txVar;
    }

    public static tx h(tx txVar, long j, byte[] bArr, int i) {
        while (j >= txVar.c) {
            txVar = (tx) txVar.X;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (txVar.c - j));
            xc xcVar = (xc) txVar.o;
            System.arraycopy(xcVar.a, ((int) (j - txVar.b)) + xcVar.b, bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == txVar.c) {
                txVar = (tx) txVar.X;
            }
        }
        return txVar;
    }

    public static tx i(tx txVar, m24 m24, tu1 tu1, yze yze) {
        int i;
        if (m24.f(1073741824)) {
            long j = tu1.b;
            yze.E(1);
            tx f2 = f(txVar, j, yze.a, 1);
            long j2 = j + 1;
            byte b2 = yze.a[0];
            boolean z = (b2 & 128) != 0;
            byte b3 = b2 & Byte.MAX_VALUE;
            nw3 nw3 = m24.c;
            byte[] bArr = (byte[]) nw3.a;
            if (bArr == null) {
                nw3.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            txVar = f(f2, j2, (byte[]) nw3.a, b3);
            long j3 = j2 + ((long) b3);
            if (z) {
                yze.E(2);
                txVar = f(txVar, j3, yze.a, 2);
                j3 += 2;
                i = yze.A();
            } else {
                i = 1;
            }
            int[] iArr = (int[]) nw3.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = (int[]) nw3.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i2 = i * 6;
                yze.E(i2);
                txVar = f(txVar, j3, yze.a, i2);
                j3 += (long) i2;
                yze.H(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = yze.A();
                    iArr2[i3] = yze.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = tu1.a - ((int) (j3 - tu1.b));
            }
            yoe yoe = (yoe) tu1.c;
            int i4 = mze.a;
            byte[] bArr2 = yoe.b;
            byte[] bArr3 = (byte[]) nw3.a;
            nw3.f = i;
            nw3.d = iArr;
            nw3.e = iArr2;
            nw3.b = bArr2;
            nw3.a = bArr3;
            int i5 = yoe.a;
            nw3.c = i5;
            int i6 = yoe.c;
            nw3.g = i6;
            int i7 = yoe.d;
            nw3.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) nw3.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (mze.a >= 24) {
                otf otf = (otf) nw3.j;
                otf.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) otf.b;
                pattern.set(i6, i7);
                ((MediaCodec.CryptoInfo) otf.a).setPattern(pattern);
            }
            long j4 = tu1.b;
            int i8 = (int) (j3 - j4);
            tu1.b = j4 + ((long) i8);
            tu1.a -= i8;
        }
        if (m24.f(268435456)) {
            yze.E(4);
            tx f3 = f(txVar, tu1.b, yze.a, 4);
            int y = yze.y();
            tu1.b += 4;
            tu1.a -= 4;
            m24.x(y);
            tx e2 = e(f3, tu1.b, m24.o, y);
            tu1.b += (long) y;
            int i9 = tu1.a - y;
            tu1.a = i9;
            ByteBuffer byteBuffer = m24.Z;
            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                m24.Z = ByteBuffer.allocate(i9);
            } else {
                m24.Z.clear();
            }
            return e(e2, tu1.b, m24.Z, tu1.a);
        }
        m24.x(tu1.a);
        return e(txVar, tu1.b, m24.o, tu1.a);
    }

    public static tx j(tx txVar, n24 n24, tu1 tu1, ija ija) {
        int i;
        if (n24.f(1073741824)) {
            long j = tu1.b;
            ija.D(1);
            tx h2 = h(txVar, j, ija.a, 1);
            long j2 = j + 1;
            byte b2 = ija.a[0];
            boolean z = (b2 & 128) != 0;
            byte b3 = b2 & Byte.MAX_VALUE;
            nw3 nw3 = n24.o;
            byte[] bArr = (byte[]) nw3.a;
            if (bArr == null) {
                nw3.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            txVar = h(h2, j2, (byte[]) nw3.a, b3);
            long j3 = j2 + ((long) b3);
            if (z) {
                ija.D(2);
                txVar = h(txVar, j3, ija.a, 2);
                j3 += 2;
                i = ija.A();
            } else {
                i = 1;
            }
            int[] iArr = (int[]) nw3.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = (int[]) nw3.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i2 = i * 6;
                ija.D(i2);
                txVar = h(txVar, j3, ija.a, i2);
                j3 += (long) i2;
                ija.G(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = ija.A();
                    iArr2[i3] = ija.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = tu1.a - ((int) (j3 - tu1.b));
            }
            zoe zoe = (zoe) tu1.c;
            int i4 = oze.a;
            byte[] bArr2 = zoe.b;
            byte[] bArr3 = (byte[]) nw3.a;
            nw3.f = i;
            nw3.d = iArr;
            nw3.e = iArr2;
            nw3.b = bArr2;
            nw3.a = bArr3;
            int i5 = zoe.a;
            nw3.c = i5;
            int i6 = zoe.c;
            nw3.g = i6;
            int i7 = zoe.d;
            nw3.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) nw3.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (oze.a >= 24) {
                qe4 qe4 = (qe4) nw3.j;
                qe4.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) qe4.c;
                pattern.set(i6, i7);
                ((MediaCodec.CryptoInfo) qe4.b).setPattern(pattern);
            }
            long j4 = tu1.b;
            int i8 = (int) (j3 - j4);
            tu1.b = j4 + ((long) i8);
            tu1.a -= i8;
        }
        if (n24.f(268435456)) {
            ija.D(4);
            tx h3 = h(txVar, tu1.b, ija.a, 4);
            int y = ija.y();
            tu1.b += 4;
            tu1.a -= 4;
            n24.x(y);
            tx g2 = g(h3, tu1.b, n24.X, y);
            tu1.b += (long) y;
            int i9 = tu1.a - y;
            tu1.a = i9;
            ByteBuffer byteBuffer = n24.w0;
            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                n24.w0 = ByteBuffer.allocate(i9);
            } else {
                n24.w0.clear();
            }
            return g(g2, tu1.b, n24.w0, tu1.a);
        }
        n24.x(tu1.a);
        return g(txVar, tu1.b, n24.X, tu1.a);
    }

    public void a(tx txVar) {
        if (((wc) txVar.o) != null) {
            l34 l34 = (l34) this.d;
            synchronized (l34) {
                tx txVar2 = txVar;
                while (txVar2 != null) {
                    try {
                        int i = l34.f;
                        l34.f = i + 1;
                        wc wcVar = (wc) txVar2.o;
                        wcVar.getClass();
                        ((wc[]) l34.g)[i] = wcVar;
                        l34.e--;
                        txVar2 = (tx) txVar2.X;
                        if (txVar2 == null || ((wc) txVar2.o) == null) {
                            txVar2 = null;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                l34.notifyAll();
            }
            txVar.o = null;
            txVar.X = null;
        }
    }

    public void b(tx txVar) {
        if (((xc) txVar.o) != null) {
            l34 l34 = (l34) this.d;
            synchronized (l34) {
                tx txVar2 = txVar;
                while (txVar2 != null) {
                    try {
                        int i = l34.f;
                        l34.f = i + 1;
                        xc xcVar = (xc) txVar2.o;
                        xcVar.getClass();
                        ((xc[]) l34.g)[i] = xcVar;
                        l34.e--;
                        txVar2 = (tx) txVar2.X;
                        if (txVar2 == null || ((xc) txVar2.o) == null) {
                            txVar2 = null;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                l34.notifyAll();
            }
            txVar.o = null;
            txVar.X = null;
        }
    }

    public void c(long j) {
        switch (this.a) {
            case 0:
                if (j != -1) {
                    while (true) {
                        tx txVar = (tx) this.f;
                        if (j >= txVar.c) {
                            l34 l34 = (l34) this.d;
                            wc wcVar = (wc) txVar.o;
                            synchronized (l34) {
                                int i = l34.f;
                                l34.f = i + 1;
                                ((wc[]) l34.g)[i] = wcVar;
                                l34.e--;
                                l34.notifyAll();
                            }
                            tx txVar2 = (tx) this.f;
                            txVar2.o = null;
                            txVar2.X = null;
                            this.f = (tx) txVar2.X;
                        } else if (((tx) this.g).b < txVar.b) {
                            this.g = txVar;
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                if (j != -1) {
                    while (true) {
                        tx txVar3 = (tx) this.f;
                        if (j >= txVar3.c) {
                            l34 l342 = (l34) this.d;
                            xc xcVar = (xc) txVar3.o;
                            synchronized (l342) {
                                int i2 = l342.f;
                                l342.f = i2 + 1;
                                ((xc[]) l342.g)[i2] = xcVar;
                                l342.e--;
                                l342.notifyAll();
                            }
                            tx txVar4 = (tx) this.f;
                            txVar4.o = null;
                            txVar4.X = null;
                            this.f = (tx) txVar4.X;
                        } else if (((tx) this.g).b < txVar3.b) {
                            this.g = txVar3;
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }

    public int d(int i) {
        wc wcVar;
        xc xcVar;
        switch (this.a) {
            case 0:
                tx txVar = (tx) this.h;
                if (((wc) txVar.o) == null) {
                    l34 l34 = (l34) this.d;
                    synchronized (l34) {
                        try {
                            int i2 = l34.e + 1;
                            l34.e = i2;
                            int i3 = l34.f;
                            if (i3 > 0) {
                                int i4 = i3 - 1;
                                l34.f = i4;
                                wcVar = ((wc[]) l34.g)[i4];
                                wcVar.getClass();
                                ((wc[]) l34.g)[l34.f] = null;
                            } else {
                                wc wcVar2 = new wc(0, new byte[l34.c]);
                                wc[] wcVarArr = (wc[]) l34.g;
                                if (i2 > wcVarArr.length) {
                                    l34.g = (wc[]) Arrays.copyOf(wcVarArr, wcVarArr.length * 2);
                                }
                                wcVar = wcVar2;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    tx txVar2 = new tx(this.b, 4, ((tx) this.h).c);
                    txVar.o = wcVar;
                    txVar.X = txVar2;
                }
                return Math.min(i, (int) (((tx) this.h).c - this.c));
            default:
                tx txVar3 = (tx) this.h;
                if (((xc) txVar3.o) == null) {
                    l34 l342 = (l34) this.d;
                    synchronized (l342) {
                        try {
                            int i5 = l342.e + 1;
                            l342.e = i5;
                            int i6 = l342.f;
                            if (i6 > 0) {
                                int i7 = i6 - 1;
                                l342.f = i7;
                                xcVar = ((xc[]) l342.g)[i7];
                                xcVar.getClass();
                                ((xc[]) l342.g)[l342.f] = null;
                            } else {
                                xc xcVar2 = new xc(0, new byte[l342.c]);
                                xc[] xcVarArr = (xc[]) l342.g;
                                if (i5 > xcVarArr.length) {
                                    l342.g = (xc[]) Arrays.copyOf(xcVarArr, xcVarArr.length * 2);
                                }
                                xcVar = xcVar2;
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                                break;
                            }
                        }
                    }
                    tx txVar4 = new tx(this.b, 5, ((tx) this.h).c);
                    txVar3.o = xcVar;
                    txVar3.X = txVar4;
                }
                return Math.min(i, (int) (((tx) this.h).c - this.c));
        }
    }

    public pjc(l34 l34) {
        this.d = l34;
        int i = l34.c;
        this.b = i;
        this.e = new yze(32);
        tx txVar = new tx(i, 4, 0);
        this.f = txVar;
        this.g = txVar;
        this.h = txVar;
    }

    public pjc(l34 l34, byte b2) {
        this.d = l34;
        int i = l34.c;
        this.b = i;
        this.e = new ija(32);
        tx txVar = new tx(i, 5, 0);
        this.f = txVar;
        this.g = txVar;
        this.h = txVar;
    }
}
