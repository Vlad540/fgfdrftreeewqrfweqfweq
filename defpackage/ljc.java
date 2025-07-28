package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.arch.Widget;
import one.me.settings.privacy.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ljc  reason: default package */
public final /* synthetic */ class ljc implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ljc() {
        this.a = 9;
        this.b = jm3.b;
    }

    public final Object invoke(Object obj) {
        long j;
        boolean z = false;
        jue jue = jue.a;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                int i = SafeModeOnboardingScreen.c;
                ex9 onBackPressedDispatcher = ((SafeModeOnboardingScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue;
            case 1:
                int intValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                uyc uyc = (uyc) obj2;
                sb.append(uyc.f[intValue]);
                sb.append(": ");
                sb.append(uyc.g[intValue].a());
                return sb.toString();
            case 2:
                View view2 = (View) obj;
                k77[] k77Arr = SettingMediaScreen.Y;
                ((SettingMediaScreen) obj2).getRouter().C();
                return jue;
            case 3:
                View view3 = (View) obj;
                k77[] k77Arr2 = SettingsBlacklistScreen.Z;
                ((SettingsBlacklistScreen) obj2).getRouter().C();
                return jue;
            case 4:
                View view4 = (View) obj;
                k77[] k77Arr3 = SettingsPrivacyScreen.Z;
                ((SettingsPrivacyScreen) obj2).getRouter().C();
                return jue;
            case 5:
                View view5 = (View) obj;
                k77[] k77Arr4 = ShareDataPickerScreen.H0;
                ex9 onBackPressedDispatcher2 = ((ShareDataPickerScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return jue;
            case 6:
                View view6 = (View) obj;
                k77[] k77Arr5 = StickerPreviewScreen.E0;
                ((StickerPreviewScreen) obj2).getRouter().C();
                return jue;
            case 7:
                View view7 = (View) obj;
                k77[] k77Arr6 = StickersScreen.z0;
                ((StickersScreen) obj2).getRouter().C();
                return jue;
            case 8:
                View view8 = (View) obj;
                k77[] k77Arr7 = StickersShowcaseScreen.z0;
                ((StickersShowcaseScreen) obj2).getRouter().C();
                return jue;
            case 9:
                if (((km3) obj).b == ((jm3) obj2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                if (!((bh2) obj).a.y0.contains(tj3.BOT)) {
                    ((kd8) obj2).getClass();
                }
                return true;
            case 11:
                ym8 ym8 = (ym8) obj;
                int i2 = rze.$EnumSwitchMapping$0[((sze) obj2).b.ordinal()];
                if (i2 == 1) {
                    j = ym8.b;
                } else if (i2 == 2) {
                    nd4 nd4 = ym8.H0;
                    j = nd4 != null ? nd4.a : 0;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Long.valueOf(j);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                j3b j3b = (j3b) obj;
                k77[] k77Arr8 = VideoMessageWidget.y0;
                j5f m0 = ((VideoMessageWidget) obj2).m0();
                if (j3b == j3b.b) {
                    z = true;
                }
                ((r6f) m0).F0.m((Object) null, Boolean.valueOf(z));
                return jue;
            case 13:
                View view9 = (View) obj;
                k77[] k77Arr9 = WebAppSettingsScreen.w0;
                ((WebAppSettingsScreen) obj2).getRouter().C();
                return jue;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                View view10 = (View) obj;
                k77[] k77Arr10 = WebAppsSettingScreen.X;
                ((WebAppsSettingScreen) obj2).getRouter().C();
                return jue;
            default:
                return Widget.binding$lambda$8((s16) obj2, obj);
        }
    }

    public /* synthetic */ ljc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
