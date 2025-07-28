package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import one.me.sdk.richvector.internal.element.ClipPathElement;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: nl1  reason: default package */
public final /* synthetic */ class nl1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nl1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v131, types: [rr3, one.me.chats.picker.contacts.ContactsPickerScreen] */
    public final Object invoke() {
        int i;
        Set<j10> set;
        wd3 wd3;
        JSONArray optJSONArray;
        int i2 = 6;
        boolean z = false;
        tq3 tq3 = null;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallTopPanelWidget.o;
                return new ml1((aj1) ((CallTopPanelWidget) this.b).a.getValue());
            case 1:
                s16 s16 = ((gm1) this.b).k1;
                if (s16 != null) {
                    return (f5f) s16.invoke();
                }
                return null;
            case 2:
                return new b(23, (an1) this.b);
            case 3:
                ync ync = (ync) ((tz0) this.b).b;
                if (ync.f || ync.e) {
                    i2 = 4;
                }
                return Integer.valueOf(i2);
            case 4:
                k77[] k77Arr2 = ChangeOwnerScreen.y0;
                long l0 = ((ChangeOwnerScreen) this.b).l0();
                i6b i6b = i6b.a;
                return new e02(l0, i6b.c(), i6b.e(), i6b.b(), i6b.f());
            case 5:
                return Boolean.valueOf(((jb5) ((o22) this.b).g.getValue()).s());
            case 6:
                k77[] k77Arr3 = ChatMediaDownloadBottomSheet.I0;
                d00 d00 = new d00();
                d00.c = a24.X(((float) 52) * dh4.c().getDisplayMetrics().density);
                d00.b = true;
                d00.invalidateSelf();
                ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = (ChatMediaDownloadBottomSheet) this.b;
                pda pda = chatMediaDownloadBottomSheet.H0;
                if (pda == null) {
                    pda = km4.y0.n(chatMediaDownloadBottomSheet.getContext()).g();
                }
                d00.b(pda.getIcon().f);
                d00.e = true;
                d00.invalidateSelf();
                return d00;
            case 7:
                k77[] k77Arr4 = ChatMediaListWidget.w0;
                ChatMediaListWidget chatMediaListWidget = (ChatMediaListWidget) this.b;
                bc2 bc2 = new bc2(chatMediaListWidget.getContext());
                bc2.setTitle(l8a.q0);
                int ordinal = chatMediaListWidget.n0().ordinal();
                if (ordinal == 0) {
                    i = l9a.w;
                } else if (ordinal == 1) {
                    i = l9a.h;
                } else if (ordinal == 2) {
                    i = l9a.v;
                } else if (ordinal == 3) {
                    i = l9a.x;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                bc2.setIcon(i);
                return bc2;
            case 8:
                int ordinal2 = ((gf2) this.b).c.ordinal();
                if (ordinal2 == 0) {
                    set = z3d.N(j10.c, j10.o);
                } else if (ordinal2 == 1) {
                    set = Collections.singleton(j10.y0);
                } else if (ordinal2 == 2) {
                    set = Collections.singleton(j10.Z);
                } else if (ordinal2 == 3) {
                    set = Collections.singleton(j10.X);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList = new ArrayList(q23.H(set, 10));
                for (j10 obj : set) {
                    arrayList.add(obj.toString());
                }
                return o23.q0(arrayList);
            case 9:
                if (((mi2) this.b) == mi2.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                km4.y0.r((fk2) this.b);
                return -16745729;
            case 11:
                fo2 fo2 = (fo2) this.b;
                int i3 = zp4.o;
                vqc vqc = fo2.b;
                vqc.getClass();
                int i4 = 60;
                int o = (int) vqc.o(PmsKey.subscription-timeout-seconds, (long) 60);
                if (o != 0) {
                    i4 = o;
                }
                long P = mt0.P(i4, eq4.SECONDS);
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, "fo2", "#" + fo2.a + " timeout = " + zp4.j(P), (Throwable) null);
                }
                return new zp4(P);
            case 12:
                t52 l = ((aw2) this.b).l();
                l.e();
                Long l2 = (Long) l.e0("getMaxLastEventTime", new e52(l, 2));
                l2.longValue();
                return l2;
            case 13:
                k77[] k77Arr5 = ChatsTabWidget.F0;
                ((ChatsTabWidget) this.b).l0().requestDisallowInterceptTouchEvent(false);
                return jue.a;
            case 14:
                k77[] k77Arr6 = ChatsTabWidget.F0;
                zu2.c.P1().b(":settings/folder/edit?id=".concat(((sz9) this.b).a), (Bundle) null);
                return jue.a;
            case 15:
                return ClipPathElement.a((ClipPathElement) this.b);
            case 16:
                vce vce = vce.a;
                k33 k33 = (k33) this.b;
                wia wia = new wia(vce, Integer.valueOf(k33.a));
                wia wia2 = new wia(vce.b, Integer.valueOf(k33.b));
                wia wia3 = new wia(vce.c, Integer.valueOf(k33.c));
                wia wia4 = new wia(vce.o, Integer.valueOf(k33.e));
                wia wia5 = new wia(vce.X, Integer.valueOf(k33.f));
                wia wia6 = new wia(vce.Y, Integer.valueOf(k33.h));
                wia wia7 = new wia(vce.Z, Integer.valueOf(k33.j));
                wia wia8 = new wia(vce.w0, Integer.valueOf(k33.k));
                wia wia9 = new wia(vce.x0, Integer.valueOf(k33.l));
                wia wia10 = new wia(vce.y0, Integer.valueOf(k33.m));
                wia wia11 = new wia(vce.z0, Integer.valueOf(k33.n));
                wia wia12 = new wia(vce.A0, Integer.valueOf(k33.o));
                wia wia13 = new wia(vce.B0, Integer.valueOf(k33.p));
                wia wia14 = new wia(vce.C0, Integer.valueOf(k33.q));
                wia wia15 = new wia(vce.D0, Integer.valueOf(k33.r));
                wia wia16 = new wia(vce.E0, Integer.valueOf(k33.s));
                wia wia17 = new wia(vce.F0, Integer.valueOf(k33.t));
                wia wia18 = new wia(vce.G0, Integer.valueOf(k33.u));
                wia wia19 = new wia(vce.H0, Integer.valueOf(k33.v));
                wia wia20 = new wia(vce.I0, Integer.valueOf(k33.w));
                wia wia21 = new wia(vce.J0, Integer.valueOf(k33.x));
                wia wia22 = new wia(vce.K0, Integer.valueOf(k33.y));
                wia wia23 = new wia(vce.L0, Integer.valueOf(k33.z));
                wia wia24 = new wia(vce.M0, Integer.valueOf(k33.A));
                wia wia25 = new wia(vce.N0, Integer.valueOf(k33.B));
                wia wia26 = new wia(vce.O0, Integer.valueOf(k33.C));
                wia wia27 = new wia(vce.P0, Integer.valueOf(k33.D));
                wia wia28 = new wia(vce.Q0, Integer.valueOf(k33.E));
                wia wia29 = new wia(vce.R0, Integer.valueOf(k33.F));
                wia wia30 = new wia(vce.S0, Integer.valueOf(k33.G));
                wia wia31 = new wia(vce.T0, Integer.valueOf(k33.H));
                wia wia32 = new wia(vce.U0, Integer.valueOf(k33.I));
                wia wia33 = new wia(vce.V0, Integer.valueOf(k33.J));
                wia wia34 = new wia(vce.W0, Integer.valueOf(k33.K));
                wia wia35 = new wia(vce.X0, k33.L);
                wia wia36 = new wia(vce.Y0, k33.M);
                wia wia37 = new wia(vce.Z0, k33.N);
                wia wia38 = new wia(vce.a1, k33.O);
                wia wia39 = new wia(vce.b1, k33.P);
                wia wia40 = new wia(vce.c1, Integer.valueOf(k33.Q));
                wia wia41 = new wia(vce.d1, Integer.valueOf(k33.R));
                wia wia42 = new wia(vce.e1, Integer.valueOf(k33.S));
                wia wia43 = wia14;
                wia wia44 = wia15;
                return ju7.R(wia, wia2, wia3, wia4, wia5, wia6, wia7, wia8, wia9, wia10, wia11, wia12, wia13, wia14, wia15, wia16, wia17, wia18, wia19, wia20, wia21, wia22, wia23, wia24, wia25, wia26, wia27, wia28, wia29, wia30, wia31, wia32, wia33, wia34, wia35, wia36, wia37, wia38, wia39, wia40, wia41, wia42);
            case 17:
                return Integer.valueOf(Integer.parseInt(((cd3) this.b).b));
            case 18:
                yd3 yd3 = (yd3) this.b;
                vqc vqc2 = (xzc) yd3.a;
                vqc2.getClass();
                String string = vqc2.g.getString(PmsKey.conn-timeouts.name(), (String) null);
                if (string != null) {
                    try {
                        tq3 = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                }
                r7e r7e = (r7e) yd3.e;
                if (tq3 == null) {
                    return (Map) r7e.getValue();
                }
                EnumMap enumMap = new EnumMap((Map) r7e.getValue());
                Iterator<String> keys = tq3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Integer G = o0e.G(next);
                    if (!(G == null || (wd3 = (wd3) o23.Y(G.intValue(), wd3.w0)) == null || (optJSONArray = tq3.optJSONArray(next)) == null || optJSONArray.length() == 0)) {
                        int length = optJSONArray.length();
                        long[] jArr = new long[length];
                        for (int i5 = 0; i5 < length; i5++) {
                            jArr[i5] = optJSONArray.optLong(i5, WorkRequest.MIN_BACKOFF_MILLIS);
                        }
                        enumMap.put(wd3, jArr);
                    }
                }
                return enumMap;
            case 19:
                return new RippleDrawable(ColorStateList.valueOf(km4.y0.r((kh3) this.b).c().a.f), (Drawable) null, new ColorDrawable(-1));
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return n1g.a((ju3) ((wk3) this.b).k.getValue());
            case 21:
                return hm3.d((hm3) this.b);
            case 22:
                km4.y0.r((an3) this.b);
                return -16745729;
            case 23:
                k77[] k77Arr7 = ContactsPickerScreen.z0;
                int i6 = e87.a;
                if (e87.b(e87.c)) {
                    bm3.p((ContactsPickerScreen) this.b);
                }
                return jue.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                ap3 ap3 = (ap3) this.b;
                di3 di3 = ap3.a;
                tf3 i7 = di3.i(di3.h.a.s(), false);
                return i7 == null ? ap3.a(((Number) ap3.b.getValue()).longValue()) : i7;
            case 25:
                grd a2 = hrd.a((Object) null);
                pj5 x = ez3.x(a2, 200);
                fp3 fp3 = (fp3) this.b;
                ez3.N(new ck5(x, new hp0(2, fp3, fp3.class, "startSearch", "startSearch(Ljava/lang/String;)V", 4, 14), 5), fp3.a);
                return a2;
            case 26:
                k77[] k77Arr8 = ContextMenuBottomSheet.K0;
                ContextMenuBottomSheet contextMenuBottomSheet = (ContextMenuBottomSheet) this.b;
                contextMenuBottomSheet.getClass();
                k77[] k77Arr9 = ContextMenuBottomSheet.K0;
                k77 k77 = k77Arr9[6];
                jr jrVar = contextMenuBottomSheet.I0;
                if (!((Boolean) jrVar.a(contextMenuBottomSheet)).booleanValue()) {
                    k77 k772 = k77Arr9[6];
                    jrVar.b(contextMenuBottomSheet, Boolean.TRUE);
                    tq3 targetController = contextMenuBottomSheet.getTargetController();
                    if (targetController instanceof tq3) {
                        tq3 = targetController;
                    }
                    if (tq3 != null) {
                        tq3.onDismiss();
                    }
                }
                return jue.a;
            case 27:
                k77[] k77Arr10 = ContextMenuPopupWindow.y0;
                ContextMenuPopupWindow contextMenuPopupWindow = (ContextMenuPopupWindow) this.b;
                contextMenuPopupWindow.getClass();
                k77[] k77Arr11 = ContextMenuPopupWindow.y0;
                k77 k773 = k77Arr11[6];
                jr jrVar2 = contextMenuPopupWindow.Z;
                if (!((Boolean) jrVar2.a(contextMenuPopupWindow)).booleanValue()) {
                    k77 k774 = k77Arr11[6];
                    jrVar2.b(contextMenuPopupWindow, Boolean.TRUE);
                    tq3 targetController2 = contextMenuPopupWindow.getTargetController();
                    if (targetController2 instanceof tq3) {
                        tq3 = targetController2;
                    }
                    if (tq3 != null) {
                        tq3.onDismiss();
                    }
                }
                return jue.a;
            case 28:
                return ((ParticipantStore) this.b).getActiveRoomId();
            default:
                return ((nj4) this.b).get();
        }
    }
}
