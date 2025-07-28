package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: pc4  reason: default package */
public final /* synthetic */ class pc4 implements Callable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ ew0 Y;
    public final /* synthetic */ Executor Z;
    public final /* synthetic */ qc4 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ pv0 c;
    public final /* synthetic */ z23 o;
    public final /* synthetic */ l4f w0;

    public /* synthetic */ pc4(qc4 qc4, Context context, pv0 pv0, z23 z23, boolean z, ew0 ew0, Executor executor, l4f l4f) {
        this.a = qc4;
        this.b = context;
        this.c = pv0;
        this.o = z23;
        this.X = z;
        this.Y = ew0;
        this.Z = executor;
        this.w0 = l4f;
    }

    public final Object call() {
        Pair pair;
        qc4 qc4 = this.a;
        qc4.getClass();
        int i = rc4.s;
        EGLDisplay x = gt0.x();
        z23 z23 = this.o;
        int[] iArr = z23.g(z23) ? gt0.c : gt0.b;
        int i2 = oze.a;
        h96 h96 = qc4.c;
        if (i2 < 29) {
            EGLContext j = h96.j(x, 2, iArr);
            pair = Pair.create(j, h96.p(j, x));
        } else {
            try {
                EGLContext j2 = h96.j(x, 3, iArr);
                pair = Pair.create(j2, h96.p(j2, x));
            } catch (GlUtil$GlException unused) {
                EGLContext j3 = h96.j(x, 2, iArr);
                pair = Pair.create(j3, h96.p(j3, x));
            }
        }
        x23 a2 = z23.a();
        a2.c = 1;
        a2.d = null;
        z23 z232 = new z23(a2.a, a2.b, a2.c, a2.e, a2.f, a2.d);
        boolean g = z23.g(z23);
        int i3 = qc4.a;
        z23 z233 = (!g && i3 != 2) ? z23 : z232;
        l4f l4f = this.w0;
        Objects.requireNonNull(l4f);
        kc4 kc4 = new kc4(l4f, 0);
        boolean z = qc4.g;
        Context context = this.b;
        ew0 ew0 = this.Y;
        Executor executor = this.Z;
        ny6 ny6 = new ny6(context, z233, h96, ew0, executor, kc4, i3, qc4.b, z, qc4.h);
        pv0 pv0 = this.c;
        q96 q96 = qc4.e;
        int i4 = qc4.f;
        boolean z2 = this.X;
        Executor executor2 = executor;
        return new rc4(context, h96, x, ny6, ew0, l4f, executor2, new tg5(context, x, (EGLContext) pair.first, (EGLSurface) pair.second, pv0, z23, ew0, executor2, l4f, q96, i4, i3, z2), z2, z23);
    }
}
