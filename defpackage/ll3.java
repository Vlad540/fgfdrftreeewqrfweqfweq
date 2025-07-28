package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: ll3  reason: default package */
public final /* synthetic */ class ll3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ ll3(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    public final Object invoke() {
        hea hea = null;
        ql3 ql3 = ql3.a;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ContactListWidget.S0;
                k77 k77 = k77Arr[7];
                if (((Boolean) widget.P0.a(widget)).booleanValue()) {
                    ((EndlessRecyclerView2) widget.F0.T0(widget, k77Arr[2])).x0(0);
                    k77 k772 = k77Arr[7];
                    widget.P0.b(widget, Boolean.FALSE);
                }
                return jue.a;
            case 1:
                k77[] k77Arr2 = ContactListWidget.S0;
                return Boolean.valueOf(((bk3) widget.o0().B0.a.getValue()).b());
            case 2:
                k77[] k77Arr3 = ContactListWidget.S0;
                return widget.getRouter();
            case 3:
                k77[] k77Arr4 = ContactListWidget.S0;
                nea nea = new nea(widget.getContext(), 6);
                nea.setId(p2a.t);
                int ordinal = widget.o0().b.ordinal();
                if (ordinal == 0) {
                    nea.setForm(fea.a);
                    nea.setTitle(ltb.contact_list_call_contact_title);
                } else if (ordinal == 1) {
                    nea.setForm(fea.b);
                    nea.setTitle(cic.O);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (rl3.$EnumSwitchMapping$1[widget.o0().b.ordinal()] == 1) {
                    nea.setLeftActions(new vda(new ml3(widget, 2)));
                }
                iea iea = new iea(new mb1(6, widget));
                int ordinal2 = widget.o0().b.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        hea = new hea(phc.M0, 0, new ml3(widget, 1), 14);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                nea.setRightActions(new aea(iea, hea));
                raa searchView = nea.getSearchView();
                if (searchView != null) {
                    searchView.setSearchHint(d8.u(nea.getContext(), q2a.j));
                    if (widget.p0()) {
                        searchView.setExpandWithAnimation(false);
                        searchView.d();
                        searchView.setExpandWithAnimation(true);
                        searchView.setSearchText(widget.m0());
                    }
                }
                return nea;
            case 4:
                k77[] k77Arr5 = ContactListWidget.S0;
                return new ul3(widget);
            case 5:
                k77[] k77Arr6 = ContactListWidget.S0;
                ql3 ql32 = widget.o0().b;
                ql32.getClass();
                return new xf0(ql32 == ql3 ? zf0.a.getAccessor().d(wn3.class) : zf0.a.getAccessor().d(kp3.class), ((Boolean) widget.C0.getValue()).booleanValue(), new ll3(widget, 1), 14);
            case 6:
                k77[] k77Arr7 = ContactListWidget.S0;
                return new hba(widget);
            case 7:
                k77[] k77Arr8 = ContactListWidget.S0;
                return new we1(new r7e(new ll3(widget, 2)), new jrf(widget, 0));
            default:
                k77[] k77Arr9 = ContactListWidget.S0;
                ql3 ql33 = widget.o0().b;
                ql33.getClass();
                if (ql33 == ql3) {
                    return mnc.M0;
                }
                return null;
        }
    }
}
