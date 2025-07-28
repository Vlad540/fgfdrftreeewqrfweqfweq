package defpackage;

import java.util.ArrayList;
import java.util.Set;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ok1  reason: default package */
public final class ok1 {
    public static final Set o;
    public final otf a;
    public final xwb b;
    public final bae c;
    public final mk9 d;
    public final ea6 e;
    public final otf f;
    public final eje g;
    public final k2e h = new Object();
    public final h2d i = new h2d(3);
    public final hi2 j;
    public final pb5 k;
    public final w4g l;
    public final ydc m;
    public final cqc n;

    static {
        String str;
        int[] w = hr1.w(30);
        ArrayList arrayList = new ArrayList(w.length);
        for (int i2 : w) {
            switch (i2) {
                case 1:
                    str = "rtt";
                    break;
                case 2:
                    str = "ss_freeze_count";
                    break;
                case 3:
                    str = "ss_total_freezes_duration";
                    break;
                case 4:
                    str = "cpu_usage_percent_total";
                    break;
                case 5:
                    str = "battery_level_change";
                    break;
                case 6:
                    str = "inserted_audio_samples_for_deceleration";
                    break;
                case 7:
                    str = "removed_audio_samples_for_acceleration";
                    break;
                case 8:
                    str = "concealed_audio_samples";
                    break;
                case 9:
                    str = "jitter_audio";
                    break;
                case 10:
                    str = "concealed_silent_audio_samples";
                    break;
                case 11:
                    str = "concealment_audio_avg_size";
                    break;
                case Protos.Attaches.Attach.PRESENT /*12*/:
                    str = "audio_loss";
                    break;
                case 13:
                    str = "nack_sent";
                    break;
                case Protos.Attaches.Attach.LOCATION /*14*/:
                    str = "pli_sent";
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                    str = "fir_sent";
                    break;
                case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                    str = "frames_decoded";
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    str = "frames_dropped";
                    break;
                case 18:
                    str = "jitter_video";
                    break;
                case 19:
                    str = "interframe_delay_variance";
                    break;
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                    str = "freeze_count";
                    break;
                case 21:
                    str = "total_freezes_duration";
                    break;
                case 22:
                    str = "video_loss";
                    break;
                case 23:
                    str = "nack_received";
                    break;
                case 24:
                    str = "pli_received";
                    break;
                case 25:
                    str = "fir_received";
                    break;
                case 26:
                    str = "adaptation_changes";
                    break;
                case 27:
                    str = "frames_encoded";
                    break;
                case 28:
                    str = "br_encode";
                    break;
                case 29:
                    str = "br_transmit";
                    break;
                case 30:
                    str = "br_retransmit";
                    break;
                default:
                    throw null;
            }
            arrayList.add(str);
        }
        o = o23.w0(arrayList);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, k2e] */
    /* JADX WARNING: type inference failed for: r1v4, types: [pb5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [cqc, java.lang.Object] */
    public ok1(otf otf, xwb xwb, bae bae, mk9 mk9, ea6 ea6, otf otf2, fje fje) {
        this.a = otf;
        this.b = xwb;
        this.c = bae;
        this.d = mk9;
        this.e = ea6;
        this.f = otf2;
        this.g = fje;
        this.j = new hi2(xwb);
        ? obj = new Object();
        obj.a = new Object();
        obj.b = new le4(0);
        obj.c = new le4(0);
        obj.o = new le4(0);
        obj.X = new le4(0);
        obj.Y = new ygd();
        this.k = obj;
        this.l = new w4g(11);
        this.m = new ydc(9);
        this.n = new Object();
    }
}
