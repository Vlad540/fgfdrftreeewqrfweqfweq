package defpackage;

import java.io.File;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

/* renamed from: o06  reason: default package */
public final /* synthetic */ class o06 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachPhoto b;
    public final /* synthetic */ int c;

    public /* synthetic */ o06(FrgAttachPhoto frgAttachPhoto, int i, int i2) {
        this.a = i2;
        this.b = frgAttachPhoto;
        this.c = i;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                File file = (File) obj;
                FrgAttachPhoto frgAttachPhoto = this.b;
                frgAttachPhoto.Q1 = null;
                frgAttachPhoto.k1();
                int i = this.c;
                if (i == 1) {
                    new gqd(((k93) frgAttachPhoto.t1.b).h(), ((k93) frgAttachPhoto.t1.b).f(), ((k93) frgAttachPhoto.t1.b).n().b).a(frgAttachPhoto, file.getAbsolutePath());
                    return;
                } else if (i == 2) {
                    swb.N(frgAttachPhoto.c0(), file, ((k93) frgAttachPhoto.t1.b).h());
                    return;
                } else if (i == 3) {
                    xie.z(frgAttachPhoto.e0(), frgAttachPhoto.G1, frgAttachPhoto.H1, frgAttachPhoto.u1.n(), ((k93) frgAttachPhoto.t1.b).h());
                    return;
                } else {
                    return;
                }
            default:
                Throwable th = (Throwable) obj;
                FrgAttachPhoto frgAttachPhoto2 = this.b;
                frgAttachPhoto2.Q1 = null;
                frgAttachPhoto2.k1();
                int i2 = this.c;
                if (i2 == 1) {
                    a06.E(frgAttachPhoto2.e0(), cic.L2);
                    return;
                } else if (i2 == 2) {
                    a06.E(frgAttachPhoto2.e0(), cic.S2);
                    return;
                } else if (i2 == 3) {
                    a06.E(frgAttachPhoto2.e0(), cic.t);
                    return;
                } else {
                    return;
                }
        }
    }
}
