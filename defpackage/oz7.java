package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: oz7  reason: default package */
public final class oz7 extends b7c implements pl7 {
    public final tg J0;
    public final nz7 K0;
    public final r10 L0;
    public final boolean M0;
    public final hbc N0;
    public final bl7 O0;
    public rwc P0;
    public final SimpleDraweeView Q0;
    public final ProgressBar R0;
    public final View S0;
    public boolean T0;
    public cl7 U0;

    public oz7(View view, tg tgVar, nz7 nz7, r10 r10, boolean z, hbc hbc, bl7 bl7) {
        super(view);
        wce wce;
        this.J0 = tgVar;
        this.K0 = nz7;
        this.L0 = r10;
        this.M0 = z;
        this.N0 = hbc;
        this.O0 = bl7;
        this.Q0 = view.findViewById(yqb.row_media_bar_selected__drawee);
        ProgressBar progressBar = (ProgressBar) view.findViewById(yqb.row_media_bar_selected__progress_bar);
        this.R0 = progressBar;
        this.S0 = view.findViewById(yqb.row_media_bar_selected__progress_background);
        a24.a0(view, new eu5(10, this));
        if (view.isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context = view.getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context);
        }
        view.setBackgroundColor(wce.m);
        js.E(progressBar, hq3.a(view.getContext(), xhc.f));
    }

    public final void C(boolean z) {
        int i = 8;
        this.R0.setVisibility(z ? 0 : 8);
        if (z) {
            i = 0;
        }
        this.S0.setVisibility(i);
    }

    public final void O(tk7 tk7, Uri uri, int i, Uri uri2) {
        tk7 tk72;
        rwc rwc = this.P0;
        if (rwc != null && (tk72 = rwc.a) != null && tk7.b == tk72.b) {
            SimpleDraweeView simpleDraweeView = this.Q0;
            if (uri == null) {
                simpleDraweeView.setController((gn4) null);
                return;
            }
            ur6 d = ur6.d(uri);
            if (uri2 != null) {
                d.l = new pha(uri2);
            }
            d.d = this.N0;
            if (i != 0) {
                d.l = new mpa(i, 0);
            }
            ywa a = a06.a.a();
            a.e = d.a();
            a.l = simpleDraweeView.getController();
            simpleDraweeView.setController(a.a());
        }
    }
}
