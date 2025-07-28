package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.profile.ProfileScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: c3  reason: default package */
public final class c3 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ Object w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = obj;
        this.w0 = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                c3 c3Var = new c3((AbstractPickerScreen) this.w0, (Continuation) obj3, 0);
                c3Var.Y = (Map) obj;
                c3Var.Z = (Map) obj2;
                return c3Var.o(jue.a);
            case 1:
                c3 c3Var2 = new c3((cc) this.w0, (Continuation) obj3, 1);
                c3Var2.Y = (List) obj;
                c3Var2.Z = (List) obj2;
                return c3Var2.o(jue.a);
            case 2:
                c3 c3Var3 = new c3((BaseBottomSheetWidget) this.w0, (Continuation) obj3, 2);
                c3Var3.Y = (z0b) obj;
                c3Var3.Z = (pda) obj2;
                jue jue = jue.a;
                c3Var3.o(jue);
                return jue;
            case 3:
                c3 c3Var4 = new c3((CallLinkInfoScreen) this.w0, (Continuation) obj3, 3);
                c3Var4.Y = (CoordinatorLayout) obj;
                c3Var4.Z = (pda) obj2;
                jue jue2 = jue.a;
                c3Var4.o(jue2);
                return jue2;
            case 4:
                c3 c3Var5 = new c3((CallScreen) this.w0, (Continuation) obj3, 4);
                c3Var5.Y = (raf) obj;
                c3Var5.Z = (List) obj2;
                jue jue3 = jue.a;
                c3Var5.o(jue3);
                return jue3;
            case 5:
                c3 c3Var6 = new c3((aj1) this.w0, (Continuation) obj3, 5);
                c3Var6.Y = (lm1) obj;
                c3Var6.Z = (u81) obj2;
                return c3Var6.o(jue.a);
            case 6:
                c3 c3Var7 = new c3((ChatScreen) this.w0, (Continuation) obj3, 6);
                c3Var7.Y = (yrc) obj;
                c3Var7.Z = (un2) obj2;
                return c3Var7.o(jue.a);
            case 7:
                c3 c3Var8 = new c3((fu2) this.w0, (Continuation) obj3, 7);
                c3Var8.Y = (hq2) obj;
                c3Var8.Z = (mte) obj2;
                return c3Var8.o(jue.a);
            case 8:
                pda pda = (pda) obj2;
                c3 c3Var9 = new c3((ryd) this.Z, (ryd) this.w0, (Continuation) obj3, 8);
                c3Var9.Y = (RecyclerView) obj;
                jue jue4 = jue.a;
                c3Var9.o(jue4);
                return jue4;
            case 9:
                c3 c3Var10 = new c3((ContactListWidget) this.w0, (Continuation) obj3, 9);
                c3Var10.Y = (bk3) obj;
                c3Var10.Z = (List) obj2;
                jue jue5 = jue.a;
                c3Var10.o(jue5);
                return jue5;
            case 10:
                pda pda2 = (pda) obj2;
                c3 c3Var11 = new c3((pq3) this.Z, (ImageView) this.w0, (Continuation) obj3, 10);
                c3Var11.Y = (FrameLayout) obj;
                jue jue6 = jue.a;
                c3Var11.o(jue6);
                return jue6;
            case 11:
                c3 c3Var12 = new c3((ExternalCallbackWidget) this.w0, (Continuation) obj3, 11);
                c3Var12.Y = (TextView) obj;
                c3Var12.Z = (pda) obj2;
                jue jue7 = jue.a;
                c3Var12.o(jue7);
                return jue7;
            case 12:
                c3 c3Var13 = new c3((qt5) this.w0, (Continuation) obj3, 12);
                c3Var13.Y = (List) obj;
                c3Var13.Z = (bs5) obj2;
                return c3Var13.o(jue.a);
            case 13:
                c3 c3Var14 = new c3((InputPhoneScreen) this.w0, (Continuation) obj3, 13);
                c3Var14.Y = (TextView) obj;
                c3Var14.Z = (pda) obj2;
                jue jue8 = jue.a;
                c3Var14.o(jue8);
                return jue8;
            case 14:
                c3 c3Var15 = new c3((Drawable) this.w0, (Continuation) obj3, 14);
                c3Var15.Y = (TextView) obj;
                c3Var15.Z = (pda) obj2;
                jue jue9 = jue.a;
                c3Var15.o(jue9);
                return jue9;
            case 15:
                List list = (List) obj;
                c3 c3Var16 = new c3((EndlessRecyclerView2) this.Z, (LogsViewerScreen) this.w0, (Continuation) obj3, 15);
                c3Var16.Y = (List) obj2;
                jue jue10 = jue.a;
                c3Var16.o(jue10);
                return jue10;
            case 16:
                LinearLayout linearLayout = (LinearLayout) obj;
                c3 c3Var17 = new c3((Drawable) this.Z, (AppCompatTextView) this.w0, (Continuation) obj3, 16);
                c3Var17.Y = (pda) obj2;
                jue jue11 = jue.a;
                c3Var17.o(jue11);
                return jue11;
            case 17:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                c3 c3Var18 = new c3((AppCompatTextView) this.Z, (AppCompatTextView) this.w0, (Continuation) obj3, 17);
                c3Var18.Y = (pda) obj2;
                jue jue12 = jue.a;
                c3Var18.o(jue12);
                return jue12;
            case 18:
                c3 c3Var19 = new c3((MessageContextMenuBottomSheet) this.w0, (Continuation) obj3, 18);
                c3Var19.Y = (FrameLayout) obj;
                c3Var19.Z = (pda) obj2;
                jue jue13 = jue.a;
                c3Var19.o(jue13);
                return jue13;
            case 19:
                c3 c3Var20 = new c3((zz8) this.w0, (Continuation) obj3, 19);
                c3Var20.Y = (i22) obj;
                c3Var20.Z = (tw8) obj2;
                return c3Var20.o(jue.a);
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                c3 c3Var21 = new c3((mna) this.w0, (Continuation) obj3, 20);
                c3Var21.Y = (nna) obj;
                c3Var21.Z = (nna) obj2;
                jue jue14 = jue.a;
                c3Var21.o(jue14);
                return jue14;
            case 21:
                c3 c3Var22 = new c3((ksa) this.w0, (Continuation) obj3, 21);
                c3Var22.Y = (hq2) obj;
                c3Var22.Z = (List) obj2;
                return c3Var22.o(jue.a);
            case 22:
                c3 c3Var23 = new c3((bta) this.w0, (Continuation) obj3, 22);
                c3Var23.Y = (List) obj;
                c3Var23.Z = (bs5) obj2;
                return c3Var23.o(jue.a);
            case 23:
                c3 c3Var24 = new c3((ata) this.w0, (Continuation) obj3, 23);
                c3Var24.Y = (List) obj;
                c3Var24.Z = (bs5) obj2;
                return c3Var24.o(jue.a);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                c3 c3Var25 = new c3((PickerContactsListWidget) this.w0, (Continuation) obj3, 24);
                c3Var25.Y = (List) obj;
                c3Var25.Z = (List) obj2;
                jue jue15 = jue.a;
                c3Var25.o(jue15);
                return jue15;
            case 25:
                c3 c3Var26 = new c3((ProfileChangeLinkScreen) this.w0, (Continuation) obj3, 25);
                c3Var26.Y = (ViewGroup) obj;
                c3Var26.Z = (pda) obj2;
                jue jue16 = jue.a;
                c3Var26.o(jue16);
                return jue16;
            case 26:
                c3 c3Var27 = new c3((q7b) this.w0, (Continuation) obj3, 26);
                c3Var27.Y = (i22) obj;
                c3Var27.Z = (tf3) obj2;
                return c3Var27.o(jue.a);
            case 27:
                c3 c3Var28 = new c3((ProfileScreen) this.w0, (Continuation) obj3, 27);
                c3Var28.Y = (View) obj;
                c3Var28.Z = (pda) obj2;
                jue jue17 = jue.a;
                c3Var28.o(jue17);
                return jue17;
            case 28:
                c3 c3Var29 = new c3((RecordControlsWidget) this.w0, (Continuation) obj3, 28);
                c3Var29.Y = (TextView) obj;
                c3Var29.Z = (pda) obj2;
                jue jue18 = jue.a;
                c3Var29.o(jue18);
                return jue18;
            default:
                c3 c3Var30 = new c3((h5c) this.w0, (Continuation) obj3, 29);
                c3Var30.Y = (yh1) obj;
                c3Var30.Z = (Long) obj2;
                return c3Var30.o(jue.a);
        }
    }

    /* JADX WARNING: type inference failed for: r3v16, types: [i7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v13, types: [bc1, ig7] */
    /* JADX WARNING: type inference failed for: r0v53, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r3v68, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r0v104, types: [gra, ig7] */
    public final Object o(Object obj) {
        int i;
        int i2;
        boolean z = true;
        boolean z2 = false;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                Map map = (Map) this.Y;
                Map map2 = (Map) this.Z;
                Iterator it = z3d.F(map2.keySet(), map.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    AbstractPickerScreen abstractPickerScreen = (AbstractPickerScreen) this.w0;
                    if (hasNext) {
                        long longValue = ((Number) it.next()).longValue();
                        x2a q0 = abstractPickerScreen.q0();
                        if (q0 != null) {
                            q0.c(longValue);
                        }
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            if (!hhd.f(map.get(entry.getKey()), entry.getValue())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            long longValue2 = ((Number) entry2.getKey()).longValue();
                            kta kta = (kta) entry2.getValue();
                            x2a q02 = abstractPickerScreen.q0();
                            if (q02 != null) {
                                q02.c(longValue2);
                            }
                            x2a q03 = abstractPickerScreen.q0();
                            if (q03 != null) {
                                q03.a(longValue2, kta.b, kta.e, kta.c, kta.d);
                            }
                        }
                        return map2;
                    }
                }
            case 1:
                wx3.H(obj);
                return ((cc) this.w0).q() ? (List) this.Z : (List) this.Y;
            case 2:
                wx3.H(obj);
                z0b z0b = (z0b) this.Y;
                pda pda = (pda) this.Z;
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) this.w0;
                pda p0 = baseBottomSheetWidget.p0();
                if (p0 != null) {
                    pda = p0;
                }
                k77 k77 = BaseBottomSheetWidget.Y[0];
                if (((Boolean) baseBottomSheetWidget.b.a(baseBottomSheetWidget)).booleanValue()) {
                    z0b.setBackground(new ColorDrawable(pda.b().d));
                }
                return jue.a;
            case 3:
                wx3.H(obj);
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.Y;
                k77[] k77Arr = CallLinkInfoScreen.F0;
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) this.w0;
                callLinkInfoScreen.getClass();
                k77[] k77Arr2 = CallLinkInfoScreen.F0;
                k77 k772 = k77Arr2[3];
                s59 s59 = km4.y0;
                ((TextView) callLinkInfoScreen.y0.T0(callLinkInfoScreen, k772)).setTextColor(s59.r(coordinatorLayout).getText().e);
                k77 k773 = k77Arr2[5];
                s59.r(coordinatorLayout);
                ((TextView) callLinkInfoScreen.A0.T0(callLinkInfoScreen, k773)).setTextColor(-16745729);
                ((TextView) callLinkInfoScreen.z0.T0(callLinkInfoScreen, k77Arr2[4])).setTextColor(s59.r(coordinatorLayout).getText().h);
                coordinatorLayout.setBackgroundColor(((pda) this.Z).b().h);
                return jue.a;
            case 4:
                wx3.H(obj);
                List list = (List) this.Z;
                int i3 = qaf.$EnumSwitchMapping$0[((raf) this.Y).ordinal()];
                if (i3 == 1 || i3 == 2) {
                    i = 0;
                } else if (i3 == 3) {
                    i = 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                CallScreen callScreen = (CallScreen) this.w0;
                if (i < 0 || i >= list.size()) {
                    smc smc = CallScreen.T0;
                    i = Math.min(callScreen.A0().getCurrentItem(), list.size() - 1);
                }
                ? obj2 = new Object();
                smc smc2 = CallScreen.T0;
                ((bc1) callScreen.J0.getValue()).F(list, new wg1((Object) obj2, (Object) callScreen, i, 0));
                obj2.a = CallScreen.l0(callScreen, i, "main");
                return jue.a;
            case 5:
                wx3.H(obj);
                lm1 lm1 = (lm1) this.Y;
                u81 u81 = (u81) this.Z;
                kb5 kb5 = (jb5) ((aj1) this.w0).y0.getValue();
                kb5.getClass();
                boolean m = kb5.m(PmsKey.show-vpn-snackbar, false);
                vye vye = vye.o;
                return (m && (u81.e instanceof y55)) ? lm1.g : vye;
            case 6:
                wx3.H(obj);
                un2 un2 = (un2) this.Z;
                k77[] k77Arr3 = ChatScreen.n1;
                Long u = ((ChatScreen) this.w0).B0().u();
                return !(((yrc) this.Y) instanceof vrc) ? iq0.b : (un2 == null || !(u == null || u.longValue() == 0)) ? iq0.a : iq0.c;
            case 7:
                CharSequence charSequence = null;
                wx3.H(obj);
                hq2 hq2 = (hq2) this.Y;
                mte mte = (mte) this.Z;
                k77[] k77Arr4 = fu2.Z0;
                ((fu2) this.w0).getClass();
                List<pi2> list2 = hq2.a;
                ArrayList arrayList = new ArrayList(q23.H(list2, 10));
                for (pi2 pi2 : list2) {
                    ip2 ip2 = (ip2) mte.a.c(pi2.a);
                    if (!hhd.f(ip2 != null ? ip2.b : charSequence, pi2.Z)) {
                        pi2 pi22 = r7;
                        pi2 pi23 = new pi2(pi2.a, pi2.b, pi2.c, pi2.o, pi2.X, pi2.Y, ip2 != null ? ip2.b : charSequence, pi2.w0, pi2.x0, pi2.y0, pi2.z0, pi2.A0, pi2.B0, pi2.C0, pi2.D0, pi2.E0, pi2.F0, pi2.G0, pi2.H0, pi2.I0, pi2.J0, pi2.K0);
                        pi2 = pi22;
                    }
                    arrayList.add(pi2);
                    charSequence = null;
                }
                return new hq2(arrayList, hq2.b);
            case 8:
                wx3.H(obj);
                ((ryd) this.Z).j();
                ((ryd) this.w0).j();
                ((RecyclerView) this.Y).Y();
                return jue.a;
            case 9:
                wx3.H(obj);
                bk3 bk3 = (bk3) this.Y;
                List list3 = (List) this.Z;
                k77[] k77Arr5 = ContactListWidget.S0;
                ContactListWidget contactListWidget = (ContactListWidget) this.w0;
                CharSequence m0 = contactListWidget.m0();
                if (m0 == null || m0.length() == 0) {
                    z2 = true;
                }
                boolean z3 = !z2;
                jue jue = jue.a;
                if (!z3) {
                    contactListWidget.X.E(bk3.a);
                    hw4 hw4 = hw4.a;
                    contactListWidget.Y.E(hw4);
                    contactListWidget.Z.E(bk3.c);
                    bk3 bk32 = bk3.d;
                    ? r0 = contactListWidget.x0;
                    if (bk3 == bk32) {
                        r0.E(hw4);
                    } else {
                        r0.E(list3);
                    }
                }
                return jue;
            case 10:
                wx3.H(obj);
                FrameLayout frameLayout = (FrameLayout) this.Y;
                Integer num = ((pq3) this.Z).e;
                if (num != null) {
                    ((ImageView) this.w0).setImageTintList(ColorStateList.valueOf(km4.y0.r(frameLayout).i(num.intValue())));
                }
                return jue.a;
            case 11:
                wx3.H(obj);
                pda pda2 = (pda) this.Z;
                int i4 = ExternalCallbackWidget.F0;
                ExternalCallbackWidget externalCallbackWidget = (ExternalCallbackWidget) this.w0;
                externalCallbackWidget.getClass();
                ((TextView) this.Y).setTextColor(pda2.getText().h);
                ((ov6) externalCallbackWidget.D0.getValue()).b = new int[]{0, pda2.getIcon().g};
                return jue.a;
            case 12:
                wx3.H(obj);
                List<ep5> list4 = (List) this.Y;
                bs5 bs5 = (bs5) this.Z;
                ArrayList arrayList2 = new ArrayList(q23.H(list4, 10));
                for (ep5 ep5 : list4) {
                    dv3 dv3 = (dv3) bs5.a.get(ep5.a);
                    if (dv3 == null) {
                        dv3 = dv3.b;
                    }
                    ((qt5) this.w0).getClass();
                    arrayList2.add(new dr5(ep5.a, ep5.b, ep5.c, dv3, ep5.G0));
                }
                return arrayList2;
            case 13:
                wx3.H(obj);
                pda pda3 = (pda) this.Z;
                ((TextView) this.Y).setTextColor(pda3.getText().f);
                k77[] k77Arr6 = InputPhoneScreen.I0;
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.w0;
                inputPhoneScreen.getClass();
                k77 k774 = InputPhoneScreen.I0[5];
                String u2 = d8.u(inputPhoneScreen.getContext(), utb.oneme_login_welcome_terms);
                String u3 = d8.u(inputPhoneScreen.getContext(), utb.oneme_login_welcome_privacy_policy_clickable_part);
                String u4 = d8.u(inputPhoneScreen.getContext(), utb.oneme_login_welcome_user_agreement_clickable_part);
                SpannableString spannableString = new SpannableString(u2);
                InputPhoneScreen.q0(u2, u3, spannableString, new ay6(0, inputPhoneScreen), pda3);
                InputPhoneScreen.q0(u2, u4, spannableString, new ay6(1, inputPhoneScreen), pda3);
                ((TextView) inputPhoneScreen.A0.T0(inputPhoneScreen, k774)).setText(spannableString);
                return jue.a;
            case 14:
                wx3.H(obj);
                TextView textView = (TextView) this.Y;
                pda pda4 = (pda) this.Z;
                ((Drawable) this.w0).setTint(pda4.getIcon().f);
                textView.setTextColor(-16745729);
                textView.setBackground(new RippleDrawable(ColorStateList.valueOf(pda4.c().a.c), new ColorDrawable(pda4.b().f), new ColorDrawable(-65536)));
                return jue.a;
            case 15:
                wx3.H(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.Z;
                endlessRecyclerView2.setRefreshingNext(false);
                boolean isEmpty = ((List) this.Y).isEmpty();
                LogsViewerScreen logsViewerScreen = (LogsViewerScreen) this.w0;
                if (isEmpty) {
                    if (!hhd.f(endlessRecyclerView2.getAdapter(), logsViewerScreen.o)) {
                        endlessRecyclerView2.M0(logsViewerScreen.o, true);
                    }
                } else if (!hhd.f(endlessRecyclerView2.getAdapter(), logsViewerScreen.X)) {
                    endlessRecyclerView2.M0(logsViewerScreen.X, true);
                }
                logsViewerScreen.X.m();
                logsViewerScreen.o.m();
                return jue.a;
            case 16:
                wx3.H(obj);
                ((pda) this.Y).getIcon();
                ((Drawable) this.Z).setTint(-1);
                ((AppCompatTextView) this.w0).setTextColor(-1);
                return jue.a;
            case 17:
                wx3.H(obj);
                pda pda5 = (pda) this.Y;
                ((AppCompatTextView) this.Z).setTextColor(pda5.getText().e);
                ((AppCompatTextView) this.w0).setTextColor(pda5.getText().f);
                return jue.a;
            case 18:
                wx3.H(obj);
                k77[] k77Arr7 = MessageContextMenuBottomSheet.d1;
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.w0;
                messageContextMenuBottomSheet.getClass();
                ColorDrawable colorDrawable = messageContextMenuBottomSheet.P0;
                colorDrawable.setColor(((pda) this.Z).b().f);
                ((FrameLayout) this.Y).setBackground(colorDrawable);
                return jue.a;
            case 19:
                wx3.H(obj);
                i22 i22 = (i22) this.Y;
                tw8 tw8 = (tw8) this.Z;
                ydc ydc = ((zz8) this.w0).j1;
                ydc.getClass();
                lg7 c = hwf.c();
                if (!tw8.c) {
                    Iterator it2 = ((ArrayList) ydc.b).iterator();
                    while (it2.hasNext()) {
                        c.addAll(((m02) it2.next()).b(i22));
                    }
                }
                Iterator it3 = ((ArrayList) ydc.c).iterator();
                if (!it3.hasNext()) {
                    c.addAll(tw8.a);
                    if (!tw8.b) {
                        Iterator it4 = ((ArrayList) ydc.o).iterator();
                        if (it4.hasNext()) {
                            hr1.r(it4.next());
                            throw null;
                        }
                    }
                    return hwf.a(c);
                }
                hr1.r(it3.next());
                throw null;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                wx3.H(obj);
                nna nna = (nna) this.Y;
                nna nna2 = (nna) this.Z;
                nna nna3 = nna.a;
                mna.a((mna) this.w0, "gallery", nna == nna3 ? "allowed" : nna2 == nna3 ? "partial" : "denied");
                return jue.a;
            case 21:
                wx3.H(obj);
                hq2 hq22 = (hq2) this.Y;
                List list5 = (List) this.Z;
                ((ksa) this.w0).D0.m((Object) null, Boolean.valueOf(hq22.b));
                ArrayList arrayList3 = new ArrayList(hq22.a.size());
                if (!((Boolean) ((ksa) this.w0).Y.invoke()).booleanValue() || hq22.b) {
                    List<pi2> list6 = hq22.a;
                    ksa ksa = (ksa) this.w0;
                    for (pi2 q : list6) {
                        arrayList3.add(ksa.q(ksa, q));
                    }
                } else {
                    zb9 a = tq7.a();
                    rg5 rg5 = new rg5(myc.Q(new es(2, hq22.a), new qq9(15)));
                    while (rg5.hasNext()) {
                        a.a(((Number) rg5.next()).longValue());
                    }
                    zb9 zb9 = ((ksa) this.w0).J0;
                    long[] jArr = zb9.b;
                    long[] jArr2 = zb9.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr2[i5];
                            long[] jArr3 = jArr2;
                            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < i6) {
                                        if ((j & 255) < 128) {
                                            i2 = i6;
                                            if (!a.d(jArr[(i5 << 3) + i7])) {
                                            }
                                        } else {
                                            i2 = i6;
                                        }
                                        j >>= 8;
                                        i7++;
                                        i6 = i2;
                                    } else if (i6 != 8) {
                                    }
                                }
                            }
                            if (i5 != length) {
                                i5++;
                                jArr2 = jArr3;
                            }
                        }
                    }
                    z = false;
                    ((ksa) this.w0).J0 = a;
                    if (!z) {
                        Iterable iterable = (Iterable) ((ksa) this.w0).I0.getValue();
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            Iterator it5 = iterable.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    if (a.d(((ira) it5.next()).a)) {
                                    }
                                }
                            }
                        }
                    } else {
                        grd grd = ((ksa) this.w0).H0;
                        grd.m((Object) null, Long.valueOf(((Number) grd.getValue()).longValue() + 1));
                    }
                    List<pi2> list7 = hq22.a;
                    ksa ksa2 = (ksa) this.w0;
                    for (pi2 q2 : list7) {
                        arrayList3.add(ksa.q(ksa2, q2));
                    }
                    o23.i0(arrayList3, list5);
                }
                return arrayList3;
            case 22:
                wx3.H(obj);
                List<ep5> list8 = (List) this.Y;
                bs5 bs52 = (bs5) this.Z;
                ArrayList arrayList4 = new ArrayList(q23.H(list8, 10));
                for (ep5 ep52 : list8) {
                    dv3 dv32 = (dv3) bs52.a.get(ep52.a);
                    if (dv32 == null) {
                        dv32 = dv3.b;
                    }
                    ((bta) this.w0).getClass();
                    arrayList4.add(new dr5(ep52.a, ep52.b, ep52.c, dv32, ep52.G0));
                }
                return arrayList4;
            case 23:
                wx3.H(obj);
                List<ep5> list9 = (List) this.Y;
                bs5 bs53 = (bs5) this.Z;
                ArrayList arrayList5 = new ArrayList(q23.H(list9, 10));
                for (ep5 ep53 : list9) {
                    dv3 dv33 = (dv3) bs53.a.get(ep53.a);
                    if (dv33 == null) {
                        dv33 = dv3.b;
                    }
                    ((ata) this.w0).getClass();
                    arrayList5.add(new dr5(ep53.a, ep53.b, ep53.c, dv33, ep53.G0));
                }
                return arrayList5;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                wx3.H(obj);
                PickerContactsListWidget pickerContactsListWidget = (PickerContactsListWidget) this.w0;
                pickerContactsListWidget.Z.E((List) this.Z);
                pickerContactsListWidget.X.E((List) this.Y);
                return jue.a;
            case 25:
                wx3.H(obj);
                pda pda6 = (pda) this.Z;
                ((ViewGroup) this.Y).setBackgroundColor(pda6.b().h);
                k77[] k77Arr8 = ProfileChangeLinkScreen.z0;
                ((ProfileChangeLinkScreen) this.w0).n0().setBackgroundColor(pda6.b().h);
                return jue.a;
            case 26:
                wx3.H(obj);
                i22 i222 = (i22) this.Y;
                tf3 tf3 = (tf3) this.Z;
                k77[] k77Arr9 = q7b.J0;
                ((q7b) this.w0).getClass();
                boolean z4 = tf3.n() == i222.b.d;
                return new z6b(z4 || d8.v(i222.d(tf3.n()), 4), z4 || d8.v(i222.d(tf3.n()), 1), z4 || d8.v(i222.d(tf3.n()), 16), z4 || d8.v(i222.d(tf3.n()), 8), z4 || d8.v(i222.d(tf3.n()), 2), z4 || d8.v(i222.d(tf3.n()), 128), (y6b) null, (y6b) null, (y6b) null, (y6b) null, (y6b) null, (y6b) null, (y6b) null, 8128);
            case 27:
                wx3.H(obj);
                pda pda7 = (pda) this.Z;
                ((View) this.Y).setBackgroundColor(pda7.b().h);
                k77[] k77Arr10 = ProfileScreen.H0;
                ProfileScreen profileScreen = (ProfileScreen) this.w0;
                profileScreen.n0().setTextColor(pda7.getText().e);
                ((TextView) profileScreen.z0.T0(profileScreen, ProfileScreen.H0[6])).setTextColor(pda7.getText().f);
                return jue.a;
            case 28:
                wx3.H(obj);
                TextView textView2 = (TextView) this.Y;
                pda pda8 = (pda) this.Z;
                k77[] k77Arr11 = RecordControlsWidget.m1;
                if (((RecordControlsWidget) this.w0).L0().B0.a.getValue() instanceof m3c) {
                    pda8.getText();
                    textView2.setTextColor(-1);
                } else {
                    textView2.setTextColor(pda8.getText().e);
                }
                return jue.a;
            default:
                wx3.H(obj);
                return ((xk1) ((h5c) this.w0).X.getValue()).h((Long) this.Z, (yh1) this.Y);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.w0 = obj;
    }
}
