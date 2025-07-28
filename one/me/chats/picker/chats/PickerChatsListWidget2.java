package one.me.chats.picker.chats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BO\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/chats/picker/chats/PickerChatsListWidget2;", "Lone/me/sdk/arch/Widget;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "Linc;", "scopeId", "Lq72;", "filter", "", "isFakeChatsEnabled", "isInMultiSelect", "Lkotlin/Function1;", "Ljue;", "onMultiSelectToggled", "(Ljava/lang/String;Ljava/lang/String;Lq72;ZZLu16;Lx54;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickerChatsListWidget2 extends Widget {
    public static final /* synthetic */ k77[] G0;
    public final t93 A0;
    public final gra B0;
    public final gra C0;
    public final nl0 D0;
    public final nl0 E0;
    public final t97 F0;
    public final jr X;
    public final u16 Y;
    public final t97 Z;
    public final t97 a;
    public final String b;
    public final jr c;
    public final jr o;
    public ibe w0;
    public final ExecutorService x0;
    public b y0;
    public final i41 z0;

    static {
        Class<PickerChatsListWidget2> cls = PickerChatsListWidget2.class;
        G0 = new k77[]{new khb(cls, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), m4b.g(m7c.a, cls, "isFakeChatsEnabled", "isFakeChatsEnabled()Z", 0), new hc9(cls, "isInMultiSelect", "isInMultiSelect()Z"), new khb(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    public PickerChatsListWidget2(String str, String str2, q72 q72, boolean z, boolean z2, u16 u16, x54 x54) {
        this(jjd.j(new wia("folder.id.key", str), new wia("scope.id", new inc(str2)), new wia("picker.filter", q72), new wia("folder.fake.enabled", Boolean.valueOf(z)), new wia("is_in_multiselect", Boolean.valueOf(z2))));
        this.Y = u16;
    }

    public static final boolean l0(PickerChatsListWidget2 pickerChatsListWidget2, int i) {
        return i < 0 || i >= pickerChatsListWidget2.A0.j() || !hhd.f(pickerChatsListWidget2.A0.E(i).first, pickerChatsListWidget2.z0);
    }

    public static final boolean m0(PickerChatsListWidget2 pickerChatsListWidget2) {
        List D = pickerChatsListWidget2.A0.D();
        if (!D.isEmpty()) {
            Iterator it = D.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((f6c) it.next()) == pickerChatsListWidget2.C0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return ((Boolean) pickerChatsListWidget2.p0().E0.a.getValue()).booleanValue();
    }

    public final wra n0() {
        return (wra) this.a.getValue();
    }

    public final EndlessRecyclerView2 o0() {
        k77 k77 = G0[3];
        return (EndlessRecyclerView2) this.E0.getValue();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rr3, one.me.chats.picker.chats.PickerChatsListWidget2] */
    public final void onAttach(View view) {
        PickerChatsListWidget2.super.onAttach(view);
        grd grd = p0().H0;
        grd.m((Object) null, Long.valueOf(((Number) grd.getValue()).longValue() + 1));
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [rr3, one.me.chats.picker.chats.PickerChatsListWidget2, one.me.sdk.arch.Widget] */
    public final void onContextAvailable(Context context) {
        PickerChatsListWidget2.super.onContextAvailable(context);
        if (hhd.f(this.b, "all.chat.folder")) {
            ez3.N(new ck5(n0().y0, new hp0(2, p0(), ksa.class, "search", "search$chats_list_release(Ljava/lang/String;)V", 4, 25), 5), getLifecycleScope());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!hhd.f(this.b, "all.chat.folder")) {
            return o0();
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(o0());
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        EndlessRecyclerView2 o0 = o0();
        ibe ibe = this.w0;
        if (ibe != null) {
            ibe.B(o0);
        }
        o0.setDelegate((py4) null);
        o0.setPager((ny4) null);
        o0.setAdapter((f6c) null);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [f6c, gra, ig7] */
    public final void onViewCreated(View view) {
        t93 t93 = this.A0;
        ? r1 = this.B0;
        t93.C(r1);
        EndlessRecyclerView2 o0 = o0();
        o0.getContext();
        o0.setLayoutManager(new LinearLayoutManager());
        o0.setAdapter(t93);
        this.w0 = gp0.l(o0);
        o0.setPager(new t61(this, 7));
        o0.setDelegate(this.z0);
        o0.setClipToPadding(false);
        float f = (float) 6;
        o0.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        o0.setThreshold(10);
        o0.setIgnoreRefreshingFlagsForScrollEvent(true);
        b bVar = this.y0;
        if (bVar != null) {
            o0.setRecycledViewPool(bVar);
        }
        o0.setItemAnimator((k6c) null);
        k6c itemAnimator = o0.getItemAnimator();
        w84 w84 = itemAnimator instanceof w84 ? (w84) itemAnimator : null;
        if (w84 != null) {
            w84.g = false;
        }
        k77 k77 = G0[2];
        boolean booleanValue = ((Boolean) this.X.a(this)).booleanValue();
        t97 t97 = this.F0;
        if (booleanValue) {
            o0.j((tw2) t97.getValue());
        } else {
            o0.p0((tw2) t97.getValue());
        }
        o0.l(new u24(o0));
        if (r1.j() > 0) {
            o0.measure(View.MeasureSpec.makeMeasureSpec(o0.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(o0.getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
            k6c itemAnimator2 = o0.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.e();
            }
        }
        o0().setRefreshingNext(((Boolean) p0().E0.a.getValue()).booleanValue());
        t0c t0c = p0().C0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new wsa((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(p0().G0, getViewLifecycleOwner().R(), ob7), new xsa((Continuation) null, this, view), 5), getViewLifecycleScope());
        ez3.N(new ck5(n0().Z, new ysa((Continuation) null, this), 5), getViewLifecycleScope());
        if (hhd.f(this.b, "all.chat.folder")) {
            ez3.N(new ck5(n0().y0, new zsa((Continuation) null, this), 5), getViewLifecycleScope());
        }
    }

    public final ksa p0() {
        return (ksa) this.Z.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: f6c[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PickerChatsListWidget2(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 3
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            r8.<init>(r9, r2, r3, r4)
            java.lang.String r5 = "scope.id"
            java.lang.Class<inc> r6 = inc.class
            java.lang.Object r5 = ek8.E(r9, r5, r6)
            if (r5 == 0) goto L_0x00cb
            android.os.Parcelable r5 = (android.os.Parcelable) r5
            inc r5 = (inc) r5
            java.lang.Class<wra> r6 = defpackage.wra.class
            java.lang.String r5 = r5.a
            t97 r4 = r8.getSharedViewModel-cp94BC8(r5, r6, r4)
            r8.a = r4
            java.lang.String r4 = "folder.id.key"
            java.lang.String r9 = r9.getString(r4)
            if (r9 == 0) goto L_0x00bf
            r8.b = r9
            jr r9 = new jr
            java.lang.String r4 = "picker.filter"
            java.lang.Class<q72> r5 = defpackage.q72.class
            r9.<init>(r5, r4)
            r8.c = r9
            jr r9 = new jr
            java.lang.String r4 = "folder.fake.enabled"
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            r9.<init>(r5, r4)
            r8.o = r9
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            jr r4 = new jr
            java.lang.String r6 = "is_in_multiselect"
            r4.<init>(r5, r9, r6)
            r8.X = r4
            tsa r9 = new tsa
            r9.<init>(r8, r2)
            wq9 r4 = new wq9
            r5 = 6
            r4.<init>(r5, r9)
            java.lang.Class<ksa> r9 = defpackage.ksa.class
            t97 r9 = r8.createViewModelLazy(r9, r4)
            r8.Z = r9
            tp2 r9 = defpackage.tp2.a
            x4a r9 = r9.c()
            java.util.concurrent.ExecutorService r9 = r9.a()
            r8.x0 = r9
            i41 r4 = new i41
            r4.<init>(r9, r1)
            r8.z0 = r4
            t93 r5 = new t93
            s93 r6 = new s93
            r6.<init>((boolean) r2, (int) r1)
            f6c[] r7 = new defpackage.f6c[r1]
            r7[r2] = r4
            r5.<init>(r6, r7)
            r8.A0 = r5
            vsa r4 = new vsa
            r4.<init>(r8)
            gra r5 = new gra
            r5.<init>(r4, r9, r2)
            r8.B0 = r5
            gra r5 = new gra
            r5.<init>(r4, r9, r2)
            r8.C0 = r5
            tsa r9 = new tsa
            r9.<init>(r8, r1)
            nl0 r9 = r8.binding(r9)
            r8.D0 = r9
            tsa r9 = new tsa
            r9.<init>(r8, r3)
            nl0 r9 = r8.binding(r9)
            r8.E0 = r9
            tsa r9 = new tsa
            r9.<init>(r8, r0)
            t97 r9 = defpackage.ez3.O(r0, r9)
            r8.F0 = r9
            ksa r8 = r8.p0()
            kr2 r8 = r8.c
            r8.e()
            return
        L_0x00bf:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Required value was null."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x00cb:
            java.lang.String r8 = r6.getSimpleName()
            java.lang.String r9 = "No value passed for key scope.id of type "
            java.lang.String r0 = " in bundle"
            java.lang.String r8 = wn6.i(r9, r8, r0)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.picker.chats.PickerChatsListWidget2.<init>(android.os.Bundle):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickerChatsListWidget2(String str, String str2, q72 q72, boolean z, boolean z2, u16 u16, int i, x54 x54) {
        this(str, str2, (i & 4) != 0 ? q72.a : q72, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : u16, (x54) null);
    }
}
