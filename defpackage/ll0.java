package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: ll0  reason: default package */
public abstract class ll0 {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public Object e;

    public ll0(gl0 gl0, jl0 jl0, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = jl0;
        this.b = i;
        this.c = new dl0(gl0, j, j2, j3, j4, j5);
    }

    public static int c(q74 q74, long j, le4 le4) {
        if (j == q74.o) {
            return 0;
        }
        le4.a = j;
        return 1;
    }

    public static int d(r74 r74, long j, le4 le4) {
        if (j == r74.o) {
            return 0;
        }
        le4.a = j;
        return 1;
    }

    public int a(q74 q74, le4 le4) {
        q74 q742;
        le4 le42;
        long j;
        while (true) {
            q742 = q74;
            le42 = le4;
            fl0 fl0 = (fl0) this.e;
            swb.i(fl0);
            long j2 = fl0.f;
            long j3 = fl0.g;
            j = fl0.h;
            int i = ((j3 - j2) > ((long) this.b) ? 1 : ((j3 - j2) == ((long) this.b) ? 0 : -1));
            jl0 jl0 = (jl0) this.d;
            if (i <= 0) {
                this.e = null;
                jl0.c();
                return c(q742, j2, le42);
            }
            long j4 = j - q742.o;
            if (j4 >= 0 && j4 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                q742.z((int) j4);
                q742.Y = 0;
                il0 g = jl0.g(q742, fl0.b);
                int i2 = g.a;
                if (i2 != -3) {
                    long j5 = g.b;
                    long j6 = g.c;
                    if (i2 == -2) {
                        long j7 = j5;
                        fl0.d = j7;
                        fl0.f = j6;
                        fl0.h = fl0.a(fl0.b, j7, fl0.e, j6, fl0.g, fl0.c);
                    } else if (i2 == -1) {
                        long j8 = j5;
                        fl0.e = j8;
                        fl0.g = j6;
                        fl0.h = fl0.a(fl0.b, fl0.d, j8, fl0.f, j6, fl0.c);
                    } else if (i2 == 0) {
                        long j9 = j6 - q742.o;
                        if (j9 >= 0 && j9 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            q742.z((int) j9);
                        }
                        this.e = null;
                        jl0.c();
                        return c(q742, j6, le42);
                    } else {
                        throw new IllegalStateException("Invalid case");
                    }
                } else {
                    this.e = null;
                    jl0.c();
                    return c(q74, j, le4);
                }
            }
        }
        return c(q742, j, le42);
    }

    public int b(r74 r74, le4 le4) {
        r74 r742;
        le4 le42;
        long j;
        while (true) {
            r742 = r74;
            le42 = le4;
            fl0 fl0 = (fl0) this.e;
            oyb.l(fl0);
            long j2 = fl0.f;
            long j3 = fl0.g;
            j = fl0.h;
            int i = ((j3 - j2) > ((long) this.b) ? 1 : ((j3 - j2) == ((long) this.b) ? 0 : -1));
            kl0 kl0 = (kl0) this.d;
            if (i <= 0) {
                this.e = null;
                kl0.c();
                return d(r742, j2, le42);
            }
            long j4 = j - r742.o;
            if (j4 >= 0 && j4 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                r742.z((int) j4);
                r742.Y = 0;
                il0 k = kl0.k(r742, fl0.b);
                int i2 = k.a;
                if (i2 != -3) {
                    long j5 = k.b;
                    long j6 = k.c;
                    if (i2 == -2) {
                        long j7 = j5;
                        fl0.d = j7;
                        fl0.f = j6;
                        fl0.h = fl0.b(fl0.b, j7, fl0.e, j6, fl0.g, fl0.c);
                    } else if (i2 == -1) {
                        long j8 = j5;
                        fl0.e = j8;
                        fl0.g = j6;
                        fl0.h = fl0.b(fl0.b, fl0.d, j8, fl0.f, j6, fl0.c);
                    } else if (i2 == 0) {
                        long j9 = j6 - r742.o;
                        if (j9 >= 0 && j9 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            r742.z((int) j9);
                        }
                        this.e = null;
                        kl0.c();
                        return d(r742, j6, le42);
                    } else {
                        throw new IllegalStateException("Invalid case");
                    }
                } else {
                    this.e = null;
                    kl0.c();
                    return d(r74, j, le4);
                }
            }
        }
        return d(r742, j, le42);
    }

    public final void e(long j) {
        long j2 = j;
        switch (this.a) {
            case 0:
                fl0 fl0 = (fl0) this.e;
                if (fl0 == null || fl0.a != j2) {
                    dl0 dl0 = (dl0) this.c;
                    long j3 = j;
                    this.e = new fl0(j3, dl0.a.a(j2), dl0.d, dl0.e, dl0.f, dl0.g, 0);
                    return;
                }
                return;
            default:
                fl0 fl02 = (fl0) this.e;
                if (fl02 == null || fl02.a != j2) {
                    el0 el0 = (el0) this.c;
                    long j4 = j;
                    this.e = new fl0(j4, el0.a.a(j2), el0.o, el0.X, el0.Y, el0.Z, 1);
                    return;
                }
                return;
        }
    }

    public ll0(hl0 hl0, kl0 kl0, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = kl0;
        this.b = i;
        this.c = new el0(hl0, j, j2, j3, j4, j5);
    }
}
