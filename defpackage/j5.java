package defpackage;

import androidx.fragment.app.a;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.attaches.fragments.FrgAttachUnknown;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* renamed from: j5  reason: default package */
public final class j5 implements kbf {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;

    public /* synthetic */ j5(s5 s5Var, int i) {
        this.a = i;
        this.b = s5Var;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i, float f) {
    }

    private final void d(int i, float f) {
    }

    public final void k(int i) {
        int i2 = this.a;
    }

    public final void m(int i) {
        switch (this.a) {
            case 0:
                ActAttachesView actAttachesView = (ActAttachesView) this.b;
                v10 v10 = actAttachesView.a1;
                if (v10 != null) {
                    if (v10.j.indexOf(actAttachesView.k1) != i) {
                        FrgAttachView k = actAttachesView.a1.k(actAttachesView.k1);
                        if (k instanceof FrgAttachVideo) {
                            ((FrgAttachVideo) k).H1();
                        }
                        v10 v102 = actAttachesView.a1;
                        FrgAttachVideo frgAttachVideo = (a) v102.g.get(v102.h(i));
                        if (frgAttachVideo instanceof FrgAttachVideo) {
                            frgAttachVideo.G1();
                        }
                        yia l = actAttachesView.a1.l(i);
                        if (l != null) {
                            actAttachesView.k1 = ((o10) l.a).q;
                            actAttachesView.i1 = false;
                            actAttachesView.q0();
                            actAttachesView.r0();
                            FrgAttachView k2 = actAttachesView.a1.k(actAttachesView.k1);
                            String str = k2 instanceof FrgAttachPhoto ? "ATTACH_PHOTO" : k2 instanceof FrgAttachVideo ? "ATTACH_VIDEO" : k2 instanceof FrgAttachUnknown ? "ATTACH_UNKNOWN" : null;
                            if (!r1g.p(str)) {
                                udd.q("ru.ok.messages.media.attaches.ActAttachesView", "sendFragmentStats: " + str);
                                vl.b().b().f(str);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ActContactAvatars) this.b).m(i);
                return;
        }
    }

    public final void q(int i, float f) {
        int i2 = this.a;
    }
}
