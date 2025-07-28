package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.LogPrinter;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import me.leolin.shortcutbadger.BuildConfig;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;

/* renamed from: w4g  reason: default package */
public final class w4g implements mp, yk, m96, n96, Provider, yx4, i36, CapturerObserver, i28 {
    public static w4g X;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ w4g(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public static Object[] c(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        LogPrinter logPrinter = dc6.A0;
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i + 1);
        for (int i2 = 0; i2 < length; i2++) {
            objArr2[iArr[i2]] = objArr[i2];
        }
        return objArr2;
    }

    public static final SharedPreferences y(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void z(Context context) {
        SharedPreferences y = y(context);
        if (!y.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                "Failed to store app set ID last used time for App ".concat(valueOf);
            }
            throw new Exception("Failed to store the app set ID last used time.");
        }
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        ((e3b) this.o).e = null;
    }

    public void b(long j, int i, int i2, int i3) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    public void d(int i, long j) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, j);
    }

    public void e(Throwable th) {
        ((e3b) this.o).e = null;
        List<ps1> list = (List) this.b;
        if (!list.isEmpty()) {
            for (ps1 s : list) {
                ((fu1) this.c).s(s);
            }
            list.clear();
        }
    }

    public int f() {
        return ((MediaCodec) this.b).dequeueInputBuffer(0);
    }

    public void flush() {
        ((MediaCodec) this.b).flush();
    }

    public int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.b;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && mze.a < 21) {
                this.o = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public Object get() {
        return new ew3((Context) ((Provider) this.b).get(), (eye) ((Provider) this.c).get(), (eye) ((Provider) this.o).get());
    }

    public h67 getFailParser() {
        return (h67) this.o;
    }

    public ByteBuffer getInputBuffer(int i) {
        return mze.a >= 21 ? ((MediaCodec) this.b).getInputBuffer(i) : ((ByteBuffer[]) this.c)[i];
    }

    public h67 getOkParser() {
        return (h67) this.c;
    }

    public ByteBuffer getOutputBuffer(int i) {
        return mze.a >= 21 ? ((MediaCodec) this.b).getOutputBuffer(i) : ((ByteBuffer[]) this.o)[i];
    }

    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.b).getOutputFormat();
    }

    public int getPriority() {
        return ((fl) this.b).getPriority();
    }

    public kl getScope() {
        return ((fl) this.b).getScope();
    }

    public Uri getUri() {
        return ((fl) this.b).getUri();
    }

    public void h(int i) {
        ((MediaCodec) this.b).setVideoScalingMode(i);
    }

    public synchronized void i() {
        ((ope) this.c).i();
    }

    public void j(Surface surface) {
        ((MediaCodec) this.b).setOutputSurface(surface);
    }

    public void k(p96 p96) {
        ((ew0) this.o).v(new my1(this, 0, p96));
    }

    public void l(int i, nw3 nw3, long j) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) nw3.i, j, 0);
    }

    public synchronized void m() {
        ((ope) this.c).S();
    }

    public void n(i38 i38, Handler handler) {
        ((MediaCodec) this.b).setOnFrameRenderedListener(new bx(this, i38, 2), handler);
    }

    public boolean o(int i) {
        return ((yx4) this.b).o(i) && t(i) != null;
    }

    public void onCapturerStarted(boolean z) {
        if (z) {
            ((gx0) ((ygd) this.c).a).Z0.log("OKRTCCall", "Screen capture has started, fast=true");
        }
    }

    public void onCapturerStopped() {
        ((ygd) this.c).e(true);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        if (videoFrame != null) {
            ((ufc) this.b).getClass();
        } else {
            videoFrame = null;
        }
        CapturerObserver capturerObserver = (CapturerObserver) this.o;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    public synchronized void p() {
        ((ope) this.c).p();
        o96 o96 = (o96) this.b;
        Objects.requireNonNull(o96);
        ((ew0) this.o).v(new ny1(o96, 0));
    }

    public void q(e8c e8c, p96 p96) {
        w4g w4g = this;
        e8c e8c2 = e8c;
        p96 p962 = p96;
        if (((k96) w4g.o) == null) {
            try {
                k96 k96 = new k96((Context) w4g.b, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_alpha_scale_es2.glsl");
                w4g.o = k96;
                k96.n(new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f});
                ((k96) w4g.o).p("uTexTransformationMatrix", gt0.k());
            } catch (IOException e) {
                throw new Exception(e);
            }
        }
        int i = p962.b;
        int i2 = p962.c;
        int i3 = p962.d;
        gt0.t(i, i2, i3);
        gjd gjd = new gjd(i2, i3);
        hi2 hi2 = (hi2) w4g.c;
        hi2.j = gjd;
        gt0.j();
        k96 k962 = (k96) w4g.o;
        k962.getClass();
        k962.w();
        int i4 = 3042;
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        gt0.g();
        int i5 = e8c2.o - 1;
        while (i5 >= 0) {
            hc4 hc4 = (hc4) e8c2.get(i5);
            k96 k963 = (k96) w4g.o;
            k963.getClass();
            p96 p963 = hc4.b;
            k963.u(p963.a, 0, "uTexSampler");
            gjd gjd2 = new gjd(p963.c, p963.d);
            float[] fArr = (float[]) hi2.b;
            Matrix.setIdentityM(fArr, 0);
            float[] fArr2 = (float[]) hi2.a;
            Matrix.setIdentityM(fArr2, 0);
            float[] fArr3 = (float[]) hi2.e;
            Matrix.setIdentityM(fArr3, 0);
            float[] fArr4 = (float[]) hi2.c;
            Matrix.setIdentityM(fArr4, 0);
            float[] fArr5 = (float[]) hi2.d;
            Matrix.setIdentityM(fArr5, 0);
            Matrix.setIdentityM((float[]) hi2.f, 0);
            float[] fArr6 = (float[]) hi2.g;
            Matrix.setIdentityM(fArr6, 0);
            float[] fArr7 = (float[]) hi2.h;
            Matrix.setIdentityM(fArr7, 0);
            float[] fArr8 = (float[]) hi2.i;
            Matrix.setIdentityM(fArr8, 0);
            jj7 jj7 = hc4.d;
            Pair pair = (Pair) jj7.a;
            Matrix.translateM(fArr2, 0, ((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), 0.0f);
            oyb.l((gjd) hi2.j);
            float f = (float) gjd2.a;
            gjd gjd3 = (gjd) hi2.j;
            float f2 = (float) gjd2.b;
            Matrix.scaleM(fArr, 0, f / ((float) gjd3.a), f2 / ((float) gjd3.b), 1.0f);
            Pair pair2 = (Pair) jj7.c;
            Matrix.scaleM(fArr4, 0, ((Float) pair2.first).floatValue(), ((Float) pair2.second).floatValue(), 1.0f);
            Matrix.invertM(fArr5, 0, fArr4, 0);
            Pair pair3 = (Pair) jj7.b;
            Matrix.translateM(fArr3, 0, ((Float) pair3.first).floatValue() * -1.0f, ((Float) pair3.second).floatValue() * -1.0f, 0.0f);
            Matrix.rotateM((float[]) hi2.f, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            Matrix.scaleM(fArr6, 0, f2 / f, 1.0f, 1.0f);
            Matrix.invertM(fArr7, 0, fArr6, 0);
            float[] fArr9 = (float[]) hi2.i;
            Matrix.multiplyMM(fArr9, 0, fArr9, 0, (float[]) hi2.a, 0);
            float[] fArr10 = (float[]) hi2.i;
            Matrix.multiplyMM(fArr10, 0, fArr10, 0, (float[]) hi2.b, 0);
            float[] fArr11 = (float[]) hi2.i;
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, (float[]) hi2.c, 0);
            float[] fArr12 = (float[]) hi2.i;
            Matrix.multiplyMM(fArr12, 0, fArr12, 0, (float[]) hi2.e, 0);
            float[] fArr13 = (float[]) hi2.i;
            Matrix.multiplyMM(fArr13, 0, fArr13, 0, (float[]) hi2.d, 0);
            float[] fArr14 = (float[]) hi2.i;
            Matrix.multiplyMM(fArr14, 0, fArr14, 0, (float[]) hi2.g, 0);
            float[] fArr15 = (float[]) hi2.i;
            Matrix.multiplyMM(fArr15, 0, fArr15, 0, (float[]) hi2.f, 0);
            float[] fArr16 = (float[]) hi2.i;
            Matrix.multiplyMM(fArr16, 0, fArr16, 0, (float[]) hi2.h, 0);
            float[] fArr17 = (float[]) hi2.i;
            Matrix.multiplyMM(fArr17, 0, fArr17, 0, (float[]) hi2.c, 0);
            k963.p("uTransformationMatrix", fArr8);
            k963.o("uAlphaScale", 1.0f);
            k963.h();
            GLES20.glDrawArrays(5, 0, 4);
            gt0.g();
            e8c2 = e8c;
            i5--;
            i4 = 3042;
            w4g = this;
        }
        GLES20.glDisable(i4);
        gt0.g();
    }

    public zx4 r(int i) {
        return t(i);
    }

    public void release() {
        this.c = null;
        this.o = null;
        ((MediaCodec) this.b).release();
    }

    public void releaseOutputBuffer(int i, boolean z) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, z);
    }

    public synchronized void s(p96 p96, long j) {
        ((ope) this.c).Q(p96, j);
    }

    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    public boolean shouldGzip() {
        return ((fl) this.b).shouldGzip();
    }

    public boolean shouldPost() {
        return ((fl) this.b).shouldPost();
    }

    public zx4 t(int i) {
        HashMap hashMap = (HashMap) this.o;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return (zx4) hashMap.get(Integer.valueOf(i));
        }
        yx4 yx4 = (yx4) this.b;
        f90 f90 = null;
        if (yx4.o(i)) {
            zx4 r = yx4.r(i);
            if (r != null) {
                ArrayList arrayList = new ArrayList();
                for (g90 g90 : r.d()) {
                    if (cr4.a(g90, (zq4) this.c)) {
                        arrayList.add(g90);
                    }
                }
                if (!arrayList.isEmpty()) {
                    f90 = f90.e(r.a(), r.b(), r.c(), arrayList);
                }
            }
            hashMap.put(Integer.valueOf(i), f90);
        }
        return f90;
    }

    public String toString() {
        switch (this.a) {
            case 10:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                nu7 nu7 = (nu7) ((nu7) this.c).b;
                String str = BuildConfig.FLAVOR;
                while (nu7 != null) {
                    Object obj = nu7.a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    nu7 = (nu7) nu7.b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        r3 = (defpackage.alc) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4 = r3.b(r5.a(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r4 = r3.a(r5.a());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0086 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.uaf u(defpackage.xy2 r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            bbf r0 = (defpackage.bbf) r0
            java.util.LinkedHashMap r1 = r0.a
            java.lang.Object r1 = r1.get(r6)
            uaf r1 = (defpackage.uaf) r1
            java.util.Map r2 = defpackage.xy2.b
            java.lang.Class r3 = r5.a
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0021
            int r2 = r2.intValue()
            boolean r2 = defpackage.ete.N(r2, r1)
            goto L_0x0033
        L_0x0021:
            boolean r2 = r3.isPrimitive()
            if (r2 == 0) goto L_0x002f
            xy2 r2 = defpackage.m7c.a(r3)
            java.lang.Class r3 = defpackage.mt0.p(r2)
        L_0x002f:
            boolean r2 = r3.isInstance(r1)
        L_0x0033:
            java.lang.Object r3 = r4.c
            zaf r3 = (defpackage.zaf) r3
            if (r2 == 0) goto L_0x0073
            boolean r4 = r3 instanceof defpackage.alc
            if (r4 == 0) goto L_0x0072
            alc r3 = (defpackage.alc) r3
            pc7 r4 = r3.d
            if (r4 == 0) goto L_0x0072
            mm r5 = r3.e
            java.lang.String r6 = "androidx.lifecycle.savedstate.vm.tag"
            java.lang.AutoCloseable r6 = r1.c(r6)
            ukc r6 = (defpackage.ukc) r6
            if (r6 == 0) goto L_0x0072
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x0072
            r6.a(r5, r4)
            ob7 r6 = r4.d
            ob7 r0 = defpackage.ob7.b
            if (r6 == r0) goto L_0x006f
            ob7 r0 = defpackage.ob7.o
            boolean r6 = r6.a(r0)
            if (r6 == 0) goto L_0x0065
            goto L_0x006f
        L_0x0065:
            z84 r6 = new z84
            r0 = 3
            r6.<init>(r4, r0, r5)
            r4.a(r6)
            goto L_0x0072
        L_0x006f:
            r5.g()
        L_0x0072:
            return r1
        L_0x0073:
            pb9 r1 = new pb9
            java.lang.Object r4 = r4.o
            hw3 r4 = (defpackage.hw3) r4
            r1.<init>((defpackage.hw3) r4)
            dr9 r4 = dr9.X
            r1.a(r4, r6)
            uaf r4 = r3.c(r5, r1)     // Catch:{ AbstractMethodError -> 0x0086 }
            goto L_0x0097
        L_0x0086:
            java.lang.Class r4 = r5.a()     // Catch:{ AbstractMethodError -> 0x008f }
            uaf r4 = r3.b(r4, r1)     // Catch:{ AbstractMethodError -> 0x008f }
            goto L_0x0097
        L_0x008f:
            java.lang.Class r4 = r5.a()
            uaf r4 = r3.a(r4)
        L_0x0097:
            java.util.LinkedHashMap r5 = r0.a
            java.lang.Object r5 = r5.put(r6, r4)
            uaf r5 = (defpackage.uaf) r5
            if (r5 == 0) goto L_0x00a4
            r5.b()
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4g.u(xy2, java.lang.String):uaf");
    }

    public boolean v(int i, ff3 ff3, ghb ghb) {
        int[] iArr = ff3.p0;
        int i2 = iArr[0];
        sj0 sj0 = (sj0) this.c;
        sj0.b = i2;
        sj0.d = iArr[1];
        sj0.e = ff3.q();
        sj0.f = ff3.k();
        sj0.k = false;
        sj0.j = i;
        boolean z = sj0.b == 3;
        boolean z2 = sj0.d == 3;
        boolean z3 = z && ff3.W > 0.0f;
        boolean z4 = z2 && ff3.W > 0.0f;
        int[] iArr2 = ff3.t;
        if (z3 && iArr2[0] == 4) {
            sj0.b = 1;
        }
        if (z4 && iArr2[1] == 4) {
            sj0.d = 1;
        }
        ghb.c(ff3, sj0);
        ff3.O(sj0.g);
        ff3.L(sj0.h);
        ff3.E = sj0.c;
        ff3.I(sj0.i);
        sj0.j = 0;
        return sj0.k;
    }

    public void w(gf3 gf3, int i, int i2, int i3) {
        int i4 = gf3.b0;
        int i5 = gf3.c0;
        gf3.b0 = 0;
        gf3.c0 = 0;
        gf3.O(i2);
        gf3.L(i3);
        if (i4 < 0) {
            gf3.b0 = 0;
        } else {
            gf3.b0 = i4;
        }
        if (i5 < 0) {
            gf3.c0 = 0;
        } else {
            gf3.c0 = i5;
        }
        gf3 gf32 = (gf3) this.o;
        gf32.t0 = i;
        gf32.U();
    }

    public boolean willWriteParams() {
        return ((fl) this.b).willWriteParams();
    }

    public boolean willWriteSupplyParams() {
        return ((fl) this.b).willWriteSupplyParams();
    }

    public void writeParams(t67 t67) {
        ((fl) this.b).writeParams(t67);
    }

    public void writeSupplyParams(t67 t67) {
        ((fl) this.b).writeSupplyParams(t67);
    }

    public void x(gf3 gf3) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = gf3.q0.size();
        for (int i = 0; i < size; i++) {
            ff3 ff3 = (ff3) gf3.q0.get(i);
            int[] iArr = ff3.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(ff3);
            }
        }
        gf3.s0.a = true;
    }

    public w4g(int i) {
        this.a = i;
        switch (i) {
            case 18:
                this.b = Collections.emptyList();
                this.c = Collections.emptyList();
                return;
            default:
                this.b = new Object();
                this.c = new ygd();
                this.o = new Object();
                return;
        }
    }

    public w4g(xwb xwb, axb axb) {
        this.a = 3;
        this.b = xwb;
        this.c = axb;
        this.o = new Object();
    }

    public w4g(ufc ufc, ygd ygd) {
        this.a = 13;
        this.b = ufc;
        this.c = ygd;
    }

    public w4g(Context context, int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = context;
                this.c = new hi2();
                return;
            default:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.c = newSingleThreadScheduledExecutor;
                this.o = Executors.newSingleThreadExecutor();
                this.b = context;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(new lde(19, (Object) this), 0, 86400, TimeUnit.SECONDS);
                return;
        }
    }

    public w4g(Context context, String str) {
        this.a = 16;
        this.b = context;
        this.c = str;
        this.o = new r7e(new ke(12, (Object) this));
    }

    public w4g(ea6 ea6) {
        this.a = 5;
        gf6 gf6 = a06.g;
        ns7 ns7 = n06.d;
        this.b = ea6;
        this.c = gf6;
        this.o = ns7;
    }

    public w4g(fl flVar, h67 h67) {
        this.a = 1;
        oa2 oa2 = oa2.a;
        this.b = flVar;
        this.c = h67;
        this.o = oa2;
    }

    public w4g(yx4 yx4, zq4 zq4) {
        this.a = 7;
        this.o = new HashMap();
        this.b = yx4;
        this.c = zq4;
    }

    public w4g(sv7 sv7, View view) {
        Object obj;
        this.a = 9;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            obj = new Object();
        } else {
            obj = i >= 33 ? new Object() : null;
        }
        this.b = obj;
        this.c = sv7;
        this.o = view;
    }

    public w4g(h96 h96, o96 o96, o96 o962, ew0 ew0) {
        this.a = 4;
        this.b = o96;
        this.c = new ope(h96, o962, ew0);
        this.o = ew0;
    }

    public w4g(gf3 gf3) {
        this.a = 2;
        this.b = new ArrayList();
        this.c = new sj0(0);
        this.o = gf3;
    }

    public w4g(MediaCodec mediaCodec) {
        this.a = 15;
        this.b = mediaCodec;
        if (mze.a < 21) {
            this.c = mediaCodec.getInputBuffers();
            this.o = mediaCodec.getOutputBuffers();
        }
    }

    public w4g(e3b e3b, ArrayList arrayList, fu1 fu1) {
        this.a = 12;
        this.o = e3b;
        this.b = arrayList;
        this.c = fu1;
    }

    public w4g(String str) {
        this.a = 10;
        Object obj = new Object();
        this.c = obj;
        this.o = obj;
        this.b = str;
    }

    public w4g(Object[] objArr, Object[] objArr2) {
        this.a = 8;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i] = num.intValue();
        }
        this.b = iArr;
        this.c = c(objArr, iArr);
        this.o = c(objArr2, iArr);
    }
}
