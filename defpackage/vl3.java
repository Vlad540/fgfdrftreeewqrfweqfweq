package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.contactlist.ContactListWidget;

/* renamed from: vl3  reason: default package */
public final class vl3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vl3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((vl3) n((mge) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vl3 vl3 = new vl3(this.Y, continuation);
        vl3.X = obj;
        return vl3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ContactListWidget contactListWidget = this.Y;
        CharSequence a = ((mge) this.X).a(contactListWidget.getContext());
        String obj2 = a != null ? a.toString() : null;
        if (obj2 == null) {
            obj2 = BuildConfig.FLAVOR;
        }
        raa searchView = contactListWidget.n0().getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(obj2);
        }
        return jue.a;
    }
}
