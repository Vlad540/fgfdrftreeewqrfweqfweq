package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.ProgressBar;
import androidx.fragment.app.c;
import java.io.File;
import java.util.ArrayList;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.views.dialogs.ProgressDialog;

/* renamed from: xc5  reason: default package */
public final /* synthetic */ class xc5 implements of3, v1b {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad5 b;

    public /* synthetic */ xc5(ad5 ad5, int i) {
        this.a = i;
        this.b = ad5;
    }

    public void accept(Object obj) {
        ProgressDialog E;
        ad5 ad5 = this.b;
        switch (this.a) {
            case 0:
                o10 o10 = (o10) obj;
                if (ad5.a()) {
                    int i = (int) o10.p;
                    c cVar = ((FrgAttachVideo) ad5.d).J0;
                    if (cVar != null && (E = cVar.E("ru.ok.messages.views.dialogs.ProgressDialog")) != null) {
                        ((ProgressBar) E.j1().findViewById(yqb.dialog_progress__progress)).setProgress(i);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sna sna = (sna) obj;
                if (r1g.p(ad5.j) || !urd.Q(sna.b, sna.c, urd.v())) {
                    ad5.j = null;
                    ad5.k = false;
                    ad5.m = false;
                    ad5.l = 0;
                    return;
                }
                ad5.d(ad5.j, ad5.k);
                return;
            default:
                o10 o102 = (o10) obj;
                if (ad5.a()) {
                    ((FrgAttachVideo) ad5.d).k1();
                    if (wce.b(o102.j.c, false)) {
                        ad5.e.f("ACTION_THEME_SHARE_EXTERNAL");
                    }
                    mg5 mg5 = ad5.g;
                    File h = mg5.h(o102);
                    Context e0 = ad5.c.e0();
                    if (e0 != null) {
                        ArrayList arrayList = swb.d;
                        try {
                            Uri f = mg5.f(e0, h);
                            stf stf = new stf(e0);
                            ((Intent) stf.b).setType("*/*");
                            stf.K(f);
                            stf.L((CharSequence) null);
                            stf.M();
                            return;
                        } catch (Exception e) {
                            udd.s("swb", "shareFile error", e);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public boolean test(Object obj) {
        xm8 xm8 = (xm8) obj;
        ad5 ad5 = this.b;
        ad5.getClass();
        vo8 vo8 = xm8.a;
        return vo8.b == ad5.i && vo8.m() && xm8.a.g() != null;
    }
}
