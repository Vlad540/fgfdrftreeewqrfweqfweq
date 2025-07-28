package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalPhoto;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: d6  reason: default package */
public final class d6 extends qbf {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ d6(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    private final void d(int i) {
    }

    private final void e(int i, float f, int i2) {
    }

    public void a(int i) {
        int i2 = this.a;
    }

    public void b(int i, float f, int i2) {
        int i3 = this.a;
    }

    public final void c(int i) {
        boolean z = false;
        ActLocalMedias actLocalMedias = this.b;
        switch (this.a) {
            case 0:
                if (actLocalMedias.d1 != null) {
                    tk7 tk7 = (tk7) actLocalMedias.Z0.get(actLocalMedias.a1);
                    if (tk7 != null) {
                        FrgLocalMedia F = actLocalMedias.d1.F(tk7.b);
                        if (F instanceof FrgLocalVideo) {
                            FrgLocalVideo frgLocalVideo = (FrgLocalVideo) F;
                            View view = (View) frgLocalVideo.N1.c;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            frgLocalVideo.x1();
                        }
                    }
                    tk7 tk72 = (tk7) actLocalMedias.Z0.get(i);
                    if (tk72 != null) {
                        FrgLocalMedia F2 = actLocalMedias.d1.F(tk72.b);
                        if (F2 instanceof FrgLocalVideo) {
                            ((FrgLocalVideo) F2).w1();
                        }
                    }
                }
                actLocalMedias.a1 = i;
                actLocalMedias.t0(i);
                String str = null;
                if (actLocalMedias.Z0.size() - i < 6) {
                    wk7 l0 = actLocalMedias.l0();
                    String str2 = actLocalMedias.b1;
                    if (str2 == null) {
                        l0.getClass();
                    } else {
                        o46 o46 = (o46) l0.g.get(str2);
                        if (o46 != null) {
                            z = ((bv6) l0.c).b(o46);
                        }
                    }
                    if (z) {
                        wk7 l02 = actLocalMedias.l0();
                        xs7.E(l02.e, l02.d.a().plus(l02.b), (ru3) null, new vk7(l02, actLocalMedias.b1, (Continuation) null), 2);
                    }
                }
                FrgLocalMedia j0 = actLocalMedias.j0();
                if (j0 != null) {
                    if (j0 instanceof FrgLocalPhoto) {
                        str = "LOCAL_PHOTO";
                    } else if (j0 instanceof FrgLocalVideo) {
                        str = "LOCAL_VIDEO";
                    } else if (j0 instanceof FrgLocalGif) {
                        str = "LOCAL_GIF";
                    }
                    if (!r1g.p(str)) {
                        udd.q("ru.ok.messages.media.mediabar.ActLocalMedias", "sendFragmentStats: " + str);
                        ((k93) actLocalMedias.O0.b).b().f(str);
                    }
                }
                actLocalMedias.m1.a2((tk7) actLocalMedias.Z0.get(actLocalMedias.a1));
                return;
            default:
                int i2 = ActLocalMedias.w1;
                List c = actLocalMedias.l0().f.c();
                int g = actLocalMedias.l0().f.g((tk7) actLocalMedias.Z0.get(i)) - 1;
                if (g == -1) {
                    for (int i3 = 0; i3 < c.size(); i3++) {
                        ((rwc) c.get(i3)).e = false;
                    }
                    actLocalMedias.s0();
                    return;
                }
                int i4 = 0;
                while (i4 < c.size()) {
                    ((rwc) c.get(i4)).e = g == i4;
                    i4++;
                }
                actLocalMedias.s0();
                actLocalMedias.j1.x(i);
                return;
        }
    }
}
