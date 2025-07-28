package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import java.util.ArrayList;
import java.util.Locale;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

public class FrgDlgAudioTracksPicker extends FrgDlgChecked<FrgAttachVideo> {
    public ArrayList J1;

    public final Dialog i1() {
        ov7 ov7 = new ov7(V0());
        ov7.e(i0(cic.g));
        this.J1 = U0().getParcelableArrayList("ru.ok.tamtam.extra.AUDIO_TRACKS");
        ooe ooe = (ooe) U0().getParcelable("ru.ok.tamtam.extra.CURRENT_AUDIO_TRACK");
        Locale u = vl.b().n().a.u();
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (int i2 = 0; i2 < this.J1.size(); i2++) {
            ooe ooe2 = (ooe) this.J1.get(i2);
            String str = ooe2.b;
            String str2 = ooe2.c;
            String str3 = null;
            if (!r1g.p(str2) && !"und".equals(str2)) {
                str3 = dhe.e(new Locale(str2).getDisplayLanguage(u));
            }
            if (r1g.p(str)) {
                str = str3;
            } else if (!r1g.p(str3)) {
                str = str + "(" + str3 + ")";
            }
            boolean p = r1g.p(str);
            int i3 = ooe2.w0;
            if (p) {
                str = h0().getString(cic.f, new Object[]{Integer.valueOf(i3 + 1)});
            }
            arrayList.add(str);
            if (i3 == ooe.w0 && ooe2.x0 == ooe.x0) {
                i = i2;
            }
        }
        g00 g00 = new g00(1, this);
        pc pcVar = ov7.a;
        pcVar.p = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        pcVar.r = g00;
        pcVar.u = i;
        pcVar.t = true;
        String i0 = i0(cic.r);
        h00 h00 = new h00(2);
        pcVar.k = i0;
        pcVar.l = h00;
        return ov7.a();
    }

    public final Class o1() {
        return FrgAttachVideo.class;
    }
}
