package defpackage;

import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: hp6  reason: default package */
public final class hp6 implements oye {
    public final /* synthetic */ int a;
    public final fc9 b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public hp6(int i) {
        this(fc9.c(), 0);
        this.a = i;
        switch (i) {
            case 1:
                this(fc9.c(), 1);
                return;
            case 2:
                this(fc9.c(), 2);
                return;
            default:
                return;
        }
    }

    public bq6 a() {
        Object obj;
        Object obj2;
        Object obj3;
        z80 z80 = cq6.X;
        fc9 fc9 = this.b;
        fc9.getClass();
        Object obj4 = null;
        try {
            obj = fc9.h(z80);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            fc9.j(qq6.z, num);
        } else {
            zp6 zp6 = bq6.A;
            try {
                obj3 = fc9.h(cq6.Y);
            } catch (IllegalArgumentException unused2) {
                obj3 = null;
            }
            if (Objects.equals(obj3, 1)) {
                fc9.j(qq6.z, 4101);
                fc9.j(qq6.A, zq4.c);
            } else {
                fc9.j(qq6.z, 256);
            }
        }
        cq6 cq6 = new cq6(hga.a(fc9));
        br6.A(cq6);
        bq6 bq6 = new bq6(cq6);
        try {
            obj2 = fc9.h(br6.F);
        } catch (IllegalArgumentException unused3) {
            obj2 = null;
        }
        Size size = (Size) obj2;
        if (size != null) {
            bq6.t = new Rational(size.getWidth(), size.getHeight());
        }
        z80 z802 = z17.M;
        Object u = pa2.u();
        try {
            u = fc9.h(z802);
        } catch (IllegalArgumentException unused4) {
        }
        e07.o((Executor) u, "The IO executor can't be null");
        z80 z803 = cq6.c;
        if (fc9.a.containsKey(z803)) {
            Integer num2 = (Integer) fc9.h(z803);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            } else if (num2.intValue() == 3) {
                try {
                    obj4 = fc9.h(cq6.z0);
                } catch (IllegalArgumentException unused5) {
                }
                if (obj4 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return bq6;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [b3b, mye] */
    public b3b b() {
        c3b c3b = new c3b(hga.a(this.b));
        br6.A(c3b);
        ? mye = new mye(c3b);
        mye.q = b3b.y;
        return mye;
    }

    public final Object c(ibc ibc) {
        switch (this.a) {
            case 0:
                this.b.j(br6.J, ibc);
                return this;
            case 1:
                this.b.j(br6.J, ibc);
                return this;
            case 2:
                this.b.j(br6.J, ibc);
                return this;
            default:
                this.b.j(br6.J, ibc);
                return this;
        }
    }

    public final Object d(Size size) {
        switch (this.a) {
            case 0:
                this.b.j(br6.F, size);
                return this;
            case 1:
                this.b.j(br6.F, size);
                return this;
            case 2:
                this.b.j(br6.F, size);
                return this;
            default:
                throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }
    }

    public final Object e(int i) {
        switch (this.a) {
            case 0:
                this.b.j(br6.C, Integer.valueOf(i));
                return this;
            case 1:
                this.b.j(br6.C, Integer.valueOf(i));
                return this;
            case 2:
                z80 z80 = br6.C;
                Integer valueOf = Integer.valueOf(i);
                fc9 fc9 = this.b;
                fc9.j(z80, valueOf);
                fc9.j(br6.D, Integer.valueOf(i));
                return this;
            default:
                this.b.j(br6.C, Integer.valueOf(i));
                return this;
        }
    }

    public final ob9 o() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return this.b;
        }
    }

    public final pye r() {
        switch (this.a) {
            case 0:
                return new np6(hga.a(this.b));
            case 1:
                return new cq6(hga.a(this.b));
            case 2:
                return new c3b(hga.a(this.b));
            default:
                return new i2f(hga.a(this.b));
        }
    }

    public hp6(fc9 fc9, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        this.a = i;
        switch (i) {
            case 1:
                this.b = fc9;
                Object obj5 = null;
                try {
                    obj = fc9.h(gde.d0);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                Class<bq6> cls2 = bq6.class;
                if (cls == null || cls.equals(cls2)) {
                    this.b.j(pye.s0, rye.a);
                    z80 z80 = gde.d0;
                    fc9 fc92 = this.b;
                    fc92.j(z80, cls2);
                    try {
                        obj5 = fc92.h(gde.c0);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (obj5 == null) {
                        this.b.j(gde.c0, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            case 2:
                this.b = fc9;
                Object obj6 = null;
                try {
                    obj2 = fc9.h(gde.d0);
                } catch (IllegalArgumentException unused3) {
                    obj2 = null;
                }
                Class cls3 = (Class) obj2;
                Class<b3b> cls4 = b3b.class;
                if (cls3 == null || cls3.equals(cls4)) {
                    this.b.j(pye.s0, rye.b);
                    z80 z802 = gde.d0;
                    fc9 fc93 = this.b;
                    fc93.j(z802, cls4);
                    try {
                        obj6 = fc93.h(gde.c0);
                    } catch (IllegalArgumentException unused4) {
                    }
                    if (obj6 == null) {
                        this.b.j(gde.c0, cls4.getCanonicalName() + "-" + UUID.randomUUID());
                    }
                    int i2 = -1;
                    try {
                        i2 = fc9.h(br6.E);
                    } catch (IllegalArgumentException unused5) {
                    }
                    if (((Integer) i2).intValue() == -1) {
                        fc9.j(br6.E, 2);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
            case 3:
                this.b = fc9;
                if (fc9.a.containsKey(i2f.b)) {
                    Object obj7 = null;
                    try {
                        obj3 = fc9.h(gde.d0);
                    } catch (IllegalArgumentException unused6) {
                        obj3 = null;
                    }
                    Class cls5 = (Class) obj3;
                    Class<h2f> cls6 = h2f.class;
                    if (cls5 == null || cls5.equals(cls6)) {
                        this.b.j(pye.s0, rye.o);
                        z80 z803 = gde.d0;
                        fc9 fc94 = this.b;
                        fc94.j(z803, cls6);
                        try {
                            obj7 = fc94.h(gde.c0);
                        } catch (IllegalArgumentException unused7) {
                        }
                        if (obj7 == null) {
                            fc94.j(gde.c0, cls6.getCanonicalName() + "-" + UUID.randomUUID());
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls5);
                }
                throw new IllegalArgumentException("VideoOutput is required");
            default:
                this.b = fc9;
                Object obj8 = null;
                try {
                    obj4 = fc9.h(gde.d0);
                } catch (IllegalArgumentException unused8) {
                    obj4 = null;
                }
                Class cls7 = (Class) obj4;
                Class<kp6> cls8 = kp6.class;
                if (cls7 == null || cls7.equals(cls8)) {
                    this.b.j(pye.s0, rye.c);
                    z80 z804 = gde.d0;
                    fc9 fc95 = this.b;
                    fc95.j(z804, cls8);
                    try {
                        obj8 = fc95.h(gde.c0);
                    } catch (IllegalArgumentException unused9) {
                    }
                    if (obj8 == null) {
                        fc95.j(gde.c0, cls8.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls7);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hp6(defpackage.d7f r3) {
        /*
            r2 = this;
            r0 = 3
            r2.a = r0
            fc9 r0 = defpackage.fc9.c()
            z80 r1 = defpackage.i2f.b
            r0.j(r1, r3)
            r3 = 3
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp6.<init>(d7f):void");
    }
}
