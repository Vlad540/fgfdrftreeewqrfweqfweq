package defpackage;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* renamed from: s17  reason: default package */
public final class s17 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByQrBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s17(InviteByQrBottomSheet inviteByQrBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.Y = inviteByQrBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((s17) n((mjb) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        s17 s17 = new s17(this.Y, continuation);
        s17.X = obj;
        return s17;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        mjb mjb = (mjb) this.X;
        InviteByQrBottomSheet inviteByQrBottomSheet = this.Y;
        InviteByQrBottomSheet.z0(inviteByQrBottomSheet).setText(mjb.a);
        n0c n0c = inviteByQrBottomSheet.E0;
        CharSequence charSequence = mjb.b;
        if (charSequence == null || h0e.c0(charSequence)) {
            InviteByQrBottomSheet.A0(inviteByQrBottomSheet).setVisibility(8);
            ((LinearLayout.LayoutParams) InviteByQrBottomSheet.z0(inviteByQrBottomSheet).getLayoutParams()).topMargin = a24.X(((float) 27) * dh4.c().getDisplayMetrics().density);
            ((LinearLayout.LayoutParams) ((AppCompatImageView) n0c.T0(inviteByQrBottomSheet, InviteByQrBottomSheet.I0[2])).getLayoutParams()).topMargin = a24.X(((float) 15) * dh4.c().getDisplayMetrics().density);
        } else {
            InviteByQrBottomSheet.A0(inviteByQrBottomSheet).setVisibility(0);
            float f = (float) 18;
            ((LinearLayout.LayoutParams) InviteByQrBottomSheet.z0(inviteByQrBottomSheet).getLayoutParams()).topMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
            ((LinearLayout.LayoutParams) ((AppCompatImageView) n0c.T0(inviteByQrBottomSheet, InviteByQrBottomSheet.I0[2])).getLayoutParams()).topMargin = a24.X(f * dh4.c().getDisplayMetrics().density);
        }
        InviteByQrBottomSheet.A0(inviteByQrBottomSheet).setText(charSequence);
        ((AppCompatImageView) n0c.T0(inviteByQrBottomSheet, InviteByQrBottomSheet.I0[2])).setImageBitmap(mjb.c);
        return jue.a;
    }
}
