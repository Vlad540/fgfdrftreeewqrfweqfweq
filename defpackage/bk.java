package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import one.me.android.OneMeApplication;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.devmenu.DevMenuScreen;
import one.me.folders.list.FoldersListScreen;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import one.me.settings.privacy.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.animoji.views.AnimojiTextView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: bk  reason: default package */
public final /* synthetic */ class bk implements i26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r11v45, types: [t5d, sg9] */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        a34 a34;
        zye zye;
        za6 za6;
        String str = null;
        switch (this.a) {
            case 0:
                AnimojiTextView.j((AnimojiTextView) this.b, (CharSequence) obj, (TextView.BufferType) obj2);
                return jue.a;
            case 1:
                ((gx0) this.b).k((g41) obj, obj2);
                return jue.a;
            case 2:
                ((u5g) this.b).k(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return jue.a;
            case 3:
                ((Long) obj).getClass();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                xg1 xg1 = ((uj1) this.b).K0;
                if (xg1 != null) {
                    smc smc = CallScreen.T0;
                    xg1.a.z0().c.h.a(booleanValue);
                }
                return jue.a;
            case 4:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                an1.a((an1) this.b);
                return jue.a;
            case 5:
                int i2 = ChangeDisabledDialog.C0;
                ob7 ob7 = ob7.o;
                ChangeDisabledDialog changeDisabledDialog = (ChangeDisabledDialog) this.b;
                ez3.N(new ck5(wx3.e((pj5) obj, changeDisabledDialog.getViewLifecycleOwner().R(), ob7), new zy1((Continuation) null, (u16) obj2), 5), changeDisabledDialog.getViewLifecycleScope());
                return jue.a;
            case 6:
                ((dk3) ((cpf) this.b).Y).g(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return jue.a;
            case 7:
                a24.a0((AppCompatTextView) obj2, new ub((Object) (oq3) obj, 22, (Object) (zq3) this.b));
                return jue.a;
            case 8:
                z14 z14 = (z14) obj2;
                int i3 = DevMenuScreen.x0;
                mge mge = ((z14) obj).b;
                DevMenuScreen devMenuScreen = (DevMenuScreen) this.b;
                CharSequence a2 = mge.a(devMenuScreen.getContext());
                String obj3 = a2 != null ? a2.toString() : null;
                String str2 = "";
                if (obj3 == null) {
                    obj3 = str2;
                }
                CharSequence a3 = z14.b.a(devMenuScreen.getContext());
                if (a3 != null) {
                    str = a3.toString();
                }
                if (str != null) {
                    str2 = str;
                }
                return Integer.valueOf(obj3.compareTo(str2));
            case 9:
                ((ue5) this.b).d.k((String) obj, obj2);
                return jue.a;
            case 10:
                ob7 ob72 = ob7.o;
                ForgotPinCodeDialog forgotPinCodeDialog = (ForgotPinCodeDialog) this.b;
                ez3.N(new ck5(wx3.e((pj5) obj, forgotPinCodeDialog.getViewLifecycleOwner().R(), ob72), new ou5((Continuation) null, (u16) obj2), 5), forgotPinCodeDialog.getViewLifecycleScope());
                return jue.a;
            case 11:
                View view = (View) obj;
                x2e x2e = (x2e) obj2;
                i26 i26 = (i26) this.b;
                if (i26 != null) {
                    i26.invoke(view, x2e);
                }
                return jue.a;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                String str3 = (String) obj;
                List<gy7> list = (List) obj2;
                int i4 = OneMeApplication.w0;
                int size = list.size();
                long j = 0;
                for (gy7 gy7 : list) {
                    j += gy7.o.toMillis(gy7.c);
                }
                StringBuilder sb = new StringBuilder("Thread: ");
                sb.append(str3);
                sb.append(", tasksCount = ");
                sb.append(size);
                sb.append(", totalDuration = ");
                String k = wn6.k(sb, j, "\n");
                StringBuilder sb2 = (StringBuilder) this.b;
                sb2.append(k);
                o23.b0(o23.m0(list, new gu6(6)), sb2, 0, new qq9(4), 60);
                sb2.append("\n");
                return jue.a;
            case 13:
                int intValue = ((Integer) obj).intValue();
                String str4 = (fu3) obj2;
                xhd key = str4.getKey();
                String str5 = ((zic) this.b).X.get(key);
                if (key != xhd.c) {
                    i = str4 != str5 ? Integer.MIN_VALUE : intValue + 1;
                } else {
                    String str6 = (g37) str5;
                    String str7 = (g37) str4;
                    while (true) {
                        if (str7 != null) {
                            if (str7 != str6 && (str7 instanceof ScopeCoroutine)) {
                                str7 = ((ScopeCoroutine) str7).getParent();
                            }
                        }
                    }
                    str = str7;
                    if (str == str6) {
                        if (str6 != null) {
                            intValue++;
                        }
                        i = intValue;
                    } else {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + str + ", expected child of " + str6 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                return Integer.valueOf(i);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                long longValue = ((Long) obj).longValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                f7d f7d = ((q7d) this.b).J0;
                if (f7d != null) {
                    f7d.W(longValue, booleanValue2);
                }
                return jue.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((f7d) this.b).W(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return jue.a;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                long longValue2 = ((Long) obj).longValue();
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                k77[] k77Arr = SettingMediaScreen.Y;
                i5d l0 = ((SettingMediaScreen) ((e3) this.b).a).l0();
                int i5 = (int) longValue2;
                l0.getClass();
                if (i5 == saa.m) {
                    l0.B0.o1(l0, i5d.E0[6], taf.n(l0, (hu3) null, (ru3) null, new b5d(l0, booleanValue3, (Continuation) null), 3));
                } else if (i5 == saa.j) {
                    l0.C0.o1(l0, i5d.E0[7], taf.n(l0, (hu3) null, (ru3) null, new a5d(l0, booleanValue3, (Continuation) null), 3));
                } else if (i5 == saa.n) {
                    l0.A0.o1(l0, i5d.E0[5], taf.n(l0, (hu3) null, (ru3) null, new f5d(l0, booleanValue3, (Continuation) null), 3));
                }
                return jue.a;
            case LangUtils.HASH_SEED /*17*/:
                long longValue3 = ((Long) obj).longValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                k77[] k77Arr2 = SettingsPrivacyScreen.Z;
                t9d l02 = ((SettingsPrivacyScreen) ((lhd) this.b).b).l0();
                l02.getClass();
                long j2 = waa.g;
                if (longValue3 == j2) {
                    if (!booleanValue4) {
                        l02.M0 = j2;
                        l02.w(t5d.b);
                    } else if (!l02.s().q()) {
                        if (l02.s().q()) {
                            a34 = (!l02.s().q() || !l02.t().a()) ? s5d.b : t5d.b;
                        } else if (((i03) l02.t()).g.getBoolean("app.onboarding.safe_mode", false)) {
                            c9d.c.getClass();
                            a34 = new a34(":settings/privacy/pincode?mode=setup");
                        } else {
                            c9d.c.getClass();
                            a34 = new a34(":settings/privacy/onboarding");
                        }
                        l02.w(a34);
                    }
                }
                return jue.a;
            case 18:
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                k77[] k77Arr3 = StickersSettingsScreen.Y;
                gxd l03 = ((StickersSettingsScreen) this.b).l0();
                ArrayList arrayList = new ArrayList((Collection) l03.X.getValue());
                if (intValue3 >= 0 && intValue3 <= p23.A(arrayList)) {
                    dtc dtc = (dtc) arrayList.get(intValue3);
                    if (dtc instanceof btc) {
                        l03.z0 = Long.valueOf(((btc) dtc).a);
                        if (l03.x0 == null) {
                            l03.y0 = intValue2;
                            Object obj4 = arrayList.get(intValue2);
                            btc btc = obj4 instanceof btc ? (btc) obj4 : null;
                            l03.x0 = btc != null ? Long.valueOf(btc.a) : null;
                        }
                        Object obj5 = arrayList.get(intValue2);
                        arrayList.remove(intValue2);
                        arrayList.add(intValue3, obj5);
                        l03.X.m((Object) null, arrayList);
                    }
                }
                return jue.a;
            case 19:
                List list2 = (List) obj;
                if (((Integer) obj2).intValue() == rca.v) {
                    hge hge = new hge(list2.size() > 1 ? sca.t : sca.s);
                    int size2 = list2.size();
                    kyd kyd = (kyd) this.b;
                    String s = kyd.s(size2);
                    mvd mvd = mvd.RECENT;
                    mvd mvd2 = kyd.b;
                    Context context = kyd.o;
                    taf.o(kyd.E0, new n6d(hge, new lge(context.getString(sca.u, new Object[]{s, mvd2 == mvd ? context.getString(sca.E) : context.getString(sca.y)})), p23.B(new kc3[]{new kc3(rca.c, new hge(sca.h), 1, false), new kc3(rca.a, new hge(sca.i), 2, false)})));
                }
                return jue.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                View view2 = (View) obj;
                if (((MotionEvent) obj2).getAction() == 0 && (za6 = zye.J0) != null) {
                    ((FoldersListScreen) za6.a).o.t((zye = (zye) this.b));
                }
                return Boolean.FALSE;
            case 21:
                Long l = (Long) obj;
                l.longValue();
                ((w1f) this.b).c.invoke(l, (View) obj2);
                return jue.a;
            default:
                rz rzVar = (rz) obj;
                ((Long) obj2).longValue();
                ((a6f) this.b).performClick();
                return jue.a;
        }
    }
}
