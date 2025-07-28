package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: aqd  reason: default package */
public final class aqd extends l5e implements i26 {
    public final /* synthetic */ dqd X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqd(dqd dqd, Continuation continuation) {
        super(2, continuation);
        this.X = dqd;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new aqd(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        dqd dqd = this.X;
        grd grd = dqd.y0;
        lg7 c = hwf.c();
        c.add(new qv3(kca.s, phc.f2, new hge(cic.z)));
        vqc vqc = (vqc) dqd.c;
        vqc.getClass();
        if (vqc.m(PmsKey.f15channelsenabled, false)) {
            c.add(new qv3(kca.r, l9a.k, new hge(cic.Q)));
        }
        grd.setValue(hwf.a(c));
        return jue.a;
    }
}
