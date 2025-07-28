package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.Map;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: xz6  reason: default package */
public final /* synthetic */ class xz6 implements u16 {
    public final /* synthetic */ int a;

    public /* synthetic */ xz6(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        String str;
        boolean z = true;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(p0e.Q((String) ((Map.Entry) obj).getKey(), "MP4", false));
            case 1:
                return new wb5(3, (String) ((Map.Entry) obj).getValue());
            case 2:
                return Boolean.valueOf(p0e.Q((String) ((Map.Entry) obj).getKey(), "MP4", false));
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                return new vb5(3, -1, am7.q((String) entry.getKey()), 0, (String) entry.getValue());
            case 4:
                uae uae = ((TamErrorException) obj).a;
                r17.E0.getClass();
                if (uae instanceof lae) {
                    String str2 = ((lae) uae).b;
                    return (hhd.f(str2, "service.unavailable") || hhd.f(str2, "service.timeout")) ? new c17(new hge(rhc.Q), new hge(rhc.P)) : new c17(new hge(rhc.O), new hge(rhc.N));
                }
                String str3 = uae.b;
                if (hhd.f(str3, "contact.not.found") || hhd.f(str3, "not.found")) {
                    return d17.a;
                }
                if (hhd.f(str3, "too.many.requests")) {
                    return e17.a;
                }
                String str4 = uae.o;
                return new b17((str4 == null || str4.length() == 0) ? new hge(cic.E) : new lge(str4));
            case 5:
                return ((yk7) obj).b;
            case 6:
                ln7 ln7 = (ln7) obj;
                String str5 = ln7.d;
                return new on7(1, 0, ln7, hhd.f(str5, "COLD_START") || hhd.f(str5, "WARM_START"));
            case 7:
                return obj.toString();
            case 8:
                return Long.toString(((Long) obj).longValue());
            case 9:
                Intent intent = (Intent) obj;
                return jue.a;
            case 10:
                return new EnhancedAnimatedVectorDrawable((Context) obj, j6a.b);
            case 11:
                return new EnhancedAnimatedVectorDrawable((Context) obj, j6a.d);
            case Protos.Attaches.Attach.PRESENT:
                return Long.valueOf(((ei8) obj).a);
            case 13:
                tf3 tf3 = (tf3) obj;
                if (!tf3.Y && !e07.A(tf3) && tf3.k() == 0 && (!tf3.t() || !tf3.v())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case Protos.Attaches.Attach.LOCATION:
                return ((ira) obj).c.toString();
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return ((ira) obj).c.toString();
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return Boolean.valueOf(((View) obj).isClickable());
            case LangUtils.HASH_SEED:
                return new a1f(0, ((pda) obj).getIcon().a.c);
            case 18:
                return new yq8((Context) obj);
            case 19:
                if (((xr8) obj).a.a != zyb.EMOJI) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                k77[] k77Arr = MessageWriteWidget.J0;
                return new a1f(0, ((pda) obj).getIcon().a.c);
            case 21:
                return Boolean.valueOf(((uv6) obj).b instanceof MessageModel);
            case 22:
                if (((zm8) obj) != zm8.Z) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                hr8 hr8 = (hr8) obj;
                return new or9(hr8.c, hr8.e, hr8.i, ep4.MESSAGES_LIMIT);
            case 24:
                hr8 hr82 = (hr8) obj;
                return new or9(hr82.c, hr82.e, hr82.i, ep4.NOTIFICATIONS_LIMIT);
            case 25:
                return Boolean.valueOf(((si2) obj).f.isEmpty());
            case 26:
                return ((hr8) obj).l;
            case 27:
                wo9 wo9 = (wo9) obj;
                if (!wo9.b || (str = wo9.a) == null || str.length() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                return ((tr8) obj).b.b;
            default:
                if (((un3) obj).a != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
