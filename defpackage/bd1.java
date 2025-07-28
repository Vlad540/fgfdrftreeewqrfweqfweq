package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: bd1  reason: default package */
public final class bd1 extends chd {
    public final /* synthetic */ int J0 = 0;
    public final Object K0;
    public final ViewGroup L0;

    public bd1(s1a s1a, f fVar) {
        super(s1a);
        this.K0 = fVar;
        this.L0 = s1a;
    }

    public final void A(pg7 pg7) {
        switch (this.J0) {
            case 0:
                hr1.r(pg7);
                ((j91) this.L0).setListener((i91) this.K0);
                return;
            case 1:
                t91 t91 = (t91) pg7;
                ((rj1) this.L0).setListener((qj1) this.K0);
                return;
            default:
                igd igd = pg7 instanceof igd ? (igd) pg7 : null;
                if (igd != null) {
                    s1a s1a = this.L0;
                    CharSequence a = igd.a.a(s1a.getContext());
                    CharSequence charSequence = BuildConfig.FLAVOR;
                    if (a == null) {
                        a = charSequence;
                    }
                    s1a.setTextTitle(a);
                    CharSequence a2 = igd.b.a(s1a.getContext());
                    if (a2 != null) {
                        charSequence = a2;
                    }
                    s1a.setTextSubtitle(charSequence);
                    a24.Z(s1a, 300, new ub(this, 7, charSequence));
                    return;
                }
                return;
        }
    }

    public bd1(FrameLayout frameLayout, i91 i91) {
        super(frameLayout);
        this.K0 = i91;
        this.L0 = (j91) frameLayout.findViewById(uob.call_invite_opponent_preview);
    }

    public bd1(FrameLayout frameLayout, qj1 qj1) {
        super(frameLayout);
        this.K0 = qj1;
        this.L0 = (rj1) frameLayout.findViewById(uob.call_copy_link_preview);
    }
}
