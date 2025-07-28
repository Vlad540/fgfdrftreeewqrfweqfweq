package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;
import one.me.sharedata.ShareDataPickerScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.onechat.reactions.ReactionsViewModel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: nya  reason: default package */
public final /* synthetic */ class nya implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nya(zde zde) {
        this.a = 25;
        this.b = una.TYPE_CHAT_MARK;
        this.c = zde;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r8v22, types: [hva, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v15, types: [sdd, java.lang.Object] */
    public final Object invoke() {
        long j;
        long e;
        boolean z = true;
        Integer num = null;
        jue jue = jue.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                rya rya = (rya) obj2;
                rya.f.o1(rya, rya.h[0], xs7.D(rya.c, ((pae) obj).a(), ru3.b, new pya(rya, (Continuation) null)));
                return jue;
            case 1:
                ((ProfileChangeLinkScreen) ((t5b) ((cpf) obj2).Y)).o0().b.g(((b7) ((q8b) obj)).a);
                return jue;
            case 2:
                k77[] k77Arr = ProfileChangeLinkScreen.z0;
                long j2 = ((Bundle) obj2).getLong("entity:id");
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) obj;
                profileChangeLinkScreen.getClass();
                k77 k77 = ProfileChangeLinkScreen.z0[1];
                return new pz1(j2, (d8b) profileChangeLinkScreen.b.a(profileChangeLinkScreen), profileChangeLinkScreen.m0());
            case 3:
                b7 b7Var = (b7) ((q8b) obj);
                long j3 = (long) b7Var.a;
                if (b7Var.b.o != d7d.o) {
                    z = false;
                }
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) ((w6b) ((mr5) obj2).Y);
                if (z) {
                    profileEditAdminPermissionsWidget.n0().w();
                } else {
                    q7b n0 = profileEditAdminPermissionsWidget.n0();
                    k77[] k77Arr2 = q7b.J0;
                    n0.v(j3, false);
                }
                return jue;
            case 4:
                k77[] k77Arr3 = ProfileEditScreen.C0;
                Parcelable parcelable = ((Bundle) obj).getParcelable("profile:type");
                if (parcelable != null) {
                    return new hab(((ProfileEditScreen) obj2).a, (d8b) parcelable);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 5:
                ((ProfileEditScreen) ((u9b) ((cpf) obj2).Y)).m0().b.a(((b7) ((q8b) obj)).a);
                return jue;
            case 6:
                ubb l0 = ((ProfileInviteScreen) ((hbb) obj2).X).l0();
                l0.getClass();
                int i = j8a.P;
                int i2 = ((jcb) ((ncb) obj)).a;
                l05 l05 = l0.F0;
                if (i2 == i) {
                    String s = l0.s();
                    if (s != null) {
                        taf.o(l05, new cbb(s));
                    }
                } else if (i2 == j8a.O) {
                    String s2 = l0.s();
                    if (s2 != null) {
                        taf.o(l05, new bbb(s2));
                    }
                } else if (i2 == j8a.M) {
                    kdb.c.getClass();
                    rf0.j(wn6.k(new StringBuilder(":profile/edit/link?id="), l0.b, "&type=local_chat&flow=edit"), l05);
                }
                return jue;
            case 7:
                ((s16) obj2).invoke();
                return Boolean.valueOf(((xyb) obj).isLaidOut());
            case 8:
                return new a0c((t97) obj2, (ReactionsViewModel) obj);
            case 9:
                xdc xdc = (xdc) obj2;
                long a2 = ((aqc) xdc.e.getValue()).a();
                o62 o62 = (o62) obj;
                boolean f = o62.f(a2);
                r7e r7e = xdc.c;
                if (f) {
                    pkc pkc = (pkc) r7e.getValue();
                    pkc.getClass();
                    pec a3 = pec.a(1, "SELECT chat_id FROM saved_msg_chat WHERE user_id = ?");
                    a3.j(1, a2);
                    aec aec = pkc.a;
                    aec.b();
                    Cursor o = aec.o(a3, (CancellationSignal) null);
                    try {
                        e = o.moveToFirst() ? o.getLong(0) : 0;
                    } finally {
                        o.close();
                        a3.m();
                    }
                } else {
                    long j4 = o62.a;
                    if (j4 != 0) {
                        e = xdc.c().e(j4);
                    } else {
                        long j5 = o62.l;
                        if (j5 != 0) {
                            yp2 c2 = xdc.c();
                            c2.getClass();
                            pec a4 = pec.a(1, "SELECT id FROM chats WHERE cid = ?");
                            a4.j(1, j5);
                            aec aec2 = c2.a;
                            aec2.b();
                            Cursor o2 = aec2.o(a4, (CancellationSignal) null);
                            try {
                                long j6 = o2.moveToFirst() ? o2.getLong(0) : 0;
                                o2.close();
                                a4.m();
                                j = j6;
                            } catch (Throwable th) {
                                o2.close();
                                a4.m();
                                throw th;
                            }
                        } else {
                            j = 0;
                        }
                        long d = xdc.c().d(new o72(j, o62.a, o62, o62.a().e, pfa.n(((cw8) xdc.d.getValue()).k(o62.j), o62), o62.l), ((l16) xdc.f.getValue()).a);
                        if (f && j == 0) {
                            ((pkc) r7e.getValue()).a(a2, d);
                        }
                        return Long.valueOf(d);
                    }
                }
                j = e;
                long d2 = xdc.c().d(new o72(j, o62.a, o62, o62.a().e, pfa.n(((cw8) xdc.d.getValue()).k(o62.j), o62), o62.l), ((l16) xdc.f.getValue()).a);
                ((pkc) r7e.getValue()).a(a2, d2);
                return Long.valueOf(d2);
            case 10:
                a06.v((Activity) obj2, (Intent) obj);
                return jue;
            case 11:
                efc efc = (Activity) obj2;
                if (efc.h()) {
                    a06.h((RootController) obj);
                }
                a06.v(efc, efc.getIntent());
                return jue;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((vx0) ((doc) obj2).c.getValue()).C0.g(new ib(((RecordManager.StopParams) obj).getRemoveRecord()));
                return jue;
            case 13:
                TextPaint textPaint = new TextPaint();
                wxc wxc = (wxc) obj;
                ((nge) obj2).a(textPaint, wxc.a.getResources().getDisplayMetrics(), (yq4) wxc.f.getValue());
                return textPaint;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                k77[] k77Arr4 = ServerPortBottomSheet.F0;
                bm3.r((OneMeButton) obj2);
                ((ServerPortBottomSheet) obj).r0(true);
                return jue;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                sn0 sn0 = (sn0) ((pg7) obj);
                k77[] k77Arr5 = SettingsBlacklistScreen.Z;
                k6d l02 = ((SettingsBlacklistScreen) ((x3a) obj2).b).l0();
                l02.getClass();
                Bundle bundle = new Bundle(0);
                bundle.putLong("user_unblock_id", sn0.a);
                taf.o(l02.C0, new v5d(new jge(xaa.b, cs.g0(new Object[]{sn0.c})), p23.B(new u5d[]{new u5d(new hge(xaa.c), vaa.d, true), new u5d(new hge(xaa.a), vaa.e, false)}), (mnc) null, bundle, 4));
                return jue;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                int i3 = SetupPinCodeScreen.o;
                bm3.r((hva) obj2);
                ex9 onBackPressedDispatcher = ((SetupPinCodeScreen) obj).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue;
            case LangUtils.HASH_SEED /*17*/:
                k77[] k77Arr6 = ShareDataPickerScreen.H0;
                ShareDataPickerScreen shareDataPickerScreen = (ShareDataPickerScreen) obj2;
                shareDataPickerScreen.u0().c.k.K(4);
                ek8.g((View) obj, ShareDataPickerScreen.I0, (u16) null);
                shareDataPickerScreen.w0().setLeftIcon(phc.Z0);
                return jue;
            case 18:
                k77[] k77Arr7 = ShareDataPickerScreen.H0;
                ShareDataPickerScreen shareDataPickerScreen2 = (ShareDataPickerScreen) obj2;
                zad zad = shareDataPickerScreen2.u0().c;
                CharSequence text = ((jq8) obj).getText();
                zad.getClass();
                if (!((Set) shareDataPickerScreen2.u0().Z.a.getValue()).isEmpty() && !zad.m) {
                    zad.m = true;
                    ou3 ou3 = zad.l;
                    if (ou3 != null) {
                        xs7.D(ou3, sk9.a.plus(((pae) zad.d.getValue()).a()), ru3.c, new yad(zad, text, (Continuation) null));
                    }
                    zad.i.g(abd.a);
                }
                return jue;
            case 19:
                rad rad = (rad) obj;
                ((ubd) obj2).w0.invoke(new vv8(rad.g, rad));
                return jue;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                Context context = ((ydd) obj2).a;
                ActivityManager activityManager = (ActivityManager) hq3.b(context, ActivityManager.class);
                if (activityManager != null) {
                    num = Integer.valueOf(activityManager.getLauncherLargeIconSize());
                }
                int i4 = l9a.j;
                km4.y0.n(context).g();
                Drawable q = js.q(i4, -16745729, context);
                Bitmap E = d8.E(q, num != null ? num.intValue() : q.getIntrinsicWidth(), num != null ? num.intValue() : q.getIntrinsicHeight());
                String string = context.getString(zub.shortcut_id_create_chat);
                ? obj3 = new Object();
                obj3.a = context;
                obj3.b = string;
                obj3.d = context.getString(cic.X2);
                obj3.f = IconCompat.b(E);
                sr7.c.getClass();
                t97 t97 = (t97) obj;
                String str = ((gg7) ((al) t97.getValue())).b;
                String str2 = ((gg7) ((al) t97.getValue())).e;
                Intent intent = new Intent(context, MainActivity.class);
                intent.setAction("CUSTOM_DEEP_LINK");
                intent.setData(Uri.parse(str + "://" + str2 + "/:start-conversation"));
                obj3.c = new Intent[]{intent};
                if (!TextUtils.isEmpty(obj3.d)) {
                    Intent[] intentArr = obj3.c;
                    if (intentArr != null && intentArr.length != 0) {
                        return obj3;
                    }
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            case 21:
                Object obj4 = ((l7c) obj2).a;
                wia wia = oed.b;
                if (hhd.f(obj4, wia != null ? (gba) wia.b : null)) {
                    oed.b = null;
                }
                ((s16) obj).invoke();
                return jue;
            case 22:
                hud hud = (hud) ((rq3) obj2).M0;
                if (hud != null) {
                    ((fwd) obj).f(hud);
                }
                return jue;
            case 23:
                ((s16) obj2).invoke();
                ((a7e) obj).y();
                return jue;
            case 24:
                cn0 cn0 = (cn0) ((t97) obj2).getValue();
                Drawable b2 = gq3.b(((c7e) obj).Z, phc.P1);
                if (b2 != null) {
                    Bitmap bitmap = (Bitmap) cn0.get(b2.getIntrinsicHeight() * b2.getIntrinsicWidth() * 4);
                    bitmap.reconfigure(b2.getIntrinsicWidth(), b2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    b2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    b2.draw(canvas);
                    return bitmap;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 25:
                StringBuilder sb = new StringBuilder("Cancelling task of type=");
                sb.append((una) obj2);
                sb.append(", task=");
                zde zde = (zde) obj;
                sb.append(zde.f.getClass().getName());
                sb.append(", id=");
                sb.append(zde.a);
                sb.append(", status=");
                sb.append(zde.b);
                return sb.toString();
            case 26:
                return ((xr0) ((t97) obj2).getValue()).a(((fle) obj).a);
            case 27:
                h6f h6f = (h6f) obj;
                q4e q4e = (q4e) obj2;
                Surface d3 = q4e.d(h6f.X, new f6f(h6f, q4e));
                s6f s6f = h6f.y0;
                if (s6f != null) {
                    s6f.p(d3);
                    h6f.Z.put(q4e, d3);
                    return jue;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                kmf kmf = (kmf) obj2;
                long s3 = ((lqc) kmf.Z).s();
                uif uif = uif.a;
                return new zgf(s3, kmf.b, kmf.a, (Context) uif.getAccessor().c(Context.class), new t0c(kmf.K0), uif.getAccessor().d(xff.class), (t97) obj);
        }
    }

    public /* synthetic */ nya(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
