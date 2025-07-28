package defpackage;

import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;
import org.apache.http.util.LangUtils;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: gu6  reason: default package */
public final class gu6 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ gu6(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return gp0.f(Long.valueOf(((yk7) obj2).X), Long.valueOf(((yk7) obj).X));
            case 1:
                return gp0.f(Long.valueOf(((yk7) obj2).X), Long.valueOf(((yk7) obj).X));
            case 2:
                return gp0.f(Long.valueOf(((yk7) obj2).X), Long.valueOf(((yk7) obj).X));
            case 3:
                return gp0.f(Integer.valueOf(am7.q((String) ((Map.Entry) obj).getKey())), Integer.valueOf(am7.q((String) ((Map.Entry) obj2).getKey())));
            case 4:
                return gp0.f(Long.valueOf(((mn7) obj).a), Long.valueOf(((mn7) obj2).a));
            case 5:
                return gp0.f(Long.valueOf(((si2) obj2).m), Long.valueOf(((si2) obj).m));
            case 6:
                return gp0.f(Long.valueOf(((gy7) obj).Y), Long.valueOf(((gy7) obj2).Y));
            case 7:
                return gp0.f(Integer.valueOf(((fma) obj).b), Integer.valueOf(((fma) obj2).b));
            case 8:
                return gp0.f(Integer.valueOf(((fma) obj).b), Integer.valueOf(((fma) obj2).b));
            case 9:
                return gp0.f(Boolean.valueOf(((lk3) obj2).w0), Boolean.valueOf(((lk3) obj).w0));
            case 10:
                return ((nld) obj).b - ((nld) obj2).b;
            case 11:
                i22 i22 = ((prc) obj2).o;
                Long l = null;
                Long valueOf = i22 != null ? Long.valueOf(i22.l()) : null;
                i22 i222 = ((prc) obj).o;
                if (i222 != null) {
                    l = Long.valueOf(i222.l());
                }
                return gp0.f(valueOf, l);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                i22 i223 = ((prc) obj2).o;
                Long l2 = null;
                Long valueOf2 = i223 != null ? Long.valueOf(i223.l()) : null;
                i22 i224 = ((prc) obj).o;
                if (i224 != null) {
                    l2 = Long.valueOf(i224.l());
                }
                return gp0.f(valueOf2, l2);
            case 13:
                return gp0.f(Long.valueOf(((i22) obj2).l()), Long.valueOf(((i22) obj).l()));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return gp0.f(Boolean.valueOf(!((hud) obj).w0), Boolean.valueOf(!((hud) obj2).w0));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return ((ibf) obj).b - ((ibf) obj2).b;
            case LangUtils.HASH_SEED /*17*/:
                CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) obj;
                CameraEnumerationAndroid.CaptureFormat captureFormat2 = (CameraEnumerationAndroid.CaptureFormat) obj2;
                return Integer.compare(captureFormat2.width * captureFormat2.height, captureFormat.width * captureFormat.height);
            default:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
        }
    }
}
