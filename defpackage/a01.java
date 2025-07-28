package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.ColorDrawable;
import java.util.Collections;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: a01  reason: default package */
public final /* synthetic */ class a01 implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ a01(int i) {
        this.a = i;
    }

    public final Object invoke() {
        oed oed = oed.a;
        Class<qna> cls = qna.class;
        switch (this.a) {
            case 0:
                int i = f01.Y0;
                return -231920335;
            case 1:
                return Boolean.valueOf(((jb5) bh1.a.getAccessor().d(jb5.class).getValue()).r());
            case 2:
                float f = dh4.c().getDisplayMetrics().density * 32.0f;
                return new float[]{f, f, f, f, f, f, f, f};
            case 3:
                return new AnimatorSet();
            case 4:
                return z11.a.c();
            case 5:
                return new q75(50);
            case 6:
                return new q75(50);
            case 7:
                float f2 = dh4.c().getDisplayMetrics().density * 40.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case 8:
                int i2 = CallEventsWidget.X;
                bh1 bh1 = bh1.a;
                return new r41(bh1.b(), bh1.getAccessor().d(xk1.class), (pae) bh1.getAccessor().c(pae.class), z11.a.b());
            case 9:
                kk9 kk9 = CallHistoryPageScreen.y0;
                hge hge = new hge(ctb.call_history_item_call_context_action_remove);
                int i3 = bnb.ic_delete_22;
                return Collections.singletonList(new pq3(0, hge, Integer.valueOf(j9a.J), Integer.valueOf(i3), Integer.valueOf(j9a.F)));
            case 10:
                j61.c.Z1((Long) null, (String) null, (CharSequence) null);
                return jue.a;
            case 11:
                mk9 mk9 = CallIncomingScreen.Z;
                return (qna) z11.a.getAccessor().c(cls);
            case 12:
                return new xh1();
            case 13:
                return new ColorDrawable(0);
            case 14:
                k77[] k77Arr = CallJoinLinkPreviewWidget.F0;
                return mnc.O0;
            case 15:
                k77[] k77Arr2 = CallLinkInfoScreen.F0;
                return mnc.N0;
            case 16:
                k77[] k77Arr3 = CallMoreBottomSheet.B0;
                return new w4c();
            case 17:
                return new zo4(11).thenComparingLong(new id1(new hd1(0))).thenComparing(new zo4(12)).reversed();
            case 18:
                k77[] k77Arr4 = CallOpponentsListWidget.L0;
                return mnc.K1;
            case 19:
                k77[] k77Arr5 = CallOpponentsListWidget.L0;
                return oed;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                k77[] k77Arr6 = CallOpponentsListWidget.L0;
                float f3 = dh4.c().getDisplayMetrics().density * 12.0f;
                return new float[]{f3, f3, f3, f3, f3, f3, f3, f3};
            case 21:
                return z11.a.c();
            case 22:
                k77[] k77Arr7 = cf1.B0;
                return 262952;
            case 23:
                k77[] k77Arr8 = cf1.B0;
                return null;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                smc smc = CallScreen.T0;
                return (dj1) z11.a.getAccessor().c(dj1.class);
            case 25:
                smc smc2 = CallScreen.T0;
                return oed;
            case 26:
                smc smc3 = CallScreen.T0;
                return mnc.P0;
            case 27:
                smc smc4 = CallScreen.T0;
                return new fna(z11.a.getAccessor().d(cls));
            case 28:
                smc smc5 = CallScreen.T0;
                return new ck1();
            default:
                return new f5f(z11.a.getAccessor().d(so1.class));
        }
    }
}
