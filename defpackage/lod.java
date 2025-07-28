package defpackage;

import android.opengl.GLES20;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;

/* renamed from: lod  reason: default package */
public final class lod implements yxf {
    public int a;
    public int b;
    public int c;
    public final int d;
    public final Object e;
    public final Object f;

    public lod(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = i;
        this.b = i2;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        this.e = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        this.f = asFloatBuffer2;
        this.d = 5;
        this.c = 4;
    }

    public void a() {
        if (((FloatBuffer) this.e) != null && ((FloatBuffer) this.f) != null) {
            int i = this.a;
            GLES20.glEnableVertexAttribArray(i);
            ek8.c("glEnableVertexAttribArray");
            int i2 = this.b;
            GLES20.glEnableVertexAttribArray(i2);
            ek8.c("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.a, 2, 5126, false, 8, (FloatBuffer) this.e);
            ek8.c("glVertexAttribPointer");
            GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 8, (FloatBuffer) this.f);
            ek8.c("glVertexAttribPointer");
            GLES20.glDrawArrays(this.d, 0, this.c);
            ek8.c("glDrawArrays");
            GLES20.glDisableVertexAttribArray(i);
            ek8.c("glDisableVertexAttribArray");
            GLES20.glDisableVertexAttribArray(i2);
            ek8.c("glDisableVertexAttribArray");
        }
    }

    public void b() {
    }

    public void c() {
        View view = (View) rf0.e((ArrayList) this.e, 1);
        this.b = ((StaggeredGridLayoutManager) this.f).r.c(view);
        ((iod) view.getLayoutParams()).getClass();
    }

    public void d() {
        ((ArrayList) this.e).clear();
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 0;
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.f).w;
        ArrayList arrayList = (ArrayList) this.e;
        return z ? g(arrayList.size() - 1, -1, false, true) : g(0, arrayList.size(), false, true);
    }

    public int f() {
        boolean z = ((StaggeredGridLayoutManager) this.f).w;
        ArrayList arrayList = (ArrayList) this.e;
        return z ? g(0, arrayList.size(), false, true) : g(arrayList.size() - 1, -1, false, true);
    }

    public int g(int i, int i2, boolean z, boolean z2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        int m = staggeredGridLayoutManager.r.m();
        int h = staggeredGridLayoutManager.r.h();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.e).get(i);
            int f2 = staggeredGridLayoutManager.r.f(view);
            int c2 = staggeredGridLayoutManager.r.c(view);
            boolean z3 = false;
            boolean z4 = !z2 ? f2 < h : f2 <= h;
            if (!z2 ? c2 > m : c2 >= m) {
                z3 = true;
            }
            if (z4 && z3) {
                if (z) {
                    return a.M(view);
                }
                if (f2 < m || c2 > h) {
                    return a.M(view);
                }
            }
            i += i3;
        }
        return -1;
    }

    public int h(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.e).size() == 0) {
            return i;
        }
        c();
        return this.b;
    }

    public View i(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && a.M(view2) >= i) || ((!staggeredGridLayoutManager.w && a.M(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && a.M(view3) <= i) || ((!staggeredGridLayoutManager.w && a.M(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public int j(int i) {
        int i2 = this.a;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.e).size() == 0) {
            return i;
        }
        View view = (View) ((ArrayList) this.e).get(0);
        this.a = ((StaggeredGridLayoutManager) this.f).r.f(view);
        ((iod) view.getLayoutParams()).getClass();
        return this.a;
    }

    public lod(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = new ArrayList();
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 0;
        this.d = i;
    }
}
