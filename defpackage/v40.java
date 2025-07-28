package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* renamed from: v40  reason: default package */
public final class v40 implements r30 {
    public boolean X;
    public boolean Y;
    public final t40 Z = new t40(this);
    public final va9 a;
    public final mib b;
    public final r7e c;
    public final s30 o;

    public v40(Context context, va9 va9, mib mib) {
        this.a = va9;
        this.b = mib;
        r7e d = w40.a.getAccessor().d(so1.class);
        this.c = new r7e(new b5(context, 4));
        this.o = new s30(context, this);
        gvf gvf = new gvf(3, (Object) this);
        r7e r7e = new r7e(new c6(13, this));
        ((nb9) va9).e(gvf);
        ((ep1) ((so1) d.getValue())).d((u40) r7e.getValue());
    }

    public static final boolean b(v40 v40) {
        for (AudioDeviceInfo type : ((AudioManager) v40.c.getValue()).getDevices(2)) {
            int type2 = type.getType();
            if (type2 == 3 || type2 == 4 || type2 == 8) {
                return true;
            }
        }
        return false;
    }

    public static final void c(v40 v40) {
        boolean z = v40.a.x;
        s30 s30 = v40.o;
        if (z) {
            s30.p(1);
            v40.d();
            return;
        }
        s30.o();
        if (v40.X) {
            v40.X = false;
            mib mib = v40.b;
            mib.b();
            mib.h.remove(v40.Z);
        }
    }

    public final boolean a() {
        return this.a.x;
    }

    public final void d() {
        if (this.Y && !this.X && this.a.x) {
            this.X = true;
            mib mib = this.b;
            mib.a();
            mib.h.add(this.Z);
        }
    }

    public final float e() {
        return this.a.z;
    }

    public final void g(float f) {
    }

    public final void onAudioFocusChange(int i) {
        this.o.n(i);
    }

    public final void pause() {
        nb9 nb9 = this.a;
        if (!nb9.b()) {
            nb9.q();
        }
    }

    public final void play() {
        nb9 nb9 = this.a;
        if (!nb9.b()) {
            this.o.p(1);
            nb9.r();
        }
    }
}
