package one.me.profile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/profile/ProfileScreen;", "Lone/me/sdk/arch/Widget;", "Lreb;", "Ltq3;", "Llc3;", "Lac0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lr6b;", "type", "", "isOpenedFromDialog", "(JLr6b;Z)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileScreen extends Widget implements reb, tq3, lc3, ac0 {
    public static final /* synthetic */ k77[] H0;
    public final n0c A0;
    public final n0c B0;
    public final n0c C0;
    public final n0c D0;
    public final t97 E0;
    public final t97 F0;
    public final t97 G0;
    public final n0c X;
    public final n0c Y;
    public final n0c Z;
    public final jj7 a;
    public final sy6 b;
    public final t97 c;
    public final t97 o;
    public final n0c w0;
    public final n0c x0;
    public final n0c y0;
    public final n0c z0;

    static {
        Class<ProfileScreen> cls = ProfileScreen.class;
        k77 khb = new khb(cls, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0);
        n7c n7c = m7c.a;
        H0 = new k77[]{khb, wn6.e(n7c, cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), wn6.f(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c), wn6.f(cls, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0, n7c), wn6.f(cls, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, n7c), wn6.f(cls, "expandedTitle", "getExpandedTitle()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "expandedSubtitle", "getExpandedSubtitle()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "linkView", "getLinkView()Landroidx/appcompat/widget/AppCompatTextView;", 0, n7c), wn6.f(cls, "dotDivider", "getDotDivider()Landroidx/appcompat/widget/AppCompatTextView;", 0, n7c), wn6.f(cls, "phoneNumberView", "getPhoneNumberView()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0, n7c), wn6.f(cls, "linkButtonView", "getLinkButtonView()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, n7c)};
    }

    public ProfileScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jj7(new k6b(11), (s16) null, 6);
        this.b = sy6.d;
        this.c = createViewModelLazy(fgb.class, new wq9(18, new fe2(bundle, 7)));
        this.o = ez3.O(3, new geb(this, 0));
        this.X = viewBinding(j8a.c1);
        this.Y = viewBinding(j8a.k1);
        this.Z = viewBinding(j8a.j1);
        this.w0 = viewBinding(j8a.e1);
        this.x0 = viewBinding(j8a.d1);
        this.y0 = viewBinding(j8a.h1);
        this.z0 = viewBinding(j8a.g1);
        this.A0 = viewBinding(j8a.U);
        this.B0 = viewBinding(j8a.E);
        this.C0 = viewBinding(j8a.b1);
        viewBinding(j8a.T);
        this.D0 = childSlotRouter(j8a.i1);
        i6b i6b = i6b.a;
        this.E0 = i6b.getAccessor().d(qna.class);
        this.F0 = i6b.getAccessor().d(xg9.class);
        this.G0 = i6b.getAccessor().d(iq1.class);
    }

    public static final void l0(ProfileScreen profileScreen, nea nea, boolean z) {
        b1f b1f;
        profileScreen.getClass();
        int C = xy6.C(tge.e(nea.getTitle()));
        int i = 0;
        if (z) {
            b1f a2 = tge.a(nea.getTitle());
            if ((a2 != null ? a2.a : 0) == C) {
                return;
            }
        }
        if (z) {
            b1f a3 = tge.a(nea.getTitle());
            if (a3 != null) {
                i = a3.a;
            }
            if (i != C) {
                b1f = new b1f(nea.getContext(), C, new qq9(26));
                tge.d(nea.getTitle(), b1f);
            }
        }
        b1f = null;
        tge.d(nea.getTitle(), b1f);
    }

    public final void a(String str, RectF rectF, Rect rect) {
        fgb q0 = q0();
        xs7.E(q0.a, q0.u().b(), (ru3) null, new wfb(q0, str, rectF, (Continuation) null), 2);
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r6, android.os.Bundle r7) {
        /*
            r5 = this;
            we1 r0 = r5.m0()
            boolean r0 = r0.g(r6)
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            int r0 = defpackage.j8a.R0
            if (r6 == r0) goto L_0x0188
            int r1 = defpackage.j8a.S0
            if (r6 == r1) goto L_0x0188
            int r1 = defpackage.j8a.Q0
            if (r6 == r1) goto L_0x0188
            int r1 = defpackage.j8a.T0
            if (r6 != r1) goto L_0x001d
            goto L_0x0188
        L_0x001d:
            int r0 = defpackage.j8a.m
            r1 = 0
            if (r6 != r0) goto L_0x003d
            fgb r5 = r5.q0()
            kotlinx.coroutines.internal.ContextScope r6 = r5.a
            pae r7 = r5.u()
            n3a r7 = (n3a) r7
            ju3 r7 = r7.b()
            ofb r0 = new ofb
            r0.<init>(r5, r1)
            r5 = 2
            xs7.E(r6, r7, r1, r0, r5)
            goto L_0x0214
        L_0x003d:
            int r0 = defpackage.j8a.x
            if (r6 != r0) goto L_0x004a
            fgb r5 = r5.q0()
            r5.q()
            goto L_0x0214
        L_0x004a:
            int r0 = defpackage.j8a.D
            r2 = 0
            if (r6 == r0) goto L_0x017d
            int r0 = defpackage.j8a.B
            if (r6 != r0) goto L_0x0055
            goto L_0x017d
        L_0x0055:
            int r0 = defpackage.j8a.r
            java.lang.String r3 = "&leave_chat=true"
            java.lang.String r4 = ":profile/change-owner?chat_id="
            if (r6 != r0) goto L_0x008d
            fgb r5 = r5.q0()
            h5b r6 = r5.T0
            java.lang.Long r6 = r6.i()
            if (r6 == 0) goto L_0x0214
            long r6 = r6.longValue()
            kdb r0 = defpackage.kdb.c
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r6 = r0.toString()
            a34 r7 = new a34
            r7.<init>(r6)
            l05 r5 = r5.F0
            defpackage.taf.o(r5, r7)
            goto L_0x0214
        L_0x008d:
            int r0 = defpackage.j8a.R
            if (r6 != r0) goto L_0x00c3
            fgb r5 = r5.q0()
            h5b r6 = r5.T0
            java.lang.Long r6 = r6.i()
            if (r6 == 0) goto L_0x0214
            long r6 = r6.longValue()
            pae r0 = r5.u()
            n3a r0 = (n3a) r0
            ju3 r0 = r0.b()
            ru3 r3 = ru3.b
            ufb r4 = new ufb
            r4.<init>(r5, r6, r1)
            kotlinx.coroutines.internal.ContextScope r6 = r5.a
            qod r6 = xs7.D(r6, r0, r3, r4)
            k77[] r7 = defpackage.fgb.X0
            r7 = r7[r2]
            e3 r0 = r5.G0
            r0.o1(r5, r7, r6)
            goto L_0x0214
        L_0x00c3:
            int r0 = defpackage.j8a.Q
            if (r6 != r0) goto L_0x00ee
            android.os.Bundle r5 = r5.getArgs()
            java.lang.String r6 = "profile:id"
            long r5 = r5.getLong(r6)
            kdb r7 = defpackage.kdb.c
            r7.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r5 = r0.toString()
            d34 r6 = r7.P1()
            r6.b(r5, r1)
            goto L_0x0214
        L_0x00ee:
            int r0 = defpackage.j8a.A0
            r3 = 1
            java.lang.String r4 = "profile:participant_id_for_action"
            if (r6 != r0) goto L_0x011b
            if (r7 == 0) goto L_0x011a
            long r6 = r7.getLong(r4)
            fgb r5 = r5.q0()
            r5.getClass()
            web r0 = new web
            int r1 = defpackage.k8a.d
            dge r4 = new dge
            r4.<init>(r1, r3)
            jfb r1 = new jfb
            r1.<init>((defpackage.fgb) r5, (long) r6, (boolean) r2)
            r0.<init>(r4, r1)
            l05 r5 = r5.E0
            defpackage.taf.o(r5, r0)
            goto L_0x0214
        L_0x011a:
            return
        L_0x011b:
            int r0 = defpackage.j8a.C0
            if (r6 != r0) goto L_0x0145
            if (r7 == 0) goto L_0x0144
            long r6 = r7.getLong(r4)
            fgb r5 = r5.q0()
            r5.getClass()
            web r0 = new web
            int r1 = defpackage.k8a.d
            dge r2 = new dge
            r2.<init>(r1, r3)
            jfb r1 = new jfb
            r1.<init>((defpackage.fgb) r5, (long) r6, (boolean) r3)
            r0.<init>(r2, r1)
            l05 r5 = r5.E0
            defpackage.taf.o(r5, r0)
            goto L_0x0214
        L_0x0144:
            return
        L_0x0145:
            int r7 = defpackage.j8a.o
            if (r6 != r7) goto L_0x0156
            kdb r5 = defpackage.kdb.c
            d34 r5 = r5.P1()
            java.lang.String r6 = ":media-picker/select/photo"
            r5.b(r6, r1)
            goto L_0x0214
        L_0x0156:
            int r7 = defpackage.j8a.n
            if (r6 != r7) goto L_0x0163
            fgb r5 = r5.q0()
            r5.y()
            goto L_0x0214
        L_0x0163:
            int r7 = defpackage.j8a.C
            if (r6 != r7) goto L_0x0170
            fgb r5 = r5.q0()
            r5.A()
            goto L_0x0214
        L_0x0170:
            int r7 = defpackage.j8a.A
            if (r6 != r7) goto L_0x0214
            fgb r5 = r5.q0()
            r5.C(r3)
            goto L_0x0214
        L_0x017d:
            fgb r5 = r5.q0()
            k77[] r6 = defpackage.fgb.X0
            r5.C(r2)
            goto L_0x0214
        L_0x0188:
            fgb r5 = r5.q0()
            h5b r7 = r5.T0
            java.lang.Long r7 = r7.i()
            if (r7 == 0) goto L_0x0214
            long r1 = r7.longValue()
            t97 r7 = r5.y0
            if (r6 != r0) goto L_0x01ad
            java.lang.Object r6 = r7.getValue()
            f03 r6 = (defpackage.f03) r6
            lqc r6 = (defpackage.lqc) r6
            long r6 = r6.m()
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x01ab:
            long r6 = r6 + r3
            goto L_0x01db
        L_0x01ad:
            int r0 = defpackage.j8a.S0
            if (r6 != r0) goto L_0x01c1
            java.lang.Object r6 = r7.getValue()
            f03 r6 = (defpackage.f03) r6
            lqc r6 = (defpackage.lqc) r6
            long r6 = r6.m()
            r3 = 18000000(0x112a880, double:8.8931816E-317)
            goto L_0x01ab
        L_0x01c1:
            int r0 = defpackage.j8a.Q0
            if (r6 != r0) goto L_0x01d5
            java.lang.Object r6 = r7.getValue()
            f03 r6 = (defpackage.f03) r6
            lqc r6 = (defpackage.lqc) r6
            long r6 = r6.m()
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x01ab
        L_0x01d5:
            int r7 = defpackage.j8a.T0
            if (r6 != r7) goto L_0x0214
            r6 = -1
        L_0x01db:
            bv2 r0 = r5.t()
            aw2 r0 = (defpackage.aw2) r0
            t52 r0 = r0.l()
            i22 r1 = r0.B(r1)
            if (r1 == 0) goto L_0x01fd
            r0.l(r6, r1)
            nj4 r6 = r0.p
            java.lang.Object r6 = r6.get()
            pk r6 = (defpackage.pk) r6
            long r0 = r1.a
            gy9 r6 = (defpackage.gy9) r6
            r6.r(r0)
        L_0x01fd:
            bfb r6 = new bfb
            int r7 = defpackage.phc.n
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r0 = defpackage.l8a.y2
            hge r1 = new hge
            r1.<init>(r0)
            r6.<init>(r1, r7)
            l05 r5 = r5.E0
            defpackage.taf.o(r5, r6)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profile.ProfileScreen.i(int, android.os.Bundle):void");
    }

    public final we1 m0() {
        return (we1) this.o.getValue();
    }

    public final TextView n0() {
        return (TextView) this.y0.T0(this, H0[5]);
    }

    public final nea o0() {
        return (nea) this.Z.T0(this, H0[2]);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ProfileScreen.super.onActivityResult(i, i2, intent);
        if (i != 333) {
            if (i != 666 || i2 != -1) {
                return;
            }
            if (intent == null) {
                q0().D();
                return;
            }
            fgb q0 = q0();
            xs7.E(q0.a, q0.u().b(), (ru3) null, new xfb(intent, q0, (Continuation) null), 2);
        } else if (i2 == -1) {
            fgb q02 = q0();
            xs7.E(q02.a, q02.u().b(), (ru3) null, new qfb(q02, intent != null ? intent.getData() : null, (Continuation) null), 2);
        }
    }

    public final void onAttach(View view) {
        ProfileScreen.super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new mp0(10, this));
        } else if (tge.c(o0().getTitle())) {
            l0(this, o0(), true);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        feb feb = new feb(this, 3);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(j8a.f1);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        feb.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!m0().b(i, strArr, iArr) && i == 158 && ((qna) this.E0.getValue()).b(strArr)) {
            q0().y();
        }
    }

    public final void onViewCreated(View view) {
        xs7.E(getViewLifecycleScope(), (hu3) null, (ru3) null, new heb((Continuation) null, this), 3);
        urd.B(new c3(this, (Continuation) null, 27), view);
        RecyclerView p0 = p0();
        e44 e44 = new e44(new rp0(4, this), 15, new Rect(p0.getPaddingLeft(), p0.getPaddingTop(), p0.getPaddingRight(), p0.getPaddingBottom()));
        WeakHashMap weakHashMap = eaf.a;
        t9f.u(p0, e44);
        if (p0.K0) {
            r9f.c(p0);
        } else {
            p0.addOnAttachStateChangeListener(new q40(p0, 4, p0));
        }
        p85 p85 = new p85();
        k77[] k77Arr = H0;
        k77 k77 = k77Arr[0];
        n0c n0c = this.X;
        ((fm) n0c.T0(this, k77)).a(am7.F(new db1(p85, this, 3), (fm) n0c.T0(this, k77Arr[0]), getViewLifecycleOwner()));
        ((AppCompatTextView) this.A0.T0(this, k77Arr[7])).setOnClickListener(new eu5(29, this));
        ik5 ik5 = new ik5(q0().S0, 2);
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(ik5, getViewLifecycleOwner().R(), ob7), new ieb((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(ez3.z(new v11(q0().O0, q0().Q0, new vp7(3, (Continuation) null, 3), 4)), getViewLifecycleOwner().R(), ob7), new jeb((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new u09(q0().E0, 21), getViewLifecycleOwner().R(), ob7), new keb((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(q0().F0, getViewLifecycleOwner().R(), ob7), new leb((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final EndlessRecyclerView2 p0() {
        return (EndlessRecyclerView2) this.Y.T0(this, H0[1]);
    }

    public final fgb q0() {
        return (fgb) this.c.getValue();
    }

    public final void y(int i, Bundle bundle) {
        String string;
        sf7 sf7;
        String string2;
        sf7 sf72;
        hge hge;
        if (i == j8a.X0) {
            Context context = getContext();
            fgb q0 = q0();
            String o2 = q0.T0.o();
            if (o2 == null) {
                o2 = "";
            }
            taf.o(q0.E0, new bfb(new hge(l8a.G0), Integer.valueOf(phc.v)));
            hhd.q(context, "+" + o2);
        } else if (i == j8a.a1) {
            fgb q02 = q0();
            String o3 = q02.T0.o();
            if (o3 != null) {
                xs7.E(q02.a, q02.u().b(), (ru3) null, new pfb(q02, Long.parseLong(o3), (Continuation) null), 2);
            }
        } else if (i == j8a.Z0) {
            q0().w(false);
        } else if (i == j8a.Y0) {
            q0().w(true);
        } else if (i == j8a.S) {
            hhd.q(getContext(), q0().r());
        } else if (i == j8a.r0) {
            if (bundle != null) {
                long j = bundle.getLong("profile:participant_id_for_action");
                fgb q03 = q0();
                cfb A = q03.T0.A(j);
                if (A != null) {
                    taf.o(q03.E0, A);
                }
            }
        } else if (i == vhc.f || i == vhc.e || i == vhc.g || i == vhc.h) {
            if (bundle != null && (string = bundle.getString("profile:contextmenu:link")) != null && (sf7 = (sf7) o23.Y(bundle.getInt("profile:contextmenu:link_type", -1), sf7.w0)) != null) {
                q0().x(4, string, sf7);
                q0().v(string);
            }
        } else if ((i == vhc.b || i == vhc.a || i == vhc.c || i == vhc.d) && bundle != null && (string2 = bundle.getString("profile:contextmenu:link")) != null && (sf72 = (sf7) o23.Y(bundle.getInt("profile:contextmenu:link_type", -1), sf7.w0)) != null) {
            int i2 = 3;
            q0().x(3, string2, sf72);
            hhd.q(getContext(), bm3.u(string2) ? h0e.k0(string2, "mailto:") : bm3.v(string2) ? h0e.k0(string2, "tel:") : string2);
            if (hhd.y()) {
                if (!bm3.u(string2)) {
                    i2 = bm3.v(string2) ? 2 : 1;
                }
                int t = hr1.t(i2);
                if (t == 0) {
                    hge = sf72 == sf7.X ? new hge(l8a.r1) : new hge(whc.k);
                } else if (t == 1) {
                    hge = new hge(whc.n);
                } else if (t == 2) {
                    hge = new hge(whc.l);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                hba hba = new hba((Widget) this);
                hba.h(hge);
                hba.f(new vba(phc.t));
                hba.j();
            }
        }
    }

    public ProfileScreen(long j, r6b r6b, boolean z) {
        this(jjd.j(new wia[]{new wia("profile:id", Long.valueOf(j)), new wia("profile:id_type", r6b), new wia("profile:opened_from_dialog", Boolean.valueOf(z))}));
    }
}
