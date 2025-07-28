package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.sdk.uikit.common.views.EmptySearchView;

/* renamed from: sb  reason: default package */
public final class sb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AdminsFromContactsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sb(Continuation continuation, AdminsFromContactsScreen adminsFromContactsScreen) {
        super(2, continuation);
        this.Y = adminsFromContactsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sb sbVar = new sb(continuation, this.Y);
        sbVar.X = obj;
        return sbVar;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        k77[] k77Arr = AdminsFromContactsScreen.y0;
        AdminsFromContactsScreen adminsFromContactsScreen = this.Y;
        boolean q = ((cc) adminsFromContactsScreen.c.getValue()).q();
        if (q) {
            RecyclerView m0 = adminsFromContactsScreen.m0();
            ryd ryd = adminsFromContactsScreen.Z;
            if (ryd != null) {
                m0.p0(ryd);
            }
            adminsFromContactsScreen.Z = null;
        } else {
            RecyclerView m02 = adminsFromContactsScreen.m0();
            ryd ryd2 = adminsFromContactsScreen.Z;
            if (ryd2 != null) {
                m02.p0(ryd2);
            }
            adminsFromContactsScreen.Z = null;
            adminsFromContactsScreen.l0(adminsFromContactsScreen.m0());
        }
        int i = 0;
        boolean z = q && list.isEmpty();
        ((EmptySearchView) adminsFromContactsScreen.X.T0(adminsFromContactsScreen, AdminsFromContactsScreen.y0[2])).setVisibility(z ? 0 : 8);
        RecyclerView m03 = adminsFromContactsScreen.m0();
        if (!(!z)) {
            i = 8;
        }
        m03.setVisibility(i);
        adminsFromContactsScreen.x0.E(list);
        return jue.a;
    }
}
