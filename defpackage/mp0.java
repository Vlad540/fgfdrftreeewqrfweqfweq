package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import java.util.List;
import one.me.chatscreen.ChatScreen;
import one.me.profile.ProfileScreen;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: mp0  reason: default package */
public final class mp0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mp0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        f5f b2;
        Object value;
        int i9 = 0;
        ViewGroup viewGroup = null;
        switch (this.a) {
            case 0:
                ((BottomAppBar$Behavior) this.b).getClass();
                throw null;
            case 1:
                view.removeOnLayoutChangeListener(this);
                zj1 zj1 = (zj1) this.b;
                zj1.A(zj1.U0);
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                sm1 sm1 = (sm1) this.b;
                sm1.L(sm1.j1);
                return;
            case 3:
                an1 an1 = (an1) this.b;
                if (an1.c != null && (b2 = an1.getVideoLayoutUpdatesController()) != null) {
                    b2.a(an1, an1.z0);
                    return;
                }
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                k77[] k77Arr = ChatScreen.n1;
                ChatScreen chatScreen = (ChatScreen) this.b;
                if (tge.c(chatScreen.J0().getTitle())) {
                    ChatScreen.u0(chatScreen, chatScreen.J0(), true);
                    return;
                }
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                uq8 uq8 = (uq8) this.b;
                ViewGroup viewGroup2 = (ViewGroup) uq8.b;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                int p = me4.p((float) 10, dh4.c().getDisplayMetrics().density, viewGroup2.getMeasuredWidth()) - uq8.L();
                if (p >= 0) {
                    i9 = p;
                }
                ViewGroup viewGroup3 = (ViewGroup) uq8.b;
                if (viewGroup3 != null) {
                    viewGroup = viewGroup3;
                }
                x87.I(i9, uq8.Q(), viewGroup);
                return;
            case 6:
                view.removeOnLayoutChangeListener(this);
                String str = ((f29) this.b).f;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, str, us8.i(((f29) this.b).b.c, "Scroll: Highlighted from args message with id="), (Throwable) null);
                }
                f29 f29 = (f29) this.b;
                nx8 nx8 = f29.e;
                long j = f29.b.c;
                List list = ((f29) this.b).b.d;
                grd grd = nx8.o;
                do {
                    value = grd.getValue();
                    fg6 fg6 = (fg6) value;
                } while (!grd.b(value, new fg6(j, list)));
                return;
            case 7:
                view.removeOnLayoutChangeListener(this);
                x2a x2a = (x2a) this.b;
                x2a.getEditText().getHitRect(x2a.E0);
                Rect rect = x2a.F0;
                rect.set(x2a.E0);
                rect.left = rect.right;
                rect.right = x2a.getRight();
                return;
            case 8:
                view.removeOnLayoutChangeListener(this);
                ((raa) this.b).K0.start();
                return;
            case 9:
                nea.e((nea) this.b);
                return;
            case 10:
                view.removeOnLayoutChangeListener(this);
                k77[] k77Arr2 = ProfileScreen.H0;
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                if (tge.c(profileScreen.o0().getTitle())) {
                    ProfileScreen.l0(profileScreen, profileScreen.o0(), true);
                    return;
                }
                return;
            case 11:
                view.removeOnLayoutChangeListener(this);
                k77[] k77Arr3 = RecordControlsWidget.m1;
                ((RecordControlsWidget) this.b).S0();
                return;
            case 12:
                view.removeOnLayoutChangeListener(this);
                ((s16) this.b).invoke();
                return;
            case 13:
                ((tsc) this.b).adjustDropDownSizeAndPosition();
                return;
            case 14:
                fme fme = (fme) this.b;
                fme.getClass();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                fme.Z0 = iArr[0];
                view.getWindowVisibleDisplayFrame(fme.S0);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                k77[] k77Arr4 = WebAppRootScreen.K0;
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.b;
                if (tge.c(webAppRootScreen.x0().getTitle())) {
                    WebAppRootScreen.C0(webAppRootScreen.x0(), true);
                    return;
                }
                return;
        }
    }
}
