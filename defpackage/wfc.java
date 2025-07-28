package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Editable;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.login.welcome.WelcomeScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.settings.SettingsAvatarBottomSheet;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.stickers.widgets.StickerView;

/* renamed from: wfc  reason: default package */
public final /* synthetic */ class wfc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wfc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onClick(View view) {
        boolean z = false;
        String str = null;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                agc agc = ((dgc) obj).P0;
                if (agc != null) {
                    agc.b();
                    return;
                }
                return;
            case 1:
                ewc ewc = (ewc) obj;
                p46 p46 = ewc.M0;
                if (p46 != null) {
                    sic sic = ewc.J0;
                    sic.getClass();
                    k77[] k77Arr = SelectAlbumWidget.Y;
                    qvc n0 = ((SelectAlbumWidget) sic.b).n0();
                    grd grd = n0.Y;
                    o46 o46 = p46.a;
                    grd.setValue(o46);
                    taf.o(n0.o, new gvc(o46));
                    taf.o(n0.X, new dvc());
                    return;
                }
                return;
            case 2:
                k77[] k77Arr2 = ServerHostBottomSheet.K0;
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) obj;
                serverHostBottomSheet.getClass();
                CharSequence text = ((mda) serverHostBottomSheet.I0.T0(serverHostBottomSheet, ServerHostBottomSheet.K0[3])).getText();
                if (text == null || text.length() == 0) {
                    z = true;
                }
                if (!z) {
                    kk6 kk6 = (kk6) serverHostBottomSheet.C0.getValue();
                    String obj2 = text.toString();
                    SharedPreferences.Editor edit = kk6.Y.edit();
                    edit.putString("Custom", obj2);
                    edit.apply();
                    kk6.s(obj2);
                    return;
                }
                return;
            case 3:
                g4d g4d = (g4d) obj;
                FrgBaseSettings frgBaseSettings = g4d.R0;
                if (frgBaseSettings != null) {
                    frgBaseSettings.u1(g4d.Q0.a);
                    return;
                }
                return;
            case 4:
                k77[] k77Arr3 = SettingsAvatarBottomSheet.G0;
                k77 k77 = k77Arr3[4];
                SettingsAvatarBottomSheet settingsAvatarBottomSheet = (SettingsAvatarBottomSheet) obj;
                jr jrVar = settingsAvatarBottomSheet.F0;
                if (!((Boolean) jrVar.a(settingsAvatarBottomSheet)).booleanValue()) {
                    k77 k772 = k77Arr3[4];
                    jrVar.b(settingsAvatarBottomSheet, Boolean.TRUE);
                    settingsAvatarBottomSheet.getTargetController();
                }
                settingsAvatarBottomSheet.r0(true);
                return;
            case 5:
                Editable text2 = ((rdd) obj).L0.getText();
                if (text2 != null) {
                    text2.clear();
                    return;
                }
                return;
            case 6:
                int i = StickerView.B0;
                ((StickerView) obj).getClass();
                return;
            case 7:
                k77[] k77Arr4 = StickersScreen.z0;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                StickersScreen stickersScreen = (StickersScreen) obj;
                wxd wxd = (wxd) stickersScreen.n0().D0.a.getValue();
                intent.putExtra("android.intent.extra.TEXT", wxd != null ? wxd.c : null);
                intent.setType("text/plain");
                vgc vgc = (vgc) o23.f0(stickersScreen.getRouter().e());
                if (vgc != null) {
                    str = vgc.b;
                }
                vwd.c.Z1(intent, str);
                return;
            case 8:
                k77[] k77Arr5 = SuggestionsWidget.F0;
                ((SuggestionsWidget) obj).B0();
                return;
            case 9:
                ((jea) obj).b.invoke(view);
                return;
            case 10:
                ((hea) obj).e.invoke(view);
                return;
            case 11:
                ((jme) obj).dismiss();
                return;
            case 12:
                m3f m3f = (m3f) obj;
                rz rzVar = m3f.Y;
                Long l = m3f.Z;
                if (rzVar != null && l != null) {
                    long longValue = l.longValue();
                    i26 i26 = m3f.o;
                    if (i26 != null) {
                        i26.invoke(rzVar, Long.valueOf(longValue));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                k77[] k77Arr6 = WebAppRootScreen.K0;
                kmf y0 = ((WebAppRootScreen) obj).y0();
                y0.getClass();
                y0.F0.o1(y0, kmf.V0[0], taf.n(y0, (hu3) null, ru3.b, new cmf(y0, (Continuation) null), 1));
                return;
            default:
                sz6 sz6 = (sz6) ((WelcomeScreen) obj).X.getValue();
                sz6.getClass();
                sz6.a(n06.f(new InputPhoneScreen(), (wr3) null, (wr3) null), "InputPhoneScreen");
                return;
        }
    }

    public /* synthetic */ wfc(SettingsAvatarBottomSheet settingsAvatarBottomSheet, int i) {
        this.a = 4;
        this.b = settingsAvatarBottomSheet;
    }
}
