package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: wf  reason: default package */
public final class wf implements vf {
    public Object X = wt0.b;
    public Object Y;
    public Object Z;
    public boolean a;
    public long b;
    public Object c;
    public Object o = BuildConfig.FLAVOR;

    public void B(Rect rect) {
        vf vfVar = (vf) this.c;
        if (vfVar != null) {
            vfVar.B(rect);
        }
    }

    public int F() {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return -1;
        }
        return vfVar.F();
    }

    public void G(hs1 hs1) {
        vf vfVar = (vf) this.c;
        if (vfVar != null) {
            vfVar.G(hs1);
        }
    }

    public boolean H(Drawable drawable, Canvas canvas, int i) {
        this.b = ((b69) this.o).now();
        boolean z = false;
        vf vfVar = (vf) this.c;
        if (vfVar != null && vfVar.H(drawable, canvas, i)) {
            z = true;
        }
        b();
        return z;
    }

    public int I() {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return 0;
        }
        return vfVar.I();
    }

    public void a(int i) {
        vf vfVar = (vf) this.c;
        if (vfVar != null) {
            vfVar.a(i);
        }
    }

    public synchronized void b() {
        if (!this.a) {
            this.a = true;
            ((ScheduledExecutorService) this.X).schedule((re) this.Z, 1000, TimeUnit.MILLISECONDS);
        }
    }

    public int c() {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return 0;
        }
        return vfVar.c();
    }

    public void clear() {
        vf vfVar = (vf) this.c;
        if (vfVar != null) {
            vfVar.clear();
        }
    }

    public void h(ColorFilter colorFilter) {
        vf vfVar = (vf) this.c;
        if (vfVar != null) {
            vfVar.h(colorFilter);
        }
    }

    public int i() {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return 0;
        }
        return vfVar.i();
    }

    public int o(int i) {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return 0;
        }
        return vfVar.o(i);
    }

    public int s() {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return -1;
        }
        return vfVar.s();
    }
}
