package defpackage;

import kotlin.coroutines.Continuation;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: lb2  reason: default package */
public final class lb2 extends x9 {
    public final /* synthetic */ int c;
    public final /* synthetic */ BaseBottomSheetWidget d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb2(BaseBottomSheetWidget baseBottomSheetWidget, int i) {
        super(baseBottomSheetWidget, 1);
        this.c = i;
        this.d = baseBottomSheetWidget;
    }

    public int a() {
        switch (this.c) {
            case 1:
                k77[] k77Arr = WebAppRootScreen.K0;
                if (this.d.A0()) {
                    return 0;
                }
                return c();
            default:
                return lb2.super.a();
        }
    }

    public int b() {
        switch (this.c) {
            case 1:
                return 2;
            default:
                return lb2.super.b();
        }
    }

    public int c() {
        switch (this.c) {
            case 1:
                k77[] k77Arr = WebAppRootScreen.K0;
                if (this.d.A0()) {
                    return 0;
                }
                return lb2.super.c();
            default:
                return lb2.super.c();
        }
    }

    public void k() {
        switch (this.c) {
            case 0:
                k77[] k77Arr = ChatMediaDownloadBottomSheet.I0;
                ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = this.d;
                ez3.N(new ck5(wx3.e(((zb2) chatMediaDownloadBottomSheet.C0.getValue()).z0, chatMediaDownloadBottomSheet.getViewLifecycleOwner().R(), ob7.X), new kb2((Continuation) null, chatMediaDownloadBottomSheet), 5), chatMediaDownloadBottomSheet.getViewLifecycleScope());
                return;
            default:
                lb2.super.k();
                return;
        }
    }

    public boolean n(float f, float f2) {
        switch (this.c) {
            case 1:
                k77[] k77Arr = WebAppRootScreen.K0;
                WebAppRootScreen webAppRootScreen = this.d;
                return !webAppRootScreen.A0() && webAppRootScreen.z0().b;
            default:
                return lb2.super.n(f, f2);
        }
    }
}
