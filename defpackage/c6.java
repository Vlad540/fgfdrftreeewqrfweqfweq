package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.tamtam.nano.Protos;

/* renamed from: c6  reason: default package */
public final /* synthetic */ class c6 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [android.app.Activity, ru.ok.messages.media.mediabar.ActLocalMedias] */
    /* JADX WARNING: type inference failed for: r10v2, types: [ru.ok.messages.photoeditor.ActPhotoEditor, android.app.Activity] */
    public final Object invoke() {
        Object value;
        qda qda = qda.a;
        jue jue = jue.a;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                int i = ActLocalMedias.w1;
                int intExtra = ((ActLocalMedias) obj).getIntent().getIntExtra("act:local_medias:chat_mode", 0);
                mi2.b.getClass();
                try {
                    return mi2.values()[intExtra];
                } catch (Throwable unused) {
                    return mi2.DEFAULT;
                }
            case 1:
                int i2 = ActPhotoEditor.d1;
                return Boolean.valueOf(((ActPhotoEditor) obj).getIntent().getBooleanExtra("photo_editor:regular_sending", true));
            case 2:
                k77[] k77Arr = AddChatAdminsScreen.B0;
                o8 o8Var = new o8(5);
                long l0 = ((AddChatAdminsScreen) obj).l0();
                i6b i6b = i6b.a;
                return new lj8((u16) o8Var, new h9(l0, i6b.c(), i6b.getAccessor().d(o2b.class), i6b.d(), i6b.getAccessor().d(s2b.class), 0), 4);
            case 3:
                k77[] k77Arr2 = AddChatMembersScreen.B0;
                int i3 = e87.a;
                if (e87.b(e87.c)) {
                    bm3.p((AddChatMembersScreen) obj);
                }
                return jue;
            case 4:
                k77[] k77Arr3 = AdminsFromContactsScreen.y0;
                k77 k77 = AdminsFromContactsScreen.y0[0];
                AdminsFromContactsScreen adminsFromContactsScreen = (AdminsFromContactsScreen) obj;
                long longValue = ((Number) adminsFromContactsScreen.a.a(adminsFromContactsScreen)).longValue();
                i6b i6b2 = i6b.a;
                return new cc(longValue, (qb) i6b2.getAccessor().c(qb.class), i6b2.c(), i6b2.f());
            case 5:
                return ((zd) obj).b.getContentResolver();
            case 6:
                dw4 dw4 = new dw4();
                dw4.setCallback(((zj) obj).x0);
                return dw4;
            case 7:
                return ((fp) obj).a();
            case 8:
                y52 y52 = new y52();
                y52.e = Collections.singletonMap(1L, 1L);
                dr drVar = (dr) obj;
                i22 a2 = ((p72) drVar.Y.getValue()).a(0, 0, y52.b(), (xm8) null, (xm8) null, (xm8) null);
                a2.l0((di3) drVar.w0.getValue());
                return a2;
            case 9:
                return ((fw) obj).i.k();
            case 10:
                mw mwVar = (mw) obj;
                return new sze((lh6) mwVar.e, (md4) mwVar.d);
            case 11:
                HashMap hashMap = ((AudioAttachView) obj).z0;
                for (Map.Entry entry : hashMap.entrySet()) {
                    ViewGroup viewGroup = (ViewGroup) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    viewGroup.setClipToPadding((intValue & 1) != 0);
                    viewGroup.setClipChildren((intValue & 2) != 0);
                }
                hashMap.clear();
                return jue;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return r40.a((r40) obj);
            case 13:
                return new u40((v40) obj);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                lu7 lu7 = on8.y;
                pda r = km4.y0.r((xk0) obj);
                lu7.getClass();
                return lu7.g(r);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                zz0 zz0 = (zz0) obj;
                View t = ek8.t(zz0, uob.call_bottom_control_container);
                return t == null ? zz0 : t;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                k77[] k77Arr4 = CallBottomPanelWidget.w0;
                CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) obj;
                return new u01(new jrf(callBottomPanelWidget, 1), (aj1) callBottomPanelWidget.c.getValue());
            case LangUtils.HASH_SEED /*17*/:
                return new e11(paf.a((f11) obj));
            case 18:
                l11 l11 = (l11) obj;
                return new oc0(gq3.b(l11.a, n1a.w), dz9.a, l11.a, new o8(16), new o8(17));
            case 19:
                udd.s(((p61) obj).A0, "Didn't updated calls adapter after 5 times, too much computing!", (Throwable) null);
                return jue;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                n61 n61 = (n61) obj;
                fh3 fh3 = n61.a;
                return new oc0(gq3.b(fh3.getContext(), bnb.ic_call_24), dz9.a, fh3.getContext(), new m61(n61, 0), new m61(n61, 1));
            case 21:
                return Boolean.valueOf(((kb5) ((jb5) ((e71) obj).b.getValue())).r());
            case 22:
                mk9 mk9 = CallIncomingScreen.Z;
                return new jrf((CallIncomingScreen) obj, 1);
            case 23:
                idd idd = new idd(((f81) obj).a);
                idd.c(true);
                idd.b(fdd.b);
                k77[] k77Arr5 = idd.E0;
                idd.A0.o1(idd, k77Arr5[4], new float[]{0.9f, 1.1f, 0.9f});
                idd.B0.o1(idd, k77Arr5[5], 8000L);
                idd.x0.o1(idd, k77Arr5[1], new float[]{0.0f, 0.0f});
                idd.z0.o1(idd, k77Arr5[3], 0L);
                idd.a(qda);
                return idd;
            case 24:
                oj7 oj7 = new oj7(h1a.g, -16745729, (Context) ((nu7) obj).a);
                float f = (float) 12;
                oj7.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                return oj7;
            case 25:
                return Long.valueOf(((lqc) ((f03) ((t97) ((ga1) obj).c.b).getValue())).s());
            case 26:
                return sb1.a((sb1) obj);
            case 27:
                k77[] k77Arr6 = CallRateBottomSheet.M0;
                k77 k772 = k77Arr6[0];
                CallRateBottomSheet callRateBottomSheet = (CallRateBottomSheet) obj;
                k77 k773 = k77Arr6[1];
                boolean booleanValue = ((Boolean) callRateBottomSheet.D0.a(callRateBottomSheet)).booleanValue();
                k77 k774 = k77Arr6[2];
                return new qf1((String) callRateBottomSheet.C0.a(callRateBottomSheet), booleanValue, (List) callRateBottomSheet.E0.a(callRateBottomSheet));
            case 28:
                return Integer.valueOf(zj1.w((zj1) obj));
            default:
                lhd lhd = ((hl1) obj).K0;
                if (lhd != null) {
                    k77[] k77Arr7 = CallTopPanelWidget.o;
                    grd grd = ((CallTopPanelWidget) lhd.b).m0().c.i.Y;
                    do {
                        value = grd.getValue();
                    } while (!grd.b(value, eoc.a((eoc) value, (foc) null, (aoc) null, true, 3)));
                }
                return jue;
        }
    }
}
