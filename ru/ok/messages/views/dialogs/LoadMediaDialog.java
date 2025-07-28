package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;

public class LoadMediaDialog extends DialogFragment {
    /* JADX WARNING: type inference failed for: r8v0, types: [androidx.fragment.app.a, java.lang.Object, ru.ok.messages.views.dialogs.LoadMediaDialog, android.content.DialogInterface$OnDismissListener] */
    public final Dialog i1() {
        ov7 ov7 = new ov7(V0());
        pc pcVar = ov7.a;
        pcVar.n = this;
        int i = U0().getInt("ru.ok.tamtam.extra.SETTING_ID");
        if (i == yqb.setting_media_photo) {
            ov7.e(i0(cic.o1));
        } else if (i == yqb.setting_media_video) {
            ov7.e(i0(cic.v1));
        } else if (i == yqb.setting_media_gif) {
            ov7.e(i0(cic.m1));
        } else if (i == yqb.setting_media_audio) {
            ov7.e(i0(cic.W0));
        } else if (i == yqb.setting_media_stickers) {
            ov7.e(i0(cic.u1));
        } else if (i == yqb.setting_media_auto_play_video) {
            ov7.e(i0(cic.b1));
        }
        CharSequence[] charSequenceArr = {i0(cic.V0), i0(cic.n1), i == yqb.setting_media_auto_play_video ? i0(cic.a1) : i0(cic.k1)};
        g00 g00 = new g00(3, this);
        pcVar.p = charSequenceArr;
        pcVar.r = g00;
        return ov7.a();
    }
}
