package defpackage;

import one.me.contactlist.ContactListWidget;

/* renamed from: ul3  reason: default package */
public final class ul3 extends ww9 {
    public final /* synthetic */ ContactListWidget d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ul3(ContactListWidget contactListWidget) {
        super(false);
        this.d = contactListWidget;
    }

    public final void b() {
        k77[] k77Arr = ContactListWidget.S0;
        raa searchView = this.d.n0().getSearchView();
        if (searchView != null) {
            searchView.b();
        }
    }
}
