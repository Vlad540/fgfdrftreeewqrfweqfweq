package defpackage;

import androidx.fragment.app.b;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

/* renamed from: p06  reason: default package */
public final /* synthetic */ class p06 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachPhoto b;

    public /* synthetic */ p06(FrgAttachPhoto frgAttachPhoto, int i) {
        this.a = i;
        this.b = frgAttachPhoto;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                FrgAttachPhoto frgAttachPhoto = this.b;
                frgAttachPhoto.N1.r(frgAttachPhoto.H1, frgAttachPhoto.G1);
                b c0 = frgAttachPhoto.c0();
                if (c0 instanceof im) {
                    c0.invalidateOptionsMenu();
                    return;
                }
                return;
            default:
                v06 v1 = this.b.s1();
                if (v1 != null) {
                    ((ActAttachesView) v1).e();
                    return;
                }
                return;
        }
    }
}
