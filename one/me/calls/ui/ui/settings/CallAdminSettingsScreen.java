package one.me.calls.ui.ui.settings;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calls/ui/ui/settings/CallAdminSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Ldk9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallAdminSettingsScreen extends Widget implements dk9 {
    public static final /* synthetic */ k77[] x0;
    public final t97 X;
    public final t97 Y;
    public final n0c Z;
    public final sy6 a = sy6.d;
    public final t97 b = createViewModelLazy(bz0.class, new s(6, new m(22)));
    public final ux0 c;
    public final t97 o;
    public final t97 w0;

    static {
        Class<CallAdminSettingsScreen> cls = CallAdminSettingsScreen.class;
        x0 = new k77[]{new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wn6.e(m7c.a, cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public CallAdminSettingsScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        ux0 ux0 = new ux0(new u5g(4, (Object) this), ((x4a) bh1.a.getAccessor().c(x4a.class)).a());
        this.c = ux0;
        this.o = ez3.O(3, new ry0(this, 0));
        this.X = ez3.O(3, new m(23));
        this.Y = ez3.O(3, new m(24));
        viewBinding(o1a.S);
        this.Z = viewBinding(o1a.R);
        ez3.N(new ck5(l0().w0, new hp0(2, ux0, ux0.class, "submitList", "submitList(Ljava/util/List;)V", 4, 2), 5), getLifecycleScope());
        this.w0 = ez3.O(3, new ry0(this, 1));
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final bz0 l0() {
        return (bz0) this.b.getValue();
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [f6c, ux0] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(o1a.S);
        nea.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nea.setTitle(r1a.z);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new ty0(0, this)));
        nea.setCustomTheme(qda.a);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(o1a.R);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.c);
        recyclerView.setItemAnimator((k6c) null);
        recyclerView.j((qtc) this.o.getValue());
        recyclerView.j((qy0) this.X.getValue());
        linearLayout.addView(nea);
        linearLayout.addView(recyclerView);
        linearLayout.setBackgroundColor(-14803164);
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [rr3, one.me.calls.ui.ui.settings.CallAdminSettingsScreen, java.lang.Object] */
    public final void onDestroyView(View view) {
        if (((oed) this.Y.getValue()) != null) {
            oed.a();
        }
        rr3 rr3 = this;
        while (rr3.getParentController() != null) {
            rr3 = rr3.getParentController();
        }
        ygc ygc = rr3 instanceof ygc ? (ygc) rr3 : null;
        sgc S = ygc != null ? ygc.S() : null;
        if (S != null) {
            S.K((sy0) this.w0.getValue());
        }
        k77[] k77Arr = x0;
        k77 k77 = k77Arr[1];
        n0c n0c = this.Z;
        ((RecyclerView) n0c.T0(this, k77)).setAdapter((f6c) null);
        ((RecyclerView) n0c.T0(this, k77Arr[1])).p0((qy0) this.X.getValue());
        ((RecyclerView) n0c.T0(this, k77Arr[1])).p0((qtc) this.o.getValue());
        bz0 l0 = l0();
        ((ep1) ((so1) l0.X.getValue())).G.remove(l0);
        vx0 q = l0.q();
        q.getClass();
        ea eaVar = (ea) ((py0) q).F0.getValue();
        iq1 iq1 = (iq1) l0.Y.getValue();
        boolean z = eaVar.b;
        kb5 kb5 = (jb5) l0.o.getValue();
        kb5.getClass();
        boolean z2 = false;
        if (kb5.m(PmsKey.grse, false)) {
            z2 = eaVar.e;
        }
        iq1.getClass();
        ht7 ht7 = new ht7();
        Integer d = ((xg9) iq1.c.getValue()).d();
        if (d != null) {
            ht7.put("screen", Integer.valueOf(d.intValue()));
        }
        ht7.put("camera", Boolean.valueOf(z));
        ht7.put("microphone", Boolean.valueOf(eaVar.c));
        ht7.put("screenshare", Boolean.valueOf(eaVar.d));
        ht7.put("recording", Boolean.valueOf(z2));
        iq1.b("ADMIN_CALL_SETTINGS", ht7.b());
        CallAdminSettingsScreen.super.onDestroyView(view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: rr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: rr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: rr3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r4) {
        /*
            r3 = this;
            one.me.calls.ui.ui.settings.CallAdminSettingsScreen.super.onViewCreated(r4)
            r4 = r3
        L_0x0004:
            rr3 r0 = r4.getParentController()
            if (r0 == 0) goto L_0x000f
            rr3 r4 = r4.getParentController()
            goto L_0x0004
        L_0x000f:
            boolean r0 = r4 instanceof ygc
            r1 = 0
            if (r0 == 0) goto L_0x0017
            ygc r4 = (ygc) r4
            goto L_0x0018
        L_0x0017:
            r4 = r1
        L_0x0018:
            if (r4 == 0) goto L_0x001f
            sgc r4 = r4.S()
            goto L_0x0020
        L_0x001f:
            r4 = r1
        L_0x0020:
            if (r4 == 0) goto L_0x002d
            t97 r0 = r3.w0
            java.lang.Object r0 = r0.getValue()
            sy0 r0 = (defpackage.sy0) r0
            r4.a(r0)
        L_0x002d:
            bz0 r4 = r3.l0()
            l05 r4 = r4.x0
            ob7 r0 = defpackage.ob7.o
            nc7 r2 = r3.getViewLifecycleOwner()
            pc7 r2 = r2.R()
            rn1 r4 = defpackage.wx3.e(r4, r2, r0)
            uy0 r0 = new uy0
            r0.<init>(r1, r3)
            ck5 r1 = new ck5
            r2 = 5
            r1.<init>(r4, r0, r2)
            yb7 r3 = r3.getViewLifecycleScope()
            defpackage.ez3.N(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.ui.settings.CallAdminSettingsScreen.onViewCreated(android.view.View):void");
    }
}
