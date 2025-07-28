package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: bq0  reason: default package */
public final class bq0 {
    public final /* synthetic */ int a = 3;
    public int b;
    public boolean c;
    public Object d;
    public Object e;

    public /* synthetic */ bq0() {
    }

    public szf a() {
        a24.h("execute parameter required", ((n8c) this.d) != null);
        return new szf(this, (ib5[]) this.e, this.c, this.b);
    }

    public void b(int i) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        WeakHashMap weakHashMap = eaf.a;
                        ((View) bottomSheetBehavior.U.get()).postOnAnimation((re) this.d);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        WeakHashMap weakHashMap2 = eaf.a;
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((pzb) this.d);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void c(h96 h96, int i, int i2) {
        int i3;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        oyb.k(arrayDeque.isEmpty());
        oyb.k(((ArrayDeque) this.e).isEmpty());
        for (int i4 = 0; i4 < this.b; i4++) {
            if (this.c) {
                gt0.d(i, i2);
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                gt0.g();
                i3 = iArr[0];
                gt0.e(3553, i3, 9729);
                GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 5131, (Buffer) null);
                gt0.g();
            } else {
                gt0.d(i, i2);
                int[] iArr2 = new int[1];
                GLES20.glGenTextures(1, iArr2, 0);
                gt0.g();
                i3 = iArr2[0];
                gt0.e(3553, i3, 9729);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, (Buffer) null);
                gt0.g();
            }
            arrayDeque.add(h96.o(i3, i, i2));
        }
    }

    public void d() {
        Iterator g = g();
        while (true) {
            w27 w27 = (w27) g;
            if (w27.hasNext()) {
                ((p96) w27.next()).a();
            } else {
                ((ArrayDeque) this.d).clear();
                ((ArrayDeque) this.e).clear();
                return;
            }
        }
    }

    public void e(h96 h96, int i, int i2) {
        if (!((w27) g()).hasNext()) {
            c(h96, i, i2);
            return;
        }
        p96 p96 = (p96) ((w27) g()).next();
        if (p96.c != i || p96.d != i2) {
            d();
            c(h96, i, i2);
        }
    }

    public int f() {
        return !g().hasNext() ? this.b : ((ArrayDeque) this.d).size();
    }

    public Iterator g() {
        Iterable[] iterableArr = {(ArrayDeque) this.d, (ArrayDeque) this.e};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new qo5(iterableArr).iterator();
    }

    public p96 h() {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (!arrayDeque.isEmpty()) {
            p96 p96 = (p96) arrayDeque.remove();
            ((ArrayDeque) this.e).add(p96);
            return p96;
        }
        throw new IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
    }

    public bq0(boolean z, int i) {
        this.b = i;
        this.c = z;
        this.d = new ArrayDeque(i);
        this.e = new ArrayDeque(i);
    }

    public bq0(Context context) {
        this.d = context;
        this.e = new Object();
        this.b = i94.g;
    }

    public bq0(SideSheetBehavior sideSheetBehavior) {
        this.e = sideSheetBehavior;
        this.d = new pzb(13, this);
    }

    public bq0(BottomSheetBehavior bottomSheetBehavior) {
        this.e = bottomSheetBehavior;
        this.d = new re(6, this);
    }
}
