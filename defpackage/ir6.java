package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ir6  reason: default package */
public final class ir6 {
    public static ir6 p;
    public static fr6 q;
    public final v4b a;
    public final hr6 b;
    public final lv1 c;
    public final ai4 d;
    public lr7 e;
    public qe4 f;
    public lr7 g;
    public qe4 h;
    public m84 i;
    public n99 j;
    public b5b k;
    public f5b l;
    public gs m;
    public lga n;
    public AnimatedFactoryV2Impl o;

    public ir6(hr6 hr6) {
        n06.s();
        hr6.getClass();
        this.b = hr6;
        di9 di9 = hr6.v;
        di9.getClass();
        this.a = new v4b(hr6.h.b());
        this.c = new lv1(hr6.x);
        n06.s();
        this.d = hr6.f;
        di9.getClass();
    }

    public static ir6 g() {
        ir6 ir6 = p;
        ez3.n(ir6, "ImagePipelineFactory was not initialized!");
        return ir6;
    }

    public final h54 a() {
        AnimatedFactoryV2Impl b2 = b();
        if (b2 == null) {
            return null;
        }
        if (b2.h == null) {
            xe xeVar = new xe(0);
            wyc wyc = b2.i;
            if (wyc == null) {
                wyc = new la4(b2.b.a());
            }
            wyc wyc2 = wyc;
            xe xeVar2 = new xe(1);
            if (b2.f == null) {
                b2.f = new x3a(2, (Object) b2);
            }
            x3a x3a = b2.f;
            if (aue.b == null) {
                aue.b = new aue(new Handler(Looper.getMainLooper()));
            }
            b2.h = new h54(x3a, aue.b, wyc2, RealtimeSinceBootClock.get(), b2.a, b2.c, xeVar, xeVar2, new uz3(3, Boolean.valueOf(b2.k)), new uz3(3, Boolean.valueOf(b2.d)), new uz3(3, Integer.valueOf(b2.j)), new uz3(3, Integer.valueOf(b2.l)));
        }
        return b2.h;
    }

    public final AnimatedFactoryV2Impl b() {
        if (this.o == null) {
            mxa h2 = h();
            hr6 hr6 = this.b;
            h25 h25 = hr6.h;
            fv3 c2 = c();
            hr6.v.getClass();
            hr6.v.getClass();
            hr6.v.getClass();
            hr6.v.getClass();
            hr6.getClass();
            if (!gp0.k) {
                Class<AnimatedFactoryV2Impl> cls = AnimatedFactoryV2Impl.class;
                Class<mxa> cls2 = mxa.class;
                Class<h25> cls3 = h25.class;
                Class<fv3> cls4 = fv3.class;
                try {
                    Class cls5 = Boolean.TYPE;
                    Class cls6 = Integer.TYPE;
                    Constructor<AnimatedFactoryV2Impl> constructor = cls.getConstructor(new Class[]{cls2, cls3, cls4, cls5, cls5, cls6, cls6, wyc.class});
                    Boolean bool = Boolean.FALSE;
                    gp0.l = constructor.newInstance(new Object[]{h2, h25, c2, bool, bool, 30, 1000, null});
                } catch (Throwable unused) {
                }
                if (gp0.l != null) {
                    gp0.k = true;
                }
            }
            this.o = gp0.l;
        }
        return this.o;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [vze, java.lang.Object] */
    public final fv3 c() {
        if (this.e == null) {
            hr6 hr6 = this.b;
            bqc bqc = hr6.y;
            k54 k54 = hr6.a;
            lk9 lk9 = hr6.l;
            y76 y76 = hr6.b;
            hr6.v.getClass();
            hr6.v.getClass();
            hr6.getClass();
            bqc.getClass();
            lr7 lr7 = new lr7(new Object(), k54);
            lk9.getClass();
            this.e = lr7;
        }
        return this.e;
    }

    public final qe4 d() {
        if (this.f == null) {
            fv3 c2 = c();
            kk9 kk9 = this.b.i;
            kk9.getClass();
            this.f = new qe4((Object) c2, 22, (Object) new za6((Object) kk9));
        }
        return this.f;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [vze, java.lang.Object] */
    public final qe4 e() {
        if (this.h == null) {
            hr6 hr6 = this.b;
            hr6.getClass();
            if (this.g == null) {
                lr7 lr7 = new lr7(new Object(), hr6.g);
                hr6.l.getClass();
                this.g = lr7;
            }
            lr7 lr72 = this.g;
            kk9 kk9 = hr6.i;
            kk9.getClass();
            this.h = new qe4((Object) lr72, 22, (Object) new lv1(15, kk9));
        }
        return this.h;
    }

    public final fr6 f() {
        fr6 fr6;
        ai4 ai4;
        fr6 fr62;
        f5b f5b;
        f5b f5b2;
        we weVar;
        ye yeVar;
        if (q == null) {
            hr6 hr6 = this.b;
            hr6.v.getClass();
            f5b f5b3 = this.l;
            di9 di9 = hr6.v;
            ai4 ai42 = this.d;
            if (f5b3 == null) {
                ContentResolver contentResolver = hr6.d.getApplicationContext().getContentResolver();
                if (this.k == null) {
                    bqc bqc = (bqc) di9.b;
                    g0b g0b = hr6.n;
                    if (g0b.i == null) {
                        f0b f0b = g0b.a;
                        g0b.i = new w66(f0b.d, f0b.g, f0b.h);
                    }
                    w66 w66 = g0b.i;
                    if (this.i == null) {
                        hr6.getClass();
                        AnimatedFactoryV2Impl b2 = b();
                        if (b2 != null) {
                            yeVar = new ye(0, b2);
                            weVar = new we(b2);
                        } else {
                            yeVar = null;
                            weVar = null;
                        }
                        hr6.v.getClass();
                        b2b b2b = hr6.u;
                        if (b2b == null) {
                            this.i = new m84(yeVar, weVar, i(), (Map) null);
                        } else {
                            this.i = new m84(yeVar, weVar, i(), (HashMap) b2b.b);
                            mq6 mq6 = (mq6) mq6.d.getValue();
                            mq6.b = (ArrayList) b2b.c;
                            mq6.a();
                        }
                    }
                    m84 m84 = this.i;
                    qe4 c2 = g0b.c(0);
                    g0b.d();
                    qe4 d2 = d();
                    qe4 e2 = e();
                    mxa h2 = h();
                    bqc.getClass();
                    int i2 = di9.a;
                    lv1 lv1 = this.c;
                    Context context = hr6.d;
                    nfc nfc = hr6.o;
                    fr62 = fr6;
                    lv1 lv12 = lv1;
                    vl4 vl4 = hr6.e;
                    f5b2 = f5b;
                    b5b b5b = r5;
                    ai4 = ai42;
                    b5b b5b2 = new b5b(context, w66, m84, nfc, vl4, hr6.s, hr6.h, c2, d2, e2, ai4, hr6.c, h2, i2, lv12);
                    this.k = b5b;
                } else {
                    fr62 = fr6;
                    f5b2 = f5b;
                    ai4 = ai42;
                }
                b5b b5b3 = this.k;
                di9.getClass();
                if (this.j == null) {
                    hr6.getClass();
                    di9 di92 = hr6.v;
                    di92.getClass();
                    this.j = new n99(di92.a);
                }
                ContentResolver contentResolver2 = contentResolver;
                new f5b(contentResolver2, b5b3, hr6.m, hr6.s, this.a, hr6.e, hr6.w, this.j, hr6.r);
                this.l = f5b2;
            } else {
                fr62 = fr6;
                ai4 = ai42;
            }
            hr6.getClass();
            ai4 ai43 = ai4;
            new fr6(this.l, hr6.p, hr6.q, hr6.j, d(), e(), ai43, hr6.c, (uz3) di9.c, this.b);
            q = fr62;
        }
        return q;
    }

    public final mxa h() {
        if (this.m == null) {
            g0b g0b = this.b.n;
            i();
            this.m = new gs(g0b.a(), this.c);
        }
        return this.m;
    }

    public final nxa i() {
        if (this.n == null) {
            hr6 hr6 = this.b;
            g0b g0b = hr6.n;
            hr6.v.getClass();
            hr6.v.getClass();
            kp0 kp0 = (kp0) hr6.v.d;
            cn0 a2 = g0b.a();
            int i2 = g0b.a.c.d;
            p0b p0b = new p0b(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                rt0 rt0 = d24.a;
                p0b.g(ByteBuffer.allocate(16384));
            }
            this.n = new lga(a2, p0b, kp0);
        }
        return this.n;
    }
}
