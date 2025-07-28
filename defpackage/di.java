package defpackage;

import android.content.SharedPreferences;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.function.Function;
import one.me.net.client.impl.internal.SocketFactoryCreateException;
import one.me.rlottie.RLottieDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: di  reason: default package */
public final /* synthetic */ class di implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ di(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (RLottieDrawable) ((u16) this.b).invoke(obj);
            case 1:
                return (mc9) ((u16) this.b).invoke(obj);
            case 2:
                return (mc9) ((u16) this.b).invoke(obj);
            case 3:
                return (mc9) ((u16) this.b).invoke(obj);
            case 4:
                return (mc9) ((u16) this.b).invoke(obj);
            case 5:
                return (mc9) ((u16) this.b).invoke(obj);
            case 6:
                return (mc9) ((u16) this.b).invoke(obj);
            case 7:
                return (mc9) ((u16) this.b).invoke(obj);
            case 8:
                return (mc9) ((u16) this.b).invoke(obj);
            case 9:
                return (g37) ((u16) this.b).invoke(obj);
            case 10:
                return (qc9) ((u16) this.b).invoke(obj);
            case 11:
                return (ExecutorService) ((u16) this.b).invoke(obj);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return (zj) ((u16) this.b).invoke(obj);
            case 13:
                return (ThreadFactory) ((u16) this.b).invoke(obj);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return (o1b) ((u16) this.b).invoke(obj);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return (o1b) ((u16) this.b).invoke(obj);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return (mc9) ((u16) this.b).invoke(obj);
            case LangUtils.HASH_SEED /*17*/:
                return (SharedPreferences) ((u16) this.b).invoke(obj);
            case 18:
                return (pda) ((u16) this.b).invoke(obj);
            case 19:
                return (Long) ((u16) this.b).invoke(obj);
            default:
                String str = (String) obj;
                yg0 yg0 = (yg0) this.b;
                yg0.getClass();
                try {
                    return yg0.o(str);
                } catch (IOException e) {
                    throw new SocketFactoryCreateException(e);
                }
        }
    }
}
