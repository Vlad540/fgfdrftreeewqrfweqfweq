package defpackage;

import android.content.Context;
import org.webrtc.EglBase;

/* renamed from: noc  reason: default package */
public final class noc implements ml7 {
    public ty5 X;
    public volatile hz5 Y;
    public volatile boolean Z = false;
    public final xwb a;
    public final jr3 b;
    public volatile boolean c;
    public py5 o;
    public final moc w0 = new moc(this, 2);

    public noc(EglBase.Context context, Context context2, xwb xwb, ygd ygd, ufc ufc) {
        jr3 jr3 = new jr3("SSSendControl");
        this.b = jr3;
        this.a = xwb;
        jr3.c(new qp4(this, context, context2, ygd, xwb, ufc, 1));
    }

    public final void a(int i, int i2) {
        this.b.c(new as0(this, i, i2, 3));
    }
}
