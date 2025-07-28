package ru.ok.messages.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import ru.ok.messages.views.dialogs.LoadMediaDialog;
import ru.ok.messages.views.dialogs.VideoCompressionModeDialog;

public class FrgMediaSettings extends FrgBaseSettings implements tv0 {
    public kp I1;
    public ed3 J1;
    public bd K1;
    public volatile String L1 = "";
    public uv0 M1;

    public final void G() {
    }

    public final void J() {
    }

    public final void L() {
    }

    public final void L0() {
        super.L0();
        this.M1.b();
        ((k93) this.t1.b).m().f(mnc.SETTINGS_MEDIA, eja.e);
    }

    public final void P0(View view, Bundle bundle) {
        d0().f0("VideoCompressionModeDialog:result:request", this, new o2f((Runnable) null, new a6(3, this), 0));
    }

    public final void U() {
    }

    public final void e(ArrayList arrayList) {
    }

    public final String g1() {
        return "SETTINGS_MEDIA";
    }

    public final void l(String str) {
        this.L1 = str;
        if (this.s1) {
            w1();
        }
    }

    public final void m1(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 101) {
            int intExtra = intent.getIntExtra("ru.ok.tamtam.extra.SETTING_ID", 0);
            int intExtra2 = intent.getIntExtra("ru.ok.tamtam.extra.RESULT_ITEM", -1);
            if (intExtra == yqb.setting_media_photo) {
                this.I1.j(intExtra2, "app.media.load.photo");
            } else if (intExtra == yqb.setting_media_gif) {
                this.I1.j(intExtra2, "app.media.load.gif");
            } else if (intExtra == yqb.setting_media_audio) {
                this.I1.j(intExtra2, "app.media.load.audio");
            } else if (intExtra == yqb.setting_media_stickers) {
                this.I1.j(intExtra2, "app.media.load.stickers");
            } else if (intExtra == yqb.setting_media_auto_play_video) {
                this.K1.d(intExtra2, "VIDEO_AUTO_PLAY_LOAD_TYPE_CHANGE");
                this.I1.j(intExtra2, "app.video.auto.play");
            }
            w1();
        }
    }

    public final ArrayList s1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e4d(0, i0(cic.Y0), "", (String) null, (Boolean) null, 3));
        arrayList.add(e4d.a(yqb.setting_media_photo, i0(cic.p1), x1(this.I1.g.getInt("app.media.load.photo", 0), yqb.setting_media_photo)));
        int i = yqb.setting_media_gif;
        int i2 = cic.l1;
        arrayList.add(e4d.a(i, i0(i2), x1(this.I1.g.getInt("app.media.load.gif", 0), yqb.setting_media_gif)));
        arrayList.add(e4d.a(yqb.setting_media_audio, i0(cic.X0), x1(this.I1.g.getInt("app.media.load.audio", 0), yqb.setting_media_audio)));
        e4d e4d = new e4d(yqb.setting_media_roaming, i0(cic.q1), this.I1.m() ? i0(cic.t1) : i0(cic.s1), (String) null, Boolean.valueOf(this.I1.m()), 2);
        e4d.Z = true;
        arrayList.add(e4d);
        arrayList.add(new e4d(0, i0(cic.Z0), "", (String) null, (Boolean) null, 3));
        e4d a = e4d.a(yqb.setting_media_auto_play_video, i0(cic.A), x1(this.I1.g.getInt("app.video.auto.play", 1), yqb.setting_media_auto_play_video));
        a.Z = true;
        arrayList.add(a);
        arrayList.add(new e4d(yqb.setting_media_auto_play_gif, i0(i2), "", (String) null, Boolean.valueOf(this.I1.g.getBoolean("app.media.autoplay.gif", true)), 2));
        arrayList.add(new e4d(0, i0(cic.i1), "", (String) null, (Boolean) null, 3));
        e4d a2 = e4d.a(yqb.setting_media_video_auto_compress, i0(cic.j1), this.I1.p().a.a);
        a2.Z = true;
        arrayList.add(a2);
        arrayList.add(new e4d(yqb.setting_media_caching_setting, i0(cic.e1), "", this.L1, (Boolean) null, 1));
        return arrayList;
    }

    public final String t1() {
        return i0(cic.G0);
    }

    public final void u1(int i) {
        if (i == yqb.setting_media_photo || i == yqb.setting_media_video || i == yqb.setting_media_gif || i == yqb.setting_media_audio || i == yqb.setting_media_stickers || i == yqb.setting_media_auto_play_video) {
            LoadMediaDialog loadMediaDialog = new LoadMediaDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("ru.ok.tamtam.extra.SETTING_ID", i);
            loadMediaDialog.Y0(bundle);
            loadMediaDialog.c1(HttpStatus.SC_SWITCHING_PROTOCOLS, this);
            loadMediaDialog.l1(this.J0, "ru.ok.messages.views.dialogs.LoadMediaDialog");
        } else if (i == yqb.setting_media_video_auto_compress) {
            VideoCompressionModeDialog videoCompressionModeDialog = new VideoCompressionModeDialog();
            videoCompressionModeDialog.Y0(jjd.j(new wia[]{new wia("ru.ok.tamtam.extra.SETTING_ID", Integer.valueOf(i))}));
            videoCompressionModeDialog.l1(d0(), "ru.ok.messages.settings.FrgBaseSettings");
        } else if (i == yqb.setting_media_caching_setting) {
            Context e0 = e0();
            int i2 = yqb.setting_media_caching;
            int i3 = ActSettings.Z0;
            Intent intent = new Intent(e0, ActSettings.class);
            intent.putExtra("ru.ok.tamtam.extra.SETTING_ID", i2);
            intent.putExtra("ru.ok.tamtam.extra.SHOW_PUSH_ALERT", false);
            e0.startActivity(intent);
        }
    }

    public final void v1(int i, Object obj) {
        if (i == yqb.setting_media_gallery_auto_save) {
            this.I1.i("app.media.save.to.gallery", ((Boolean) obj).booleanValue());
        } else if (i == yqb.setting_media_auto_play_gif) {
            this.I1.i("app.media.autoplay.gif", ((Boolean) obj).booleanValue());
        } else if (i == yqb.setting_media_roaming) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.I1.i("app.media.load.roaming", booleanValue);
            this.K1.g("ROAMING_SWITCH", booleanValue ? "1" : "0");
            w1();
        }
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        this.I1 = ((k93) this.t1.b).n().c;
        ((k93) this.t1.b).n();
        this.J1 = (ed3) ((k93) this.t1.b).getAccessor().c(ed3.class);
        this.K1 = ((k93) this.t1.b).b();
        this.M1 = new uv0((ed5) this.u1.getAccessor().c(ed5.class), (h30) ((k93) this.t1.b).getAccessor().c(h30.class), new hvf(e0()), this.u1.u(), cnc.a(), de.a(), new hy5(3, this), this);
    }

    public final String x1(int i, int i2) {
        if (i == -1) {
            return i2 == yqb.setting_media_auto_play_video ? i0(cic.a1) : i0(cic.k1);
        }
        String str = "";
        if (i != 0) {
            return i != 1 ? str : i0(cic.n1);
        }
        if (!this.I1.m() && this.J1.g()) {
            str = " " + i0(cic.r1);
        }
        return i0(cic.V0) + str;
    }
}
