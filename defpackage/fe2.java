package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import one.me.contactlist.ContactListWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.avatars.ContactAvatarsScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.webapp.settings.WebAppSettingsScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: fe2  reason: default package */
public final /* synthetic */ class fe2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ fe2(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    public final Object invoke() {
        mg3 mg3;
        lg3 lg3;
        Boolean bool = ql3.b;
        String str = "";
        Class<pae> cls = pae.class;
        Class<jb5> cls2 = jb5.class;
        Class<ed3> cls3 = ed3.class;
        Class<ng0> cls4 = ng0.class;
        Boolean bool2 = null;
        Bundle bundle = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatMediaTabWidget.A0;
                return new ee2(bundle.getLong("chat_id"));
            case 1:
                k77[] k77Arr2 = ContactAvatarsScreen.D0;
                long j = bundle.getLong("EXTRA_CONTACT_ID");
                yj3 yj3 = (yj3) ((Parcelable) ek8.E(bundle, "EXTRA_CONTACT_INFO", yj3.class));
                if (j != 0) {
                    lg3 = new lg3(j);
                } else if (yj3 != null) {
                    uj3 uj3 = yj3.a;
                    if (uj3 != null) {
                        mg3 = new mg3(uj3);
                        i6b i6b = i6b.a;
                        return new bh3(mg3, i6b.e(), i6b.b(), i6b.h(), i6b.getAccessor().d(g15.class), i6b.f());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } else {
                    lg3 = new lg3(0);
                }
                mg3 = lg3;
                i6b i6b2 = i6b.a;
                return new bh3(mg3, i6b2.e(), i6b2.b(), i6b2.h(), i6b2.getAccessor().d(g15.class), i6b2.f());
            case 2:
                k77[] k77Arr3 = ContactListWidget.S0;
                String string = bundle != null ? bundle.getString("contact_screen_open_mode") : null;
                if (string != null) {
                    str = string;
                }
                try {
                    bool2 = ql3.valueOf(str);
                } catch (IllegalArgumentException unused) {
                }
                Boolean bool3 = bool2 == null ? bool : bool2;
                co3 co3 = co3.a;
                return new kl3(bool3, co3.getAccessor().d(Context.class), (ok3) co3.getAccessor().c(ok3.class), co3.getAccessor().d(vs7.class), (pae) co3.getAccessor().c(cls), co3.getAccessor().d(gsc.class), co3.getAccessor().d(wf3.class), co3.getAccessor().d(ap3.class), co3.getAccessor().d(bv2.class), co3.getAccessor().d(ch3.class), co3.getAccessor().d(mn3.class), co3.getAccessor().d(xf3.class), co3.getAccessor().d(cn3.class), co3.getAccessor().d(g5e.class), co3.getAccessor().d(xzc.class));
            case 3:
                k77[] k77Arr4 = ContactListWidget.S0;
                String string2 = bundle != null ? bundle.getString("contact_screen_open_mode") : null;
                if (string2 != null) {
                    str = string2;
                }
                try {
                    bool2 = ql3.valueOf(str);
                } catch (IllegalArgumentException unused2) {
                }
                if (bool2 != null) {
                    bool = bool2;
                }
                return Boolean.valueOf(bool == ql3.a);
            case 4:
                k77[] k77Arr5 = KeyboardStickersWidget.x0;
                bundle.getLong("arg_key_chat_id");
                t77 t77 = t77.a;
                r7e d = t77.getAccessor().d(zsd.class);
                r7e d2 = t77.getAccessor().d(v2c.class);
                r7e d3 = t77.getAccessor().d(fa5.class);
                r7e d4 = t77.getAccessor().d(l95.class);
                t77.getAccessor().d(luf.class);
                return new lyd((pae) t77.getAccessor().c(cls), d, d2, d3, d4, new r7e(new fs5(28)), t77.getAccessor().d(cls2));
            case 5:
                k77[] k77Arr6 = ProfileInviteScreen.Y;
                long j2 = bundle.getLong(ApiProtocol.KEY_ID);
                i6b i6b3 = i6b.a;
                return new ubb(j2, i6b3.getAccessor().d(cls3), i6b3.c(), i6b3.f(), i6b3.b(), i6b3.getAccessor().d(cls4), i6b3.g(), i6b3.d());
            case 6:
                int i = ProfileMemberPermissionsScreen.o;
                long j3 = bundle.getLong(ApiProtocol.KEY_ID);
                z7b z7b = z7b.a;
                return new jdb(j3, z7b.c(), z7b.d(), z7b.b(), z7b.getAccessor().d(cls4), z7b.getAccessor().d(cls3), z7b.getAccessor().d(hba.class), z7b.getAccessor().d(cls2));
            case 7:
                k77[] k77Arr7 = ProfileScreen.H0;
                long j4 = bundle.getLong("profile:id");
                Class<r6b> cls5 = r6b.class;
                Object E = ek8.E(bundle, "profile:id_type", cls5);
                if (E != null) {
                    return new fgb(j4, (r6b) ((Parcelable) E), bundle.getBoolean("profile:opened_from_dialog"));
                }
                throw new IllegalArgumentException(wn6.i("No value passed for key profile:id_type of type ", cls5.getSimpleName(), " in bundle").toString());
            case 8:
                k77[] k77Arr8 = RaiseHandActionBottomSheet.F0;
                le1 parcelable = bundle.getParcelable("opponent_id");
                if (parcelable == null) {
                    parcelable = le1.c;
                }
                return new fxb(parcelable, bh1.a.b());
            case 9:
                k77[] k77Arr9 = RecordExitBottomSheet.K0;
                y4c valueOf = y4c.valueOf(bundle.getString("open_type", "UNDEFINE"));
                bh1 bh1 = bh1.a;
                r7e d5 = bh1.getAccessor().d(boc.class);
                r7e d6 = bh1.getAccessor().d(xk1.class);
                po1 b2 = bh1.b();
                r7e d7 = bh1.getAccessor().d(vx0.class);
                if (bundle.containsKey("admin_record_settings")) {
                    bool2 = Boolean.valueOf(bundle.getBoolean("admin_record_settings"));
                }
                return new h5c(valueOf, bool2, b2, d6, d5, d7);
            default:
                k77[] k77Arr10 = WebAppSettingsScreen.w0;
                return new anf(((lqc) ((f03) uif.a.getAccessor().c(f03.class))).s(), bundle.getLong("bot_id_arg"));
        }
    }
}
