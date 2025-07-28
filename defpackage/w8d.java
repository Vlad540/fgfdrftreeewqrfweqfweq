package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: w8d  reason: default package */
public final class w8d implements wy6 {
    public final /* synthetic */ int a;

    public /* synthetic */ w8d(int i) {
        this.a = i;
    }

    public final Object a(w4 w4Var) {
        w4 w4Var2 = w4Var;
        switch (this.a) {
            case 0:
                return a9d.a;
            case 1:
                return new ehd(new lge("Сброс UserSettings.SAFE_MODE"), zhc.r0, new jqc(w4Var2, 27));
            case 2:
                return new t7d(6);
            case 3:
                return qbd.b;
            case 4:
                return new ed(w4Var2);
            case 5:
                return jpd.a;
            case 6:
                return dvd.a;
            case 7:
                return uvd.a;
            case 8:
                return axd.a;
            case 9:
                return kxd.a;
            case 10:
                return new fzc("Новый файловый загрузчик", PmsKey.f87newuploaderenabled, false);
            case 11:
                return new ile(new r7e(yr3.C0), w4Var2.d(xr0.class), (zpe) w4Var2.c(zpe.class));
            case Protos.Attaches.Attach.PRESENT:
                return (pp7) w4Var2.c(b9e.class);
            case 13:
                return new fzc("WebApp biometry", PmsKey.f122webappbiometryenabled, false);
            case Protos.Attaches.Attach.LOCATION:
                return new b8b(1, w4Var2.d(f03.class));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                r7e d = w4Var2.d(f03.class);
                return new hk7(new lge("Полноэкранный режим веб-аппов"), new e78(0, (f03) d.getValue(), f03.class, "isWebAppFullscreen", "isWebAppFullscreen()Z", 0, 16), new h87(1, (f03) d.getValue(), f03.class, "setWebAppFullscreen", "setWebAppFullscreen(Z)V", 0, 17), phc.U1, 16);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new xkf(r57.d, w4Var2.d(tif.class), w4Var2.d(m53.class));
            case LangUtils.HASH_SEED:
                return new uof(w4Var2.d(tif.class));
            case 18:
                return new jkf(w4Var2.d(tif.class));
            case 19:
                return new kof(r57.d, w4Var2.d(tif.class), w4Var2.d(m53.class));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new pjf(r57.d, w4Var2.d(tif.class), w4Var2.d(m53.class), w4Var2.d(xzc.class));
            case 21:
                return new fzc("Скачивание файла из мини-аппа", PmsKey.f50jsdownloaddelegate, false);
            case 22:
                return new gif(r57.d, w4Var2.d(tif.class), w4Var2.d(m53.class), w4Var2.d(tf4.class), w4Var2.d(jb5.class));
            default:
                return tpf.a;
        }
    }
}
