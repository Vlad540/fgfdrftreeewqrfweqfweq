package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ngb  reason: default package */
public final class ngb {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public boolean g;
    public final w66 h;

    public ngb(w66 w66) {
        w66.getClass();
        this.h = w66;
    }

    public final boolean a(j0b j0b) {
        int read;
        int i = this.e;
        while (this.a != 6 && (read = j0b.read()) != -1) {
            try {
                int i2 = this.c;
                this.c = i2 + 1;
                if (this.g) {
                    this.a = 6;
                    this.g = false;
                    return false;
                }
                int i3 = this.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    this.a = 5;
                                } else if (i3 != 5) {
                                    ez3.o(false);
                                } else {
                                    int i4 = ((this.b << 8) + read) - 2;
                                    wx3.F(j0b, (long) i4);
                                    this.c += i4;
                                    this.a = 2;
                                }
                            } else if (read == 255) {
                                this.a = 3;
                            } else if (read == 0) {
                                this.a = 2;
                            } else if (read == 217) {
                                this.g = true;
                                int i5 = i2 - 1;
                                int i6 = this.d;
                                if (i6 > 0) {
                                    this.f = i5;
                                }
                                this.d = i6 + 1;
                                this.e = i6;
                                this.a = 2;
                            } else {
                                if (read == 218) {
                                    int i7 = i2 - 1;
                                    int i8 = this.d;
                                    if (i8 > 0) {
                                        this.f = i7;
                                    }
                                    this.d = i8 + 1;
                                    this.e = i8;
                                }
                                if (read != 1) {
                                    if (read < 208 || read > 215) {
                                        if (!(read == 217 || read == 216)) {
                                            this.a = 4;
                                        }
                                    }
                                }
                                this.a = 2;
                            }
                        } else if (read == 255) {
                            this.a = 3;
                        }
                    } else if (read == 216) {
                        this.a = 2;
                    } else {
                        this.a = 6;
                    }
                } else if (read == 255) {
                    this.a = 1;
                } else {
                    this.a = 6;
                }
                this.b = read;
            } catch (IOException e2) {
                bm3.z(e2);
                throw null;
            }
        }
        return (this.a == 6 || this.e == i) ? false : true;
    }

    public final boolean b(ax4 ax4) {
        if (this.a == 6 || ax4.o() <= this.c) {
            return false;
        }
        InputStream n = ax4.n();
        n.getClass();
        w66 w66 = this.h;
        j0b j0b = new j0b(n, (byte[]) w66.get(16384), w66);
        try {
            wx3.F(j0b, (long) this.c);
            boolean a2 = a(j0b);
            g13.b(j0b);
            return a2;
        } catch (IOException e2) {
            bm3.z(e2);
            throw null;
        } catch (Throwable th) {
            g13.b(j0b);
            throw th;
        }
    }
}
