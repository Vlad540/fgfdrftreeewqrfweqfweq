package ru.ok.messages.media.mediabar;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.b;
import ru.ok.messages.views.fragments.FrgSlideOut;

public abstract class FrgLocalMedia extends FrgSlideOut implements pl7 {
    public tk7 G1;
    public boolean H1;
    public cl7 I1;
    public ProgressBar J1;
    public View K1;
    public boolean L1;

    public static Bundle t1(tk7 tk7, boolean z, qk7 qk7) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ru.ok.messages.extra.LOCAL_MEDIA", tk7);
        bundle.putBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT", z);
        bundle.putParcelable("ru.ok.messages.extra.OPTIONS", qk7);
        return bundle;
    }

    public final void C(boolean z) {
        ProgressBar progressBar = this.J1;
        if (progressBar == null || this.K1 == null) {
            this.L1 = z;
            return;
        }
        boolean z2 = !z;
        at7.A(progressBar, z2);
        at7.A(this.K1, z2);
    }

    public final boolean D() {
        return !this.H1;
    }

    public void I0() {
        super.I0();
        cl7 cl7 = this.I1;
        pwc pwc = cl7.b;
        pwc.f.remove(cl7);
        pwc.g.remove(cl7);
    }

    public void L0() {
        super.L0();
        cl7 cl7 = this.I1;
        pwc pwc = cl7.b;
        pwc.f.add(cl7);
        pwc.g.add(cl7);
    }

    public final void N(int i) {
        f16 f16 = (f16) h1();
        if (f16 != null) {
            ActLocalMedias actLocalMedias = (ActLocalMedias) f16;
            if (!actLocalMedias.c1.y0) {
                pwc pwc = actLocalMedias.l0().f;
                pwc.a.clear();
                pwc.n();
                pwc.b.clear();
                if (((kp) pwc.h).g.getBoolean("app.send.media.as.collage", true)) {
                    pwc.l = 3;
                } else {
                    pwc.l = 1;
                }
            }
        }
        if (this.H1) {
            b c0 = c0();
            c0.getClass();
            y7.a(c0);
            return;
        }
        super.N(i);
    }

    public void P0(View view, Bundle bundle) {
        view.setBackgroundColor(-16777216);
        this.J1 = (ProgressBar) view.findViewById(yqb.frg_local_media__progress_bar);
        this.K1 = view.findViewById(yqb.frg_local_media__progress_background);
        js.E(this.J1, hq3.a(e0(), xhc.f));
        at7.A(this.J1, !this.L1);
        at7.A(this.K1, !this.L1);
    }

    public final String g1() {
        return null;
    }

    public final void n1(r5 r5Var) {
        super.n1(r5Var);
        if (!(c0() instanceof f16)) {
            throw new IllegalStateException("Parent activity must implement FrgLocalMedia.Listener interface");
        }
    }

    public void u1() {
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        mif i1 = i1();
        Z0(true);
        if (i1 != null) {
            i1.m();
        }
        Bundle bundle2 = this.Z;
        this.G1 = (tk7) bundle2.getParcelable("ru.ok.messages.extra.LOCAL_MEDIA");
        this.H1 = bundle2.getBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT");
        qk7 qk7 = (qk7) bundle2.getParcelable("ru.ok.messages.extra.OPTIONS");
        this.I1 = ((bl7) ((k93) this.t1.b).getAccessor().c(bl7.class)).a(this, this.G1);
    }

    public void z0() {
        super.z0();
        this.I1.a();
    }
}
