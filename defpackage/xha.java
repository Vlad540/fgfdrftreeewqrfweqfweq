package defpackage;

import android.os.Bundle;

/* renamed from: xha  reason: default package */
public final class xha implements nc7, zkc {
    public pc7 a;
    public ud b;
    public boolean c;
    public Bundle o;

    public static final void a(xha xha, rr3 rr3, rr3 rr32, wr3 wr3, xr3 xr3) {
        if (rr3 == rr32 && !xr3.b && wr3.d() && rr32.getView() != null) {
            pc7 pc7 = xha.a;
            ud udVar = null;
            if ((pc7 == null ? null : pc7).d == ob7.X) {
                if (pc7 == null) {
                    pc7 = null;
                }
                pc7.d(nb7.ON_PAUSE);
                Bundle bundle = new Bundle();
                xha.o = bundle;
                ud udVar2 = xha.b;
                if (udVar2 != null) {
                    udVar = udVar2;
                }
                udVar.u(bundle);
                xha.c = true;
            }
        }
    }

    public final pc7 R() {
        pc7 pc7 = this.a;
        if (pc7 == null) {
            return null;
        }
        return pc7;
    }

    public final mm y() {
        ud udVar = this.b;
        if (udVar == null) {
            udVar = null;
        }
        return (mm) udVar.o;
    }
}
