package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: z4d  reason: default package */
public final class z4d extends l5e implements i26 {
    public final /* synthetic */ i5d X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z4d(i5d i5d, Continuation continuation) {
        super(2, continuation);
        this.X = i5d;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z4d(this.X, continuation);
    }

    public final Object o(Object obj) {
        grd grd;
        Object value;
        wx3.H(obj);
        lg7 c = hwf.c();
        k77[] k77Arr = i5d.E0;
        i5d i5d = this.X;
        i5d.getClass();
        c.add(new gtc(new hge(taa.r), 0, (long) saa.y));
        c.add(new htc(1, new hge(taa.p), 0, (long) saa.o, new x6d(i5d.t(i5d.r().g.getInt("app.media.load.photo", 0), false), (Integer) null)));
        c.add(new htc(2, new hge(taa.l), 0, (long) saa.l, new x6d(i5d.t(i5d.r().g.getInt("app.media.load.gif", 0), false), (Integer) null)));
        c.add(new htc(2, new hge(taa.i), 0, (long) saa.k, new x6d(i5d.t(i5d.r().g.getInt("app.media.load.audio", 0), false), (Integer) null)));
        c.add(new htc(3, new hge(taa.o), 0, (long) saa.n, new z6d(i5d.r().m(), true)));
        c.add(new gtc(new hge(taa.s), 1, (long) saa.z));
        c.add(new htc(1, new hge(taa.v), 1, (long) saa.p, new x6d(i5d.t(i5d.r().g.getInt("app.video.auto.play", 1), true), (Integer) null)));
        t97 t97 = i5d.o;
        vqc vqc = (vqc) ((xzc) ((rj) t97.getValue()).b.getValue());
        vqc.getClass();
        boolean m = vqc.m(PmsKey.f17chatanimojienabled, false);
        long j = (long) saa.m;
        c.add(new htc(m ? 2 : 3, new hge(taa.m), 1, j, new z6d(((kp) i5d.r()).g.getBoolean("app.media.autoplay.gif", true), true)));
        if (m) {
            c.add(new htc(3, new hge(taa.h), 1, (long) saa.j, new z6d(((rj) t97.getValue()).a(), true)));
        }
        c.add(new gtc(new hge(taa.t), 2, (long) saa.A));
        c.add(new htc(4, new hge(taa.w), 2, (long) saa.r, new x6d(new lge(i5d.r().p().a.a), (Integer) null)));
        c.add(new htc(4, new hge(taa.k), 3, (long) saa.q, w6d.a));
        lg7 a = hwf.a(c);
        do {
            grd = i5d.X;
            value = grd.getValue();
            List list = (List) value;
        } while (!grd.b(value, a));
        return jue.a;
    }
}
