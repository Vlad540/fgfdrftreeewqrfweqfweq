package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.Map;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker;
import ru.ok.messages.views.dialogs.FrgDlgStopLiveLocation;
import ru.ok.messages.views.dialogs.LoadMediaDialog;
import ru.ok.messages.views.dialogs.VideoQualityPickerDialog;

/* renamed from: g00  reason: default package */
public final /* synthetic */ class g00 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int intValue;
        vo8 vo8;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                ArrayList arrayList = swb.d;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    return;
                } catch (Exception e) {
                    udd.s("swb", e.getMessage(), e);
                    return;
                }
            case 1:
                FrgDlgAudioTracksPicker frgDlgAudioTracksPicker = (FrgDlgAudioTracksPicker) obj;
                a aVar = frgDlgAudioTracksPicker.M0;
                Class cls = FrgAttachVideo.class;
                FrgAttachVideo frgAttachVideo = (FrgAttachVideo) (aVar != null ? cls.cast(aVar) : cls.cast(frgDlgAudioTracksPicker.c0()));
                ooe ooe = (ooe) frgDlgAudioTracksPicker.J1.get(i);
                frgAttachVideo.getClass();
                udd.p("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "onAudioTrackSelected %s", new Object[]{ooe});
                fd9 fd9 = frgAttachVideo.R1;
                if (fd9 != null) {
                    udd.p("fd9", "selectAudioTrack %s", new Object[]{ooe});
                    if (fd9.b2()) {
                        o10 o10 = fd9.C0;
                        if (!(o10 == null || (vo8 = fd9.B0) == null)) {
                            int i2 = ooe.x0;
                            to8 to8 = fd9.w0;
                            to8.getClass();
                            to8.t(vo8, o10.q, new a45(i2, ooe.w0, 5));
                        }
                        al7 al7 = (al7) fd9.c;
                        if (al7.f != null) {
                            n35 n35 = al7.b;
                            n35.getClass();
                            udd.p("n35", "selectAudioTrack: %s", new Object[]{ooe});
                            n35.u();
                            ooe ooe2 = ooe.y0;
                            kv2 kv2 = n35.b;
                            ac4 ac4 = (ac4) kv2.a;
                            if (ooe == ooe2) {
                                bu7 bu7 = ac4.c;
                                if (bu7 != null && (intValue = ((Integer) kv2.k(bu7).second).intValue()) >= 0) {
                                    ob4 b2 = ac4.b();
                                    SparseArray sparseArray = b2.M;
                                    Map map = (Map) sparseArray.get(intValue);
                                    if (map != null && !map.isEmpty()) {
                                        sparseArray.remove(intValue);
                                    }
                                    ac4.h(b2);
                                }
                            } else {
                                bu7 bu72 = ac4.c;
                                if (bu72 != null) {
                                    pb4 pb4 = new pb4(ooe.w0, 0, new int[]{ooe.x0});
                                    voe[] voeArr = bu72.c;
                                    int i3 = ooe.Z;
                                    voe voe = voeArr[i3];
                                    ob4 b3 = ac4.b();
                                    b3.e(i3, voe, pb4);
                                    ac4.h(b3);
                                }
                            }
                        }
                    }
                }
                frgDlgAudioTracksPicker.g1(false, false);
                return;
            case 2:
                ((FrgDlgStopLiveLocation) obj).g1(false, false);
                return;
            case 3:
                LoadMediaDialog loadMediaDialog = (LoadMediaDialog) obj;
                a j0 = loadMediaDialog.j0(true);
                if (j0 != null) {
                    Intent intent = new Intent();
                    intent.putExtra("ru.ok.tamtam.extra.SETTING_ID", loadMediaDialog.U0().getInt("ru.ok.tamtam.extra.SETTING_ID"));
                    if (i == 0) {
                        intent.putExtra("ru.ok.tamtam.extra.RESULT_ITEM", 0);
                    } else if (i == 1) {
                        intent.putExtra("ru.ok.tamtam.extra.RESULT_ITEM", 1);
                    } else if (i == 2) {
                        intent.putExtra("ru.ok.tamtam.extra.RESULT_ITEM", -1);
                    }
                    j0.t0(loadMediaDialog.k0(), -1, intent);
                    return;
                }
                return;
            default:
                ((VideoQualityPickerDialog) obj).p1(u7f.a);
                return;
        }
    }
}
