package defpackage;

import android.content.Context;
import java.util.Map;
import org.webrtc.EglBase;

/* renamed from: qp4  reason: default package */
public final /* synthetic */ class qp4 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ qp4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
        this.Y = obj5;
        this.Z = obj6;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((ez2) this.b).a((hu1) this.c, (hu1) this.o, (o4e) this.X, (o4e) this.Y, (Map.Entry) this.Z);
                return;
            default:
                noc noc = (noc) this.b;
                xwb xwb = (xwb) this.Y;
                noc.getClass();
                noc.o = new py5((EglBase.Context) this.c, (Context) this.o, (ygd) this.X, xwb);
                noc.X = new ty5(xwb, (ufc) this.Z);
                noc.Y = new hz5();
                py5 py5 = noc.o;
                ty5 ty5 = noc.X;
                py5.Z = ty5;
                hz5 hz5 = noc.Y;
                ty5.getClass();
                ty5.c.c(new ry5(ty5, hz5, 0));
                ty5 ty52 = noc.X;
                hz5 hz52 = noc.Y;
                ty52.getClass();
                ty52.c.c(new ry5(ty52, hz52, 1));
                return;
        }
    }
}
