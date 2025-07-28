package defpackage;

import android.view.View;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: kz7  reason: default package */
public final /* synthetic */ class kz7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPreviewLayout b;

    public /* synthetic */ kz7(MediaBarPreviewLayout mediaBarPreviewLayout, int i) {
        this.a = i;
        this.b = mediaBarPreviewLayout;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    public final void onClick(View view) {
        int i = 1;
        ? r0 = this.b;
        switch (this.a) {
            case 0:
                if (r0.X0 != null) {
                    if (r0.b1) {
                        yzc yzc = r0.a1.b;
                        yzc.getClass();
                        int o = (int) yzc.o(PmsKey.f57maxattachcount, (long) 12);
                        if (r0.V0.f.b() > o) {
                            a06.H(0, r0.getContext(), dhe.s(bic.a, o, r0.getContext()));
                            return;
                        }
                    }
                    ((ActLocalMedias) r0.X0).n0();
                    return;
                }
                return;
            case 1:
                int i2 = MediaBarPreviewLayout.f1;
                pwc pwc = r0.V0.f;
                pwc.p(pwc.l == 2 ? 1 : 2);
                r0.w();
                pwc pwc2 = r0.V0.f;
                if (pwc2.l == 2) {
                    r0.y(pwc2.b() > 1 ? cic.C2 : cic.B2);
                    return;
                } else {
                    r0.y(cic.D2);
                    return;
                }
            case 2:
                int i3 = MediaBarPreviewLayout.f1;
                pwc pwc3 = r0.V0.f;
                if (pwc3.l != 3) {
                    i = 3;
                }
                pwc3.p(i);
                r0.w();
                if (r0.V0.f.l == 3) {
                    r0.y(cic.A2);
                    return;
                } else {
                    r0.y(cic.F2);
                    return;
                }
            default:
                pwc pwc4 = r0.V0.f;
                pwc4.a.clear();
                pwc4.n();
                lz7 lz7 = r0.X0;
                if (lz7 != null) {
                    ActLocalMedias actLocalMedias = (ActLocalMedias) lz7;
                    if (hhd.f(actLocalMedias.b1, "SELECTED_MEDIA_ALBUM")) {
                        actLocalMedias.Y();
                    } else {
                        actLocalMedias.s0();
                    }
                }
                r0.W0.m();
                return;
        }
    }
}
