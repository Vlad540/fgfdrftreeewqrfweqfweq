package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: i17  reason: default package */
public final class i17 extends ConstraintLayout implements mhe {
    public final /* synthetic */ InviteByPhoneScreen K0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i17(InviteByPhoneScreen inviteByPhoneScreen, Context context) {
        super(context);
        this.K0 = inviteByPhoneScreen;
    }

    public final void onThemeChanged(pda pda) {
        k77[] k77Arr = InviteByPhoneScreen.F0;
        InviteByPhoneScreen inviteByPhoneScreen = this.K0;
        inviteByPhoneScreen.getClass();
        k77[] k77Arr2 = InviteByPhoneScreen.F0;
        ((TextView) inviteByPhoneScreen.Y.T0(inviteByPhoneScreen, k77Arr2[1])).setTextColor(pda.getText().e);
        ((TextView) inviteByPhoneScreen.Z.T0(inviteByPhoneScreen, k77Arr2[2])).setTextColor(pda.getText().f);
        AppCompatTextView appCompatTextView = inviteByPhoneScreen.z0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(pda.getText().b);
        }
        inviteByPhoneScreen.n0().onThemeChanged(pda);
        inviteByPhoneScreen.m0().e();
        ((nea) inviteByPhoneScreen.y0.T0(inviteByPhoneScreen, k77Arr2[5])).onThemeChanged(pda);
    }
}
