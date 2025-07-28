package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: od9  reason: default package */
public final /* synthetic */ class od9 implements t26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd9 b;

    public /* synthetic */ od9(vd9 vd9, int i) {
        this.a = i;
        this.b = vd9;
    }

    public final Object apply(Object obj) {
        nl7 nl7 = (nl7) obj;
        switch (this.a) {
            case 0:
                kpa kpa = this.b.y0;
                nl7.o = (kpa == null || kpa.o == null) ? false : true;
                return nl7;
            case 1:
                kpa kpa2 = this.b.y0;
                nl7.n = (kpa2 == null || kpa2.Y == null) ? false : true;
                return nl7;
            case 2:
                vd9 vd9 = this.b;
                boolean z = vd9.F0;
                nl7.e = z;
                nl7.a();
                nl7.a = z;
                FrgLocalMedia j0 = ((ActLocalMedias) vd9.c).j0();
                nl7.f = j0 == null ? false : j0 instanceof FrgLocalVideo;
                return nl7;
            case 3:
                boolean z2 = this.b.F0;
                nl7.g = z2;
                nl7.i = z2;
                nl7.h = z2;
                nl7.e = false;
                return nl7;
            case 4:
                vd9 vd92 = this.b;
                tk7 tk7 = vd92.X;
                pwc pwc = vd92.A0;
                int g = pwc.g(tk7);
                nl7.k = g > 0 || pwc.c().size() < 100;
                nl7.l = g;
                return nl7;
            default:
                kpa kpa3 = this.b.y0;
                nl7.m = (kpa3 == null || kpa3.b == null) ? false : true;
                return nl7;
        }
    }
}
