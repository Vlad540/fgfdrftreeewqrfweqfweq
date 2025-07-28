package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: k96  reason: default package */
public final class k96 implements ns9, bw9 {
    public Object X;
    public Object Y;
    public int a;
    public boolean b;
    public Object c;
    public Object o;

    public k96(Class cls, int i) {
        this.a = i;
        this.o = cls;
        this.X = new Rect();
        this.c = new ArrayList();
        this.Y = new WeakReference((Object) null);
    }

    public static final void a(ucf ucf, View view, ViewTreeObserver viewTreeObserver) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(ucf);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(ucf);
        }
    }

    public static void e(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        }
        gt0.h(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, z);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        gt0.g();
    }

    public void b() {
        boolean z = this.b;
        yv1 yv1 = (yv1) this.c;
        if (!z) {
            int i = this.a;
            if (i == 2) {
                yv1.resumeWith(this.Y);
            } else if (yv1.isActive()) {
                yv1.resumeWith(new kcc(new NoSuchElementException("No value received via onNext for ".concat(us8.t(i)))));
            }
        } else if (yv1.isActive()) {
            yv1.resumeWith(this.X);
        }
    }

    public void c(Object obj) {
        int i = this.a;
        int t = hr1.t(i);
        xi4 xi4 = null;
        yv1 yv1 = (yv1) this.c;
        if (t == 0 || t == 1) {
            if (!this.b) {
                this.b = true;
                yv1.resumeWith(obj);
                xi4 xi42 = (xi4) this.o;
                if (xi42 != null) {
                    xi4 = xi42;
                }
                xi4.f();
            }
        } else if (t != 2 && t != 3) {
            throw new NoWhenBranchMatchedException();
        } else if (i != 4 || !this.b) {
            this.X = obj;
            this.b = true;
        } else {
            if (yv1.isActive()) {
                yv1.resumeWith(new kcc(new IllegalArgumentException("More than one onNext value for ".concat(us8.t(i)))));
            }
            xi4 xi43 = (xi4) this.o;
            if (xi43 != null) {
                xi4 = xi43;
            }
            xi4.f();
        }
    }

    public void d(xi4 xi4) {
        this.o = xi4;
        ((yv1) this.c).d(new ty0(11, xi4));
    }

    public s16 f(rr3 rr3) {
        View view;
        View view2 = rr3.getView();
        rr3 targetController = rr3.getTargetController();
        View view3 = targetController != null ? targetController.getView() : null;
        if (view2 != null) {
            view = view2;
        } else if (view3 == null) {
            return new fs5(6);
        } else {
            view = view3;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        ucf ucf = new ucf(this, view3, view);
        viewTreeObserver.addOnPreDrawListener(ucf);
        rr3.addLifecycleListener(new tcf(this, viewTreeObserver, ucf, view));
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new scf(view, viewTreeObserver, ucf, view, 0));
        } else if (!view.isAttachedToWindow()) {
            a(ucf, view, viewTreeObserver);
        } else {
            view.addOnAttachStateChangeListener(new scf(view, viewTreeObserver, ucf, view, 1));
        }
        return new kcf(ucf, view, viewTreeObserver);
    }

    public void g(Executor executor, ls9 ls9) {
        krd krd;
        synchronized (this.o) {
            k(ls9);
            krd = new krd((AtomicReference) this.X, executor, ls9);
            ((HashMap) this.c).put(ls9, krd);
            ((CopyOnWriteArraySet) this.Y).add(krd);
        }
        krd.a(0);
    }

    public void h() {
        for (i96 i96 : (i96[]) this.o) {
            FloatBuffer floatBuffer = i96.b;
            oyb.h(floatBuffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(i96.a, i96.c, 5126, false, 0, floatBuffer);
            GLES20.glEnableVertexAttribArray(i96.a);
            gt0.g();
        }
        for (j96 j96 : (j96[]) this.X) {
            boolean z = this.b;
            int[] iArr = j96.d;
            int i = j96.a;
            int i2 = j96.b;
            if (i2 != 5124) {
                float[] fArr = j96.c;
                if (i2 == 5126) {
                    GLES20.glUniform1fv(i, 1, fArr, 0);
                    gt0.g();
                } else if (i2 != 35678 && i2 != 35815 && i2 != 36198) {
                    switch (i2) {
                        case 35664:
                            GLES20.glUniform2fv(i, 1, fArr, 0);
                            gt0.g();
                            break;
                        case 35665:
                            GLES20.glUniform3fv(i, 1, fArr, 0);
                            gt0.g();
                            break;
                        case 35666:
                            GLES20.glUniform4fv(i, 1, fArr, 0);
                            gt0.g();
                            break;
                        case 35667:
                            GLES20.glUniform2iv(i, 1, iArr, 0);
                            gt0.g();
                            break;
                        case 35668:
                            GLES20.glUniform3iv(i, 1, iArr, 0);
                            gt0.g();
                            break;
                        case 35669:
                            GLES20.glUniform4iv(i, 1, iArr, 0);
                            gt0.g();
                            break;
                        default:
                            switch (i2) {
                                case 35675:
                                    GLES20.glUniformMatrix3fv(i, 1, false, fArr, 0);
                                    gt0.g();
                                    break;
                                case 35676:
                                    GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
                                    gt0.g();
                                    break;
                                default:
                                    throw new IllegalStateException(wn6.h(i2, "Unexpected uniform type: "));
                            }
                    }
                } else if (j96.e != 0) {
                    GLES20.glActiveTexture(j96.f + 33984);
                    gt0.g();
                    gt0.e(i2 == 35678 ? 3553 : 36197, j96.e, (i2 != 35678 || z) ? 9728 : 9729);
                    GLES20.glUniform1i(i, j96.f);
                    gt0.g();
                } else {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
            } else {
                GLES20.glUniform1iv(i, 1, iArr, 0);
                gt0.g();
            }
        }
    }

    public int i() {
        int i;
        synchronized (this.o) {
            i = this.a;
            this.a = i + 1;
        }
        return i;
    }

    public void j() {
        ArrayList arrayList;
        synchronized (this.o) {
            try {
                this.b = true;
                arrayList = new ArrayList(((yr) this.X).values());
                ((yr) this.X).clear();
                if (((Runnable) this.c) != null) {
                    Handler handler = (Handler) this.Y;
                    handler.getClass();
                    handler.post((Runnable) this.c);
                    this.c = null;
                    this.Y = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((lyc) it.next()).n();
        }
    }

    public void k(ls9 ls9) {
        krd krd = (krd) ((HashMap) this.c).remove(ls9);
        if (krd != null) {
            krd.c.set(false);
            ((CopyOnWriteArraySet) this.Y).remove(krd);
        }
    }

    public void l() {
        synchronized (this.o) {
            try {
                Iterator it = new HashSet(((HashMap) this.c).keySet()).iterator();
                while (it.hasNext()) {
                    k((ls9) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ch7 m() {
        Object obj = ((AtomicReference) this.X).get();
        return obj instanceof ta0 ? new as6(1, ((ta0) obj).a) : ct0.w(obj);
    }

    public void n(float[] fArr) {
        i96 i96 = (i96) ((HashMap) this.c).get("aFramePosition");
        i96.getClass();
        i96.b = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        i96.c = 4;
    }

    public void o(String str, float f) {
        j96 j96 = (j96) ((HashMap) this.Y).get(str);
        j96.getClass();
        j96.c[0] = f;
    }

    public void onError(Throwable th) {
        ((yv1) this.c).resumeWith(new kcc(th));
    }

    public void p(String str, float[] fArr) {
        j96 j96 = (j96) ((HashMap) this.Y).get(str);
        j96.getClass();
        System.arraycopy(fArr, 0, j96.c, 0, fArr.length);
    }

    public void q(float[] fArr) {
        j96 j96 = (j96) ((HashMap) this.Y).get("uRgbMatrix");
        if (j96 != null) {
            System.arraycopy(fArr, 0, j96.c, 0, fArr.length);
        }
    }

    public void r(ls9 ls9) {
        synchronized (this.o) {
            k(ls9);
        }
    }

    public void s(int i, Object obj) {
        synchronized (this.o) {
            try {
                lyc lyc = (lyc) ((yr) this.X).remove(Integer.valueOf(i));
                if (lyc != null) {
                    if (lyc.x0.getClass() == obj.getClass()) {
                        lyc.l(obj);
                    } else {
                        ez3.j0("Type mismatch, expected " + lyc.x0.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((Runnable) this.c) != null && ((yr) this.X).isEmpty()) {
                    j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(int i, String str) {
        j96 j96 = (j96) ((HashMap) this.Y).get(str);
        j96.getClass();
        j96.d[0] = i;
    }

    public void u(int i, int i2, String str) {
        j96 j96 = (j96) ((HashMap) this.Y).get(str);
        j96.getClass();
        j96.e = i;
        j96.f = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r1.hasNext() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        ((defpackage.krd) r1.next()).a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r1 = r3.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r3.a != r4) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r3.b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r4 = ((java.util.concurrent.CopyOnWriteArraySet) r3.Y).iterator();
        r0 = r3.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        r1 = r4;
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.o
            monitor-enter(r0)
            java.lang.Object r1 = r3.X     // Catch:{ all -> 0x0013 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0013 }
            java.lang.Object r1 = r1.getAndSet(r4)     // Catch:{ all -> 0x0013 }
            boolean r4 = java.util.Objects.equals(r1, r4)     // Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r3 = move-exception
            goto L_0x005a
        L_0x0015:
            int r4 = r3.a     // Catch:{ all -> 0x0013 }
            r1 = 1
            int r4 = r4 + r1
            r3.a = r4     // Catch:{ all -> 0x0013 }
            boolean r2 = r3.b     // Catch:{ all -> 0x0013 }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0021:
            r3.b = r1     // Catch:{ all -> 0x0013 }
            java.lang.Object r1 = r3.Y     // Catch:{ all -> 0x0013 }
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1     // Catch:{ all -> 0x0013 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
        L_0x002c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r1.next()
            krd r0 = (defpackage.krd) r0
            r0.a(r4)
            goto L_0x002c
        L_0x003c:
            java.lang.Object r1 = r3.o
            monitor-enter(r1)
            int r0 = r3.a     // Catch:{ all -> 0x0048 }
            if (r0 != r4) goto L_0x004a
            r4 = 0
            r3.b = r4     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            goto L_0x0058
        L_0x004a:
            java.lang.Object r4 = r3.Y     // Catch:{ all -> 0x0048 }
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4     // Catch:{ all -> 0x0048 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0048 }
            int r0 = r3.a     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            r1 = r4
            r4 = r0
            goto L_0x002c
        L_0x0058:
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            throw r3
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k96.v(java.lang.Object):void");
    }

    public void w() {
        GLES20.glUseProgram(this.a);
        gt0.g();
    }

    public k96() {
        this.o = new Object();
        this.X = new kgd();
    }

    public k96(Context context, String str, String str2) {
        byte[] bArr;
        byte[] bArr2;
        String Q = oze.Q(context, str);
        String Q2 = oze.Q(context, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        gt0.g();
        e(glCreateProgram, 35633, Q);
        e(glCreateProgram, 35632, Q2);
        GLES20.glLinkProgram(glCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        int i2 = 1;
        gt0.h("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(glCreateProgram);
        this.c = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.o = new i96[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.a;
            int[] iArr3 = new int[i2];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i5 = iArr3[0];
            int[] iArr4 = new int[i2];
            int[] iArr5 = new int[i2];
            int[] iArr6 = new int[i2];
            byte[] bArr3 = new byte[i5];
            int i6 = i5;
            int i7 = i4;
            GLES20.glGetActiveAttrib(i4, i3, i5, iArr4, 0, iArr5, 0, iArr6, 0, bArr3, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i6) {
                    bArr2 = bArr3;
                    i8 = i6;
                    break;
                }
                bArr2 = bArr3;
                if (bArr2[i8] == 0) {
                    break;
                }
                i8++;
                bArr3 = bArr2;
            }
            String str3 = new String(bArr2, 0, i8);
            i96 i96 = new i96(str3, GLES20.glGetAttribLocation(i7, str3));
            ((i96[]) this.o)[i3] = i96;
            ((HashMap) this.c).put(str3, i96);
            i3++;
            i2 = 1;
        }
        this.Y = new HashMap();
        int[] iArr7 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr7, 0);
        this.X = new j96[iArr7[0]];
        for (int i9 = 0; i9 < iArr7[i]; i9++) {
            int i10 = this.a;
            int[] iArr8 = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr8, i);
            int[] iArr9 = new int[1];
            int i11 = iArr8[i];
            byte[] bArr4 = new byte[i11];
            int i12 = i11;
            int[] iArr10 = iArr9;
            GLES20.glGetActiveUniform(i10, i9, i11, new int[1], 0, new int[1], 0, iArr9, 0, bArr4, 0);
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    bArr = bArr4;
                    i13 = i12;
                    break;
                }
                bArr = bArr4;
                if (bArr[i13] == 0) {
                    break;
                }
                i13++;
                bArr4 = bArr;
            }
            i = 0;
            String str4 = new String(bArr, 0, i13);
            j96 j96 = new j96(str4, GLES20.glGetUniformLocation(i10, str4), iArr10[0]);
            ((j96[]) this.X)[i9] = j96;
            ((HashMap) this.Y).put(str4, j96);
        }
        gt0.g();
    }

    public k96(Object obj) {
        this.o = new Object();
        this.a = 0;
        this.b = false;
        this.c = new HashMap();
        this.Y = new CopyOnWriteArraySet();
        this.X = new AtomicReference(obj);
    }
}
