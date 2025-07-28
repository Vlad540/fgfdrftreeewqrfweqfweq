package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: g  reason: default package */
public final class g implements wy6 {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    public final Object a(w4 w4Var) {
        w4 w4Var2 = w4Var;
        switch (this.a) {
            case 0:
                return j.a;
            case 1:
                return new rzc(PmsKey.media-order, new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"});
            case 2:
                return rp.a;
            case 3:
                return jq.a;
            case 4:
                return new fzc("📞 Зал ожидания в групповых звонках", PmsKey.gcwr, false);
            case 5:
                r7e d = w4Var2.d(f03.class);
                return new hk7(new lge("📞 Логгирование WebRtc в звонках"), new vz0(0, (f03) d.getValue(), f03.class, "isWebRtcLoggingEnabled", "isWebRtcLoggingEnabled()Z", 0, 0), new f(1, (f03) d.getValue(), f03.class, "setWebRtcLoggingEnabled", "setWebRtcLoggingEnabled(Z)V", 0, 3), cnb.ic_call_22, 16);
            case 6:
                return new wz0(0);
            case 7:
                return c31.a;
            case 8:
                return new fzc("📞 Шеринг в 1-1", PmsKey.sse, false);
            case 9:
                return new fzc("📞 Отображение VPN снекбара", PmsKey.show-vpn-snackbar, false);
            case 10:
                return new fzc("📞 Шеринг в групповом", PmsKey.gsse, false);
            case 11:
                return new fzc("📞 Групповые звонки", PmsKey.gce, false);
            case 12:
                return new fzc("📞 Групповые звонки: пермишен участников чата", PmsKey.gcmpe, false);
            case 13:
                return new fzc("📞 Запись звонка", PmsKey.grse, false);
            case 14:
                return new fzc("📞 Групповые звонки по ссылке", PmsKey.lgce, false);
            case 15:
                return new fzc("📞 Админские настройки в групповых звонках", PmsKey.gcas, false);
            case 16:
                return e61.a;
            case 17:
                return new r62(w4Var2.d(xzc.class), w4Var2.d(jb5.class), w4Var2.d(qkc.class));
            case 18:
                return new fzc(PmsKey.chat-anim);
            case 19:
                return new ff5((tt0) w4Var2.c(tt0.class), (pae) w4Var2.c(pae.class));
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return new q6b(1, w4Var2.d(jb5.class));
            case 21:
                return new fzc("Превью видео при перемотке", PmsKey.media-viewer-video-collage-enabled, false);
            case 22:
                return new az5(w4Var2.d(hr6.class), w4Var2.d(sma.class), w4Var2.d(pae.class));
            case 23:
                return cw2.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new b98(4);
            case 25:
                return new bw2((Context) w4Var2.c(Context.class), (o2b) w4Var2.c(o2b.class), (q2b) w4Var2.c(q2b.class));
            case 26:
                return new src((Context) w4Var2.c(Context.class), (w6a) w4Var2.c(w6a.class), (ho2) w4Var2.c(ho2.class), (i5a) w4Var2.c(i5a.class), (bv2) w4Var2.c(bv2.class), (q2b) w4Var2.c(q2b.class), (f03) w4Var2.c(f03.class), w4Var2.d(xzc.class));
            case 27:
                return r63.b;
            case 28:
                return new ho3(0, w4Var2.d(xzc.class));
            default:
                f03 f03 = (f03) w4Var2.c(f03.class);
                mge hge = new hge(mtb.oneme_settings_iar_time_condition);
                f fVar = new f(1, f03, f03.class, "setDisableInAppReviewTimeCondition", "setDisableInAppReviewTimeCondition(Z)V", 0, 16);
                return new hk7(hge, new vz0(0, f03, f03.class, "isDisableInAppReviewTimeCondition", "isDisableInAppReviewTimeCondition()Z", 0, 22), fVar, 0, 24);
        }
    }
}
