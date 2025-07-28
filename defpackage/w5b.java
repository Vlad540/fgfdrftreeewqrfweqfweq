package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import org.apache.http.protocol.HTTP;

/* renamed from: w5b  reason: default package */
public final class w5b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w5b(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((g6b) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        w5b w5b = new w5b(continuation, this.Y);
        w5b.X = obj;
        return w5b;
    }

    public final Object o(Object obj) {
        CharSequence a;
        wx3.H(obj);
        g6b g6b = (g6b) this.X;
        boolean z = g6b instanceof e6b;
        jue jue = jue.a;
        int i = 1;
        rr3 rr3 = this.Y;
        if (z) {
            bm3.p(rr3);
            pfa.a(1).e(((e6b) g6b).b).j((ImageView) rr3.Z.T0(rr3, ProfileChangeLinkScreen.z0[2])).build().q(rr3);
        } else {
            CharSequence charSequence = null;
            if (g6b instanceof f6b) {
                f6b f6b = (f6b) g6b;
                mge mge = f6b.b;
                if (mge == null || (a = mge.a(rr3.getContext())) == null) {
                    return jue;
                }
                mge mge2 = f6b.c;
                if (mge2 != null) {
                    charSequence = mge2.a(rr3.getContext());
                }
                hba hba = new hba((Widget) rr3);
                hba.i(a);
                hba.b(charSequence);
                if (!f6b.d) {
                    i = 2;
                }
                hba.e(i);
                hba.c(new pba(0, ProfileChangeLinkScreen.l0(rr3).getVisibility() == 0 ? (a24.X(((float) 12) * dh4.c().getDisplayMetrics().density) * 2) + ProfileChangeLinkScreen.l0(rr3).getMeasuredHeight() : 0, 3));
                Integer num = f6b.e;
                hba.f(num != null ? new vba(num.intValue()) : wba.a);
                hba.j();
            } else if (g6b instanceof c6b) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", ((c6b) g6b).b.a(rr3.getContext()));
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                s8b.c.P1().b(":chats/share", jjd.j(new wia[]{new wia("ru.ok.tamtam.extra.DATA", intent), new wia("ru.ok.tamtam.extra.SHARE_TITLE", d8.u(rr3.getContext(), i8a.Q1)), new wia("tag", ProfileChangeLinkScreen.class.getName())}));
            } else if (g6b instanceof z5b) {
                ((ClipboardManager) rr3.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied Text", ((z5b) g6b).b));
            } else if (g6b instanceof d6b) {
                k77[] k77Arr = BottomSheetWidget.B0;
                d6b d6b = (d6b) g6b;
                jc3 a2 = a24.a(d6b.b, (Bundle) null, 6);
                a2.f(d6b.c);
                d6b.d.forEach(new fh2(new hh2(1, a2, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 8), 7));
                ConfirmationBottomSheet e = a2.e();
                e.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                if (ygc != null) {
                    charSequence = ygc.S();
                }
                e.y0(rr3);
                if (charSequence != null) {
                    vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    charSequence.G(vgc);
                }
            } else if (g6b instanceof a6b) {
                String str = oyb.g;
                Context context = rr3.getContext();
                CharSequence a3 = ((a6b) g6b).b.a(rr3.getContext());
                if (a3 == null) {
                    a3 = "";
                }
                oyb.R(context, a3);
            } else if (g6b instanceof b6b) {
                s8b.c.P1().e(new r8b(0, new e98(rr3, g6b, 23)));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue;
    }
}
