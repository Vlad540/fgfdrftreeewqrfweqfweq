package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Pair;
import android.view.Choreographer;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.camera.core.CameraUnavailableException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: otf  reason: default package */
public final class otf implements v2a, i36, lta, h96, ru4, aj6, vze, cf8, ho4, aga, kl0 {
    public Object a;
    public Object b;

    public /* synthetic */ otf(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static fz0 M(JSONObject jSONObject) {
        ge1 b2 = ge1.b(jSONObject.optString("initiatorId"));
        Long l = null;
        if (b2 == null) {
            return null;
        }
        if (jSONObject.has("movieId")) {
            l = Long.valueOf(jSONObject.optLong("movieId"));
        }
        return new fz0(b2, l);
    }

    public void A(int i, se8 se8, i78 i78) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new hf8(this, H, i78, 0));
        }
    }

    public void B(int i, se8 se8) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new if8(this, H, 3));
        }
    }

    public void C(int i, se8 se8) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new if8(this, H, 1));
        }
    }

    public void D(int i, se8 se8) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new if8(this, H, 2));
        }
    }

    public void E(int i, se8 se8, i78 i78) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new hf8(this, H, i78, 1));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[SYNTHETIC, Splitter:B:26:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap F(android.net.Uri r17, boolean r18) {
        /*
            r16 = this;
            r1 = r17
            java.lang.String r0 = "r"
            r2 = r16
            java.lang.Object r2 = r2.a
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = 0
            r4 = 1
            android.os.ParcelFileDescriptor r5 = r2.openFileDescriptor(r1, r0)     // Catch:{ IOException -> 0x0086, all -> 0x0084 }
            java.io.FileDescriptor r6 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0041 }
            int r7 = defpackage.at7.z0     // Catch:{ IOException -> 0x0041 }
            v25 r7 = new v25     // Catch:{ IOException -> 0x0041 }
            r7.<init>((java.io.FileDescriptor) r6)     // Catch:{ IOException -> 0x0041 }
            java.lang.String r6 = "Orientation"
            int r6 = r7.e(r4, r6)     // Catch:{ IOException -> 0x0041 }
            r5.close()     // Catch:{ IOException -> 0x0041 }
            android.os.ParcelFileDescriptor r5 = r2.openFileDescriptor(r1, r0)     // Catch:{ IOException -> 0x0041 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0041 }
            android.graphics.Point r7 = defpackage.at7.q(r7, r6)     // Catch:{ IOException -> 0x0041 }
            r5.close()     // Catch:{ IOException -> 0x0041 }
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0041 }
            r8.<init>()     // Catch:{ IOException -> 0x0041 }
            if (r18 == 0) goto L_0x0043
            r8.inMutable = r4     // Catch:{ IOException -> 0x0041 }
            goto L_0x0043
        L_0x003d:
            r0 = move-exception
            r3 = r5
            goto L_0x00cd
        L_0x0041:
            r0 = move-exception
            goto L_0x0088
        L_0x0043:
            r9 = 2048(0x800, float:2.87E-42)
            int r7 = defpackage.at7.v(r7, r9, r9)     // Catch:{ IOException -> 0x0041 }
            r8.inSampleSize = r7     // Catch:{ IOException -> 0x0041 }
            android.os.ParcelFileDescriptor r5 = r2.openFileDescriptor(r1, r0)     // Catch:{ IOException -> 0x0041 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0041 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r3, r8)     // Catch:{ IOException -> 0x0041 }
            r5.close()     // Catch:{ IOException -> 0x0041 }
            int r2 = defpackage.at7.w(r6)     // Catch:{ IOException -> 0x0041 }
            if (r2 != 0) goto L_0x0064
            defpackage.ete.n(r5)
            return r0
        L_0x0064:
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ IOException -> 0x0041 }
            r14.<init>()     // Catch:{ IOException -> 0x0041 }
            float r2 = (float) r2     // Catch:{ IOException -> 0x0041 }
            r14.setRotate(r2)     // Catch:{ IOException -> 0x0041 }
            int r12 = r0.getWidth()     // Catch:{ IOException -> 0x0041 }
            int r13 = r0.getHeight()     // Catch:{ IOException -> 0x0041 }
            r10 = 0
            r11 = 0
            r15 = 1
            r9 = r0
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0041 }
            r0.recycle()     // Catch:{ IOException -> 0x0041 }
            defpackage.ete.n(r5)
            return r2
        L_0x0084:
            r0 = move-exception
            goto L_0x00cd
        L_0x0086:
            r0 = move-exception
            r5 = r3
        L_0x0088:
            boolean r2 = r0 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x003d }
            java.lang.String r6 = "otf"
            if (r2 == 0) goto L_0x00c4
            java.lang.String r0 = r17.toString()     // Catch:{ all -> 0x003d }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00ab }
            r1.<init>(r0)     // Catch:{ all -> 0x00ab }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = "file by path %s not exists"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00ab }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch:{ all -> 0x00ab }
            defpackage.udd.R(r6, r3, r1, r0)     // Catch:{ all -> 0x00ab }
            goto L_0x00c0
        L_0x00ab:
            r0 = move-exception
            goto L_0x00bb
        L_0x00ad:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            if (r18 == 0) goto L_0x00b6
            r1.inMutable = r4     // Catch:{ all -> 0x00ab }
        L_0x00b6:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r0, r1)     // Catch:{ all -> 0x00ab }
            goto L_0x00c0
        L_0x00bb:
            java.lang.String r1 = "getBitmapFromExternalStorage fail"
            defpackage.udd.S(r6, r1, r0)     // Catch:{ all -> 0x003d }
        L_0x00c0:
            defpackage.ete.n(r5)
            return r3
        L_0x00c4:
            java.lang.String r1 = "getBitmapFromPath: failed to get bitmap"
            defpackage.udd.s(r6, r1, r0)     // Catch:{ all -> 0x003d }
            defpackage.ete.n(r5)
            return r3
        L_0x00cd:
            defpackage.ete.n(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otf.F(android.net.Uri, boolean):android.graphics.Bitmap");
    }

    public LinkedHashSet G() {
        LinkedHashSet linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.b).values());
        }
        return linkedHashSet;
    }

    public Pair H(int i, se8 se8) {
        se8 se82;
        nf8 nf8 = (nf8) this.a;
        se8 se83 = null;
        if (se8 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= nf8.c.size()) {
                    se82 = null;
                    break;
                } else if (((se8) nf8.c.get(i2)).d == se8.d) {
                    Object obj = nf8.b;
                    int i3 = uza.n;
                    se82 = se8.a(Pair.create(obj, se8.a));
                    break;
                } else {
                    i2++;
                }
            }
            if (se82 == null) {
                return null;
            }
            se83 = se82;
        }
        return Pair.create(Integer.valueOf(i + nf8.d), se83);
    }

    public synchronized Map I() {
        try {
            if (((Map) this.b) == null) {
                this.b = Collections.unmodifiableMap(new HashMap((HashMap) this.a));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (Map) this.b;
    }

    public void J(JSONObject jSONObject) {
        fv6 fv6;
        e3 e3Var = (e3) this.b;
        e3Var.getClass();
        try {
            fv6 = new fv6(x87.J(jSONObject), jSONObject.getString("message"), jSONObject.getBoolean("direct"));
        } catch (JSONException e) {
            ((xwb) e3Var.a).logException("ChatParser", "Can't parse chat message", e);
            fv6 = null;
        }
        if (fv6 != null) {
            ((na2) this.a).onNewMessage(fv6);
        }
    }

    public void K(zd2 zd2) {
        synchronized (this.a) {
            try {
                zd2.getClass();
                for (String str : new LinkedHashSet((ArrayList) zd2.g)) {
                    ((LinkedHashMap) this.b).put(str, zd2.e(str));
                }
            } catch (CameraUnavailableException e) {
                throw new Exception(e);
            }
        }
    }

    public void L(hhd hhd) {
        ((vb9) this.a).i(hhd);
        boolean z = hhd instanceof zfa;
        b4d b4d = (b4d) this.b;
        if (z) {
            b4d.j((zfa) hhd);
        } else if (hhd instanceof xfa) {
            b4d.k(((xfa) hhd).e);
        }
    }

    public bpe N(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.a;
            if (i2 >= iArr.length) {
                ez3.A("Unmatched track of type: " + i);
                return new qh4();
            } else if (i == iArr[i2]) {
                return ((wjc[]) this.b)[i2];
            } else {
                i2++;
            }
        }
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        ((lr1) this.b).B0.remove((ww1) this.a);
        int t = hr1.t(((lr1) this.b).W0);
        if (!(t == 1 || t == 4)) {
            if (t == 5 || (t == 6 && ((lr1) this.b).z0 != 0)) {
                ((lr1) this.b).toString();
            } else {
                return;
            }
        }
        if (((lr1) this.b).B0.isEmpty()) {
            lr1 lr1 = (lr1) this.b;
            if (lr1.y0 != null) {
                lr1.toString();
                ((lr1) this.b).y0.close();
                ((lr1) this.b).y0 = null;
            }
        }
    }

    public kja b() {
        return new nu7(((aj6) this.a).b(), (List) this.b);
    }

    public void c() {
        byte[] bArr = oze.f;
        ija ija = (ija) this.b;
        ija.getClass();
        ija.E(bArr.length, bArr);
    }

    public pj5 d(long j) {
        Object obj;
        Iterator it = ((Set) ((AtomicReference) ((j54) this.a).X).get()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((zta) obj).a == j) {
                break;
            }
        }
        zta zta = (zta) obj;
        return zta == null ? fw4.a : ez3.P(new ik5(ez3.P(new zi1(((ok3) ((t97) this.b).getValue()).a(), 26), new yn3(zta, j, (Continuation) null)), 2), new zn3(j, (Continuation) null));
    }

    public void e(Throwable th) {
    }

    public void f() {
        ViewParent parent = ((x2a) this.b).getParent();
        ScrollView scrollView = parent instanceof ScrollView ? (ScrollView) parent : null;
        if (scrollView != null) {
            scrollView.post(new b(1, scrollView));
        }
    }

    public void g(int i, se8 se8, yi7 yi7, i78 i78, IOException iOException, boolean z) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new xe8((Object) this, (Object) H, (Object) yi7, (Object) i78, iOException, z, 2));
        }
    }

    public Object h() {
        return (vue) this.a;
    }

    public int i(Object obj) {
        ev3 ev3 = (ev3) obj;
        if (((lr7) this.b).w0) {
            return ev3.f;
        }
        return ((vze) this.a).i(ev3.b.e0());
    }

    public EGLContext j(EGLDisplay eGLDisplay, int i, int[] iArr) {
        EGLContext l = gt0.l((EGLContext) this.a, eGLDisplay, i, iArr);
        ((ArrayList) this.b).add(l);
        return l;
    }

    public il0 k(r74 r74, long j) {
        int f;
        il0 il0;
        r74 r742 = r74;
        long j2 = r742.o;
        int min = (int) Math.min(20000, r742.c - j2);
        ija ija = (ija) this.b;
        ija.D(min);
        r742.r(ija.a, 0, min, false);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (ija.a() >= 4) {
            if (ni5.f(ija.b, ija.a) != 442) {
                ija.H(1);
            } else {
                ija.H(4);
                long e = rib.e(ija);
                if (e != -9223372036854775807L) {
                    long b2 = ((cke) this.a).b(e);
                    if (b2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return new il0(-1, b2, j2);
                        }
                        il0 = new il0(0, -9223372036854775807L, j2 + ((long) i2));
                    } else if (100000 + b2 > j) {
                        il0 = new il0(0, -9223372036854775807L, j2 + ((long) ija.b));
                    } else {
                        i2 = ija.b;
                        j3 = b2;
                    }
                    return il0;
                }
                int i3 = ija.c;
                if (ija.a() >= 10) {
                    ija.H(9);
                    int u = ija.u() & 7;
                    if (ija.a() >= u) {
                        ija.H(u);
                        if (ija.a() >= 4) {
                            if (ni5.f(ija.b, ija.a) == 443) {
                                ija.H(4);
                                int A = ija.A();
                                if (ija.a() < A) {
                                    ija.G(i3);
                                } else {
                                    ija.H(A);
                                }
                            }
                            while (true) {
                                if (ija.a() < 4 || (f = ni5.f(ija.b, ija.a)) == 442 || f == 441 || (f >>> 8) != 1) {
                                    break;
                                }
                                ija.H(4);
                                if (ija.a() < 2) {
                                    ija.G(i3);
                                    break;
                                }
                                ija.G(Math.min(ija.c, ija.b + ija.A()));
                            }
                        } else {
                            ija.G(i3);
                        }
                    } else {
                        ija.G(i3);
                    }
                } else {
                    ija.G(i3);
                }
                i = ija.b;
            }
        }
        return j3 != -9223372036854775807L ? new il0(-2, j3, j2 + ((long) i)) : il0.e;
    }

    public EGLSurface l(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        int[] iArr;
        int[] iArr2 = gt0.f;
        if (i == 3 || i == 10) {
            iArr = gt0.b;
        } else if (i == 7 || i == 6) {
            iArr = gt0.c;
            if (!z) {
                if (i == 6) {
                    if (oze.a < 33 || !gt0.B("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        throw new Exception("BT.2020 PQ OpenGL output isn't supported.");
                    }
                    iArr2 = gt0.d;
                } else if (gt0.B("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                    iArr2 = gt0.e;
                } else {
                    throw new Exception("BT.2020 HLG OpenGL output isn't supported.");
                }
            }
        } else {
            throw new IllegalArgumentException(wn6.h(i, "Unsupported color transfer: "));
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, gt0.y(eGLDisplay, iArr), obj, iArr2, 0);
        gt0.f("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    public kja m(ui6 ui6, mi6 mi6) {
        return new nu7(((aj6) this.a).m(ui6, mi6), (List) this.b);
    }

    public boolean n(CharSequence charSequence, int i, int i2, hte hte) {
        if ((hte.c & 4) > 0) {
            return true;
        }
        if (((vue) this.a) == null) {
            this.a = new vue(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((qr4) this.b).getClass();
        ((vue) this.a).setSpan(new ite(hte), i, i2, 33);
        return true;
    }

    public p96 o(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        gt0.g();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        gt0.g();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        gt0.g();
        return new p96(i, iArr[0], i2, i3);
    }

    public EGLSurface p(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        return gt0.m(eGLContext, eGLDisplay);
    }

    public void q(long j) {
        ((AbstractPickerScreen) this.a).u0().q(j, (yta) null);
    }

    public void r(int i, se8 se8, yi7 yi7, i78 i78) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new jf8(this, H, yi7, i78, 0));
        }
    }

    public void s(int i, se8 se8, Exception exc) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new px4((Object) this, (Object) H, (Object) exc, 19));
        }
    }

    public void t(int i, se8 se8, yi7 yi7, i78 i78) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new jf8(this, H, yi7, i78, 2));
        }
    }

    public void u(int i, se8 se8, int i2) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new wg1((Object) this, (Object) H, i2, 14));
        }
    }

    public void v(EGLDisplay eGLDisplay) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.b;
            if (i < arrayList.size()) {
                gt0.r((EGLContext) arrayList.get(i), eGLDisplay);
                i++;
            } else {
                return;
            }
        }
    }

    public void w() {
        this.a = null;
        this.b = null;
    }

    public void x(int i, se8 se8, yi7 yi7, i78 i78) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new jf8(this, H, yi7, i78, 1));
        }
    }

    public void y(int i, se8 se8) {
        Pair H = H(i, se8);
        if (H != null) {
            ((h8e) ((zd6) ((pf8) this.b).k)).d(new if8(this, H, 0));
        }
    }

    public void z(l24 l24) {
        synchronized (l24) {
        }
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new x50(this, l24, 1));
        }
    }

    public /* synthetic */ otf(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public otf(int i) {
        switch (i) {
            case 9:
                this.a = new Object();
                this.b = new LinkedHashMap();
                new HashSet();
                return;
            case 14:
                this.a = EGL14.EGL_NO_CONTEXT;
                this.b = new ArrayList();
                return;
            case 19:
                this.a = new HashMap();
                return;
            case 25:
                this.a = new yh7();
                this.b = new Object();
                L(aga.R);
                return;
            case 28:
                this.a = new pq3(vhc.f, new hge(whc.h), Integer.valueOf(phc.D0), (Integer) null, 20);
                this.b = new pq3(vhc.b, new hge(whc.e), Integer.valueOf(zhc.t), (Integer) null, 20);
                return;
            default:
                this.a = Choreographer.getInstance();
                this.b = Looper.myLooper();
                return;
        }
    }
}
