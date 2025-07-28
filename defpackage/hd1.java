package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* renamed from: hd1  reason: default package */
public final /* synthetic */ class hd1 implements u16 {
    public final /* synthetic */ int a;

    public /* synthetic */ hd1(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        jue jue = jue.a;
        switch (this.a) {
            case 0:
                return Long.valueOf(Long.MAX_VALUE - ((ad1) obj).Z);
            case 1:
                k77[] k77Arr = CallOpponentsListWidget.L0;
                ((EditText) obj).getText().clear();
                return jue;
            case 2:
                return Integer.valueOf(((pda) obj).getIcon().e);
            case 3:
                ((pda) obj).getIcon();
                return new a1f(-1, -16745729);
            case 4:
                ((Long) obj).getClass();
                k77[] k77Arr2 = ChangeOwnerScreen.y0;
                return hw4.a;
            case 5:
                return Integer.valueOf(((pda) obj).getIcon().i);
            case 6:
                ((pda) obj).getIcon();
                return new a1f(-1, -16745729);
            case 7:
                return ((ym8) obj).a(true, false);
            case 8:
                return Integer.valueOf(((pda) obj).getText().g);
            case 9:
                return Integer.valueOf(((pda) obj).getText().g);
            case 10:
                return new a1f(0, ((pda) obj).getIcon().a.c);
            case 11:
                return Integer.valueOf(((pda) obj).getText().g);
            case 12:
                return Integer.valueOf(((pda) obj).getIcon().i);
            case 13:
                return Integer.valueOf(((pda) obj).getText().g);
            case 14:
                return Integer.valueOf(((pda) obj).getText().f);
            case 15:
                View view = (View) obj;
                k77[] k77Arr3 = ChatMediaTabWidget.A0;
                kdb.c.f2();
                return jue;
            case 16:
                y52 y52 = (y52) obj;
                b62 b62 = y52.r;
                if (b62 == null) {
                    b62 = b62.g;
                }
                a62 a2 = b62.a();
                a2.c = 0;
                y52.r = a2.a();
                return jue;
            case 17:
                hr8 hr8 = (hr8) obj;
                return "p_id=" + hr8.a + ",m_id=" + hr8.e + ",sender=" + hr8.g;
            case 18:
                hr8 hr82 = (hr8) obj;
                return new or9(hr82.c, hr82.e, hr82.i, ep4.c);
            case 19:
                View view2 = (View) obj;
                k77[] k77Arr4 = ChatNotificationsSettingsScreen.Y;
                lp9.c.P1().d();
                return jue;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                pda pda = (pda) obj;
                k77[] k77Arr5 = ChatScreen.n1;
                pda.a().o().c.getClass();
                return new a1f(-1, pda.a().o().c.a);
            case 21:
                return h2g.s((String) obj);
            case 22:
                if (((pi2) obj).F0 != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                i22 i22 = (i22) obj;
                o62 o62 = i22.b;
                if ((o62.b != n62.c && o62.a == 0 && o62.j == 0 && o62.f0 == null) || i22.D() || (o62.H.g && i22.c == null)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                View view3 = (View) obj;
                k77[] k77Arr6 = ChatsListSearchScreen.N0;
                return jue;
            case 25:
                nrc nrc = (nrc) obj;
                return nrc.getItemId() + "/" + m4b.k(nrc.a);
            case 26:
                return ((pi2) obj).G0;
            case 27:
                return Boolean.valueOf(((i22) obj).K());
            case 28:
                View view4 = (View) obj;
                k77[] k77Arr7 = ChatsTabWidget.F0;
                zu2.c.P1().b(":start-conversation", (Bundle) null);
                return jue;
            default:
                ((Integer) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
