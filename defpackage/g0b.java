package defpackage;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: g0b  reason: default package */
public final class g0b {
    public final f0b a;
    public il8 b;
    public cn0 c;
    public il8 d;
    public zi5 e;
    public il8 f;
    public qe4 g;
    public og0 h;
    public w66 i;

    public g0b(f0b f0b) {
        this.a = f0b;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [cn0, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.cn0 a() {
        /*
            r6 = this;
            cn0 r0 = r6.c
            if (r0 != 0) goto L_0x0085
            f0b r0 = r6.a
            java.lang.String r1 = r0.i
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -1868884870: goto L_0x003b;
                case -1106578487: goto L_0x0031;
                case -404562712: goto L_0x0027;
                case -402149703: goto L_0x001d;
                case 95945896: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0045
        L_0x0013:
            java.lang.String r2 = "dummy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0045
            r1 = 0
            goto L_0x0046
        L_0x001d:
            java.lang.String r2 = "dummy_with_tracking"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0045
            r1 = r5
            goto L_0x0046
        L_0x0027:
            java.lang.String r2 = "experimental"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0045
            r1 = r4
            goto L_0x0046
        L_0x0031:
            java.lang.String r2 = "legacy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0045
            r1 = 4
            goto L_0x0046
        L_0x003b:
            java.lang.String r2 = "legacy_default_params"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0045
            r1 = r3
            goto L_0x0046
        L_0x0045:
            r1 = -1
        L_0x0046:
            if (r1 == 0) goto L_0x007e
            if (r1 == r5) goto L_0x0076
            if (r1 == r4) goto L_0x0068
            mk9 r2 = r0.b
            lk9 r4 = r0.d
            if (r1 == r3) goto L_0x005c
            mr0 r1 = new mr0
            h0b r0 = r0.a
            r1.<init>(r4, r0, r2)
            r6.c = r1
            goto L_0x0085
        L_0x005c:
            mr0 r0 = new mr0
            h0b r1 = defpackage.l54.a()
            r0.<init>(r4, r1, r2)
            r6.c = r0
            goto L_0x0085
        L_0x0068:
            jr7 r1 = new jr7
            mk9 r2 = defpackage.mk9.j()
            int r0 = r0.j
            r1.<init>(r0, r2)
            r6.c = r1
            goto L_0x0085
        L_0x0076:
            yp4 r0 = new yp4
            r0.<init>()
            r6.c = r0
            goto L_0x0085
        L_0x007e:
            sp4 r0 = new sp4
            r0.<init>()
            r6.c = r0
        L_0x0085:
            cn0 r6 = r6.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g0b.a():cn0");
    }

    public final zi5 b() {
        if (this.e == null) {
            f0b f0b = this.a;
            this.e = new zi5(f0b.d, f0b.c);
        }
        return this.e;
    }

    public final qe4 c(int i2) {
        il8 il8;
        if (this.g == null) {
            f0b f0b = this.a;
            Class<i0b> cls = i0b.class;
            Class<h0b> cls2 = h0b.class;
            Class<ll8> cls3 = ll8.class;
            if (i2 == 0) {
                if (this.f == null) {
                    try {
                        this.f = NativeMemoryChunkPool.class.getConstructor(new Class[]{cls3, cls2, cls}).newInstance(new Object[]{f0b.d, f0b.e, f0b.f});
                    } catch (ClassNotFoundException e2) {
                        m75.c("PoolFactory", BuildConfig.FLAVOR, e2);
                        this.f = null;
                    } catch (IllegalAccessException e3) {
                        m75.c("PoolFactory", BuildConfig.FLAVOR, e3);
                        this.f = null;
                    } catch (InstantiationException e4) {
                        m75.c("PoolFactory", BuildConfig.FLAVOR, e4);
                        this.f = null;
                    } catch (NoSuchMethodException e5) {
                        m75.c("PoolFactory", BuildConfig.FLAVOR, e5);
                        this.f = null;
                    } catch (InvocationTargetException e6) {
                        m75.c("PoolFactory", BuildConfig.FLAVOR, e6);
                        this.f = null;
                    }
                }
                il8 = this.f;
            } else if (i2 == 1) {
                if (this.d == null) {
                    try {
                        this.d = BufferMemoryChunkPool.class.getConstructor(new Class[]{cls3, cls2, cls}).newInstance(new Object[]{f0b.d, f0b.e, f0b.f});
                    } catch (ClassNotFoundException unused) {
                        this.d = null;
                    } catch (IllegalAccessException unused2) {
                        this.d = null;
                    } catch (InstantiationException unused3) {
                        this.d = null;
                    } catch (NoSuchMethodException unused4) {
                        this.d = null;
                    } catch (InvocationTargetException unused5) {
                        this.d = null;
                    }
                }
                il8 = this.d;
            } else if (i2 == 2) {
                if (this.b == null) {
                    try {
                        this.b = AshmemMemoryChunkPool.class.getConstructor(new Class[]{cls3, cls2, cls}).newInstance(new Object[]{f0b.d, f0b.e, f0b.f});
                    } catch (ClassNotFoundException unused6) {
                        this.b = null;
                    } catch (IllegalAccessException unused7) {
                        this.b = null;
                    } catch (InstantiationException unused8) {
                        this.b = null;
                    } catch (NoSuchMethodException unused9) {
                        this.b = null;
                    } catch (InvocationTargetException unused10) {
                        this.b = null;
                    }
                }
                il8 = this.b;
            } else {
                throw new IllegalArgumentException("Invalid MemoryChunkType");
            }
            ez3.n(il8, "failed to get pool for chunk type: " + i2);
            this.g = new qe4((Object) il8, 25, (Object) d());
        }
        return this.g;
    }

    public final og0 d() {
        if (this.h == null) {
            if (this.i == null) {
                f0b f0b = this.a;
                this.i = new w66(f0b.d, f0b.g, f0b.h);
            }
            this.h = new og0(this.i);
        }
        return this.h;
    }
}
