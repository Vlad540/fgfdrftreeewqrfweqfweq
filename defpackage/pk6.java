package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: pk6  reason: default package */
public final class pk6 extends InputStream {
    public static final /* synthetic */ int A0 = 0;
    public int X = 0;
    public int Y = 0;
    public byte[] Z = new byte[65536];
    public final DataInputStream a;
    public boolean b;
    public int c = 0;
    public int o = 4;
    public int w0 = 0;
    public int x0 = 0;
    public int y0;
    public final int z0;

    public pk6(DataInputStream dataInputStream) {
        this.a = dataInputStream;
        this.z0 = 2;
    }

    public final void S(int i) {
        int i2 = this.x0 + i;
        byte[] bArr = this.Z;
        if (i2 > bArr.length) {
            byte[] bArr2 = new byte[((int) (((double) bArr.length) * 1.5d))];
            byte[] bArr3 = this.Z;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            this.Z = bArr2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fd, code lost:
        o0(r13.y0 + 8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean U() {
        /*
            r13 = this;
            r0 = 0
            r13.w0 = r0
            r13.x0 = r0
            int r1 = r13.X
            r2 = -1
            java.io.DataInputStream r3 = r13.a
            r4 = 1
            if (r1 == 0) goto L_0x013a
            if (r1 < 0) goto L_0x0125
            int r1 = r13.m()
            r5 = 144(0x90, float:2.02E-43)
            if (r1 == r5) goto L_0x011a
            r5 = 195(0xc3, float:2.73E-43)
            if (r1 == r5) goto L_0x0112
            r5 = 254(0xfe, float:3.56E-43)
            r6 = 4
            if (r1 == r5) goto L_0x010b
            r5 = 255(0xff, float:3.57E-43)
            if (r1 == r5) goto L_0x011a
            r5 = 2
            r7 = 8
            switch(r1) {
                case 1: goto L_0x0104;
                case 2: goto L_0x00fd;
                case 3: goto L_0x00fd;
                case 4: goto L_0x010b;
                case 5: goto L_0x011a;
                case 6: goto L_0x010b;
                case 7: goto L_0x011a;
                case 8: goto L_0x00fd;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r1) {
                case 32: goto L_0x00c7;
                case 33: goto L_0x00b8;
                case 34: goto L_0x0047;
                case 35: goto L_0x0047;
                default: goto L_0x002d;
            }
        L_0x002d:
            switch(r1) {
                case 137: goto L_0x011a;
                case 138: goto L_0x011a;
                case 139: goto L_0x011a;
                case 140: goto L_0x011a;
                case 141: goto L_0x011a;
                case 142: goto L_0x00fd;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Type "
            java.lang.String r3 = " is not supported! "
            java.lang.StringBuilder r1 = defpackage.me4.m(r1, r2, r3)
            int r13 = r13.c
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L_0x0047:
            r13.n()
            int r8 = r13.y0
            if (r8 != r7) goto L_0x0051
            r13.n()
        L_0x0051:
            r13.n()
            int r8 = r13.n()
            r9 = 35
            if (r1 != r9) goto L_0x0062
            int r1 = r13.m()
            long r9 = (long) r1
            goto L_0x0074
        L_0x0062:
            int r1 = r13.n()
            long r9 = (long) r1
            int r1 = r13.y0
            if (r1 != r7) goto L_0x0074
            r1 = 32
            long r9 = r9 << r1
            int r1 = r13.n()
            long r11 = (long) r1
            long r9 = r9 | r11
        L_0x0074:
            int r1 = (int) r9
            switch(r1) {
                case 4: goto L_0x007e;
                case 5: goto L_0x007c;
                case 6: goto L_0x007f;
                case 7: goto L_0x007a;
                case 8: goto L_0x007e;
                case 9: goto L_0x007c;
                case 10: goto L_0x007f;
                case 11: goto L_0x007a;
                default: goto L_0x0078;
            }
        L_0x0078:
            r6 = r0
            goto L_0x007f
        L_0x007a:
            r6 = r7
            goto L_0x007f
        L_0x007c:
            r6 = r5
            goto L_0x007f
        L_0x007e:
            r6 = r4
        L_0x007f:
            if (r6 != 0) goto L_0x0083
            r1 = r4
            goto L_0x0084
        L_0x0083:
            r1 = r0
        L_0x0084:
            if (r1 == 0) goto L_0x0088
            int r6 = r13.y0
        L_0x0088:
            int r6 = r6 * r8
            if (r1 == 0) goto L_0x008d
        L_0x008b:
            r0 = r6
            goto L_0x00b1
        L_0x008d:
            int r1 = r13.z0
            if (r1 != r5) goto L_0x00ab
            boolean r1 = r13.b
            if (r1 != 0) goto L_0x00b1
            r1 = r6
        L_0x0096:
            if (r1 <= 0) goto L_0x00b1
            int r5 = r3.skipBytes(r1)
            if (r5 == r2) goto L_0x00a5
            int r7 = r13.c
            int r7 = r7 + r5
            r13.c = r7
            int r1 = r1 - r5
            goto L_0x0096
        L_0x00a5:
            java.io.EOFException r13 = new java.io.EOFException
            r13.<init>()
            throw r13
        L_0x00ab:
            boolean r1 = r13.b
            if (r1 == 0) goto L_0x008b
            r13.Y = r6
        L_0x00b1:
            int r1 = r13.X
            int r1 = r1 - r6
            r13.X = r1
            goto L_0x011f
        L_0x00b8:
            int r1 = r13.y0
            int r1 = r1 * r5
            int r1 = r1 + r6
            r13.o0(r1)
            int r1 = r13.n()
            r13.o0(r1)
            goto L_0x011f
        L_0x00c7:
            int r1 = r13.y0
            int r1 = r1 * 7
            int r1 = r1 + r7
            r13.o0(r1)
            int r1 = r13.o()
            r2 = r0
        L_0x00d4:
            if (r2 >= r1) goto L_0x00df
            r13.o0(r5)
            r13.z()
            int r2 = r2 + 1
            goto L_0x00d4
        L_0x00df:
            int r1 = r13.o()
            r2 = r0
        L_0x00e4:
            if (r2 >= r1) goto L_0x00f1
            int r3 = r13.y0
            r13.o0(r3)
            r13.z()
            int r2 = r2 + 1
            goto L_0x00e4
        L_0x00f1:
            int r1 = r13.o()
            int r2 = r13.y0
            int r2 = r2 + r4
            int r2 = r2 * r1
            r13.o0(r2)
            goto L_0x011f
        L_0x00fd:
            int r1 = r13.y0
            int r1 = r1 + r7
            r13.o0(r1)
            goto L_0x011f
        L_0x0104:
            int r1 = r13.y0
            int r1 = r1 * r5
            r13.o0(r1)
            goto L_0x011f
        L_0x010b:
            int r1 = r13.y0
            int r1 = r1 + r6
            r13.o0(r1)
            goto L_0x011f
        L_0x0112:
            int r1 = r13.y0
            int r1 = r1 + 9
            r13.o0(r1)
            goto L_0x011f
        L_0x011a:
            int r1 = r13.y0
            r13.o0(r1)
        L_0x011f:
            int r1 = r13.c
            int r1 = r1 + r0
            r13.o = r1
            return r4
        L_0x0125:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Heap parsing reached "
            r1.<init>(r2)
            int r13 = r13.X
            java.lang.String r2 = " heap length"
            java.lang.String r13 = defpackage.wn6.j(r1, r13, r2)
            r0.<init>(r13)
            throw r0
        L_0x013a:
            int r1 = r3.read()
            if (r1 != r2) goto L_0x0141
            goto L_0x0171
        L_0x0141:
            r13.S(r4)
            byte[] r0 = r13.Z
            int r2 = r13.x0
            int r3 = r2 + 1
            r13.x0 = r3
            byte r3 = (byte) r1
            r0[r2] = r3
            int r0 = r13.c
            int r0 = r0 + r4
            r13.c = r0
            r13.n0()
            int r0 = r13.n0()
            r2 = 12
            if (r1 == r2) goto L_0x016a
            r2 = 28
            if (r1 != r2) goto L_0x0164
            goto L_0x016a
        L_0x0164:
            int r1 = r13.c
            int r1 = r1 + r0
            r13.o = r1
            goto L_0x0170
        L_0x016a:
            int r1 = r13.c
            r13.o = r1
            r13.X = r0
        L_0x0170:
            r0 = r4
        L_0x0171:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk6.U():boolean");
    }

    public final void close() {
        this.a.close();
    }

    public final int e0(int i, byte[] bArr, int i2) {
        int min = Math.min(i2, this.x0 - this.w0);
        System.arraycopy(this.Z, this.w0, bArr, i, min);
        this.w0 += min;
        return min;
    }

    public final int m() {
        int read = this.a.read();
        S(1);
        byte[] bArr = this.Z;
        int i = this.x0;
        this.x0 = i + 1;
        bArr[i] = (byte) read;
        this.X--;
        this.c++;
        return read;
    }

    public final void m0() {
        byte readByte;
        DataInputStream dataInputStream = this.a;
        this.b = dataInputStream.readByte() == 67;
        if (this.z0 == 2) {
            byte[] bArr = this.Z;
            int i = this.x0;
            this.x0 = i + 1;
            bArr[i] = 67;
        } else {
            byte[] bArr2 = this.Z;
            int i2 = this.x0;
            this.x0 = i2 + 1;
            bArr2[i2] = 74;
        }
        do {
            readByte = dataInputStream.readByte();
            byte[] bArr3 = this.Z;
            int i3 = this.x0;
            this.x0 = i3 + 1;
            bArr3[i3] = readByte;
        } while (readByte != 0);
        this.y0 = n0();
        dataInputStream.readFully(this.Z, this.x0, 8);
        int i4 = this.x0 + 8;
        this.x0 = i4;
        this.c = i4;
        this.o = i4;
    }

    public final int n() {
        this.X -= 4;
        return n0();
    }

    public final int n0() {
        S(4);
        this.a.readFully(this.Z, this.x0, 4);
        byte[] bArr = this.Z;
        int i = this.x0;
        int i2 = i + 1;
        this.x0 = i2;
        int i3 = i + 2;
        this.x0 = i3;
        int i4 = i + 3;
        this.x0 = i4;
        this.x0 = i + 4;
        this.c += 4;
        return ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8) | (bArr[i4] & 255);
    }

    public final int o() {
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        S(2);
        byte[] bArr = this.Z;
        int i = this.x0;
        int i2 = i + 1;
        this.x0 = i2;
        bArr[i] = (byte) read;
        this.x0 = i + 2;
        bArr[i2] = (byte) read2;
        this.X -= 2;
        this.c += 2;
        return (read << 8) | read2;
    }

    public final void o0(int i) {
        S(i);
        this.a.readFully(this.Z, this.x0, i);
        this.x0 += i;
        this.c += i;
        this.X -= i;
    }

    public final int read() {
        int i = this.c;
        if (i == 0) {
            m0();
            byte[] bArr = this.Z;
            int i2 = this.w0;
            this.w0 = i2 + 1;
            return bArr[i2];
        }
        int i3 = this.x0;
        int i4 = this.w0;
        if (i3 > i4) {
            byte[] bArr2 = this.Z;
            this.w0 = i4 + 1;
            return bArr2[i4];
        }
        int i5 = this.Y;
        if (i5 > 0) {
            this.Y = i5 - 1;
            return -2;
        } else if (this.o > i) {
            int read = this.a.read();
            if (read != -1) {
                this.c++;
            }
            return read;
        } else if (!U()) {
            return -1;
        } else {
            byte[] bArr3 = this.Z;
            int i6 = this.w0;
            this.w0 = i6 + 1;
            return bArr3[i6];
        }
    }

    public final void z() {
        int m = m();
        int i = 2;
        if (m != 2) {
            if (m != 70) {
                if (m != 76) {
                    if (m != 83) {
                        if (m != 73) {
                            if (m != 74) {
                                if (m != 90) {
                                    if (m != 91) {
                                        switch (m) {
                                            case 4:
                                            case 8:
                                                break;
                                            case 5:
                                            case 9:
                                                break;
                                            case 6:
                                            case 10:
                                                break;
                                            case 7:
                                            case 11:
                                                break;
                                            default:
                                                switch (m) {
                                                    case 66:
                                                        break;
                                                    case 67:
                                                        break;
                                                    case 68:
                                                        break;
                                                    default:
                                                        throw new IllegalArgumentException(rf0.f(m, "Signature type ", " is not supported"));
                                                }
                                        }
                                    }
                                }
                                i = 1;
                            }
                            i = 8;
                        }
                    }
                    o0(i);
                }
            }
            i = 4;
            o0(i);
        }
        i = this.y0;
        o0(i);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.c;
        if (i3 == 0) {
            m0();
            return e0(i, bArr, i2);
        } else if (this.x0 > this.w0) {
            return e0(i, bArr, i2);
        } else {
            int i4 = this.Y;
            if (i4 > 0) {
                int min = Math.min(i2, i4);
                Arrays.fill(bArr, i, i + min, (byte) -2);
                this.Y -= min;
                return min;
            }
            int i5 = this.o;
            if (i5 > i3) {
                int read = this.a.read(bArr, i, Math.min(i2, i5 - i3));
                if (read != -1) {
                    this.c += read;
                }
                return read;
            } else if (U()) {
                return e0(i, bArr, i2);
            } else {
                return -1;
            }
        }
    }
}
