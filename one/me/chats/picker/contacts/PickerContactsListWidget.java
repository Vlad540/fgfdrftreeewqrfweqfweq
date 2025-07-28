package one.me.chats.picker.contacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chats/picker/contacts/PickerContactsListWidget;", "Lone/me/sdk/arch/Widget;", "Lfra;", "", "Lsn3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickerContactsListWidget extends Widget implements fra, sn3 {
    public static final /* synthetic */ k77[] C0;
    public xj6 A0;
    public ryd B0;
    public final gra X;
    public final gra Y;
    public final mr5 Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final ExecutorService o;
    public final t93 w0;
    public final nl0 x0;
    public final nl0 y0;
    public ibe z0;

    static {
        khb khb = new khb(PickerContactsListWidget.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        m7c.a.getClass();
        C0 = new k77[]{khb};
    }

    public PickerContactsListWidget(String str, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str))));
    }

    public final void l0(RecyclerView recyclerView) {
        hj2 hj2 = new hj2(4, new nta(this, 0));
        ryd ryd = new ryd(recyclerView, this.w0, hj2);
        this.B0 = ryd;
        recyclerView.j(ryd);
        xj6 xj6 = new xj6(hj2);
        this.A0 = xj6;
        recyclerView.j(xj6);
        urd.B(new rb(ryd, (Continuation) null, 2), recyclerView);
    }

    public final wra m0() {
        return (wra) this.a.getValue();
    }

    public final RecyclerView n0() {
        k77 k77 = C0[0];
        return (RecyclerView) this.y0.getValue();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [one.me.chats.picker.contacts.PickerContactsListWidget, rr3, one.me.sdk.arch.Widget] */
    public final void onContextAvailable(Context context) {
        PickerContactsListWidget.super.onContextAvailable(context);
        ez3.N(new ck5(m0().y0, new hp0(2, (wta) this.b.getValue(), wta.class, "onSearch", "onSearch(Ljava/lang/String;)V", 4, 26), 5), getLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(n0());
        return frameLayout;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.chats.picker.contacts.PickerContactsListWidget, rr3] */
    public final void onDestroyView(View view) {
        ibe ibe = this.z0;
        if (ibe != null) {
            ibe.B(n0());
        }
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        PickerContactsListWidget.super.onDestroyView(view);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            jrf jrf = new jrf(this, 1);
            String[] strArr2 = qna.e;
            int i2 = cic.O1;
            int i3 = cic.U1;
            ((qna) this.c.getValue()).getClass();
            qna.k(jrf, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        PickerContactsListWidget.super.onViewCreated(view);
        ez3.N(new ck5(wx3.e(((wta) this.b.getValue()).o, getViewLifecycleOwner().R(), ob7.o), new pta((Continuation) null, this, view), 5), getViewLifecycleScope());
        ez3.N(new ck5(m0().Z, new rta(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(m0().y0, new sta(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final void t() {
        ((qna) this.c.getValue()).f(new jrf(this, 1), qna.e, 156);
    }

    public final void w(int i) {
        t();
    }

    public final void z(long j, yta yta) {
        m0().q(j, yta);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: f6c[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PickerContactsListWidget(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            r3 = 0
            r9.<init>(r10, r1, r2, r3)
            java.lang.String r4 = "arg_key_scope_id"
            java.lang.Class<inc> r5 = inc.class
            java.lang.Object r10 = ek8.E(r10, r4, r5)
            if (r10 == 0) goto L_0x00c6
            android.os.Parcelable r10 = (android.os.Parcelable) r10
            inc r10 = (inc) r10
            java.lang.Class<wra> r4 = defpackage.wra.class
            java.lang.String r10 = r10.a
            t97 r10 = r9.getSharedViewModel-cp94BC8(r10, r4, r3)
            r9.a = r10
            qga r10 = new qga
            r4 = 11
            r10.<init>(r4)
            wq9 r4 = new wq9
            r5 = 9
            r4.<init>(r5, r10)
            java.lang.Class<wta> r10 = defpackage.wta.class
            t97 r10 = r9.createViewModelLazy(r10, r4)
            r9.b = r10
            qga r4 = new qga
            r5 = 12
            r4.<init>(r5)
            wq9 r5 = new wq9
            r6 = 10
            r5.<init>(r6, r4)
            java.lang.Class<xf0> r4 = defpackage.xf0.class
            t97 r4 = r9.createViewModelLazy(r4, r5)
            tp2 r5 = defpackage.tp2.a
            w4 r6 = r5.getAccessor()
            java.lang.Class<qna> r7 = qna.class
            r7e r6 = r6.d(r7)
            r9.c = r6
            x4a r5 = r5.c()
            java.util.concurrent.ExecutorService r5 = r5.a()
            r9.o = r5
            gra r6 = new gra
            r7 = 48
            r6.<init>(r9, r5, r7)
            r9.X = r6
            gra r8 = new gra
            r8.<init>(r9, r5, r7)
            r9.Y = r8
            mr5 r7 = new mr5
            r8 = 3
            r7.<init>((java.lang.Object) r9, (java.util.concurrent.ExecutorService) r5, (int) r8)
            r9.Z = r7
            t93 r5 = new t93
            s93 r8 = new s93
            r8.<init>((boolean) r1, (int) r0)
            f6c[] r2 = new defpackage.f6c[r2]
            r2[r1] = r7
            r2[r0] = r6
            r5.<init>(r8, r2)
            r9.w0 = r5
            ota r2 = new ota
            r2.<init>(r9, r1)
            nl0 r1 = r9.binding(r2)
            r9.x0 = r1
            ota r1 = new ota
            r1.<init>(r9, r0)
            nl0 r0 = r9.binding(r1)
            r9.y0 = r0
            java.lang.Object r10 = r10.getValue()
            wta r10 = (defpackage.wta) r10
            t0c r10 = r10.b
            java.lang.Object r0 = r4.getValue()
            xf0 r0 = (defpackage.xf0) r0
            t0c r0 = r0.w0
            c3 r1 = new c3
            r2 = 24
            r1.<init>(r9, r3, r2)
            v11 r2 = new v11
            r3 = 4
            r2.<init>(r10, r0, r1, r3)
            yb7 r9 = r9.getLifecycleScope()
            defpackage.ez3.N(r2, r9)
            return
        L_0x00c6:
            java.lang.String r9 = r5.getSimpleName()
            java.lang.String r10 = "No value passed for key arg_key_scope_id of type "
            java.lang.String r0 = " in bundle"
            java.lang.String r9 = wn6.i(r10, r9, r0)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.picker.contacts.PickerContactsListWidget.<init>(android.os.Bundle):void");
    }
}
