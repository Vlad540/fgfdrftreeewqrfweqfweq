package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: tn8  reason: default package */
public final /* synthetic */ class tn8 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn8 b;

    public /* synthetic */ tn8(wn8 wn8, int i) {
        this.a = i;
        this.b = wn8;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (yq4) ((o4a) this.b.g.getValue()).a.getValue();
            case 1:
                Drawable b2 = gq3.b(this.b.a, z6a.h);
                if (b2 != null) {
                    return b2;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 2:
                TextPaint textPaint = new TextPaint();
                nge nge = jp2.j;
                wn8 wn8 = this.b;
                nge.a(textPaint, wn8.a.getResources().getDisplayMetrics(), (yq4) wn8.h.getValue());
                return textPaint;
            case 3:
                Drawable b3 = gq3.b(this.b.a, z6a.f);
                if (b3 != null) {
                    return b3;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 4:
                Drawable b4 = gq3.b(this.b.a, z6a.e);
                if (b4 != null) {
                    return b4;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 5:
                TextPaint textPaint2 = new TextPaint();
                nge nge2 = jp2.f;
                wn8 wn82 = this.b;
                nge2.a(textPaint2, wn82.a.getResources().getDisplayMetrics(), (yq4) wn82.h.getValue());
                return textPaint2;
            case 6:
                TextPaint textPaint3 = new TextPaint();
                nge nge3 = jp2.g;
                wn8 wn83 = this.b;
                nge3.a(textPaint3, wn83.a.getResources().getDisplayMetrics(), (yq4) wn83.h.getValue());
                return textPaint3;
            case 7:
                TextPaint textPaint4 = new TextPaint();
                nge nge4 = jp2.c;
                wn8 wn84 = this.b;
                nge4.a(textPaint4, wn84.a.getResources().getDisplayMetrics(), (yq4) wn84.h.getValue());
                return textPaint4;
            case 8:
                TextPaint textPaint5 = new TextPaint();
                nge nge5 = jp2.i;
                wn8 wn85 = this.b;
                nge5.a(textPaint5, wn85.a.getResources().getDisplayMetrics(), (yq4) wn85.h.getValue());
                return textPaint5;
            case 9:
                return hr1.g(this.b.a.getString(c7a.y0), ":");
            case 10:
                return this.b.a.getString(c7a.z0);
            case 11:
                return this.b.a.getString(c7a.A0);
            case Protos.Attaches.Attach.PRESENT:
                return this.b.a.getString(c7a.w0);
            case 13:
                return this.b.a.getString(c7a.x0);
            case Protos.Attaches.Attach.LOCATION:
                return this.b.a.getString(c7a.v0);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                Drawable b5 = gq3.b(this.b.a, phc.Q);
                if (b5 != null) {
                    return b5;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                Drawable b6 = gq3.b(this.b.a, phc.n1);
                if (b6 != null) {
                    return b6;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case LangUtils.HASH_SEED:
                Drawable b7 = gq3.b(this.b.a, phc.w0);
                if (b7 != null) {
                    return b7;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 18:
                Drawable b8 = gq3.b(this.b.a, phc.q);
                if (b8 != null) {
                    return b8;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 19:
                Drawable b9 = gq3.b(this.b.a, phc.y1);
                if (b9 != null) {
                    return b9;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                Drawable b10 = gq3.b(this.b.a, phc.g0);
                if (b10 != null) {
                    return b10;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                Drawable b11 = gq3.b(this.b.a, phc.x1);
                if (b11 != null) {
                    return b11;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
