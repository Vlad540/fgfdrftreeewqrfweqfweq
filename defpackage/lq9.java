package defpackage;

import one.me.sdk.arch.Widget;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: lq9  reason: default package */
public final class lq9 implements wy6 {
    public final /* synthetic */ int a;

    public /* synthetic */ lq9(int i) {
        this.a = i;
    }

    public final Object a(w4 w4Var) {
        switch (this.a) {
            case 0:
                return new t7d(5);
            case 1:
                return new fzc("Включить Webm стикеры", PmsKey.f125webmstickersenabled, true);
            case 2:
                return new fzc("Аналитика", PmsKey.f2analyticsenabled, true);
            case 3:
                return (pp7) w4Var.c(dcc.class);
            case 4:
                return new fzc(PmsKey.f86newsessionlogic);
            case 5:
                w4Var.d(kk0.class);
                return new wz0(2);
            case 6:
                return p47.a;
            case 7:
                return ud7.a;
            case 8:
                return f65.a;
            case 9:
                return (pp7) w4Var.c(ydd.class);
            case 10:
                return (pp7) w4Var.c(ue0.class);
            case 11:
                return new b0a(w4Var, 0);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new e0a(w4Var);
            case 13:
                return rf9.a;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new yz9(w4Var);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return (al) w4Var.c(gg7.class);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                op opVar = op.a;
                op.b = w4Var.d(yzc.class);
                return opVar;
            case LangUtils.HASH_SEED /*17*/:
                return pp.a;
            case 18:
                vgc vgc = (vgc) o23.f0(((y3a) w4Var.c(y3a.class)).f().C().e());
                return new hba((Widget) (vgc != null ? vgc.a : null));
            case 19:
                return new ff7(w4Var.d(ef7.class));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return i0a.a;
            case 21:
                return new q6b(0, w4Var.d(jb5.class));
            case 22:
                f03 f03 = (f03) w4Var.c(f03.class);
                return new hk7(new lge("Отображение debug info в профиле"), new e78(0, f03, f03.class, "isDebugProfileInfoEnabled", "isDebugProfileInfoEnabled()Z", 0, 7), new h87(1, f03, f03.class, "setDebugProfileInfoEnabled", "setDebugProfileInfoEnabled(Z)V", 0, 10), phc.Y0, 16);
            case 23:
                return new fzc("Включить видеосообщения", PmsKey.f119videomsgenabled, false);
            case 24:
                return new fzc("Включить новый экран просмотра аватарок", PmsKey.f7avatarsscreenenabled, false);
            case 25:
                return new b8b(0, w4Var.d(xzc.class));
            case 26:
                return new fzc("Пункт \"Тип канала и ссылка\" (при редактировании канала)", PmsKey.f30editchanneltypescreenenabled, false);
            case 27:
                return new fzc("Пункт \"Тип чата и ссылка\" (при редактировании чата)", PmsKey.f31editchattypescreenenabled, false);
            case 28:
                return new fzc("Включить права на управления ссылкой в чате", PmsKey.f19chatinvitelinkpermissionsenabled, false);
            default:
                return new fzc("Новые пермишены для админов", PmsKey.f84newadminpermissions, false);
        }
    }
}
