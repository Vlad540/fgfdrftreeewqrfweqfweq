package one.me.chats.picker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chats/picker/PickerChatsListWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "Linc;", "scopeId", "(Ljava/lang/String;Ljava/lang/String;Lx54;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickerChatsListWidget extends Widget {
    public static final /* synthetic */ k77[] A0;
    public final ExecutorService X;
    public final n0c Y;
    public b Z;
    public final t97 a;
    public final String b;
    public final t97 c;
    public ibe o;
    public final i41 w0;
    public final t93 x0;
    public final gra y0;
    public final gra z0;

    static {
        khb khb = new khb(PickerChatsListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0);
        m7c.a.getClass();
        A0 = new k77[]{khb};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: f6c[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PickerChatsListWidget(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 5
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            r8.<init>(r9, r2, r3, r4)
            java.lang.String r3 = "scope.id"
            java.lang.Class<inc> r5 = inc.class
            java.lang.Object r3 = ek8.E(r9, r3, r5)
            if (r3 == 0) goto L_0x00bc
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            inc r3 = (inc) r3
            java.lang.Class<xra> r5 = defpackage.xra.class
            java.lang.String r3 = r3.a
            t97 r3 = r8.getSharedViewModel-cp94BC8(r3, r5, r4)
            r8.a = r3
            java.lang.String r3 = "folder.id.key"
            java.lang.String r9 = r9.getString(r3)
            if (r9 == 0) goto L_0x00b0
            r8.b = r9
            qk8 r9 = new qk8
            r3 = 26
            r9.<init>(r3, r8)
            wq9 r3 = new wq9
            r3.<init>(r0, r9)
            java.lang.Class<lsa> r9 = defpackage.lsa.class
            t97 r9 = r8.createViewModelLazy(r9, r3)
            r8.c = r9
            tp2 r9 = defpackage.tp2.a
            x4a r3 = r9.c()
            java.util.concurrent.ExecutorService r3 = r3.a()
            r8.X = r3
            int r5 = defpackage.f2a.k
            n0c r5 = r8.viewBinding(r5)
            r8.Y = r5
            i41 r5 = new i41
            r5.<init>(r3, r1)
            r8.w0 = r5
            t93 r6 = new t93
            s93 r7 = new s93
            r7.<init>((boolean) r2, (int) r1)
            f6c[] r1 = new defpackage.f6c[r1]
            r1[r2] = r5
            r6.<init>(r7, r1)
            r8.x0 = r6
            osa r1 = new osa
            r1.<init>(r8)
            gra r5 = new gra
            r5.<init>(r1, r3, r2)
            r8.y0 = r5
            gra r5 = new gra
            r5.<init>(r1, r3, r2)
            r8.z0 = r5
            qr3 r1 = defpackage.qr3.b
            r8.setRetainViewMode(r1)
            lsa r1 = r8.o0()
            kr2 r1 = r1.b
            r1.e()
            lsa r1 = r8.o0()
            pj5 r1 = r1.o
            msa r2 = new msa
            r2.<init>(r8, r4)
            ck5 r3 = new ck5
            r3.<init>(r1, r2, r0)
            pae r9 = r9.d()
            n3a r9 = (defpackage.n3a) r9
            zr7 r9 = r9.c()
            pj5 r9 = defpackage.ez3.J(r3, r9)
            yb7 r8 = r8.getLifecycleScope()
            defpackage.ez3.N(r9, r8)
            return
        L_0x00b0:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Required value was null."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x00bc:
            java.lang.String r8 = r5.getSimpleName()
            java.lang.String r9 = "No value passed for key scope.id of type "
            java.lang.String r0 = " in bundle"
            java.lang.String r8 = wn6.i(r9, r8, r0)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.picker.PickerChatsListWidget.<init>(android.os.Bundle):void");
    }

    public static final boolean l0(PickerChatsListWidget pickerChatsListWidget, int i) {
        return i < 0 || i >= pickerChatsListWidget.x0.j() || !hhd.f(pickerChatsListWidget.x0.E(i).first, pickerChatsListWidget.w0);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.chats.picker.PickerChatsListWidget, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [gra, ig7] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m0(one.me.chats.picker.PickerChatsListWidget r2, defpackage.wia r3, defpackage.gra r4) {
        /*
            r2.getClass()
            java.lang.Object r3 = r3.a
            java.util.List r3 = (java.util.List) r3
            r4.E(r3)
            android.view.View r3 = r2.getView()
            if (r3 == 0) goto L_0x004c
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r2.n0()
            t93 r4 = r2.x0
            java.util.List r4 = r4.D()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0021
            goto L_0x0036
        L_0x0021:
            java.util.Iterator r4 = r4.iterator()
        L_0x0025:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r4.next()
            f6c r0 = (defpackage.f6c) r0
            gra r1 = r2.z0
            if (r0 != r1) goto L_0x0025
            goto L_0x0048
        L_0x0036:
            lsa r2 = r2.o0()
            grd r2 = r2.c
            java.lang.Object r2 = r2.getValue()
            hq2 r2 = (defpackage.hq2) r2
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x0048
            r2 = 1
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            r3.setRefreshingNext(r2)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.picker.PickerChatsListWidget.m0(one.me.chats.picker.PickerChatsListWidget, wia, gra):void");
    }

    public final EndlessRecyclerView2 n0() {
        return (EndlessRecyclerView2) this.Y.T0(this, A0[0]);
    }

    public final lsa o0() {
        return (lsa) this.c.getValue();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chats.picker.PickerChatsListWidget] */
    public final void onContextAvailable(Context context) {
        PickerChatsListWidget.super.onContextAvailable(context);
        u09 u09 = new u09(((xra) this.a.getValue()).E0, 17);
        tp2 tp2 = tp2.a;
        ez3.N(ez3.J(new ck5(ez3.J(u09, tp2.d().a()), new qsa(this, (Continuation) null), 5), tp2.d().c()), getLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(f2a.k);
        endlessRecyclerView2.setClipChildren(false);
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipToOutline(false);
        endlessRecyclerView2.setHasFixedSize(true);
        return endlessRecyclerView2;
    }

    public final void onDestroyView(View view) {
        EndlessRecyclerView2 n0 = n0();
        ibe ibe = this.o;
        if (ibe != null) {
            ibe.B(n0);
        }
        n0.setDelegate((py4) null);
        n0.setPager((ny4) null);
        n0.setAdapter((f6c) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [f6c, gra, ig7] */
    public final void onViewCreated(View view) {
        t93 t93 = this.x0;
        ? r0 = this.y0;
        t93.C(r0);
        EndlessRecyclerView2 n0 = n0();
        n0.getContext();
        n0.setLayoutManager(new LinearLayoutManager());
        n0.setAdapter(t93);
        this.o = gp0.l(n0);
        n0.setPager(new t61(this, 6));
        n0.setDelegate(this.w0);
        n0.setClipToPadding(false);
        float f = (float) 6;
        n0.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        n0.setThreshold(10);
        n0.setIgnoreRefreshingFlagsForScrollEvent(true);
        b bVar = this.Z;
        if (bVar != null) {
            n0.setRecycledViewPool(bVar);
        }
        n0.j(new tw2(new oy4(n0, 1), new e98(15, this), new nsa(this, 0), new nsa(this, 1)));
        n0.l(new u24(n0));
        if (r0.j() > 0) {
            n0.measure(View.MeasureSpec.makeMeasureSpec(n0.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(n0.getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        n0().setRefreshingNext(((hq2) o0().c.getValue()).b);
        t97 t97 = this.a;
        ez3.N(new ck5(((xra) t97.getValue()).A0, new rsa(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(((xra) t97.getValue()).E0, new ssa(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public PickerChatsListWidget(String str, String str2, x54 x54) {
        this(jjd.j(new wia("folder.id.key", str), new wia("scope.id", new inc(str2))));
    }
}
