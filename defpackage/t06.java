package defpackage;

import androidx.fragment.app.b;
import androidx.viewpager.widget.ViewPager;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: t06  reason: default package */
public final /* synthetic */ class t06 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ t06(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    public final void run() {
        ViewPager viewPager;
        yia l;
        o10 o10;
        switch (this.a) {
            case 0:
                FrgAttachVideo frgAttachVideo = this.b;
                if (frgAttachVideo.s1) {
                    frgAttachVideo.M1();
                    b c0 = frgAttachVideo.c0();
                    if (c0 instanceof im) {
                        c0.invalidateOptionsMenu();
                    }
                    v06 v1 = frgAttachVideo.s1();
                    if (v1 != null) {
                        String str = frgAttachVideo.H1.q;
                        ActAttachesView actAttachesView = (ActAttachesView) v1;
                        v10 v10 = actAttachesView.a1;
                        boolean z = false;
                        if (!(v10 == null || (viewPager = actAttachesView.j1) == null || (l = v10.l(viewPager.getCurrentItem())) == null || (o10 = (o10) l.a) == null)) {
                            z = r1g.c(o10.q, str);
                        }
                        if (z && frgAttachVideo.R1 == null) {
                            frgAttachVideo.G1();
                            return;
                        }
                    }
                    frgAttachVideo.K1();
                    return;
                }
                return;
            case 1:
                v06 v12 = this.b.s1();
                if (v12 != null) {
                    ((ActAttachesView) v12).e();
                    return;
                }
                return;
            default:
                FrgAttachVideo frgAttachVideo2 = this.b;
                if (frgAttachVideo2.H1.d.a == 0) {
                    to8 n = frgAttachVideo2.u1.n();
                    n.getClass();
                    tic.a(new oo8(n, frgAttachVideo2.G1, frgAttachVideo2.H1.q, (zs8) frgAttachVideo2.u1.getAccessor().c(zs8.class)), n.h, (j6) null, new be8(13), (qmc) null);
                    return;
                }
                frgAttachVideo2.K1();
                return;
        }
    }
}
