package defpackage;

import java.util.Collections;
import ru.ok.messages.views.fragments.FrgProfilePhoto;

/* renamed from: h16  reason: default package */
public final /* synthetic */ class h16 implements of3, dwf {
    public final /* synthetic */ FrgProfilePhoto a;

    public /* synthetic */ h16(FrgProfilePhoto frgProfilePhoto) {
        this.a = frgProfilePhoto;
    }

    public void accept(Object obj) {
        FrgProfilePhoto frgProfilePhoto = this.a;
        frgProfilePhoto.getClass();
        vo8 vo8 = ((xm8) obj).a;
        frgProfilePhoto.J1 = vo8;
        String str = vo8.f().f;
        frgProfilePhoto.J1.f().getClass();
        frgProfilePhoto.I1 = new i6(Collections.singletonList(str), frgProfilePhoto.I1.c);
        frgProfilePhoto.L1 = true;
        frgProfilePhoto.t1();
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View] */
    public void e(Throwable th) {
        FrgProfilePhoto frgProfilePhoto = this.a;
        frgProfilePhoto.G1.setVisibility(4);
        frgProfilePhoto.H1.setVisibility(0);
        frgProfilePhoto.H1.setZoomEnabled(false);
        a06.H(1, frgProfilePhoto.c0(), frgProfilePhoto.i0(cic.F));
    }
}
