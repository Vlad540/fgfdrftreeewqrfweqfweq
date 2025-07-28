package defpackage;

import android.window.BackEvent;

/* renamed from: gd0  reason: default package */
public final class gd0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public gd0(BackEvent backEvent) {
        tk tkVar = tk.a;
        float d2 = tkVar.d(backEvent);
        float e = tkVar.e(backEvent);
        float b2 = tkVar.b(backEvent);
        int c2 = tkVar.c(backEvent);
        this.a = d2;
        this.b = e;
        this.c = b2;
        this.d = c2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return hr1.h(sb, this.d, '}');
    }
}
