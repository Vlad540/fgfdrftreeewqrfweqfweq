package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: dd6  reason: default package */
public final class dd6 implements tld {
    public final CRC32 X = new CRC32();
    public byte a;
    public final v0c b;
    public final Inflater c;
    public final yv6 o;

    public dd6(tld tld) {
        v0c v0c = new v0c(tld);
        this.b = v0c;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.o = new yv6(v0c, inflater);
    }

    public static void a(int i, int i2, String str) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final long c(wr0 wr0, long j) {
        v0c v0c;
        wr0 wr02;
        long j2;
        wr0 wr03 = wr0;
        long j3 = j;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(us8.i(j3, "byteCount < 0: ").toString());
        } else if (i == 0) {
            return 0;
        } else {
            byte b2 = this.a;
            CRC32 crc32 = this.X;
            v0c v0c2 = this.b;
            if (b2 == 0) {
                v0c2.h0(10);
                wr0 wr04 = v0c2.a;
                byte S = wr04.S(3);
                boolean z = ((S >> 1) & 1) == 1;
                if (z) {
                    d(v0c2.a, 0, 10);
                }
                a(8075, v0c2.readShort(), "ID1ID2");
                v0c2.R(8);
                if (((S >> 2) & 1) == 1) {
                    v0c2.h0(2);
                    if (z) {
                        d(v0c2.a, 0, 2);
                    }
                    short readShort = wr04.readShort();
                    long j4 = (long) ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8)));
                    v0c2.h0(j4);
                    if (z) {
                        d(v0c2.a, 0, j4);
                        j2 = j4;
                    } else {
                        j2 = j4;
                    }
                    v0c2.R(j2);
                }
                if (((S >> 3) & 1) == 1) {
                    wr02 = wr04;
                    v0c v0c3 = v0c2;
                    long a2 = v0c2.a((byte) 0, 0, Long.MAX_VALUE);
                    if (a2 != -1) {
                        if (z) {
                            v0c = v0c3;
                            d(v0c3.a, 0, a2 + 1);
                        } else {
                            v0c = v0c3;
                        }
                        v0c.R(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    wr02 = wr04;
                    v0c = v0c2;
                }
                if (((S >> 4) & 1) == 1) {
                    long a3 = v0c.a((byte) 0, 0, Long.MAX_VALUE);
                    if (a3 != -1) {
                        if (z) {
                            d(v0c.a, 0, a3 + 1);
                        }
                        v0c.R(a3 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    v0c.h0(2);
                    short readShort2 = wr02.readShort();
                    a((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) ((int) crc32.getValue()), "FHCRC");
                    crc32.reset();
                }
                this.a = 1;
            } else {
                v0c = v0c2;
            }
            if (this.a == 1) {
                long j5 = wr03.b;
                long c2 = this.o.c(wr03, j3);
                if (c2 != -1) {
                    d(wr0, j5, c2);
                    return c2;
                }
                this.a = 2;
            }
            if (this.a != 2) {
                return -1;
            }
            a(v0c.m(), (int) crc32.getValue(), "CRC");
            a(v0c.m(), (int) this.c.getBytesWritten(), "ISIZE");
            this.a = 3;
            if (v0c.B()) {
                return -1;
            }
            throw new IOException("gzip finished without exhausting source");
        }
    }

    public final void close() {
        this.o.close();
    }

    public final void d(wr0 wr0, long j, long j2) {
        kuc kuc = wr0.a;
        while (true) {
            int i = kuc.c;
            int i2 = kuc.b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            kuc = kuc.f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) kuc.b) + j);
            int min = (int) Math.min((long) (kuc.c - i3), j2);
            this.X.update(kuc.a, i3, min);
            j2 -= (long) min;
            kuc = kuc.f;
            j = 0;
        }
    }

    public final xje p() {
        return this.b.c.p();
    }
}
