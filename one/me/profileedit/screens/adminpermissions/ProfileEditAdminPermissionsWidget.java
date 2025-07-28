package one.me.profileedit.screens.adminpermissions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsWidget;", "Lone/me/sdk/arch/Widget;", "Lw6b;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "contactId", "Lb7b;", "type", "(JJLb7b;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileEditAdminPermissionsWidget extends Widget implements w6b, lc3 {
    public static final /* synthetic */ k77[] B0;
    public gba A0;
    public final r7e X;
    public final t97 Y;
    public final mr5 Z;
    public final sy6 a;
    public final jr b;
    public final jr c;
    public final jr o;
    public final n0c w0;
    public final n0c x0;
    public final ebc y0;
    public final int z0;

    static {
        Class<ProfileEditAdminPermissionsWidget> cls = ProfileEditAdminPermissionsWidget.class;
        k77 khb = new khb(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        n7c n7c = m7c.a;
        B0 = new k77[]{khb, wn6.e(n7c, cls, "contactId", "getContactId()J", 0), wn6.f(cls, "type", "getType()Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsType;", 0, n7c), wn6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c), wn6.f(cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, n7c)};
    }

    public ProfileEditAdminPermissionsWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = sy6.d;
        Class<Long> cls = Long.class;
        this.b = new jr(cls, "chat_id");
        this.c = new jr(cls, "contact_id");
        this.o = new jr(b7b.class, "permissions_type");
        this.X = new r7e(new k6b(8));
        this.Y = createViewModelLazy(q7b.class, new wq9(14, new r7b(this, 0)));
        this.Z = new mr5(((x4a) z7b.a.getAccessor().c(x4a.class)).a(), this, 11);
        this.w0 = viewBinding(f8a.T);
        this.x0 = viewBinding(f8a.Q);
        this.y0 = bm3.C(new r7b(this, 1));
        this.z0 = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        r9 = n0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r10, android.os.Bundle r11) {
        /*
            r9 = this;
            int r11 = defpackage.f8a.d0
            if (r10 != r11) goto L_0x000d
            q7b r9 = r9.n0()
            r9.r()
            goto L_0x00a1
        L_0x000d:
            int r11 = defpackage.f8a.c0
            if (r10 != r11) goto L_0x0021
            q7b r9 = r9.n0()
            r9.getClass()
            v03 r10 = defpackage.v03.b
            l05 r9 = r9.E0
            defpackage.taf.o(r9, r10)
            goto L_0x00a1
        L_0x0021:
            int r11 = defpackage.f8a.H
            if (r10 != r11) goto L_0x0069
            q7b r9 = r9.n0()
            i22 r10 = r9.s()
            if (r10 == 0) goto L_0x00a1
            t97 r11 = r9.y0
            java.lang.Object r11 = r11.getValue()
            pk r11 = (defpackage.pk) r11
            o62 r10 = r10.b
            long r3 = r10.a
            r0 = r11
            gy9 r0 = (defpackage.gy9) r0
            long r1 = r9.b
            long r5 = r9.c
            r0.h(r1, r3, r5)
            u6b r10 = new u6b
            int r11 = defpackage.i8a.S0
            hge r0 = new hge
            r0.<init>(r11)
            int r11 = defpackage.phc.A
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.<init>(r0, r11)
            l05 r11 = r9.F0
            defpackage.taf.o(r11, r10)
            a7b r10 = new a7b
            long r0 = r9.b
            r10.<init>(r0)
            l05 r9 = r9.E0
            defpackage.taf.o(r9, r10)
            goto L_0x00a1
        L_0x0069:
            int r11 = defpackage.f8a.K
            if (r10 != r11) goto L_0x00a1
            q7b r9 = r9.n0()
            i22 r10 = r9.s()
            if (r10 == 0) goto L_0x00a1
            t97 r11 = r9.y0
            java.lang.Object r11 = r11.getValue()
            pk r11 = (defpackage.pk) r11
            o62 r0 = r10.b
            long r4 = r0.a
            long r0 = r9.c
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.List r6 = java.util.Collections.singletonList(r2)
            int r8 = r10.d(r0)
            r1 = r11
            gy9 r1 = (defpackage.gy9) r1
            long r2 = r10.a
            r7 = 0
            r1.J(r2, r4, r6, r7, r8)
            v03 r10 = defpackage.v03.b
            l05 r9 = r9.E0
            defpackage.taf.o(r9, r10)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.i(int, android.os.Bundle):void");
    }

    public final boolean l0() {
        return ((Boolean) this.X.getValue()).booleanValue();
    }

    public final b7b m0() {
        k77 k77 = B0[2];
        return (b7b) this.o.a(this);
    }

    public final q7b n0() {
        return (q7b) this.Y.getValue();
    }

    public final void o0() {
        ebc ebc = this.y0;
        if (ebc.a()) {
            OneMeButton oneMeButton = (OneMeButton) ebc.getValue();
            if (oneMeButton.getVisibility() == 0) {
                afa.a(oneMeButton, new q36(oneMeButton, this, oneMeButton, 15));
                return;
            }
            RecyclerView recyclerView = (RecyclerView) this.x0.T0(this, B0[4]);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), this.z0);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rb9 rb9;
        rb9 rb92;
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        urd.B(new ql2(3, (Continuation) null, 5), frameLayout);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(f8a.Q);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        float f = (float) 24;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), a24.X(dh4.c().getDisplayMetrics().density * f), recyclerView.getPaddingRight(), this.z0);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.Z);
        recyclerView.setItemAnimator((k6c) null);
        recyclerView.setHasFixedSize(true);
        ub9 ub9 = gz6.a;
        ub9 ub92 = new ub9(3);
        ub92.g(2048);
        ub92.g(4096);
        ub92.g(128);
        recyclerView.j(new qtc(km4.y0.r(recyclerView), new w48(this, 18, ub92), (o8) null, 12));
        if (l0()) {
            float f2 = (float) 8;
            rb9 = zy6.b(a24.X(dh4.c().getDisplayMetrics().density * f2), 0, 32768, a24.X(dh4.c().getDisplayMetrics().density * f), 4096, a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(((float) 20) * dh4.c().getDisplayMetrics().density));
        } else {
            float f3 = (float) 6;
            rb9 = zy6.b(0, a24.X(dh4.c().getDisplayMetrics().density * f3), 32768, a24.X(dh4.c().getDisplayMetrics().density * f), 4096, a24.X(f3 * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f));
        }
        if (l0()) {
            float f4 = (float) 8;
            rb92 = zy6.b(a24.X(dh4.c().getDisplayMetrics().density * f4), 0, 4096, a24.X(((float) 20) * dh4.c().getDisplayMetrics().density), 32768, a24.X(f4 * dh4.c().getDisplayMetrics().density), a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
        } else {
            float f5 = (float) 12;
            rb92 = zy6.b(0, a24.X(((float) 6) * dh4.c().getDisplayMetrics().density), 4096, a24.X(((float) 30) * dh4.c().getDisplayMetrics().density), 32768, a24.X(dh4.c().getDisplayMetrics().density * f5), a24.X(f5 * dh4.c().getDisplayMetrics().density));
        }
        float f6 = (float) 12;
        recyclerView.j(new ku7(zy6.b(a24.X(dh4.c().getDisplayMetrics().density * f6), a24.X(dh4.c().getDisplayMetrics().density * f), 4096, a24.X(dh4.c().getDisplayMetrics().density * f), 32768, a24.X(f6 * dh4.c().getDisplayMetrics().density), a24.X(f * dh4.c().getDisplayMetrics().density)), rb9, rb92, 0));
        frameLayout.addView(recyclerView);
        nea nea = new nea(frameLayout.getContext(), 6);
        nea.setId(f8a.T);
        nea.setTitle(l0() ? i8a.K0 : i8a.n1);
        nea.setForm(fea.a);
        nea.setLeftActions(new wda(new s7b(this, 0)));
        if (!l0()) {
            nea.setRightActions(new xda(new s7b(this, 1)));
        }
        urd.B(new t7b(3, (Continuation) null, 0), nea);
        frameLayout.addView(nea);
        if (l0()) {
            frameLayout.addView((View) this.y0.getValue());
        }
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.y0.b = smc.Y;
        ProfileEditAdminPermissionsWidget.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        nea nea = (nea) this.w0.T0(this, B0[3]);
        afa.a(nea, new p36(nea, 17, this));
        o0();
        ex9 h = getRouter().h();
        if (h != null) {
            h.a(this.lifecycleOwner, new or3(this, 8));
        }
        ik5 ik5 = new ik5(n0().E0, 2);
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(ik5, getViewLifecycleOwner().R(), ob7), new u7b((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new ik5(n0().F0, 2), getViewLifecycleOwner().R(), ob7), new v7b((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(n0().I0, getViewLifecycleOwner().R(), ob7), new w7b((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ProfileEditAdminPermissionsWidget(long j, long j2, b7b b7b) {
        this(jjd.j(new wia[]{new wia("chat_id", Long.valueOf(j)), new wia("contact_id", Long.valueOf(j2)), new wia("permissions_type", b7b)}));
    }
}
