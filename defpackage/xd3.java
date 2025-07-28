package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Looper;
import android.text.BoringLayout;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.EnumMap;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.contactlist.ContactListWidget;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: xd3  reason: default package */
public final /* synthetic */ class xd3 implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ xd3(int i) {
        this.a = i;
    }

    public final Object invoke() {
        MessageDigest messageDigest;
        Class<d8a> cls = d8a.class;
        jue jue = jue.a;
        MessageDigest messageDigest2 = null;
        switch (this.a) {
            case 0:
                wia wia = new wia(wd3.b, new long[]{60000, 80000});
                wia wia2 = new wia(wd3.o, new long[]{60000, 80000});
                wia wia3 = new wia(wd3.X, new long[]{15000, 20000, 30000, 40000, 50000, 60000, 80000});
                wd3 wd3 = wd3.c;
                long[] jArr = xy6.c;
                wia[] wiaArr = {wia, wia2, wia3, new wia(wd3, jArr), new wia(wd3.Y, jArr)};
                EnumMap enumMap = new EnumMap(wd3.class);
                for (int i = 0; i < 5; i++) {
                    wia wia4 = wiaArr[i];
                    enumMap.put((Enum) wia4.a, wia4.b);
                }
                return enumMap;
            case 1:
                z7b z7b = z7b.a;
                return new rw2(z7b.getAccessor().d(cls), z7b.getAccessor().d(g15.class));
            case 2:
                return (p8b) z7b.a.getAccessor().c(p8b.class);
            case 3:
                return new w86(z7b.a.getAccessor().d(cls));
            case 4:
                k77[] k77Arr = ContactListWidget.S0;
                t97 t97 = mqc.a;
                return new ak3(nqc.a.getAccessor().d(xzc.class));
            case 5:
                return new l6b();
            case 6:
                return new q5b();
            case 7:
                return Boolean.FALSE;
            case 8:
                k77[] k77Arr2 = vq3.o;
                return jue;
            case 9:
                return new hge(c7a.g);
            case 10:
                return new hge(c7a.h);
            case 11:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case Protos.Attaches.Attach.PRESENT:
                BoringLayout.Metrics metrics = new BoringLayout.Metrics();
                h04.I0.getFontMetricsInt(metrics);
                return metrics;
            case 13:
                try {
                    Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                    declaredField.setAccessible(true);
                    return (ThreadLocal) declaredField.get((Object) null);
                } catch (Throwable unused) {
                    return null;
                }
            case Protos.Attaches.Attach.LOCATION:
                return new Object();
            case Protos.Attaches.Attach.DAILY_MEDIA:
                int i2 = gg4.w0;
                return jue;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                k77[] k77Arr3 = DialogNotificationsSettingsScreen.Y;
                return new ng4();
            case LangUtils.HASH_SEED:
                return Resources.getSystem();
            case 18:
                return icd.a(1, 1, 2);
            case 19:
                return Long.valueOf(TimeUnit.SECONDS.toSeconds(1));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new ur4();
            case 21:
                return new Object();
            case 22:
                try {
                    messageDigest = MessageDigest.getInstance("SHA-256");
                } catch (Throwable th) {
                    messageDigest = new kcc(th);
                }
                if (!(messageDigest instanceof kcc)) {
                    messageDigest2 = messageDigest;
                }
                return messageDigest2;
            case 23:
                k77[] k77Arr4 = EnterPinCodeScreen.X;
                return new iz4();
            case 24:
                int i3 = ExternalCallbackWidget.F0;
                return new m65();
            case 25:
                int i4 = ExternalCallbackWidget.F0;
                ov6 ov6 = new ov6();
                int X = a24.X(((float) 44) * dh4.c().getDisplayMetrics().density);
                ov6.setBounds(0, 0, X, X);
                return ov6;
            case 26:
                k77[] k77Arr5 = wd5.f;
                return ha6.a;
            case 27:
                return new Paint(1);
            case 28:
                return new eu3(dh4.c().getDisplayMetrics().density * 12.0f);
            default:
                return new WeakHashMap(1);
        }
    }
}
