package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: jl6  reason: default package */
public final class jl6 implements Closeable {
    public static final Logger X = Logger.getLogger(vk6.class.getName());
    public final il6 a;
    public final mk6 b;
    public final at0 c;
    public final boolean o;

    public jl6(at0 at0, boolean z) {
        this.c = at0;
        this.o = z;
        il6 il6 = new il6(at0);
        this.a = il6;
        this.b = new mk6(il6);
    }

    public final boolean a(boolean z, na1 na1) {
        int i;
        int readInt;
        int i2;
        nl6[] nl6Arr;
        na1 na12 = na1;
        int i3 = 0;
        try {
            this.c.h0(9);
            int s = nze.s(this.c);
            if (s <= 16384) {
                byte readByte = this.c.readByte() & 255;
                byte readByte2 = this.c.readByte();
                byte b2 = readByte2 & 255;
                int readInt2 = this.c.readInt();
                int i4 = Integer.MAX_VALUE & readInt2;
                Logger logger = X;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(vk6.a(true, i4, s, readByte, b2));
                }
                if (!z || readByte == 4) {
                    switch (readByte) {
                        case 0:
                            g(na12, s, b2, i4);
                            return true;
                        case 1:
                            n(na12, s, b2, i4);
                            return true;
                        case 2:
                            if (s != 5) {
                                throw new IOException(rf0.f(s, "TYPE_PRIORITY length: ", " != 5"));
                            } else if (i4 != 0) {
                                at0 at0 = this.c;
                                at0.readInt();
                                at0.readByte();
                                na1.getClass();
                                return true;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        case 3:
                            if (s != 4) {
                                throw new IOException(rf0.f(s, "TYPE_RST_STREAM length: ", " != 4"));
                            } else if (i4 != 0) {
                                int readInt3 = this.c.readInt();
                                int[] w = hr1.w(14);
                                int length = w.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                        int i6 = w[i5];
                                        if (hr1.t(i6) == readInt3) {
                                            i = i6;
                                        } else {
                                            i5++;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    gl6 gl6 = (gl6) na12.c;
                                    gl6.getClass();
                                    if (i4 != 0 && (readInt2 & 1) == 0) {
                                        i3 = 1;
                                    }
                                    if (i3 != 0) {
                                        gl6.y0.c(new dl6(gl6.o + '[' + i4 + "] onReset", gl6, i4, i), 0);
                                        return true;
                                    }
                                    nl6 m = gl6.m(i4);
                                    if (m == null) {
                                        return true;
                                    }
                                    synchronized (m) {
                                        if (m.k == 0) {
                                            m.k = i;
                                            m.notifyAll();
                                        }
                                    }
                                    return true;
                                }
                                throw new IOException(wn6.h(readInt3, "TYPE_RST_STREAM unexpected error code: "));
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                        case 4:
                            if (i4 != 0) {
                                throw new IOException("TYPE_SETTINGS streamId != 0");
                            } else if ((readByte2 & 1) != 0) {
                                if (s == 0) {
                                    return true;
                                }
                                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                            } else if (s % 6 == 0) {
                                y5d y5d = new y5d();
                                dz6 Q = gwf.Q(gwf.S(0, s), 6);
                                int i7 = Q.a;
                                int i8 = Q.b;
                                int i9 = Q.c;
                                if (i9 < 0 ? i7 >= i8 : i7 <= i8) {
                                    while (true) {
                                        at0 at02 = this.c;
                                        short readShort = at02.readShort();
                                        byte[] bArr = nze.a;
                                        short s2 = readShort & 65535;
                                        readInt = at02.readInt();
                                        if (s2 != 2) {
                                            if (s2 == 3) {
                                                s2 = 4;
                                            } else if (s2 != 4) {
                                                if (s2 == 5) {
                                                    if (readInt < 16384 || readInt > 16777215) {
                                                    }
                                                }
                                            } else if (readInt >= 0) {
                                                s2 = 7;
                                            } else {
                                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                            }
                                        } else if (!(readInt == 0 || readInt == 1)) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        y5d.b(s2, readInt);
                                        if (i7 != i8) {
                                            i7 += i9;
                                        }
                                    }
                                    throw new IOException(wn6.h(readInt, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                }
                                gl6 gl62 = (gl6) na12.c;
                                gl62.x0.c(new bl6(wn6.l(new StringBuilder(), gl62.o, " applyAndAckSettings"), na12, y5d), 0);
                                return true;
                            } else {
                                throw new IOException(wn6.h(s, "TYPE_SETTINGS length % 6 != 0: "));
                            }
                        case 5:
                            o(na12, s, b2, i4);
                            return true;
                        case 6:
                            if (s != 8) {
                                throw new IOException(wn6.h(s, "TYPE_PING length != 8: "));
                            } else if (i4 == 0) {
                                int readInt4 = this.c.readInt();
                                int readInt5 = this.c.readInt();
                                if ((readByte2 & 1) != 0) {
                                    synchronized (((gl6) na12.c)) {
                                        if (readInt4 == 1) {
                                            ((gl6) na12.c).C0++;
                                        } else if (readInt4 == 2) {
                                            ((gl6) na12.c).E0++;
                                        } else if (readInt4 == 3) {
                                            try {
                                                gl6 gl63 = (gl6) na12.c;
                                                gl63.getClass();
                                                gl63.notifyAll();
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    return true;
                                }
                                ((gl6) na12.c).x0.c(new al6(wn6.l(new StringBuilder(), ((gl6) na12.c).o, " ping"), na1, readInt4, readInt5, 0), 0);
                                return true;
                            } else {
                                throw new IOException("TYPE_PING streamId != 0");
                            }
                        case 7:
                            if (s < 8) {
                                throw new IOException(wn6.h(s, "TYPE_GOAWAY length < 8: "));
                            } else if (i4 == 0) {
                                int readInt6 = this.c.readInt();
                                int readInt7 = this.c.readInt();
                                int i10 = s - 8;
                                int[] w2 = hr1.w(14);
                                int length2 = w2.length;
                                int i11 = 0;
                                while (true) {
                                    if (i11 < length2) {
                                        i2 = w2[i11];
                                        if (hr1.t(i2) != readInt7) {
                                            i11++;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                }
                                if (i2 != 0) {
                                    uu0 uu0 = uu0.o;
                                    if (i10 > 0) {
                                        uu0 = this.c.e((long) i10);
                                    }
                                    uu0.c();
                                    synchronized (((gl6) na12.c)) {
                                        Object[] array = ((gl6) na12.c).c.values().toArray(new nl6[0]);
                                        if (array != null) {
                                            nl6Arr = (nl6[]) array;
                                            ((gl6) na12.c).Z = true;
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                        }
                                    }
                                    int length3 = nl6Arr.length;
                                    while (i3 < length3) {
                                        nl6 nl6 = nl6Arr[i3];
                                        if (nl6.m > readInt6 && nl6.h()) {
                                            synchronized (nl6) {
                                                if (nl6.k == 0) {
                                                    nl6.k = 8;
                                                    nl6.notifyAll();
                                                }
                                            }
                                            ((gl6) na12.c).m(nl6.m);
                                        }
                                        i3++;
                                    }
                                    return true;
                                }
                                throw new IOException(wn6.h(readInt7, "TYPE_GOAWAY unexpected error code: "));
                            } else {
                                throw new IOException("TYPE_GOAWAY streamId != 0");
                            }
                        case 8:
                            if (s == 4) {
                                long readInt8 = ((long) this.c.readInt()) & 2147483647L;
                                int i12 = (readInt8 > 0 ? 1 : (readInt8 == 0 ? 0 : -1));
                                if (i12 == 0) {
                                    throw new IOException("windowSizeIncrement was 0");
                                } else if (i4 == 0) {
                                    synchronized (((gl6) na12.c)) {
                                        gl6 gl64 = (gl6) na12.c;
                                        gl64.L0 += readInt8;
                                        gl64.notifyAll();
                                    }
                                    return true;
                                } else {
                                    nl6 g = ((gl6) na12.c).g(i4);
                                    if (g == null) {
                                        return true;
                                    }
                                    synchronized (g) {
                                        g.d += readInt8;
                                        if (i12 > 0) {
                                            g.notifyAll();
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                throw new IOException(wn6.h(s, "TYPE_WINDOW_UPDATE length !=4: "));
                            }
                        default:
                            this.c.R((long) s);
                            return true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                    String[] strArr = vk6.b;
                    sb.append(readByte < strArr.length ? strArr[readByte] : nze.h("0x%02x", Integer.valueOf(readByte)));
                    throw new IOException(sb.toString());
                }
            } else {
                throw new IOException(wn6.h(s, "FRAME_SIZE_ERROR: "));
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void close() {
        this.c.close();
    }

    public final void d(na1 na1) {
        if (!this.o) {
            uu0 uu0 = vk6.a;
            uu0 e = this.c.e((long) uu0.c.length);
            Level level = Level.FINE;
            Logger logger = X;
            if (logger.isLoggable(level)) {
                logger.fine(nze.h("<< CONNECTION " + e.d(), new Object[0]));
            }
            if (!uu0.equals(e)) {
                throw new IOException("Expected a connection header but was ".concat(e.j()));
            }
        } else if (!a(true, na1)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [wr0, java.lang.Object] */
    public final void g(na1 na1, int i, int i2, int i3) {
        byte b2;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        na1 na12 = na1;
        int i5 = i2;
        int i6 = i3;
        if (i6 != 0) {
            boolean z4 = (i5 & 1) != 0;
            if ((i5 & 32) == 0) {
                if ((i5 & 8) != 0) {
                    byte readByte = this.c.readByte();
                    byte[] bArr = nze.a;
                    b2 = readByte & 255;
                    i4 = i;
                } else {
                    i4 = i;
                    b2 = 0;
                }
                int v = wx3.v(i4, i5, b2);
                at0 at0 = this.c;
                ((gl6) na12.c).getClass();
                if (i6 != 0 && (i6 & 1) == 0) {
                    gl6 gl6 = (gl6) na12.c;
                    gl6.getClass();
                    ? obj = new Object();
                    long j2 = (long) v;
                    at0.h0(j2);
                    at0.c(obj, j2);
                    gl6.y0.c(new cl6(gl6.o + '[' + i6 + "] onData", gl6, i3, obj, v, z4), 0);
                } else {
                    nl6 g = ((gl6) na12.c).g(i6);
                    if (g == null) {
                        ((gl6) na12.c).U(i6, 2);
                        long j3 = (long) v;
                        ((gl6) na12.c).o(j3);
                        at0.R(j3);
                    } else {
                        byte[] bArr2 = nze.a;
                        ll6 ll6 = g.g;
                        long j4 = (long) v;
                        ll6.getClass();
                        while (true) {
                            if (j4 <= 0) {
                                z = z4;
                                break;
                            }
                            synchronized (ll6.Y) {
                                z2 = ll6.X;
                                z = z4;
                                z3 = ll6.b.b + j4 > ll6.o;
                            }
                            if (z3) {
                                at0.R(j4);
                                ll6.Y.e(4);
                                break;
                            } else if (z2) {
                                at0.R(j4);
                                break;
                            } else {
                                long c2 = at0.c(ll6.a, j4);
                                if (c2 != -1) {
                                    j4 -= c2;
                                    synchronized (ll6.Y) {
                                        try {
                                            if (ll6.c) {
                                                wr0 wr0 = ll6.a;
                                                j = wr0.b;
                                                wr0.m();
                                            } else {
                                                wr0 wr02 = ll6.b;
                                                boolean z5 = wr02.b == 0;
                                                wr02.t0(ll6.a);
                                                if (z5) {
                                                    nl6 nl6 = ll6.Y;
                                                    if (nl6 != null) {
                                                        nl6.notifyAll();
                                                    } else {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                                    }
                                                }
                                                j = 0;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    if (j > 0) {
                                        ll6.a(j);
                                    }
                                    z4 = z;
                                } else {
                                    throw new EOFException();
                                }
                            }
                        }
                        if (z) {
                            g.j(nze.b, true);
                        }
                    }
                }
                this.c.R((long) b2);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        throw new java.io.IOException(wn6.h(r7, "Header index too large "));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List m(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 32
            r1 = 64
            r2 = 128(0x80, float:1.794E-43)
            il6 r3 = r5.a
            r3.o = r6
            r3.a = r6
            r3.X = r7
            r3.b = r8
            r3.c = r9
        L_0x0012:
            mk6 r6 = r5.b
            v0c r7 = r6.b
            boolean r8 = r7.B()
            java.util.ArrayList r9 = r6.a
            if (r8 != 0) goto L_0x0122
            byte r7 = r7.readByte()
            byte[] r8 = defpackage.nze.a
            r8 = r7 & 255(0xff, float:3.57E-43)
            if (r8 == r2) goto L_0x011a
            r3 = r7 & 128(0x80, float:1.794E-43)
            if (r3 != r2) goto L_0x0065
            r7 = 127(0x7f, float:1.78E-43)
            int r7 = r6.e(r8, r7)
            int r8 = r7 + -1
            if (r8 < 0) goto L_0x0043
            re6[] r3 = defpackage.ok6.a
            int r4 = r3.length
            int r4 = r4 + -1
            if (r8 > r4) goto L_0x0043
            r6 = r3[r8]
            r9.add(r6)
            goto L_0x0012
        L_0x0043:
            re6[] r3 = defpackage.ok6.a
            int r3 = r3.length
            int r8 = r8 - r3
            int r3 = r6.d
            int r3 = r3 + 1
            int r3 = r3 + r8
            if (r3 < 0) goto L_0x0059
            re6[] r6 = r6.c
            int r8 = r6.length
            if (r3 >= r8) goto L_0x0059
            r6 = r6[r3]
            r9.add(r6)
            goto L_0x0012
        L_0x0059:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Header index too large "
            java.lang.String r6 = wn6.h(r7, r6)
            r5.<init>(r6)
            throw r5
        L_0x0065:
            if (r8 != r1) goto L_0x007d
            re6[] r7 = defpackage.ok6.a
            uu0 r7 = r6.d()
            defpackage.ok6.a(r7)
            uu0 r8 = r6.d()
            re6 r9 = new re6
            r9.<init>((defpackage.uu0) r7, (defpackage.uu0) r8)
            r6.c(r9)
            goto L_0x0012
        L_0x007d:
            r3 = r7 & 64
            if (r3 != r1) goto L_0x009b
            r7 = 63
            int r7 = r6.e(r8, r7)
            int r7 = r7 + -1
            uu0 r7 = r6.b(r7)
            uu0 r8 = r6.d()
            re6 r9 = new re6
            r9.<init>((defpackage.uu0) r7, (defpackage.uu0) r8)
            r6.c(r9)
            goto L_0x0012
        L_0x009b:
            r7 = r7 & r0
            if (r7 != r0) goto L_0x00e2
            r7 = 31
            int r7 = r6.e(r8, r7)
            r6.g = r7
            if (r7 < 0) goto L_0x00cc
            r8 = 4096(0x1000, float:5.74E-42)
            if (r7 > r8) goto L_0x00cc
            int r8 = r6.f
            if (r7 >= r8) goto L_0x0012
            if (r7 != 0) goto L_0x00c6
            re6[] r7 = r6.c
            r8 = 0
            defpackage.cs.W(r7, r8)
            re6[] r7 = r6.c
            int r7 = r7.length
            int r7 = r7 + -1
            r6.d = r7
            r7 = 0
            r6.e = r7
            r6.f = r7
            goto L_0x0012
        L_0x00c6:
            int r8 = r8 - r7
            r6.a(r8)
            goto L_0x0012
        L_0x00cc:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid dynamic table size update "
            r7.<init>(r8)
            int r6 = r6.g
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L_0x00e2:
            r7 = 16
            if (r8 == r7) goto L_0x0103
            if (r8 != 0) goto L_0x00e9
            goto L_0x0103
        L_0x00e9:
            r7 = 15
            int r7 = r6.e(r8, r7)
            int r7 = r7 + -1
            uu0 r7 = r6.b(r7)
            uu0 r6 = r6.d()
            re6 r8 = new re6
            r8.<init>((defpackage.uu0) r7, (defpackage.uu0) r6)
            r9.add(r8)
            goto L_0x0012
        L_0x0103:
            re6[] r7 = defpackage.ok6.a
            uu0 r7 = r6.d()
            defpackage.ok6.a(r7)
            uu0 r6 = r6.d()
            re6 r8 = new re6
            r8.<init>((defpackage.uu0) r7, (defpackage.uu0) r6)
            r9.add(r8)
            goto L_0x0012
        L_0x011a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "index == 0"
            r5.<init>(r6)
            throw r5
        L_0x0122:
            java.util.List r5 = defpackage.o23.s0(r9)
            r9.clear()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl6.m(int, int, int, int):java.util.List");
    }

    public final void n(na1 na1, int i, int i2, int i3) {
        byte b2;
        boolean z = true;
        if (i3 != 0) {
            boolean z2 = (i2 & 1) != 0;
            if ((i2 & 8) != 0) {
                byte readByte = this.c.readByte();
                byte[] bArr = nze.a;
                b2 = readByte & 255;
            } else {
                b2 = 0;
            }
            if ((i2 & 32) != 0) {
                at0 at0 = this.c;
                at0.readInt();
                at0.readByte();
                byte[] bArr2 = nze.a;
                na1.getClass();
                i -= 5;
            }
            List m = m(wx3.v(i, i2, b2), b2, i2, i3);
            ((gl6) na1.c).getClass();
            if (i3 == 0 || (i3 & 1) != 0) {
                z = false;
            }
            if (z) {
                gl6 gl6 = (gl6) na1.c;
                gl6.y0.c(new dl6(gl6.o + '[' + i3 + "] onHeaders", gl6, i3, m, z2), 0);
                return;
            }
            synchronized (((gl6) na1.c)) {
                nl6 g = ((gl6) na1.c).g(i3);
                if (g == null) {
                    gl6 gl62 = (gl6) na1.c;
                    if (!gl62.Z) {
                        if (i3 > gl62.X) {
                            if (i3 % 2 != gl62.Y % 2) {
                                nl6 nl6 = new nl6(i3, (gl6) na1.c, false, z2, nze.u(m));
                                gl6 gl63 = (gl6) na1.c;
                                gl63.X = i3;
                                gl63.c.put(Integer.valueOf(i3), nl6);
                                ((gl6) na1.c).w0.f().c(new zk6(((gl6) na1.c).o + '[' + i3 + "] onStream", nl6, na1), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                g.j(nze.u(m), z2);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void o(na1 na1, int i, int i2, int i3) {
        byte b2;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                byte readByte = this.c.readByte();
                byte[] bArr = nze.a;
                b2 = readByte & 255;
            } else {
                b2 = 0;
            }
            int readInt = this.c.readInt() & Integer.MAX_VALUE;
            List m = m(wx3.v(i - 4, i2, b2), b2, i2, i3);
            gl6 gl6 = (gl6) na1.c;
            synchronized (gl6) {
                if (gl6.P0.contains(Integer.valueOf(readInt))) {
                    gl6.U(readInt, 2);
                    return;
                }
                gl6.P0.add(Integer.valueOf(readInt));
                hee hee = gl6.y0;
                hee.c(new dl6(gl6.o + '[' + readInt + "] onRequest", gl6, readInt, m), 0);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
