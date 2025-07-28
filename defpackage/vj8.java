package defpackage;

import one.me.members.list.MembersListWidget;

/* renamed from: vj8  reason: default package */
public final /* synthetic */ class vj8 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MembersListWidget b;

    public /* synthetic */ vj8(MembersListWidget membersListWidget, int i) {
        this.a = i;
        this.b = membersListWidget;
    }

    /* JADX WARNING: type inference failed for: r15v3, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    public final Object invoke() {
        MembersListWidget membersListWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MembersListWidget.H0;
                return xy6.n(membersListWidget.m0().getContext());
            case 1:
                k77[] k77Arr2 = MembersListWidget.H0;
                s16 s16 = membersListWidget.n0().o;
                r7e r7e = new r7e(new vj8(membersListWidget, 2));
                vj8 vj8 = new vj8(membersListWidget, 3);
                return new uj8(membersListWidget.b, membersListWidget.c, r7e, membersListWidget.o, vj8, s16);
            case 2:
                k77[] k77Arr3 = MembersListWidget.H0;
                ej8 ej8 = ej8.a;
                r7e d = ej8.getAccessor().d(pae.class);
                r7e d2 = ej8.getAccessor().d(ap3.class);
                r7e d3 = ej8.getAccessor().d(bv2.class);
                r7e d4 = ej8.getAccessor().d(v86.class);
                t97 d5 = ej8.getAccessor().d(gsc.class);
                r7e d6 = ej8.getAccessor().d(f03.class);
                t97 d7 = ej8.getAccessor().d(r59.class);
                long j = membersListWidget.b;
                i22 i22 = (i22) ((aw2) ((bv2) d3.getValue())).m(j).a.getValue();
                if (i22 == null) {
                    udd.s(ek8.class.getName(), us8.j(j, "We're trying to create members loader for chat(#", ") without the chat in cache"), (Throwable) null);
                    return new bk8();
                }
                int c = i22.b.c();
                ch2 ch2 = membersListWidget.c;
                if (c > 99 || i22.G()) {
                    return new vk0(j, ch2, (pae) d.getValue(), d3, d2, d4, d7);
                }
                return new fkd(j, ch2, (f03) d6.getValue(), d3, d2, d5, (pae) d.getValue(), d7);
            default:
                k77[] k77Arr4 = MembersListWidget.H0;
                return membersListWidget.n0().c;
        }
    }
}
