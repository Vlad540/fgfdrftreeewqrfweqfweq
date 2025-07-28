package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.members.list.MembersListWidget;
import one.me.profile.ProfileScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: t61  reason: default package */
public final class t61 implements ny4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ t61(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public final void l() {
        String str;
        SuggestionsWidget suggestionsWidget = this.b;
        switch (this.a) {
            case 0:
                kk9 kk9 = CallHistoryPageScreen.y0;
                rp1 rp1 = ((CallHistoryPageScreen) suggestionsWidget).o0().X;
                rp1.getClass();
                rp1.g(new t50((Object) rp1, true, 5));
                return;
            case 1:
                k77[] k77Arr = ChatsListSearchScreen.N0;
                bt2 m0 = ((ChatsListSearchScreen) suggestionsWidget).m0();
                qod qod = m0.R0;
                if (qod == null || !qod.isActive()) {
                    grd grd = m0.I0;
                    grd.m((Object) null, js2.a((js2) grd.getValue(), is2.b, (dp6) null, (ArrayList) null, false, 30));
                    os2 os2 = new os2(m0, (Continuation) null);
                    m0.R0 = xs7.E(m0.a, m0.P0, (ru3) null, os2, 2);
                    return;
                }
                return;
            case 2:
                k77[] k77Arr2 = ChatsListWidget.O0;
                ((ChatsListWidget) suggestionsWidget).o0().X.e();
                return;
            case 3:
                k77[] k77Arr3 = LogsViewerScreen.Y;
                ((LogsViewerScreen) suggestionsWidget).l0().q();
                return;
            case 4:
                k77[] k77Arr4 = MediaGalleryWidget.Z;
                m66 n0 = ((MediaGalleryWidget) suggestionsWidget).n0();
                n0.getClass();
                udd.p("m66", "loadMoreItems()", new Object[0]);
                qod qod2 = n0.M0;
                if ((qod2 == null || !qod2.isActive()) && !((Boolean) n0.D0.getValue()).booleanValue()) {
                    try {
                        g37 g37 = n0.L0;
                        if (g37 != null) {
                            g37.cancel((CancellationException) null);
                        }
                    } catch (Throwable unused) {
                    }
                    n0.L0 = taf.n(n0, n0.s().e().plus(n0.o), (ru3) null, new b66(n0, (Continuation) null), 2);
                    return;
                }
                udd.p("m66", "try to load more items when loading in process, ignore it", new Object[0]);
                return;
            case 5:
                k77[] k77Arr5 = MembersListWidget.H0;
                ((ck8) ((MembersListWidget) suggestionsWidget).o0().w0.getValue()).e();
                return;
            case 6:
                k77[] k77Arr6 = PickerChatsListWidget.A0;
                ((PickerChatsListWidget) suggestionsWidget).o0().b.e();
                return;
            case 7:
                k77[] k77Arr7 = PickerChatsListWidget2.G0;
                ((PickerChatsListWidget2) suggestionsWidget).p0().c.e();
                return;
            case 8:
                k77[] k77Arr8 = ProfileScreen.H0;
                ((ProfileScreen) suggestionsWidget).q0().T0.s();
                return;
            case 9:
                k77[] k77Arr9 = StickersSearchScreen.y0;
                cwd m02 = ((StickersSearchScreen) suggestionsWidget).m0();
                xvd xvd = (xvd) m02.A0.get();
                qod qod3 = m02.C0;
                if ((qod3 == null || !qod3.isActive()) && (str = xvd.a) != null && str.length() != 0) {
                    m02.C0 = taf.n(m02, m02.c.b(), (ru3) null, new zvd(m02, xvd, (Continuation) null), 2);
                    return;
                }
                return;
            case 10:
                k77[] k77Arr10 = StickersShowcaseScreen.z0;
                sxd m03 = ((StickersShowcaseScreen) suggestionsWidget).m0();
                qwd qwd = m03.X;
                if (qwd.a()) {
                    qod qod4 = qwd.h;
                    if (qod4 == null || !qod4.isActive()) {
                        qwd.h = xs7.E(qwd.c, (hu3) null, (ru3) null, new owd(qwd, (Continuation) null), 3);
                        return;
                    }
                    return;
                }
                lwd lwd = m03.c;
                qod qod5 = lwd.g;
                if (qod5 == null || !qod5.isActive()) {
                    lwd.g = xs7.E(lwd.c, (hu3) null, (ru3) null, new jwd(lwd, (Continuation) null), 3);
                    return;
                }
                return;
            default:
                k77[] k77Arr11 = SuggestionsWidget.F0;
                e3e A0 = suggestionsWidget.A0();
                A0.q(((Number) A0.L0.getValue()).intValue(), (String) A0.K0.getValue());
                return;
        }
    }

    public final boolean m() {
        SuggestionsWidget suggestionsWidget = this.b;
        switch (this.a) {
            case 0:
                kk9 kk9 = CallHistoryPageScreen.y0;
                return ((CallHistoryPageScreen) suggestionsWidget).o0().r();
            case 1:
                k77[] k77Arr = ChatsListSearchScreen.N0;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) suggestionsWidget;
                if (((js2) chatsListSearchScreen.m0().J0.a.getValue()).a != is2.b && ((js2) chatsListSearchScreen.m0().J0.a.getValue()).b.length() > 0) {
                    vs7 vs7 = chatsListSearchScreen.m0().o;
                    if ((!tic.c(vs7.k) || vs7.r != null) && chatsListSearchScreen.E0.j() > 0) {
                        return true;
                    }
                }
                return false;
            case 2:
                k77[] k77Arr2 = ChatsListWidget.O0;
                return ((hq2) ((ChatsListWidget) suggestionsWidget).o0().J0.getValue()).b;
            case 3:
                return true;
            case 4:
                k77[] k77Arr3 = MediaGalleryWidget.Z;
                m66 n0 = ((MediaGalleryWidget) suggestionsWidget).n0();
                o46 o46 = (o46) n0.F0.getValue();
                if (o46 == null) {
                    return false;
                }
                boolean b2 = n0.X.b(o46);
                udd.p("m66", "canLoadMoreItems = " + b2, new Object[0]);
                return b2;
            case 5:
                k77[] k77Arr4 = MembersListWidget.H0;
                return ((ck8) ((MembersListWidget) suggestionsWidget).o0().w0.getValue()).c();
            case 6:
                k77[] k77Arr5 = PickerChatsListWidget.A0;
                return ((hq2) ((PickerChatsListWidget) suggestionsWidget).o0().c.getValue()).b;
            case 7:
                return PickerChatsListWidget2.m0((PickerChatsListWidget2) suggestionsWidget);
            case 8:
                k77[] k77Arr6 = ProfileScreen.H0;
                return ((ProfileScreen) suggestionsWidget).q0().T0.w();
            case 9:
                k77[] k77Arr7 = StickersSearchScreen.y0;
                return ((StickersSearchScreen) suggestionsWidget).m0().r();
            case 10:
                k77[] k77Arr8 = StickersShowcaseScreen.z0;
                return ((StickersShowcaseScreen) suggestionsWidget).m0().r();
            default:
                k77[] k77Arr9 = SuggestionsWidget.F0;
                e3e A0 = suggestionsWidget.A0();
                if (!hhd.f(A0.F0.a, String.valueOf((String) A0.K0.getValue()))) {
                    return false;
                }
                return A0.F0.f;
        }
    }
}
