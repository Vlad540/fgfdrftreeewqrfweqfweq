package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.AudioManager;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import one.me.settings.SettingsListScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import ru.ok.onechat.reactions.ReactionsViewModel;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: u5b  reason: default package */
public final /* synthetic */ class u5b implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u5b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v100, types: [a9a, android.view.View, java.lang.Object] */
    public final Object invoke() {
        MessageContextMenuBottomSheet messageContextMenuBottomSheet;
        rzb rzb;
        t0b callback;
        String str;
        s59 s59 = km4.y0;
        yr8 yr8 = null;
        jue jue = jue.a;
        int i = 0;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ProfileChangeLinkScreen.z0;
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) obj;
                profileChangeLinkScreen.getClass();
                k77 k77 = ProfileChangeLinkScreen.z0[1];
                int ordinal = ((d8b) profileChangeLinkScreen.b.a(profileChangeLinkScreen)).ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    return mnc.CHAT_LINK_EDITING;
                }
                if (ordinal == 2) {
                    return mnc.SETTINGS_SHORTNAME_CHANGE;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                q7b n0 = ((ProfileEditAdminPermissionsWidget) ((w6b) ((mr5) obj).Y)).n0();
                n0.getClass();
                int i2 = i8a.Z0;
                tf3 t = n0.t();
                String d = t != null ? t.d() : null;
                if (d == null) {
                    d = "";
                }
                taf.o(n0.F0, new t6b(new jge(i2, cs.g0(new Object[]{d})), (mge) null, p23.B(new kc3[]{new kc3(f8a.K, new hge(i8a.Y0), 1, false), new kc3(f8a.J, new hge(i8a.X0), 2, false)})));
                return jue;
            case 2:
                return new AtomicReference(((lqc) ((f03) ((ijb) obj).a.getValue())).g.getString("app.pushProxyList", (String) null));
            case 3:
                float[] fArr = new float[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    fArr[i3] = dh4.c().getDisplayMetrics().density * 4.0f;
                }
                Drawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
                flb flb = (flb) obj;
                js.D(shapeDrawable, s59.r(flb).b().d);
                int i4 = phc.h1;
                yn6 icon = s59.r(flb).getIcon();
                Drawable b2 = gq3.b(flb.getContext(), i4);
                js.D(b2, icon.b);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, b2});
                int X = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
                layerDrawable.setLayerSize(0, X, X);
                int X2 = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                layerDrawable.setLayerSize(1, X2, X2);
                int i5 = (X / 2) - (X2 / 2);
                layerDrawable.setLayerInset(1, i5, i5, 0, 0);
                return layerDrawable;
            case 4:
                ((twd) obj).w0.invoke();
                return jue;
            case 5:
                qzb qzb = ((rzb) obj).b;
                if (!(qzb == null || (rzb = messageContextMenuBottomSheet.T0) == null)) {
                    ReactionsViewModel q = ((k0c) (messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) qzb).U0.getValue()).q();
                    MessageModel B0 = messageContextMenuBottomSheet.B0();
                    if (B0 != null) {
                        yr8 = B0.E0;
                    }
                    lg7 j = q.j(yr8, false);
                    int measuredHeight = messageContextMenuBottomSheet.requireView().getMeasuredHeight();
                    z0b z0b = messageContextMenuBottomSheet.a;
                    if (!(z0b == null || (callback = z0b.getCallback()) == null)) {
                        i = callback.c();
                    }
                    rzb.a(j, (measuredHeight - i) - messageContextMenuBottomSheet.c1);
                    RecyclerView recyclerView = rzb.d;
                    lp.K(recyclerView, ie6.KEYBOARD_TAP);
                    afa.a(recyclerView, new vp6(14, recyclerView, messageContextMenuBottomSheet));
                }
                return jue;
            case 6:
                xv8 xv8 = xv8.a;
                r7e r7e = new r7e(new k6b(18));
                to8 to8 = (to8) xv8.getAccessor().c(to8.class);
                ip ipVar = (ip) xv8.getAccessor().c(ip.class);
                r7e d2 = xv8.getAccessor().d(n64.class);
                r7e d3 = xv8.getAccessor().d(pk.class);
                r7e d4 = xv8.getAccessor().d(rv1.class);
                r7e d5 = xv8.getAccessor().d(sxc.class);
                r7e d6 = xv8.getAccessor().d(mce.class);
                r7e d7 = xv8.getAccessor().d(n86.class);
                xv8.getAccessor().d(lu7.class);
                return new ReactionsViewModel(((k0c) obj).b, (bv2) xv8.getAccessor().c(bv2.class), (xzc) xv8.getAccessor().c(xzc.class), (tt0) xv8.getAccessor().c(tt0.class), (hzb) xv8.getAccessor().c(hzb.class), r7e, d2, d3, d4, d5, d6, d7, xv8.getAccessor().d(zr8.class), xv8.getAccessor().d(gj.class));
            case 7:
                return (AudioManager) ((Context) ((y3c) obj).w0.getValue()).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 8:
                return ((bec) ((ydc) obj).b).m().x();
            case 9:
                bec bec = (bec) obj;
                zdc w = ez3.w(bec.a, bec.c, bec.b);
                c9a c9a = (c9a) bec;
                w.a((x39[]) Arrays.copyOf(new x39[]{new z39(c9a.Z, c9a.w0), new y39(4, 5, 9), new y39(7, 8, 10)}, 3));
                x4a x4a = bec.o;
                w.g = x4a.a();
                w.h = x4a.b();
                Object[] objArr = bec.X;
                int length = objArr.length;
                while (i < length) {
                    w.e.add(objArr[i]);
                    i++;
                }
                w.d.add(new cz2(1));
                return w.b();
            case 10:
                return ((nec) obj).a.m().F();
            case 11:
                return ((oec) obj).a.m().J();
            case Protos.Attaches.Attach.PRESENT:
                return ((zec) obj).b.m().P();
            case 13:
                return ((bec) ((afc) obj).a).m().R();
            case Protos.Attaches.Attach.LOCATION:
                return ((bfc) obj).a.m().S();
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return dgc.w((dgc) obj);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                k77[] k77Arr2 = ScheduledSendPickerViewModel.p;
                String string = ((Application) obj).getString(whc.u);
                if (string.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char charAt = string.charAt(0);
                    if (Character.isLowerCase(charAt)) {
                        str = String.valueOf(charAt).toUpperCase(Locale.getDefault());
                        if (str.length() > 1) {
                            if (charAt != 329) {
                                str = str.charAt(0) + str.substring(1).toLowerCase(Locale.ROOT);
                            }
                        } else if (str.equals(String.valueOf(charAt).toUpperCase(Locale.ROOT))) {
                            str = String.valueOf(Character.toTitleCase(charAt));
                        }
                    } else {
                        str = String.valueOf(charAt);
                    }
                    sb.append(str);
                    sb.append(string.substring(1));
                    string = sb.toString();
                }
                return new x76(string);
            case LangUtils.HASH_SEED:
                x76 x76 = (x76) ((ScheduledSendPickerViewModel) obj).g.getValue();
                Calendar instance = Calendar.getInstance();
                Locale locale = Locale.getDefault();
                x76.getClass();
                v04 v04 = new v04(instance.get(5), instance.get(2), instance.get(1), 0, x76.a);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMMM", locale);
                ArrayList arrayList = new ArrayList(366);
                arrayList.add(v04);
                while (true) {
                    instance.add(5, 1);
                    long size = (long) arrayList.size();
                    int i6 = instance.get(1);
                    int i7 = instance.get(5);
                    int i8 = instance.get(2);
                    v04 v042 = new v04(i7, i8, i6, size, simpleDateFormat.format(instance.getTime()));
                    if (i7 == v04.b && i8 == v04.c) {
                        return arrayList;
                    }
                    arrayList.add(v042);
                }
                break;
            case 18:
                return (yq4) ((o4a) ((wxc) obj).e.getValue()).a.getValue();
            case 19:
                View view = new View(((zxc) obj).a.getContext());
                view.setId(a7a.O);
                view.setWillNotDraw(false);
                return view;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                uyc uyc = (uyc) obj;
                return Integer.valueOf(vx3.x(uyc, uyc.k));
            case 21:
                k77[] k77Arr3 = SettingsListScreen.D0;
                return new hba((Widget) (SettingsListScreen) obj);
            case 22:
                eid eid = (eid) obj;
                return new k7f(eid.a, eid.b, eid.c, eid.d, eid.e);
            case 23:
                k77[] k77Arr4 = StartConversationScreen.L0;
                k77 k772 = k77Arr4[0];
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj;
                if (((Boolean) startConversationScreen.c.a(startConversationScreen)).booleanValue()) {
                    ((RecyclerView) startConversationScreen.x0.T0(startConversationScreen, k77Arr4[3])).x0(0);
                    k77 k773 = k77Arr4[0];
                    startConversationScreen.c.b(startConversationScreen, Boolean.FALSE);
                }
                return jue;
            case 24:
                return gq3.b(((jqd) obj).getContext(), phc.U1);
            case 25:
                return new mqd((aj1) ((StartRecordBottomSheet) obj).C0.getValue());
            case 26:
                return (mnc) obj;
            case 27:
                lu7 lu7 = on8.y;
                pda r = s59.r((itd) obj);
                lu7.getClass();
                return lu7.g(r);
            case 28:
                k77[] k77Arr5 = StickerSetBottomSheet.E0;
                ? a9a = new a9a(((StickerSetBottomSheet) obj).getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 1;
                a9a.setLayoutParams(layoutParams);
                a9a.setAppearance(s8a.a);
                a9a.setSize(v8a.a);
                return a9a;
            default:
                kyd kyd = (kyd) obj;
                return new w99(kyd.a, kyd.X, new bk(19, kyd));
        }
    }
}
