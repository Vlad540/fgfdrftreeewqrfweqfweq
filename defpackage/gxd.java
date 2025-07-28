package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: gxd  reason: default package */
public final class gxd extends taf {
    public static final /* synthetic */ k77[] F0;
    public final e3 A0 = hwf.t();
    public Long B0;
    public Long C0;
    public final e3 D0 = hwf.t();
    public final e3 E0 = hwf.t();
    public final grd X;
    public final t0c Y;
    public final l05 Z = new l05(0);
    public final Context b;
    public final pae c;
    public final t97 o;
    public final l05 w0 = new l05(0);
    public volatile Long x0;
    public volatile int y0 = -1;
    public volatile Long z0;

    static {
        Class<gxd> cls = gxd.class;
        F0 = new k77[]{new hc9(cls, "moveFinishJob", "getMoveFinishJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "menuItemJob", "getMenuItemJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;")};
    }

    public gxd(Context context, pae pae, t97 t97, t97 t972, t97 t973) {
        this.b = context;
        this.c = pae;
        this.o = t973;
        grd a = hrd.a(hw4.a);
        this.X = a;
        this.Y = new t0c(a);
        udd.q(gxd.class.getName(), "loadSections");
        rn1 c2 = am7.c(((zsd) t97.getValue()).a());
        rn1 c3 = am7.c(((fa5) t972.getValue()).a());
        jk0 jk0 = ((l95) t973.getValue()).w0;
        jk0.getClass();
        ez3.N(ez3.J(new ck5(ez3.s(c2, c3, am7.c(new au9(new it9(jk0, 0), new g95(24), 3)), new vm3(4, (Continuation) null)), new kbb(2, this, gxd.class, "processResult", "processResult(Lone/me/stickerssettings/StickersSettingsViewModel$CombinedResult;)V", 4, 14), 5), ((n3a) pae).b()), this.a);
    }

    public final String q(List list) {
        int size = list != null ? list.size() : 0;
        return this.b.getResources().getQuantityString(haa.a, size, new Object[]{Integer.valueOf(size)});
    }
}
