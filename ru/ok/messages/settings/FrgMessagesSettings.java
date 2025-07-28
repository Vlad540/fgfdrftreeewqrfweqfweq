package ru.ok.messages.settings;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/settings/FrgMessagesSettings;", "Lru/ok/messages/settings/FrgBaseSettings;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class FrgMessagesSettings extends FrgBaseSettings {
    public final String g1() {
        return "SETTINGS_MESSAGES";
    }

    public final ArrayList s1() {
        String str;
        kp kpVar = ((k93) this.t1.b).n().c;
        ArrayList arrayList = new ArrayList();
        e4d e4d = new e4d(yqb.setting_message_send_by_enter, i0(cic.A1), (String) null, (String) null, Boolean.valueOf(kpVar.g.getBoolean("app.messages.send.by.enter", false)), 2);
        e4d.Z = true;
        arrayList.add(e4d);
        yzc yzc = ((k93) this.t1.b).n().b;
        yzc.getClass();
        List r = yzc.r(PmsKey.f5audiotranscriptionlocales, vqc.o);
        i03 i03 = ((k93) this.t1.b).n().a;
        int i = fja.d;
        String q = i03.q();
        if (r1g.p(q)) {
            q = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
        }
        Locale locale = Locale.ROOT;
        if (!r.contains(q.toLowerCase(locale)) && !r.contains(Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage().toLowerCase(locale))) {
            str = null;
        } else {
            int i2 = yqb.setting_message_audio_transcription;
            String i0 = i0(cic.z1);
            Boolean valueOf = Boolean.valueOf(kpVar.g.getBoolean("audio.transcription.enabled", true));
            str = null;
            e4d e4d2 = new e4d(i2, i0, (String) null, (String) null, valueOf, 2);
            e4d2.Z = true;
            arrayList.add(e4d2);
        }
        arrayList.add(e4d.a(yqb.setting_message_stickers, i0(cic.Y2), str));
        return arrayList;
    }

    public final String t1() {
        return i0(cic.y1);
    }

    public final void u1(int i) {
    }

    public final void v1(int i, Object obj) {
        kp kpVar = vl.o.a().c;
        if (i == yqb.setting_message_send_by_enter) {
            kpVar.i("app.messages.send.by.enter", ((Boolean) obj).booleanValue());
            return;
        }
        String str = "1";
        if (i == yqb.setting_message_in_app_browser) {
            bd b = ((k93) this.t1.b).b();
            Boolean bool = (Boolean) obj;
            if (!bool.booleanValue()) {
                str = "2";
            }
            b.g("ACTION_IN_APP_BROWSER", str);
            kpVar.i("app.messages.inAppBrowser", bool.booleanValue());
        } else if (i == yqb.setting_message_replace_emoji) {
            bd b2 = ((k93) this.t1.b).b();
            Boolean bool2 = (Boolean) obj;
            if (!bool2.booleanValue()) {
                str = "0";
            }
            b2.g("REPLACE_EMOJI", str);
            kpVar.i("app.messages.replace.emoji", bool2.booleanValue());
        } else if (i == yqb.setting_message_reactions_double_tap) {
            bd b3 = ((k93) this.t1.b).b();
            Boolean bool3 = (Boolean) obj;
            if (!bool3.booleanValue()) {
                str = "0";
            }
            b3.g("ENABLE_DOUBLE_TAP_REACTIONS", str);
            kpVar.i("app.messages.enable.double.tap.reactions", bool3.booleanValue());
        } else if (i == yqb.setting_message_audio_transcription) {
            bd b4 = ((k93) this.t1.b).b();
            Boolean bool4 = (Boolean) obj;
            if (!bool4.booleanValue()) {
                str = "0";
            }
            b4.g("ENABLE_AUDIO_TRANSCRIPTION", str);
            kpVar.i("audio.transcription.enabled", bool4.booleanValue());
            xs7.E(xs7.A(this), ((pae) ((k93) this.t1.b).getAccessor().c(pae.class)).b().plus(sk9.a), (ru3) null, new g16(this, (Continuation) null), 2);
        }
    }
}
