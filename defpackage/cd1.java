package defpackage;

import android.widget.FrameLayout;

/* renamed from: cd1  reason: default package */
public final class cd1 extends chd {
    public final pm1 J0;
    public final sm1 K0;

    public cd1(FrameLayout frameLayout, pm1 pm1) {
        super(frameLayout);
        this.J0 = pm1;
        this.K0 = (sm1) frameLayout.findViewById(uob.call_opponent);
    }

    public final void A(pg7 pg7) {
        s91 s91 = (s91) pg7;
        CharSequence charSequence = s91.c;
        String str = s91.o;
        sm1 sm1 = this.K0;
        sm1.K(str, charSequence);
        sm1.G(s91.w0);
        sm1.I(s91.Y);
        sm1.setAvatar(s91.X);
        sm1.setRaiseHand(s91.z0);
        sm1.setOpponentVideo(s91.D0);
        sm1.setButtonAction(s91.E0);
        sm1.l1 = s91.a;
        sm1.f1 = this.J0;
    }
}
