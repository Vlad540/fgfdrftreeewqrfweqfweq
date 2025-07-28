package one.me.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;
import one.me.settings.SettingsListScreen;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lone/me/main/MainScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "route", "Landroid/os/Bundle;", "routeArgs", "(Ljava/lang/String;Landroid/os/Bundle;)V", "fs7", "j06", "main-screen_release"}, k = 1, mv = {2, 0, 0})
public final class MainScreen extends Widget {
    public static final j06 Z = new Object();
    public static final /* synthetic */ k77[] w0;
    public static final hcd x0 = icd.b(0, 1, 0, 4);
    public final n0c X;
    public final String Y;
    public final t97 a;
    public final jj7 b;
    public final LinkedHashMap c;
    public final n0c o;

    /* JADX WARNING: type inference failed for: r1v1, types: [j06, java.lang.Object] */
    static {
        Class<MainScreen> cls = MainScreen.class;
        w0 = new k77[]{new khb(cls, "rootView", "getRootView()Landroid/widget/FrameLayout;", 0), m4b.g(m7c.a, cls, "bottomBarView", "getBottomBarView()Lone/me/common/bottombar/OneMeBottomBarView;", 0)};
    }

    public MainScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        this.a = createViewModelLazy(ls7.class, new js5(13, new gz3(28, this)));
        this.b = new jj7(new vz0(0, this, MainScreen.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 27), new vz0(0, this, MainScreen.class, "getCurrentParams", "getCurrentParams()Lone/me/sdk/statistics/params/Params;", 0, 28), 4);
        this.c = new LinkedHashMap();
        this.o = viewBinding(k6a.h);
        this.X = viewBinding(k6a.a);
        this.Y = MainScreen.class.getName();
        setRetainViewMode(qr3.b);
    }

    public final rnc getScreenDelegate() {
        return this.b;
    }

    public final void l0(m0a m0a) {
        mnc mnc;
        ContactListWidget contactListWidget;
        ContactListWidget settingsListScreen;
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(m0a);
        az1 az1 = obj;
        if (obj == null) {
            az1 b2 = x87.b(getContext());
            b2.setId(m0a.c);
            linkedHashMap.put(m0a, b2);
            az1 = b2;
        }
        ViewGroup viewGroup = (ViewGroup) az1;
        ((FrameLayout) this.o.T0(this, w0[0])).addView(viewGroup, 0, new FrameLayout.LayoutParams(-1, -1));
        String str = m0a.d;
        if (str.length() <= 0) {
            str = null;
        }
        sgc childRouter = getChildRouter(viewGroup, str);
        childRouter.e = 1;
        if (!childRouter.n()) {
            bs7.b.getClass();
            String a2 = k34.a(bs7.c.a);
            String str2 = m0a.d;
            if (hhd.f(str2, a2)) {
                settingsListScreen = new ContactListWidget((Bundle) null, 1, (x54) null);
                mnc = mnc.CONTACTS_TAB;
            } else if (hhd.f(str2, k34.a(bs7.d.a))) {
                settingsListScreen = new CallHistoryScreen();
                mnc = mnc.CALL_HISTORY_TAB;
            } else if (hhd.f(str2, k34.a(bs7.e.a))) {
                contactListWidget = new ChatsTabWidget(getArgs().getString("folder_id"));
                mnc = mnc.CHATS_LIST_TAB;
                contactListWidget.addLifecycleListener(new o63(3, mnc));
                contactListWidget.setRetainViewMode(qr3.b);
                vgc vgc = new vgc(contactListWidget, (String) null, (wr3) null, (wr3) null, false, -1);
                vgc.d(str);
                childRouter.R(vgc);
            } else if (hhd.f(str2, k34.a(bs7.f.a))) {
                settingsListScreen = new SettingsListScreen();
                mnc = mnc.SETTINGS_TAB;
            } else {
                throw new IllegalStateException(("invalid screen! " + str2).toString());
            }
            contactListWidget = settingsListScreen;
            contactListWidget.addLifecycleListener(new o63(3, mnc));
            contactListWidget.setRetainViewMode(qr3.b);
            vgc vgc2 = new vgc(contactListWidget, (String) null, (wr3) null, (wr3) null, false, -1);
            vgc2.d(str);
            childRouter.R(vgc2);
        }
        childRouter.I();
    }

    public final void m0(m0a m0a) {
        ViewGroup viewGroup = (ViewGroup) this.c.get(m0a);
        if (viewGroup != null) {
            sgc childRouter = getChildRouter(viewGroup, m0a.d, false);
            if (childRouter != null) {
                childRouter.F();
            }
            ((FrameLayout) this.o.T0(this, w0[0])).removeView(viewGroup);
        }
    }

    public final n0a n0() {
        return (n0a) this.X.T0(this, w0[1]);
    }

    public final sgc o0() {
        m0a m0a = q0().o;
        ViewGroup viewGroup = (ViewGroup) this.c.get(m0a);
        if (viewGroup == null) {
            return null;
        }
        return getChildRouter(viewGroup, m0a.d);
    }

    public final void onAttach(View view) {
        x0.g(Boolean.TRUE);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fs7 fs7 = new fs7(this, getContext());
        fs7.setId(k6a.h);
        fs7.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        n0a n0a = new n0a(fs7.getContext());
        n0a.setId(k6a.a);
        n0a.setElevation(dh4.c().getDisplayMetrics().density * 8.0f);
        js.u(n0a.getContext().getApplicationContext());
        n0a.setBlurEnabled(Boolean.FALSE);
        ek8.g(n0a, new sy6(0, new up0(3, 1, false), 1), (u16) null);
        km4 n = km4.y0.n(fs7.getContext());
        ez3.N(new ck5((t0c) n.x0, new gs7(this, fs7, n, (Continuation) null), 5), getViewLifecycleScope());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        fs7.addView(n0a, layoutParams);
        return fs7;
    }

    public final void onDestroyView(View view) {
        MainScreen.super.onDestroyView(view);
        LinkedHashMap linkedHashMap = this.c;
        for (m0a m0 : linkedHashMap.keySet()) {
            m0(m0);
        }
        linkedHashMap.clear();
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        Object obj;
        String string = bundle.getString("main:selected_tag");
        if (string != null) {
            ls7 q0 = q0();
            Iterator it = q0.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (hhd.f(((m0a) obj).d, string)) {
                    break;
                }
            }
            m0a m0a = (m0a) obj;
            if (m0a != null) {
                q0.o = m0a;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("main:selected_tag", q0().o.d);
    }

    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        m0a m0a = q0().o;
        sgc o0 = o0();
        Widget widget = null;
        Widget g = o0 != null ? o0.g(m0a.d) : null;
        if (g instanceof Widget) {
            widget = g;
        }
        if (widget != null) {
            widget.onUpdateArgs(bundle, bundle2);
        }
    }

    public final void onViewCreated(View view) {
        for (m0a m0a : q0().c) {
            n0a n0 = n0();
            boolean f = hhd.f(m0a, q0().o);
            xv5 xv5 = new xv5(this, 9, m0a);
            sp0 sp0 = new sp0(n0.getContext(), (AttributeSet) null);
            sp0.setId(m0a.e);
            hhd.P(wqb.tag_tab_item, sp0, m0a);
            sp0.setText(m0a.a);
            j0a j0a = m0a.b;
            if (j0a instanceof j0a) {
                j0a j0a2 = j0a;
                sp0.L0.setImageDrawable((Drawable) j0a2.a.invoke(sp0.getContext()));
                rp0 rp0 = j0a2.b;
                if (rp0 == null) {
                    rp0 = sp0.O0;
                }
                sp0.P0 = rp0;
                sp0.w();
            } else if (j0a instanceof k0a) {
                sp0.setIcon(((k0a) j0a).a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            sp0.setSelected(f);
            a24.a0(sp0, xv5);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            float f2 = (float) 4;
            layoutParams.leftMargin = a24.X(dh4.c().getDisplayMetrics().density * f2);
            layoutParams.rightMargin = a24.X(f2 * dh4.c().getDisplayMetrics().density);
            n0.addView(sp0, layoutParams);
            n0.setWeightSum((float) n0.getChildCount());
        }
        ez3.N(new ck5(q0().Y, new hs7(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(q0().w0, new is7(this, (Continuation) null), 5), getViewLifecycleScope());
        l0(q0().o);
    }

    public final mnc p0() {
        int i = q0().o.c;
        return i == k6a.g ? mnc.CONTACTS_TAB : i == k6a.c ? mnc.CALL_HISTORY_TAB : i == k6a.j ? mnc.SETTINGS_TAB : mnc.CHATS_LIST_TAB;
    }

    public final ls7 q0() {
        return (ls7) this.a.getValue();
    }

    public final void r0(m0a m0a) {
        String str = this.Y;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, "handleClick, selected item=" + m0a, (Throwable) null);
        }
        if (!hhd.f(q0().o, m0a)) {
            m0(q0().o);
            q0().o = m0a;
            n0a n0 = n0();
            n0.getClass();
            int i = 0;
            while (i < n0.getChildCount()) {
                int i2 = i + 1;
                sp0 childAt = n0.getChildAt(i);
                if (childAt != null) {
                    childAt.setSelected(hhd.E(childAt, wqb.tag_tab_item) == m0a);
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
            l0(m0a);
            this.b.l();
        }
    }

    public MainScreen(String str, Bundle bundle) {
        this();
        getArgs().putString("main:arg:deep_link", str);
        getArgs().putAll(bundle);
    }
}
