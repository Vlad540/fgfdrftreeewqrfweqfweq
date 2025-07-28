package defpackage;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: ste  reason: default package */
public final class ste extends Reader {
    public int X;
    public final boolean Y;
    public char Z = 0;
    public final tn6 a;
    public InputStream b;
    public byte[] c;
    public int o;
    public int w0;
    public int x0;
    public final boolean y0;
    public char[] z0;

    public ste(tn6 tn6, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        boolean z2 = false;
        this.a = tn6;
        this.b = inputStream;
        this.c = bArr;
        this.o = i;
        this.X = i2;
        this.Y = z;
        this.y0 = inputStream != null ? true : z2;
    }

    public final void a(int i) {
        throw new CharConversionException(wn6.j(rf0.i("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", i, ", needed 4, at char #", this.w0, ", byte #"), this.x0 + i, ")"));
    }

    public final void close() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            this.b = null;
            byte[] bArr = this.c;
            if (bArr != null) {
                this.c = null;
                this.a.a(bArr);
            }
            inputStream.close();
        }
    }

    public final int read() {
        if (this.z0 == null) {
            this.z0 = new char[1];
        }
        if (read(this.z0, 0, 1) < 1) {
            return -1;
        }
        return this.z0[0];
    }

    public final int read(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        byte b2;
        byte b3;
        int i5;
        int i6;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = this.c;
        if (bArr3 == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || (i3 = i + i2) > cArr.length) {
            throw new ArrayIndexOutOfBoundsException(wn6.j(rf0.i("read(buf,", i, ",", i2, "), cbuf["), cArr.length, "]"));
        }
        char c2 = this.Z;
        if (c2 != 0) {
            i4 = i + 1;
            cArr[i] = c2;
            this.Z = 0;
        } else {
            int i7 = this.X;
            int i8 = this.o;
            int i9 = i7 - i8;
            if (i9 < 4) {
                this.x0 = (i7 - i9) + this.x0;
                tn6 tn6 = this.a;
                boolean z = this.y0;
                if (i9 > 0) {
                    if (i8 > 0) {
                        System.arraycopy(bArr3, i8, bArr3, 0, i9);
                        this.o = 0;
                    }
                    this.X = i9;
                } else {
                    this.o = 0;
                    InputStream inputStream = this.b;
                    int read = inputStream == null ? -1 : inputStream.read(bArr3);
                    if (read < 1) {
                        this.X = 0;
                        if (read < 0) {
                            if (z && (bArr2 = this.c) != null) {
                                this.c = null;
                                tn6.a(bArr2);
                            }
                            if (i9 == 0) {
                                return -1;
                            }
                            a(this.X - this.o);
                            throw null;
                        }
                        throw new IOException("Strange I/O stream, returned 0 bytes on read");
                    }
                    this.X = read;
                }
                while (true) {
                    int i10 = this.X;
                    if (i10 >= 4) {
                        break;
                    }
                    InputStream inputStream2 = this.b;
                    if (inputStream2 == null) {
                        i6 = -1;
                    } else {
                        byte[] bArr4 = this.c;
                        i6 = inputStream2.read(bArr4, i10, bArr4.length - i10);
                    }
                    if (i6 >= 1) {
                        this.X += i6;
                    } else if (i6 < 0) {
                        if (z && (bArr = this.c) != null) {
                            this.c = null;
                            tn6.a(bArr);
                        }
                        a(this.X);
                        throw null;
                    } else {
                        throw new IOException("Strange I/O stream, returned 0 bytes on read");
                    }
                }
            }
            i4 = i;
        }
        int i11 = this.X - 4;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i12 = this.o;
            if (this.Y) {
                byte[] bArr5 = this.c;
                b2 = (bArr5[i12] << 8) | (bArr5[i12 + 1] & 255);
                b3 = (bArr5[i12 + 3] & 255) | ((bArr5[i12 + 2] & 255) << 8);
            } else {
                byte[] bArr6 = this.c;
                byte b4 = (bArr6[i12] & 255) | ((bArr6[i12 + 1] & 255) << 8);
                b2 = (bArr6[i12 + 3] << 8) | (bArr6[i12 + 2] & 255);
                b3 = b4;
            }
            int i13 = i12 + 4;
            this.o = i13;
            if (b2 != 0) {
                byte b5 = b2 & 65535;
                byte b6 = b3 | ((b5 - 1) << 16);
                if (b5 <= 16) {
                    i5 = i4 + 1;
                    cArr[i4] = (char) ((b6 >> 10) + 55296);
                    byte b7 = (b6 & 1023) | 56320;
                    if (i5 >= i3) {
                        this.Z = (char) b6;
                        break;
                    }
                    b3 = b7;
                    i4 = i5;
                } else {
                    throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(b6) + String.format(" (above 0x%08x)", new Object[]{1114111}) + " at char #" + (this.w0 + (i4 - i)) + ", byte #" + ((this.x0 + this.o) - 1) + ")");
                }
            }
            i5 = i4 + 1;
            cArr[i4] = (char) b3;
            if (i13 > i11) {
                break;
            }
            i4 = i5;
        }
        i4 = i5;
        int i14 = i4 - i;
        this.w0 += i14;
        return i14;
    }
}
