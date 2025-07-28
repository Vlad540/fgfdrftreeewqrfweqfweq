package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.arch.Widget;
import one.me.startconversation.StartConversationScreen;

/* renamed from: or3  reason: default package */
public final class or3 extends ww9 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or3(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    public void a() {
        switch (this.d) {
            case 5:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                c cVar = (c) this.e;
                if (isLoggable) {
                    Objects.toString(cVar);
                }
                hd0 hd0 = cVar.h;
                if (hd0 != null) {
                    hd0.r = false;
                    oc4 oc4 = new oc4(24, cVar);
                    if (hd0.p == null) {
                        hd0.p = new ArrayList();
                    }
                    hd0.p.add(oc4);
                    cVar.h.d(false);
                    cVar.A(true);
                    cVar.F();
                }
                cVar.h = null;
                return;
            default:
                return;
        }
    }

    public final void b() {
        grd grd;
        Object value;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                rr3 rr3 = (rr3) obj;
                if (!rr3.router.i().m()) {
                    f(false);
                    rr3.getOnBackPressedDispatcher().d();
                    if (!rr3.isBeingDestroyed) {
                        f(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                mk9 mk9 = CallIncomingScreen.Z;
                p71 l0 = ((CallIncomingScreen) obj).l0();
                do {
                    grd = l0.x0;
                    value = grd.getValue();
                    n71 n71 = (n71) value;
                } while (!grd.b(value, new m71(false)));
                return;
            case 2:
                ((w71) obj).h();
                return;
            case 3:
                smc smc = CallScreen.T0;
                ((CallScreen) obj).p0(false);
                return;
            case 4:
                k77[] k77Arr = ChatMembersScreen.y0;
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                if (chatMembersScreen.n0().r()) {
                    chatMembersScreen.n0().q();
                    return;
                } else {
                    chatMembersScreen.getRouter().C();
                    return;
                }
            case 5:
                c cVar = (c) obj;
                if (Log.isLoggable("FragmentManager", 3)) {
                    Objects.toString(cVar);
                }
                cVar.A(true);
                hd0 hd0 = cVar.h;
                or3 or3 = cVar.i;
                if (hd0 != null) {
                    ArrayList arrayList = cVar.n;
                    if (!arrayList.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(c.G(cVar.h));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            hr1.r(it.next());
                            Iterator it2 = linkedHashSet.iterator();
                            if (it2.hasNext()) {
                                a aVar = (a) it2.next();
                                throw null;
                            }
                        }
                    }
                    Iterator it3 = cVar.h.a.iterator();
                    while (it3.hasNext()) {
                        a aVar2 = ((dy5) it3.next()).b;
                        if (aVar2 != null) {
                            aVar2.C0 = false;
                        }
                    }
                    Iterator it4 = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                    while (it4.hasNext()) {
                        xa4 xa4 = (xa4) it4.next();
                        ArrayList arrayList2 = xa4.c;
                        xa4.j(arrayList2);
                        xa4.c(arrayList2);
                    }
                    Iterator it5 = cVar.h.a.iterator();
                    while (it5.hasNext()) {
                        a aVar3 = ((dy5) it5.next()).b;
                        if (aVar3 != null && aVar3.X0 == null) {
                            cVar.g(aVar3).k();
                        }
                    }
                    cVar.h = null;
                    cVar.l0();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        boolean z = or3.a;
                        cVar.toString();
                        return;
                    }
                    return;
                } else if (or3.a) {
                    cVar.T();
                    return;
                } else {
                    cVar.g.d();
                    return;
                }
            case 6:
                k77[] k77Arr2 = InputNameScreen.F0;
                ((InputNameScreen) obj).q0();
                return;
            case 7:
                ((u16) obj).invoke(this);
                return;
            case 8:
                k77[] k77Arr3 = ProfileEditAdminPermissionsWidget.B0;
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) obj;
                int ordinal = profileEditAdminPermissionsWidget.m0().ordinal();
                if (ordinal == 0) {
                    profileEditAdminPermissionsWidget.getRouter().C();
                    return;
                } else if (ordinal == 1) {
                    profileEditAdminPermissionsWidget.n0().x();
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            case 9:
                ((mrc) obj).q();
                return;
            default:
                k77[] k77Arr4 = StartConversationScreen.L0;
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj;
                startConversationScreen.getClass();
                raa searchView = ((nea) startConversationScreen.y0.T0(startConversationScreen, StartConversationScreen.L0[4])).getSearchView();
                if (searchView != null) {
                    searchView.b();
                    return;
                }
                return;
        }
    }

    public void c(gd0 gd0) {
        switch (this.d) {
            case 5:
                boolean isLoggable = Log.isLoggable("FragmentManager", 2);
                c cVar = (c) this.e;
                if (isLoggable) {
                    Objects.toString(cVar);
                }
                if (cVar.h != null) {
                    Iterator it = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        ArrayList arrayList = ((xa4) it.next()).c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            u23.K(((jmd) it2.next()).k, arrayList2);
                        }
                        List s0 = o23.s0(o23.w0(arrayList2));
                        int size = s0.size();
                        for (int i = 0; i < size; i++) {
                            ((imd) s0.get(i)).c(gd0);
                        }
                    }
                    Iterator it3 = cVar.n.iterator();
                    if (it3.hasNext()) {
                        hr1.r(it3.next());
                        throw null;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void d() {
        switch (this.d) {
            case 5:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                c cVar = (c) this.e;
                if (isLoggable) {
                    Objects.toString(cVar);
                }
                cVar.x();
                cVar.y(new ux5(cVar), false);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or3(Widget widget, int i) {
        super(true);
        this.d = i;
        this.e = widget;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public or3(StartConversationScreen startConversationScreen, boolean z) {
        super(z);
        this.d = 10;
        this.e = startConversationScreen;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public or3(boolean z, u16 u16) {
        super(z);
        this.d = 7;
        this.e = u16;
    }
}
