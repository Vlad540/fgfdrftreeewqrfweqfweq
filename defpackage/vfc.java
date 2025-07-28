package defpackage;

import android.app.Application;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.settings.SettingsListScreen;
import one.me.settings.privacy.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.startconversation.StartConversationScreen;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: vfc  reason: default package */
public final /* synthetic */ class vfc implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ vfc(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<pae> cls = pae.class;
        switch (this.a) {
            case 0:
                return new ShapeDrawable(new OvalShape());
            case 1:
                return new dmc();
            case 2:
                k77[] k77Arr = ScheduledSendPickerViewModel.p;
                return z3d.C(0);
            case 3:
                k77[] k77Arr2 = ScheduledSendPickerViewModel.p;
                return z3d.G(0);
            case 4:
                return Long.valueOf(TimeUnit.SECONDS.toSeconds(1));
            case 5:
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = zoc.B0;
                return jue.a;
            case 6:
                return Pattern.compile("^([0-9]+)X([0-9]+)");
            case 7:
                return new xbb(l8a.G, (nge) null, 6);
            case 8:
                k77[] k77Arr3 = ServerHostBottomSheet.K0;
                return new kk6();
            case 9:
                k77[] k77Arr4 = ServerPortBottomSheet.F0;
                return new f1b();
            case 10:
                k77[] k77Arr5 = SettingMediaScreen.Y;
                return mnc.t1;
            case 11:
                k77[] k77Arr6 = SettingMediaScreen.Y;
                f8d f8d = f8d.a;
                return new i5d(f8d.getAccessor().d(cls), f8d.getAccessor().d(qpc.class), f8d.getAccessor().d(rj.class));
            case 12:
                k77[] k77Arr7 = SettingsBlacklistScreen.Z;
                y8d y8d = y8d.a;
                return new k6d(new ao0(y8d.getAccessor().d(tt0.class), y8d.b()));
            case 13:
                return new j1f(300);
            case 14:
                return new j1f(300);
            case 15:
                return Collections.singletonList(f4d.B0);
            case 16:
                return Collections.singletonList(f4d.o);
            case 17:
                return Collections.singletonList(f4d.C0);
            case 18:
                lg7 c = hwf.c();
                c.add(f4d.z0);
                c.add(f4d.A0);
                return hwf.a(c);
            case 19:
                lg7 c2 = hwf.c();
                c2.add(f4d.x0);
                c2.add(f4d.y0);
                return hwf.a(c2);
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                k77[] k77Arr8 = SettingsListScreen.D0;
                s7d s7d = s7d.a;
                return new v4d(s7d.getAccessor().d(g2b.class), s7d.getAccessor().d(pbe.class), (q0a) s7d.getAccessor().c(q0a.class), (w76) s7d.getAccessor().c(w76.class), (sab) s7d.getAccessor().c(sab.class), s7d.getAccessor().d(cls), s7d.getAccessor().d(qna.class), s7d.getAccessor().d(Application.class), s7d.getAccessor().d(mg5.class), s7d.getAccessor().d(pk.class), (ap3) s7d.getAccessor().d(ap3.class).getValue(), s7d.getAccessor().d(bv2.class));
            case 21:
                int i = SetupPinCodeScreen.o;
                return new y9d();
            case 22:
                k77[] k77Arr9 = ShareDataPickerScreen.H0;
                return new u68((f87) null, 15);
            case 23:
                return p23.B(BuildConfig.FLAVOR, "Нажмите еще раз чтобы увидеть анекдот", "\"Едет отец с сыном на девятке. Перевернулись. Дальше едут на шестерке.\"", "Анекдотов больше нет :c");
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return iu7.o;
            case 25:
                return new ConcurrentHashMap();
            case 26:
                return new AccelerateDecelerateInterpolator();
            case 27:
                k77[] k77Arr10 = StartConversationScreen.L0;
                return mnc.D0;
            case 28:
                k77[] k77Arr11 = StartConversationScreen.L0;
                return ipd.a.b();
            default:
                k77[] k77Arr12 = StartConversationScreen.L0;
                return new ak3(new r7e(new vfc(28)));
        }
    }

    public /* synthetic */ vfc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment) {
        this.a = 1;
    }
}
