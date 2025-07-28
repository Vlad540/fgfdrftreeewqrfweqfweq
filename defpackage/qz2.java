package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;

/* renamed from: qz2  reason: default package */
public final /* synthetic */ class qz2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClearRecentSearchBottomSheet b;

    public /* synthetic */ qz2(ClearRecentSearchBottomSheet clearRecentSearchBottomSheet, int i) {
        this.a = i;
        this.b = clearRecentSearchBottomSheet;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                BaseBottomSheetWidget baseBottomSheetWidget = this.b;
                baseBottomSheetWidget.r0(true);
                rr3 targetController = baseBottomSheetWidget.getTargetController();
                pz2 pz2 = targetController instanceof pz2 ? (pz2) targetController : null;
                if (pz2 != null) {
                    bt2 m0 = ((ChatsListSearchScreen) pz2).m0();
                    qod qod = m0.S0;
                    if (qod == null || !qod.isActive()) {
                        m0.S0 = xs7.E(m0.a, m0.P0, (ru3) null, new ks2(m0, (Continuation) null), 2);
                        return;
                    }
                    return;
                }
                return;
            default:
                this.b.r0(true);
                return;
        }
    }
}
