package defpackage;

import android.util.Range;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;

/* renamed from: s86  reason: default package */
public final class s86 implements h25 {
    public static int Y;
    public Object X = new LinkedHashMap();
    public Object a;
    public Object b = HttpGet.METHOD_NAME;
    public Object c = new xe6(0);
    public Object o;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(defpackage.s86 r4, long r5, java.util.List r7, kotlin.coroutines.Continuation r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof defpackage.q86
            if (r0 == 0) goto L_0x0016
            r0 = r8
            q86 r0 = (defpackage.q86) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x001b
        L_0x0016:
            q86 r0 = new q86
            r0.<init>(r4, r8)
        L_0x001b:
            java.lang.Object r8 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            wx3.H(r8)
            goto L_0x004d
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            wx3.H(r8)
            java.lang.Object r4 = r4.c
            t97 r4 = (t97) r4
            java.lang.Object r4 = r4.getValue()
            sce r4 = (defpackage.sce) r4
            pn2 r8 = new pn2
            r8.<init>((long) r5, (java.util.List) r7)
            r0.Y = r3
            java.lang.Object r8 = r4.e(r8, r0)
            if (r8 != r1) goto L_0x004d
            goto L_0x0051
        L_0x004d:
            r89 r8 = (defpackage.r89) r8
            java.util.List r1 = r8.o
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s86.e(s86, long, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ExecutorService a() {
        return (ExecutorService) this.b;
    }

    public ExecutorService b() {
        return (ExecutorService) this.o;
    }

    public ExecutorService c() {
        return (ExecutorService) this.c;
    }

    public ExecutorService d() {
        return (ExecutorService) this.a;
    }

    public ExecutorService f() {
        return (ExecutorService) this.a;
    }

    public void g(String str, String str2) {
        ((xe6) this.c).f(str, str2);
    }

    public n80 h() {
        String str = ((Range) this.a) == null ? " bitrate" : "";
        if (((Integer) this.b) == null) {
            str = str.concat(" sourceFormat");
        }
        if (((Integer) this.c) == null) {
            str = hr1.g(str, " source");
        }
        if (((Range) this.o) == null) {
            str = hr1.g(str, " sampleRate");
        }
        if (((Integer) this.X) == null) {
            str = hr1.g(str, " channelCount");
        }
        if (str.isEmpty()) {
            return new n80((Range) this.a, ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (Range) this.o, ((Integer) this.X).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public ExecutorService i() {
        return (ExecutorService) this.a;
    }

    public lac j() {
        sm6 sm6 = (sm6) this.a;
        if (sm6 != null) {
            String str = (String) this.b;
            ye6 h = ((xe6) this.c).h();
            d8 d8Var = (d8) this.o;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.X;
            byte[] bArr = nze.a;
            return new lac(sm6, str, h, d8Var, linkedHashMap.isEmpty() ? iw4.a : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)));
        }
        throw new IllegalStateException("url == null".toString());
    }

    public void k() {
        gt0.i();
        j54 j54 = (j54) this.c;
        j54.getClass();
        gt0.i();
        x80 x80 = (x80) j54.o;
        Objects.requireNonNull(x80);
        yic yic = (yic) j54.b;
        Objects.requireNonNull(yic);
        j54.getClass();
        cs6 cs6 = x80.b;
        Objects.requireNonNull(cs6);
        cs6.a();
        cs6 cs62 = x80.b;
        Objects.requireNonNull(cs62);
        ct0.A(cs62.e).c(new rw1(yic, 0), pa2.A());
        cs6 cs63 = x80.c;
        if (cs63 != null) {
            cs63.a();
            ct0.A(x80.c.e).c(new rw1((yic) null, 1), pa2.A());
        }
        ((r4b) this.o).getClass();
    }

    public void l(String str, String str2) {
        ((xe6) this.c).n(str, str2);
    }

    public void m(String str, d8 d8Var) {
        if (str.length() > 0) {
            if (d8Var == null) {
                if (!(!(str.equals(HttpPost.METHOD_NAME) || str.equals(HttpPut.METHOD_NAME) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")))) {
                    throw new IllegalArgumentException(wn6.i("method ", str, " must have a request body.").toString());
                }
            } else if (!ez3.S(str)) {
                throw new IllegalArgumentException(wn6.i("method ", str, " must not have a request body.").toString());
            }
            this.b = str;
            this.o = d8Var;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public void n(String str) {
        ((xe6) this.c).m(str);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [yd3, java.lang.Object] */
    public void o(h90 h90) {
        Object obj = new Object();
        hb0 hb0 = (hb0) this.a;
        if (hb0 != null) {
            String str = (String) this.b;
            if (str == null) {
                throw new NullPointerException("Null transportName");
            } else if (((hs1) this.o) != null) {
                cy4 cy4 = (cy4) this.c;
                if (cy4 != null) {
                    tre tre = (tre) this.X;
                    tre.getClass();
                    t3b t3b = t3b.a;
                    ydc a2 = hb0.a();
                    a2.I(hb0.a);
                    a2.o = t3b;
                    a2.c = hb0.b;
                    hb0 r = a2.r();
                    ? obj2 = new Object();
                    obj2.f = new HashMap();
                    obj2.d = Long.valueOf(tre.a.a());
                    obj2.e = Long.valueOf(tre.b.a());
                    obj2.a = str;
                    u29 u29 = (u29) h90.a;
                    u29.getClass();
                    jj7 jj7 = nhb.a;
                    jj7.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jj7.t(u29, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    obj2.c = new cx4(cy4, byteArrayOutputStream.toByteArray());
                    obj2.b = null;
                    i90 c2 = obj2.c();
                    ia4 ia4 = tre.c;
                    ia4.getClass();
                    ia4.b.execute(new wc3(ia4, r, obj, c2, 1));
                    return;
                }
                throw new NullPointerException("Null encoding");
            } else {
                throw new NullPointerException("Null transformer");
            }
        } else {
            throw new NullPointerException("Null transportContext");
        }
    }

    public void p(String str) {
        Class<Object> cls = Object.class;
        if (str == null) {
            ((LinkedHashMap) this.X).remove(cls);
            return;
        }
        if (((LinkedHashMap) this.X).isEmpty()) {
            this.X = new LinkedHashMap();
        }
        ((LinkedHashMap) this.X).put(cls, cls.cast(str));
    }

    public void q(String str) {
        if (p0e.Q(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (p0e.Q(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        u93 u93 = new u93();
        u93.j((sm6) null, str);
        this.a = u93.b();
    }
}
