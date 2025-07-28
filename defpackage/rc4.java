package defpackage;

import android.content.Context;
import android.opengl.EGLDisplay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: rc4  reason: default package */
public final class rc4 implements m4f {
    public static final /* synthetic */ int s = 0;
    public final Context a;
    public final h96 b;
    public final EGLDisplay c;
    public final ny6 d;
    public final ew0 e;
    public final l4f f;
    public final Executor g;
    public final boolean h;
    public final tg5 i;
    public final ArrayList j;
    public final ga3 k;
    public jn l;
    public boolean m;
    public final ArrayList n = new ArrayList();
    public final Object o = new Object();
    public final z23 p;
    public volatile bz5 q;
    public volatile boolean r;

    static {
        g78.a("media3.effect");
    }

    public rc4(Context context, h96 h96, EGLDisplay eGLDisplay, ny6 ny6, ew0 ew0, l4f l4f, Executor executor, tg5 tg5, boolean z, z23 z23) {
        this.a = context;
        this.b = h96;
        this.c = eGLDisplay;
        this.d = ny6;
        this.e = ew0;
        this.f = l4f;
        this.g = executor;
        this.h = z;
        this.p = z23;
        this.i = tg5;
        this.j = new ArrayList();
        ga3 ga3 = new ga3(false, 1);
        this.k = ga3;
        ga3.g();
        tg5.A = new nc4(this, executor, l4f, ew0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: ms6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: ms6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: ts6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: ts6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: ms6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: ms6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: ts6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: ts6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: ms6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: ms6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: ms6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: ms6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: ts6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: ts6} */
    /* JADX WARNING: type inference failed for: r0v8, types: [xp0, java.lang.Object, n96] */
    /* JADX WARNING: type inference failed for: r12v12, types: [ms6, ts6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.jn r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            r3 = 1
            java.lang.Object r4 = r1.o
            bz5 r4 = (defpackage.bz5) r4
            z23 r4 = r4.a
            boolean r5 = defpackage.z23.g(r4)
            r6 = 6
            if (r5 == 0) goto L_0x001d
            int r5 = r4.a
            if (r5 != r6) goto L_0x0019
            r5 = r3
            goto L_0x001a
        L_0x0019:
            r5 = r2
        L_0x001a:
            defpackage.oyb.d(r5)
        L_0x001d:
            boolean r5 = defpackage.z23.g(r4)
            z23 r7 = r0.p
            if (r5 != 0) goto L_0x002b
            boolean r5 = defpackage.z23.g(r7)
            if (r5 == 0) goto L_0x0046
        L_0x002b:
            int[] r5 = new int[r3]     // Catch:{ GlUtil$GlException -> 0x03c1 }
            android.opengl.EGLDisplay r8 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch:{ GlUtil$GlException -> 0x03c1 }
            android.opengl.EGLContext r9 = android.opengl.EGL14.eglGetCurrentContext()     // Catch:{ GlUtil$GlException -> 0x03c1 }
            r10 = 12440(0x3098, float:1.7432E-41)
            android.opengl.EGL14.eglQueryContext(r8, r9, r10, r5, r2)     // Catch:{ GlUtil$GlException -> 0x03c1 }
            defpackage.gt0.g()     // Catch:{ GlUtil$GlException -> 0x03c1 }
            r5 = r5[r2]     // Catch:{ GlUtil$GlException -> 0x03c1 }
            long r8 = (long) r5
            r10 = 3
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x03b9
        L_0x0046:
            boolean r5 = r4.e()
            defpackage.oyb.d(r5)
            int r5 = r4.c
            if (r5 == r3) goto L_0x0053
            r5 = r3
            goto L_0x0054
        L_0x0053:
            r5 = r2
        L_0x0054:
            defpackage.oyb.d(r5)
            boolean r5 = r7.e()
            defpackage.oyb.d(r5)
            int r5 = r7.c
            if (r5 == r3) goto L_0x0064
            r8 = r3
            goto L_0x0065
        L_0x0064:
            r8 = r2
        L_0x0065:
            defpackage.oyb.d(r8)
            boolean r8 = defpackage.z23.g(r4)
            boolean r9 = defpackage.z23.g(r7)
            r10 = 3
            if (r8 == r9) goto L_0x009e
            int r8 = r4.a
            int r9 = r7.a
            if (r8 != r6) goto L_0x0088
            if (r9 == r6) goto L_0x0088
            boolean r8 = defpackage.z23.g(r4)
            if (r8 == 0) goto L_0x0088
            r8 = 10
            if (r5 == r8) goto L_0x0098
            if (r5 != r10) goto L_0x0088
            goto L_0x0098
        L_0x0088:
            z23 r5 = defpackage.z23.i
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x009a
            if (r9 != r6) goto L_0x009a
            boolean r4 = defpackage.z23.g(r7)
            if (r4 == 0) goto L_0x009a
        L_0x0098:
            r4 = r3
            goto L_0x009b
        L_0x009a:
            r4 = r2
        L_0x009b:
            defpackage.oyb.d(r4)
        L_0x009e:
            java.util.ArrayList r4 = r0.n
            java.util.concurrent.Executor r5 = r0.g
            ny6 r8 = r0.d
            java.lang.Object r9 = r1.c
            java.util.List r9 = (java.util.List) r9
            if (r21 != 0) goto L_0x00b0
            boolean r11 = r4.equals(r9)
            if (r11 != 0) goto L_0x01b7
        L_0x00b0:
            java.util.ArrayList r11 = r0.j
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x00cd
            r12 = r2
        L_0x00b9:
            int r13 = r11.size()
            if (r12 >= r13) goto L_0x00ca
            java.lang.Object r13 = r11.get(r12)
            o96 r13 = (defpackage.o96) r13
            r13.release()
            int r12 = r12 + r3
            goto L_0x00b9
        L_0x00ca:
            r11.clear()
        L_0x00cd:
            ts6 r12 = new ts6
            r13 = 4
            r12.<init>(r13)
            ts6 r14 = new ts6
            r14.<init>(r13)
            ts6 r15 = new ts6
            r15.<init>(r13)
            r6 = r2
        L_0x00de:
            int r10 = r9.size()
            if (r6 >= r10) goto L_0x0149
            java.lang.Object r10 = r9.get(r6)
            uw7 r10 = (defpackage.uw7) r10
            boolean r2 = r10 instanceof defpackage.uw7
            java.lang.String r3 = "DefaultVideoFrameProcessor only supports GlEffects"
            defpackage.oyb.c(r3, r2)
            boolean r2 = r10 instanceof defpackage.uw7
            if (r2 == 0) goto L_0x00ff
            uw7 r10 = (defpackage.uw7) r10
            r14.a(r10)
            r17 = r7
            r2 = r13
        L_0x00fd:
            r3 = 1
            goto L_0x0143
        L_0x00ff:
            e8c r2 = r14.j()
            e8c r3 = r15.j()
            boolean r13 = defpackage.z23.g(r7)
            boolean r16 = r2.isEmpty()
            r17 = r7
            android.content.Context r7 = r0.a
            if (r16 == 0) goto L_0x011e
            boolean r16 = r3.isEmpty()
            if (r16 != 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r2 = 4
            goto L_0x0130
        L_0x011e:
            na4 r2 = defpackage.na4.h(r7, r2, r3, r13)
            r12.a(r2)
            ts6 r14 = new ts6
            r2 = 4
            r14.<init>(r2)
            ts6 r15 = new ts6
            r15.<init>(r2)
        L_0x0130:
            uw7 r10 = (defpackage.uw7) r10
            r10.getClass()
            e8c r3 = defpackage.ws6.n(r10)
            e8c r10 = defpackage.e8c.X
            na4 r3 = defpackage.na4.h(r7, r3, r10, r13)
            r12.a(r3)
            goto L_0x00fd
        L_0x0143:
            int r6 = r6 + r3
            r13 = r2
            r7 = r17
            r2 = 0
            goto L_0x00de
        L_0x0149:
            e8c r2 = r14.j()
            e8c r3 = r15.j()
            tg5 r6 = r0.i
            java.util.ArrayList r7 = r6.b
            r7.clear()
            r7.addAll(r2)
            java.util.ArrayList r2 = r6.c
            r2.clear()
            r2.addAll(r3)
            r2 = 1
            r6.B = r2
            e8c r2 = r12.j()
            r11.addAll(r2)
            java.lang.Object r2 = defpackage.gwf.s(r11, r6)
            o96 r2 = (defpackage.o96) r2
            r8.j = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r11)
            r2.add(r6)
            r3 = 0
        L_0x017e:
            int r6 = r2.size()
            r7 = 1
            int r6 = r6 - r7
            if (r3 >= r6) goto L_0x01b1
            java.lang.Object r6 = r2.get(r3)
            o96 r6 = (defpackage.o96) r6
            int r3 = r3 + r7
            java.lang.Object r7 = r2.get(r3)
            o96 r7 = (defpackage.o96) r7
            w4g r10 = new w4g
            h96 r11 = r0.b
            ew0 r12 = r0.e
            r10.<init>((defpackage.h96) r11, (defpackage.o96) r6, (defpackage.o96) r7, (defpackage.ew0) r12)
            r6.f(r10)
            l4f r11 = r0.f
            java.util.Objects.requireNonNull(r11)
            kc4 r12 = new kc4
            r13 = 0
            r12.<init>(r11, r13)
            r6.e(r5, r12)
            r7.g(r10)
            goto L_0x017e
        L_0x01b1:
            r4.clear()
            r4.addAll(r9)
        L_0x01b7:
            o96 r2 = r8.j
            defpackage.oyb.l(r2)
            android.util.SparseArray r2 = r8.g
            int r3 = r1.b
            boolean r4 = defpackage.oze.l(r2, r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Input type not registered: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            defpackage.oyb.j(r6, r4)
            r13 = 0
        L_0x01d6:
            int r4 = r2.size()
            java.lang.Object r6 = r1.o
            bz5 r6 = (defpackage.bz5) r6
            if (r13 >= r4) goto L_0x0399
            int r4 = r2.keyAt(r13)
            java.lang.Object r7 = r2.get(r4)
            my6 r7 = (defpackage.my6) r7
            if (r4 != r3) goto L_0x037f
            z23 r4 = r7.c
            v2 r9 = r7.a
            if (r4 == 0) goto L_0x0202
            z23 r10 = r6.a
            boolean r4 = r10.equals(r4)
            if (r4 != 0) goto L_0x01fb
            goto L_0x0202
        L_0x01fb:
            r16 = r2
            r18 = r5
            r5 = 6
            goto L_0x0346
        L_0x0202:
            z23 r4 = r6.a
            java.lang.String r10 = "uApplyHdrToSdrToneMapping"
            java.lang.String r11 = "uInputColorTransfer"
            java.lang.String r12 = "shaders/vertex_shader_transformation_es3.glsl"
            java.lang.String r14 = "shaders/vertex_shader_transformation_es2.glsl"
            int r15 = r8.h
            r16 = r2
            z23 r2 = r8.b
            r21 = r12
            android.content.Context r12 = r8.a
            r17 = r14
            r14 = 2
            r18 = r5
            r5 = 1
            if (r3 == r5) goto L_0x02a5
            if (r3 == r14) goto L_0x0230
            r5 = 3
            if (r3 != r5) goto L_0x0224
            goto L_0x0230
        L_0x0224:
            androidx.media3.common.VideoFrameProcessingException r0 = new androidx.media3.common.VideoFrameProcessingException
            java.lang.String r1 = "Unsupported input type "
            java.lang.String r1 = wn6.h(r3, r1)
            r0.<init>(r1)
            throw r0
        L_0x0230:
            e8c r5 = defpackage.na4.v
            int r5 = r4.c
            if (r5 != r14) goto L_0x023b
            if (r3 != r14) goto L_0x0239
            goto L_0x023b
        L_0x0239:
            r5 = 0
            goto L_0x023c
        L_0x023b:
            r5 = 1
        L_0x023c:
            defpackage.oyb.k(r5)
            boolean r5 = defpackage.z23.g(r4)
            if (r3 != r14) goto L_0x024c
            int r14 = r2.a
            r1 = 6
            if (r14 != r1) goto L_0x024c
            r1 = 1
            goto L_0x024d
        L_0x024c:
            r1 = 0
        L_0x024d:
            if (r5 != 0) goto L_0x0255
            if (r1 == 0) goto L_0x0252
            goto L_0x0255
        L_0x0252:
            r14 = r17
            goto L_0x0257
        L_0x0255:
            r14 = r21
        L_0x0257:
            if (r1 == 0) goto L_0x025e
            java.lang.String r17 = "shaders/fragment_shader_transformation_ultra_hdr_es3.glsl"
        L_0x025b:
            r0 = r17
            goto L_0x0266
        L_0x025e:
            if (r5 == 0) goto L_0x0263
            java.lang.String r17 = "shaders/fragment_shader_transformation_hdr_internal_es3.glsl"
            goto L_0x025b
        L_0x0263:
            java.lang.String r17 = "shaders/fragment_shader_transformation_sdr_internal_es2.glsl"
            goto L_0x025b
        L_0x0266:
            k96 r0 = defpackage.na4.j(r12, r14, r0)
            if (r1 != 0) goto L_0x0282
            int r1 = r4.c
            if (r5 != 0) goto L_0x0279
            r12 = 2
            if (r1 == r12) goto L_0x0279
            r14 = 3
            if (r1 != r14) goto L_0x0277
            goto L_0x027a
        L_0x0277:
            r12 = 0
            goto L_0x027b
        L_0x0279:
            r14 = 3
        L_0x027a:
            r12 = 1
        L_0x027b:
            defpackage.oyb.d(r12)
            r0.t(r1, r11)
            goto L_0x0283
        L_0x0282:
            r14 = 3
        L_0x0283:
            if (r5 == 0) goto L_0x0290
            int r1 = r2.a
            r5 = 6
            if (r1 == r5) goto L_0x028c
            r1 = 1
            goto L_0x028d
        L_0x028c:
            r1 = 0
        L_0x028d:
            r0.t(r1, r10)
        L_0x0290:
            e8c r1 = defpackage.e8c.X
            r5 = 2
            if (r3 != r5) goto L_0x029e
            ma4 r1 = new ma4
            r1.<init>()
            e8c r1 = defpackage.ws6.n(r1)
        L_0x029e:
            na4 r0 = defpackage.na4.k(r0, r4, r2, r15, r1)
            r5 = 6
            goto L_0x0329
        L_0x02a5:
            r14 = 3
            e8c r0 = defpackage.na4.v
            boolean r0 = defpackage.z23.g(r4)
            if (r0 == 0) goto L_0x02b1
            r1 = r21
            goto L_0x02b3
        L_0x02b1:
            r1 = r17
        L_0x02b3:
            if (r0 == 0) goto L_0x02b8
            java.lang.String r5 = "shaders/fragment_shader_transformation_external_yuv_es3.glsl"
            goto L_0x02ba
        L_0x02b8:
            java.lang.String r5 = "shaders/fragment_shader_transformation_sdr_external_es2.glsl"
        L_0x02ba:
            k96 r1 = defpackage.na4.j(r12, r1, r5)
            if (r0 == 0) goto L_0x031e
            android.opengl.EGLContext r0 = android.opengl.EGL14.eglGetCurrentContext()
            android.opengl.EGLContext r5 = android.opengl.EGL14.EGL_NO_CONTEXT
            boolean r0 = defpackage.oze.a(r0, r5)
            if (r0 == 0) goto L_0x02e6
            android.opengl.EGLDisplay r0 = defpackage.gt0.x()     // Catch:{ GlUtil$GlException -> 0x0316 }
            android.opengl.EGLContext r12 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ GlUtil$GlException -> 0x0316 }
            int[] r14 = defpackage.gt0.b     // Catch:{ GlUtil$GlException -> 0x0316 }
            r5 = 2
            android.opengl.EGLContext r5 = defpackage.gt0.l(r12, r0, r5, r14)     // Catch:{ GlUtil$GlException -> 0x0316 }
            defpackage.gt0.m(r5, r0)     // Catch:{ GlUtil$GlException -> 0x0316 }
            r12 = 7939(0x1f03, float:1.1125E-41)
            java.lang.String r12 = android.opengl.GLES20.glGetString(r12)     // Catch:{ GlUtil$GlException -> 0x0316 }
            defpackage.gt0.r(r5, r0)     // Catch:{ GlUtil$GlException -> 0x0316 }
            goto L_0x02ec
        L_0x02e6:
            r0 = 7939(0x1f03, float:1.1125E-41)
            java.lang.String r12 = android.opengl.GLES20.glGetString(r0)
        L_0x02ec:
            if (r12 == 0) goto L_0x0316
            java.lang.String r0 = "GL_EXT_YUV_target"
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x0316
            int r0 = r4.b
            r5 = 1
            if (r0 != r5) goto L_0x02fe
            float[] r0 = defpackage.na4.w
            goto L_0x0300
        L_0x02fe:
            float[] r0 = defpackage.na4.x
        L_0x0300:
            java.lang.String r5 = "uYuvToRgbColorTransform"
            r1.p(r5, r0)
            int r0 = r4.c
            r1.t(r0, r11)
            int r0 = r2.a
            r5 = 6
            if (r0 == r5) goto L_0x0311
            r0 = 1
            goto L_0x0312
        L_0x0311:
            r0 = 0
        L_0x0312:
            r1.t(r0, r10)
            goto L_0x031f
        L_0x0316:
            androidx.media3.common.VideoFrameProcessingException r0 = new androidx.media3.common.VideoFrameProcessingException
            java.lang.String r1 = "The EXT_YUV_target extension is required for HDR editing input."
            r0.<init>(r1)
            throw r0
        L_0x031e:
            r5 = 6
        L_0x031f:
            boolean r0 = r8.i
            r1.b = r0
            e8c r0 = defpackage.e8c.X
            na4 r0 = defpackage.na4.k(r1, r4, r2, r15, r0)
        L_0x0329:
            java.util.concurrent.Executor r1 = r8.f
            r0.e = r1
            l96 r1 = r8.e
            r0.d = r1
            u65 r1 = r7.b
            if (r1 == 0) goto L_0x033a
            na4 r1 = (defpackage.na4) r1
            r1.release()
        L_0x033a:
            r7.b = r0
            r9.y(r0)
            r0.g(r9)
            z23 r0 = r6.a
            r7.c = r0
        L_0x0346:
            xp0 r0 = new xp0
            u65 r1 = r7.b
            r1.getClass()
            o96 r2 = r8.j
            h96 r4 = r8.c
            na4 r1 = (defpackage.na4) r1
            ew0 r6 = r8.d
            r0.<init>()
            w4g r10 = new w4g
            r10.<init>((defpackage.h96) r4, (defpackage.o96) r1, (defpackage.o96) r2, (defpackage.ew0) r6)
            r0.b = r10
            r7.d = r0
            u65 r1 = r7.b
            r1.getClass()
            lh0 r1 = (defpackage.lh0) r1
            r1.c = r0
            xp0 r0 = r7.d
            if (r0 != 0) goto L_0x036f
            goto L_0x0372
        L_0x036f:
            r1 = 1
            r0.a = r1
        L_0x0372:
            o96 r1 = r8.j
            r0.getClass()
            r1.g(r0)
            r8.k = r9
            r0 = 1
            r1 = 0
            goto L_0x038e
        L_0x037f:
            r16 = r2
            r18 = r5
            r5 = 6
            xp0 r0 = r7.d
            if (r0 != 0) goto L_0x038a
            r1 = 0
            goto L_0x038d
        L_0x038a:
            r1 = 0
            r0.a = r1
        L_0x038d:
            r0 = 1
        L_0x038e:
            int r13 = r13 + r0
            r0 = r19
            r1 = r20
            r2 = r16
            r5 = r18
            goto L_0x01d6
        L_0x0399:
            r18 = r5
            v2 r0 = r8.k
            r0.getClass()
            r0.w(r6)
            r0 = r19
            ga3 r1 = r0.k
            r1.g()
            dr1 r1 = new dr1
            r2 = 26
            r3 = r20
            r1.<init>(r0, r2, r3)
            r0 = r18
            r0.execute(r1)
            return
        L_0x03b9:
            androidx.media3.common.VideoFrameProcessingException r0 = new androidx.media3.common.VideoFrameProcessingException
            java.lang.String r1 = "OpenGL ES 3.0 context support is required for HDR input or output."
            r0.<init>(r1)
            throw r0
        L_0x03c1:
            r0 = move-exception
            androidx.media3.common.VideoFrameProcessingException r0 = androidx.media3.common.VideoFrameProcessingException.a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc4.a(jn, boolean):void");
    }

    public final boolean b() {
        oyb.k(!this.r);
        oyb.m(this.q, "registerInputStream must be called before registering input frames");
        if (!this.k.e()) {
            return false;
        }
        v2 v2Var = this.d.k;
        oyb.l(v2Var);
        v2Var.s(this.q);
        return true;
    }

    public final void c(int i2, List list, bz5 bz5) {
        bz5 bz52;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            LinkedHashMap linkedHashMap = b24.a;
            synchronized (b24.class) {
            }
            float f2 = bz5.d;
            if (f2 > 1.0f) {
                bz52 = new bz5(bz5.a, (int) (((float) bz5.b) * f2), bz5.c, 1.0f, bz5.e);
            } else if (f2 < 1.0f) {
                bz52 = new bz5(bz5.a, bz5.b, (int) (((float) bz5.c) / f2), 1.0f, bz5.e);
            } else {
                bz52 = bz5;
            }
            this.q = bz52;
            try {
                this.k.a();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                this.g.execute(new dr1(this, 27, e2));
            }
            synchronized (this.o) {
                try {
                    jn jnVar = new jn(i2, list, bz5);
                    if (!this.m) {
                        this.m = true;
                        this.k.c();
                        this.e.v(new lc4(this, jnVar, 0));
                    } else {
                        this.l = jnVar;
                        this.k.c();
                        v2 v2Var = this.d.k;
                        oyb.l(v2Var);
                        v2Var.z();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException(String.valueOf(i2));
    }

    public final void d() {
        try {
            this.e.t(new mc4(2, this));
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e2);
        }
    }

    public final void e(p4e p4e) {
        tg5 tg5 = this.i;
        tg5.getClass();
        try {
            tg5.i.o(new my1(tg5, 2, p4e));
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            tg5.j.execute(new ii4(tg5, 25, e2));
        }
    }

    public final void f() {
        b24.a();
        oyb.k(!this.r);
        this.r = true;
        v2 v2Var = this.d.k;
        v2Var.getClass();
        v2Var.z();
    }
}
