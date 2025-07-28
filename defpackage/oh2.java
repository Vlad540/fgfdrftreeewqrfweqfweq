package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: oh2  reason: default package */
public final class oh2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oh2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke() {
        jue jue = jue.a;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatMembersScreen.y0;
                ((ChatMembersScreen) obj).n0().q();
                return jue;
            case 1:
                return (aq2) obj;
            case 2:
                return (Boolean) ((hc3) obj).c2.invoke();
            case 3:
                return Class.forName((String) obj);
            default:
                k77[] k77Arr2 = MessagesListWidget.b1;
                zz8 t0 = ((MessagesListWidget) obj).t0();
                ktd ktd = (ktd) t0.G1.getValue();
                if (ktd != null) {
                    ((luf) t0.Y0.getValue()).a(new u0d(new t0d(t0.b.a, ktd.a, 1)));
                }
                tt6 tt6 = (tt6) xv8.a.getAccessor().e();
                if (tt6 != null) {
                    tt6.f(z3d.N(new st6[]{new st6(qt6.b, 1), new st6(qt6.Y, 1)}), mnc.CHAT);
                }
                return jue;
        }
    }
}
