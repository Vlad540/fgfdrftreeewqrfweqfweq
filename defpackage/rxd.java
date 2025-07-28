package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: rxd  reason: default package */
public final class rxd extends l5e implements i26 {
    public hud X;
    public List Y;
    public int Z;
    public int w0;
    public int x0;
    public final /* synthetic */ sxd y0;
    public final /* synthetic */ hud z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rxd(sxd sxd, hud hud, Continuation continuation) {
        super(2, continuation);
        this.y0 = sxd;
        this.z0 = hud;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rxd(this.y0, this.z0, continuation);
    }

    public final Object o(Object obj) {
        hud hud;
        List list;
        int i;
        int i2;
        hud hud2;
        boolean z = true;
        pu3 pu3 = pu3.a;
        int i3 = this.x0;
        jue jue = jue.a;
        sxd sxd = this.y0;
        if (i3 == 0) {
            wx3.H(obj);
            list = ((sed) sxd.z0.getValue()).b;
            int A = p23.A(list);
            if (A >= 0) {
                i = 0;
                while (true) {
                    hud2 = (hud) list.get(i);
                    if (this.z0.a != hud2.a) {
                        if (i == A) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            i = -1;
            hud2 = null;
            if (hud2 == null) {
                return jue;
            }
            boolean z2 = !hud2.w0;
            j73 d = ((l95) sxd.Y.getValue()).d(hud2.a, z2);
            this.X = hud2;
            this.Y = list;
            this.Z = i;
            this.w0 = z2 ? 1 : 0;
            this.x0 = 1;
            if (e07.c(d, this) == pu3) {
                return pu3;
            }
            i2 = z2;
            hud = hud2;
        } else if (i3 == 1) {
            i2 = this.w0;
            i = this.Z;
            list = this.Y;
            hud = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i, hud.k(hud, (ArrayList) null, false, i2 != 0, 127));
        grd grd = sxd.z0;
        sed sed = (sed) grd.getValue();
        red red = sed.a;
        sed sed2 = sed.c;
        sed.getClass();
        grd.m((Object) null, new sed(red, arrayList));
        if (i2 == 0) {
            z = false;
        }
        taf.o(sxd.x0, new qed(z ? phc.n : phc.x, z ? iaa.c : iaa.d));
        return jue;
    }
}
