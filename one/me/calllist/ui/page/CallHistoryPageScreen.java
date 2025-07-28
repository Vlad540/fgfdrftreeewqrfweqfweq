package one.me.calllist.ui.page;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/calllist/ui/page/CallHistoryPageScreen;", "Lone/me/sdk/arch/Widget;", "Ltq3;", "Llc3;", "<init>", "()V", "Lg71;", "type", "(Lg71;)V", "kk9", "call-list_release"}, k = 1, mv = {2, 0, 0})
public final class CallHistoryPageScreen extends Widget implements tq3, lc3 {
    public static final int A0 = 1;
    public static final kk9 y0 = new Object();
    public static final /* synthetic */ k77[] z0;
    public final dbc X;
    public final nl0 Y;
    public final r7e Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public kme o;
    public final t97 w0;
    public final jr x0;

    /* JADX WARNING: type inference failed for: r1v1, types: [kk9, java.lang.Object] */
    static {
        Class<CallHistoryPageScreen> cls = CallHistoryPageScreen.class;
        z0 = new k77[]{new khb(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), c3d.g(m7c.a, cls, "typeArg", "getTypeArg()Ljava/lang/String;")};
    }

    public CallHistoryPageScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        this.a = getSharedViewModel-cp94BC8("call_history_scope_id", e71.class, (s16) null);
        this.b = createViewModelLazy(w61.class, new s(9, new q61(this, 0)));
        this.c = ez3.O(3, new q61(this, 1));
        this.X = new dbc(new q61(this, 2));
        this.Y = binding(new q61(this, 3));
        this.Z = new r7e(new q61(this, 4));
        this.w0 = ez3.O(3, new a01(9));
        this.x0 = new jr(String.class, "type_arg");
    }

    public final void i(int i, Bundle bundle) {
        ((we1) this.c.getValue()).g(i);
    }

    public final g71 l0() {
        Object obj;
        lk9 lk9 = g71.b;
        k77 k77 = z0[1];
        String str = (String) this.x0.a(this);
        lk9.getClass();
        Iterator it = g71.Y.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (hhd.f(((g71) obj).name(), str)) {
                break;
            }
        }
        g71 g71 = (g71) obj;
        return g71 == null ? g71.ALL : g71;
    }

    public final EndlessRecyclerView2 m0() {
        k77 k77 = z0[0];
        return (EndlessRecyclerView2) this.Y.getValue();
    }

    public final e71 n0() {
        return (e71) this.a.getValue();
    }

    public final w61 o0() {
        return (w61) this.b.getValue();
    }

    public final void onActivityPaused(Activity activity) {
        CallHistoryPageScreen.super.onActivityPaused(activity);
        w61 o0 = o0();
        udd.p("CallHistoryPageViewModel", "unregister load history callbacks for type=" + o0.b, new Object[0]);
        rp1 rp1 = o0.X;
        rp1.getClass();
        rp1.D0.b(new pp1(rp1, 4));
        rp1.Y.remove(o0);
    }

    public final void onActivityResumed(Activity activity) {
        CallHistoryPageScreen.super.onActivityResumed(activity);
        o0().s();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        p4a p4a = (p4a) this.X.getValue();
        if (p4a != null) {
            frameLayout.addView(p4a, -1, -1);
        }
        frameLayout.addView(m0(), -1, -1);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.X.b();
        kme kme = this.o;
        if (kme != null) {
            kme.B(m0());
        }
    }

    public final void onDismiss() {
        o0().C0 = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.calllist.ui.page.CallHistoryPageScreen] */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        CallHistoryPageScreen.super.onRequestPermissionsResult(i, strArr, iArr);
        ((we1) this.c.getValue()).b(i, strArr, iArr);
    }

    public final void onViewCreated(View view) {
        e07.B(new ck5(o0().z0, new r61(this, (Continuation) null), 5), getViewLifecycleScope());
        lk9 lk9 = g71.b;
        g71 g71 = o0().b;
        lk9.getClass();
        if (g71 == g71.ALL) {
            e07.B(new ck5(o0().B0, new s61(this, (Continuation) null), 5), getViewLifecycleScope());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r8.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            w61 r8 = r6.o0()
            java.lang.Long r8 = r8.C0
            if (r8 == 0) goto L_0x005a
            long r0 = r8.longValue()
            w61 r8 = r6.o0()
            wg6 r8 = r8.q(r0)
            if (r8 != 0) goto L_0x0017
            return
        L_0x0017:
            int r2 = A0
            if (r7 != r2) goto L_0x0041
            e71 r7 = r6.n0()
            grd r2 = r7.Z
        L_0x0021:
            java.lang.Object r7 = r2.getValue()
            r3 = r7
            c71 r3 = (defpackage.c71) r3
            java.util.Map r4 = r3.b
            r3.getClass()
            c71 r3 = new c71
            r5 = 1
            r3.<init>(r4, r5)
            boolean r7 = r2.b(r7, r3)
            if (r7 == 0) goto L_0x0021
            e71 r6 = r6.n0()
            r6.q(r0, r8)
            goto L_0x005a
        L_0x0041:
            if (r7 != 0) goto L_0x005a
            e71 r6 = r6.n0()
            java.util.List r7 = java.util.Collections.singletonList(r8)
            r6.getClass()
            d71 r8 = new d71
            r0 = 0
            r8.<init>(r6, r7, r0)
            r7 = 3
            kotlinx.coroutines.internal.ContextScope r6 = r6.a
            defpackage.xs7.E(r6, r0, r0, r8, r7)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calllist.ui.page.CallHistoryPageScreen.y(int, android.os.Bundle):void");
    }

    public CallHistoryPageScreen(g71 g71) {
        this();
        String name = g71.name();
        k77 k77 = z0[1];
        this.x0.b(this, name);
    }
}
